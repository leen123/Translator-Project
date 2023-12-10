package visitor;

import ast.*;
import ast.Controller.*;
import ast.Controller.ControllerBody.BuiltInFunctions.AddFunction;
import ast.Controller.ControllerBody.*;
import ast.Controller.ControllerBody.BuiltInFunctions.ToLowerFunction;
import ast.Controller.ControllerBody.BuiltInFunctions.ToUpperFunction;
import ast.Page.Input.*;
import ast.Page.Input.FieldType.InputText;
import ast.Page.Input.FieldType.Integer;
import ast.Page.Input.FieldType.String;
import ast.Page.Input.MultipleChoice.Checkbox;
import ast.Page.Input.MultipleChoice.Dropdown;
import ast.Page.Input.MultipleChoice.MultipleChoice;
import ast.Page.Input.MultipleChoice.Radio;
import ast.Page.Location;
import ast.Page.Output.Image;
import ast.Page.Output.Output;
import ast.Page.Output.OutputText;
import ast.Page.Body;
import ast.Page.DefinedPage;
import gen.HTMLPHPPARSER;
import gen.HTMLPHPPARSERBaseVisitor;

import java.util.List;

public class BaseVisitor extends HTMLPHPPARSERBaseVisitor {
    @Override
    public App visitApp(HTMLPHPPARSER.AppContext ctx) {
        App app = new App();
        for (int i = 0; i < ctx.define_page().size(); i++) {
            app.addPage(visitDefine_page(ctx.define_page().get(i)));
        }
        for (int i = 0; i < ctx.define_controller().size(); i++) {
            app.addController(visitDefine_controller(ctx.define_controller().get(i)));
        }
        return app;
    }

    @Override
    public DefinedPage visitDefine_page(HTMLPHPPARSER.Define_pageContext ctx) {
        DefinedPage page = new DefinedPage();
        page.setPageId(ctx.PAGE_ID().get(0).getText());
        page.setPageAttribute(ctx.PAGE_ATTR().getText());
        page.setSubmitLocation(visitSubmit(ctx.submit()));
        if (ctx.PAGE_ID().size() > 1)
            page.setExtendedPageId(ctx.PAGE_ID().get(1).getText());
        for (int i = 0; i < ctx.body().size(); i++)
            page.addBody(visitBody(ctx.body(i)));
        return page;
    }

    @Override
    public DefinedController visitDefine_controller(HTMLPHPPARSER.Define_controllerContext ctx) {
        DefinedController definedController = new DefinedController(ctx);
        definedController.setControllerId(ctx.ID().get(0).getText());
        definedController.setPageId(ctx.ID().get(1).getText());
        definedController.setController(visitController(ctx.controller()));
        return definedController;
    }

    @Override
    public Location visitSubmit(HTMLPHPPARSER.SubmitContext ctx) {
        return visitLocation(ctx.location());
    }

    @Override
    public Body visitBody(HTMLPHPPARSER.BodyContext ctx) {
        Body body = new Body();
        if (ctx.input() != null)
            body.setInput(visitInput(ctx.input()));
        else body.setOutput(visitOutput(ctx.output()));
        body.setHasNewLine(ctx.IO_NEW_LINE() != null);
        return body;
    }

    @Override
    public Controller visitController(HTMLPHPPARSER.ControllerContext ctx) {
        Controller controller = new Controller();
        for (int i = 0; i < ctx.controller_body().size(); i++) {
            controller.addBody(visitController_body(ctx.controller_body().get(i)));
        }
        return controller;
    }

    @Override
    public Location visitLocation(HTMLPHPPARSER.LocationContext ctx) {
        Location location = new Location();
        if (ctx.CENTER() != null)
            location.setLocation(ctx.CENTER().getText());
        else if (ctx.RIGHT_UPPER() != null)
            location.setLocation(ctx.RIGHT_UPPER().getText());
        else if (ctx.LEFT_UPPER() != null)
            location.setLocation(ctx.LEFT_UPPER().getText());
        else if (ctx.LEFT_DOWN() != null)
            location.setLocation(ctx.LEFT_DOWN().getText());
        else location.setLocation(ctx.RIGHT_DOWN().getText());
        return location;
    }

    @Override
    public ControllerBody visitController_body(HTMLPHPPARSER.Controller_bodyContext ctx) {
        ControllerBody controllerBody = new ControllerBody();
        if (ctx.for_loop() != null)
            controllerBody.setForLoop(visitFor_loop(ctx.for_loop()));
        else if (ctx.if_statement() != null)
            controllerBody.setIfStatement(visitIf_statement(ctx.if_statement()));
        else if (ctx.function() != null) {
            controllerBody.setFunction(visitFunction(ctx.function()));
        } else if (ctx.define_array() != null) {
            controllerBody.setDefinedArray(visitDefine_array(ctx.define_array()));
        } else controllerBody.setaGoto(visitGoto_page(ctx.goto_page()));
        return controllerBody;
    }

    @Override
    public IfStatement visitIf_statement(HTMLPHPPARSER.If_statementContext ctx) {
        IfStatement ifStatement = new IfStatement();
        ifStatement.setExpression(visitExepression(ctx.exepression()));
        for (int i = 0; i < ctx.controller_body().size(); i++)
            ifStatement.addBody(visitController_body(ctx.controller_body().get(i)));
        for (int i = 0; i < ctx.else_if().size(); i++) {
            ifStatement.addElseIf(visitElse_if(ctx.else_if().get(i)));
        }
        if (ctx.else_end() != null) {
            ifStatement.setElseStatement(visitElse_end(ctx.else_end()));
        }
        return ifStatement;
    }

    @Override
    public ElseIfStatement visitElse_if(HTMLPHPPARSER.Else_ifContext ctx) {
        ElseIfStatement elseIfStatement = new ElseIfStatement();
        elseIfStatement.setExpression(visitExepression(ctx.exepression()));
        for (int i = 0; i < ctx.controller_body().size(); i++) {
            elseIfStatement.addBody(visitController_body(ctx.controller_body().get(i)));
        }
        return elseIfStatement;
    }

    @Override
    public ElseStatement visitElse_end(HTMLPHPPARSER.Else_endContext ctx) {
        ElseStatement elseStatement = new ElseStatement();
        for (int i = 0; i < ctx.controller_body().size(); i++) {
            elseStatement.addBody(visitController_body(ctx.controller_body().get(i)));
        }
        return elseStatement;
    }

    @Override
    public DefinedArray visitDefine_array(HTMLPHPPARSER.Define_arrayContext ctx) {
        DefinedArray definedArray = new DefinedArray();
        definedArray.setArrayName(ctx.ARRAY_NAME().getText());
        for (int i = 0; i < ctx.array_values().size(); i++) {
            definedArray.addArrayValue(visitArray_values(ctx.array_values().get(i)));
        }
        return definedArray;
    }

    @Override
    public ArrayValue visitArray_values(HTMLPHPPARSER.Array_valuesContext ctx) {
        ArrayValue arrayValue = new ArrayValue();
        if (ctx.ARRAY_INT_VALUES() != null) {
            arrayValue.setNumericValue(java.lang.Integer.parseInt(ctx.ARRAY_INT_VALUES().getText()));
        } else if (ctx.ARRAY_VAR_VALUES() != null) {
            arrayValue.setVariable(ctx.ARRAY_VAR_VALUES().getText());
        } else arrayValue.setStringValue(ctx.ARRAY_STRING_VALUES().getText());
        return arrayValue;
    }

    @Override
    public ForLoop visitFor_loop(HTMLPHPPARSER.For_loopContext ctx) {
        ForLoop forLoop = new ForLoop();
        forLoop.setStartVariable(ctx.FOR_EXPRESSION_VAR().getText());
        forLoop.setRangeStart(visitVar_or_number(ctx.var_or_number().get(0)));
        forLoop.setRangeEnd(visitVar_or_number(ctx.var_or_number().get(1)));
        for (int i = 0; i < ctx.controller_body().size(); i++) {
            forLoop.addBody(visitController_body(ctx.controller_body().get(i)));
        }
        return forLoop;
    }

    @Override
    public ForLoopVarOrNumber visitVar_or_number(HTMLPHPPARSER.Var_or_numberContext ctx) {
        ForLoopVarOrNumber forLoopVarOrNumber = new ForLoopVarOrNumber();
        if (ctx.FOR_EXPRESSION_NUMBER() != null) {
            forLoopVarOrNumber.setNumber(java.lang.Integer.parseInt(ctx.FOR_EXPRESSION_NUMBER().getText()));
        } else {
            forLoopVarOrNumber.setVar(this.createVar(ctx.FOR_EXPRESSION_VAR().getText(), ctx.array_bounds()));
        }
        return forLoopVarOrNumber;
    }

    @Override
    public BuiltInFunction visitFunction(HTMLPHPPARSER.FunctionContext ctx) {
        BuiltInFunction function = new BuiltInFunction();
        if (ctx.add_function() != null) {
            function.setAddFunction(visitAdd_function(ctx.add_function()));
        } else if (ctx.to_lower_function() != null) {
            function.setToLowerFunction(visitTo_lower_function(ctx.to_lower_function()));
        } else {
            function.setToUpperFunction(visitTo_upper_function(ctx.to_upper_function()));
        }
        return function;
    }


    @Override
    public AddFunction visitAdd_function(HTMLPHPPARSER.Add_functionContext ctx) {
        AddFunction addFunction = new AddFunction();
        addFunction.setVariable(this.createVar(ctx.ADD_VAR().getText(), ctx.array_bounds()));
        addFunction.setIncrementingValue(java.lang.Integer.parseInt(ctx.ADD_VALUE().getText()));
        return addFunction;
    }

    @Override
    public ToLowerFunction visitTo_lower_function(HTMLPHPPARSER.To_lower_functionContext ctx) {
        ToLowerFunction toLowerFunction = new ToLowerFunction();
        toLowerFunction.setVariable(this.createVar(
                ctx.TO_LOWER_FUNCTION_VAR().getText(), ctx.array_bounds()
        ));
        return toLowerFunction;
    }

    @Override
    public ToUpperFunction visitTo_upper_function(HTMLPHPPARSER.To_upper_functionContext ctx) {
        ToUpperFunction toUpperFunctionFunction = new ToUpperFunction();
        toUpperFunctionFunction.setVariable(this.createVar(
                ctx.TO_UPPER_FUNCTION_VAR().getText(), ctx.array_bounds()
        ));
        return toUpperFunctionFunction;
    }

    public Goto visitGoto_page(HTMLPHPPARSER.Goto_pageContext ctx) {
        Goto aGoto = new Goto();
        aGoto.setTargetPage(ctx.GOTO_PAGE_ID().getText());
        if (ctx.GOTO_VAR() != null) {
            for (int i = 0; i < ctx.GOTO_VAR().size(); i++) {
                aGoto.addGotoVar(ctx.GOTO_VAR().get(i).getText());
            }
        }
        return aGoto;
    }


    @Override
    public Expression visitExepression(HTMLPHPPARSER.ExepressionContext ctx) {
        Expression expression = new Expression();
        expression.setOperator(visitOpertator(ctx.opertator()));
        expression.setLeftSideExpression(visitLeft_expression(ctx.left_expression()));
        expression.setRightSideExpression(visitRight_expression(ctx.right_expression()));
        if (ctx.exepression_operator() != null) {
            expression.setConnectOperator(visitExepression_operator(ctx.exepression_operator()));
            expression.setConnectedExpression(visitExepression(ctx.exepression()));
        }
        return expression;
    }

    @Override
    public java.lang.String visitExepression_operator(HTMLPHPPARSER.Exepression_operatorContext ctx) {
        if (ctx.OR_OPERATOR() != null) {
            return ctx.OR_OPERATOR().getText();
        }
        return ctx.AND_AND_OPERATOR().getText();
    }

    @Override
    public LeftSideExpression visitLeft_expression(HTMLPHPPARSER.Left_expressionContext ctx) {
        LeftSideExpression leftSideExpression = new LeftSideExpression();
        if (ctx.EXPRESSION_NUMBER() != null) {
            leftSideExpression.setExpressionInteger(java.lang.Integer.parseInt(ctx.EXPRESSION_NUMBER().getText()));
        } else if (ctx.exepression_var() != null) {
            leftSideExpression.setExpressionVar(visitExepression_var(ctx.exepression_var()));
        } else leftSideExpression.setExpressionString(ctx.EXPRESSION_STRING().getText());
        return leftSideExpression;
    }

    @Override
    public RightSideExpression visitRight_expression(HTMLPHPPARSER.Right_expressionContext ctx) {
        RightSideExpression rightSideExpression = new RightSideExpression();
        if (ctx.EXPRESSION_NUMBER() != null) {
            rightSideExpression.setExpressionInteger(java.lang.Integer.parseInt(ctx.EXPRESSION_NUMBER().getText()));
        } else if (ctx.exepression_var() != null) {
            rightSideExpression.setExpressionVar(visitExepression_var(ctx.exepression_var()));
        } else {
            rightSideExpression.setExpressionString(ctx.EXPRESSION_STRING().getText());
        }
        return rightSideExpression;
    }

    @Override
    public java.lang.String visitOpertator(HTMLPHPPARSER.OpertatorContext ctx) {
        if (ctx.BIGGER_AND_EQUALS_OPERATOR() != null) {
            return ctx.BIGGER_AND_EQUALS_OPERATOR().getText();
        } else if (ctx.BIGGER_OPERATOR() != null) {
            return ctx.BIGGER_OPERATOR().getText();
        } else if (ctx.EQUALS_OPERATOR() != null) {
            return ctx.EQUALS_OPERATOR().getText();
        } else if (ctx.SMALLER_AND_EQUALS_OPERATOR() != null) {
            return ctx.SMALLER_AND_EQUALS_OPERATOR().getText();
        } else
            return ctx.SMALLER_OPERATOR().getText();

    }

    @Override
    public Variable visitExepression_var(HTMLPHPPARSER.Exepression_varContext ctx) {
        return this.createVar(ctx.EXPRESSION_VAR().getText(), ctx.array_bounds());
    }

    @Override
    public Input visitInput(HTMLPHPPARSER.InputContext ctx) {
        Input input = new Input();
        if (ctx.field() != null)
            input.setField(visitField(ctx.field()));
        else if (ctx.multiple_choice_field() != null)
            input.setMultipleChoice(visitMultiple_choice_field(ctx.multiple_choice_field()));
        else input.setFile(visitFile(ctx.file()));
        if (ctx.location() != null)
            input.setLocation(visitLocation(ctx.location()));
        input.setRequired(ctx.REQUIRED() != null);
        return input;
    }

    @Override
    public Output visitOutput(HTMLPHPPARSER.OutputContext ctx) {
        Output output = new Output();
        if (ctx.outputText() != null)
            output.setOutputText(visitOutputText(ctx.outputText()));
        else output.setOutputImage(visitImage(ctx.image()));
        if (ctx.location() != null)
            output.setLocation(visitLocation(ctx.location()));
        return output;
    }


    @Override
    public Field visitField(HTMLPHPPARSER.FieldContext ctx) {
        Field field = new Field();
        field.setInputText(ctx.INPUT_FIELD().getText());
        field.setFieldType(visitInput_field_type(ctx.input_field_type()));
        return field;
    }

    @Override
    public InputFieldType visitInput_field_type(HTMLPHPPARSER.Input_field_typeContext ctx) {
        InputFieldType inputFieldType = new InputFieldType();
        if (ctx.EMAIL() != null) {
            inputFieldType.setType(ctx.EMAIL().getText());
        } else if (ctx.URL() != null) {
            inputFieldType.setType(ctx.URL().getText());
        } else if (ctx.PASSWORD() != null) {
            inputFieldType.setType(ctx.PASSWORD().getText());
        } else if (ctx.NUMBER() != null) {
            inputFieldType.setType(ctx.NUMBER().getText());
        } else inputFieldType.setType(ctx.TEXT().getText());
        return inputFieldType;
    }

    @Override
    public File visitFile(HTMLPHPPARSER.FileContext ctx) {
        File file = new File();
        file.setName(ctx.CHOICE_NAME().getText());
        return file;
    }

    @Override
    public Image visitImage(HTMLPHPPARSER.ImageContext ctx) {
        return this.visitImage_path(ctx.image_path());
    }


    @Override
    public MultipleChoice visitMultiple_choice_field(HTMLPHPPARSER.Multiple_choice_fieldContext ctx) {
        MultipleChoice multipleChoice = new MultipleChoice();
        if (ctx.checkbox() != null)
            multipleChoice.setCheckbox(visitCheckbox(ctx.checkbox()));
        else if (ctx.dropdown() != null)
            multipleChoice.setDropdown(visitDropdown(ctx.dropdown()));
        else multipleChoice.setRadio(visitRadio(ctx.radio()));
        return multipleChoice;

    }

    @Override
    public Image visitImage_path(HTMLPHPPARSER.Image_pathContext ctx) {
        Image image = new Image();
        image.setPath(ctx.DOUBLE_QUOT_INPUT_STRING().getText());
        return image;
    }

    @Override
    public InputText visitInput_text(HTMLPHPPARSER.Input_textContext ctx) {
        InputText inputText = new InputText();

        if (ctx.string() != null)
            inputText.setString(visitString(ctx.string()));
        else inputText.setInteger(visitInteger(ctx.integer()));
        return inputText;

    }

    @Override
    public String visitString(HTMLPHPPARSER.StringContext ctx) {
        String string = new String();
        if (ctx.single_quotations_string() != null)
            string.setText(visitSingle_quotations_string(ctx.single_quotations_string()));
        else string.setText(visitDouble_quotations_string(ctx.double_quotations_string()));
        return string;
    }

    @Override
    public java.lang.String visitDouble_quotations_string(HTMLPHPPARSER.Double_quotations_stringContext ctx) {
        return ctx.DOUBLE_QUOT_INPUT_STRING().getText();
    }

    @Override
    public java.lang.String visitSingle_quotations_string(HTMLPHPPARSER.Single_quotations_stringContext ctx) {
        return ctx.SINGLE_QUOT_INPUT_STRING().getText();
    }

    @Override
    public Integer visitInteger(HTMLPHPPARSER.IntegerContext ctx) {
        Integer integer = new Integer();
        integer.setNumber(java.lang.Integer.parseInt(ctx.INPUT_NUMBER().getText()));
        return integer;
    }

    @Override
    public Checkbox visitCheckbox(HTMLPHPPARSER.CheckboxContext ctx) {
        Checkbox checkbox = new Checkbox();
        checkbox.setKey(ctx.CHOICE_NAME().getText());
        for (int i = 0; i < ctx.input_text().size(); i++) {
            checkbox.addInputText(visitInput_text(ctx.input_text(i)));
        }
        return checkbox;
    }

    @Override
    public Dropdown visitDropdown(HTMLPHPPARSER.DropdownContext ctx) {
        Dropdown dropdown = new Dropdown();
        dropdown.setKey(ctx.CHOICE_NAME().getText());
        for (int i = 0; i < ctx.input_text().size(); i++) {
            dropdown.addField(visitInput_text(ctx.input_text(i)));
        }
        return dropdown;
    }

    @Override
    public Radio visitRadio(HTMLPHPPARSER.RadioContext ctx) {
        Radio radio = new Radio();
        radio.setKey(ctx.CHOICE_NAME().getText());
        radio.setFirstInputText(visitInput_text(ctx.input_text(0)));
        radio.setSecondInputText(visitInput_text(ctx.input_text(1)));
        return radio;
    }

    @Override
    public OutputText visitOutputText(HTMLPHPPARSER.OutputTextContext ctx) {
        OutputText outputText = new OutputText();
        outputText.setText(ctx.OUTPUT_TEXT().getText());
        return outputText;
    }


    private Variable createVar(java.lang.String name, List<HTMLPHPPARSER.Array_boundsContext> array_bounds) {
        Variable variable = new Variable();
        variable.setName(name);
        if (array_bounds != null) {
            for (HTMLPHPPARSER.Array_boundsContext array_bound : array_bounds) {
                variable.addDimension(visitArray_bounds(array_bound));
            }
        }
        return variable;
    }

    @Override
    public ArrayDimension visitArray_bounds(HTMLPHPPARSER.Array_boundsContext ctx) {
        ArrayDimension arrayDimension = new ArrayDimension();
        if (ctx.ARRAY_INDEX_NUMER() != null)
            arrayDimension.setIndexNumber(java.lang.Integer.parseInt(ctx.ARRAY_INDEX_NUMER().getText()));
        else arrayDimension.setIndexVar(ctx.ARRAY_INDEX_VAR().getText());
        return arrayDimension;
    }
}

