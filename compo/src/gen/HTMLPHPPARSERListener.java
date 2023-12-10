// Generated from D:/Mriwed/src\HTMLPHPPARSER.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLPHPPARSER}.
 */
public interface HTMLPHPPARSERListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(HTMLPHPPARSER.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(HTMLPHPPARSER.AppContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#define_page}.
	 * @param ctx the parse tree
	 */
	void enterDefine_page(HTMLPHPPARSER.Define_pageContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#define_page}.
	 * @param ctx the parse tree
	 */
	void exitDefine_page(HTMLPHPPARSER.Define_pageContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#define_controller}.
	 * @param ctx the parse tree
	 */
	void enterDefine_controller(HTMLPHPPARSER.Define_controllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#define_controller}.
	 * @param ctx the parse tree
	 */
	void exitDefine_controller(HTMLPHPPARSER.Define_controllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#submit}.
	 * @param ctx the parse tree
	 */
	void enterSubmit(HTMLPHPPARSER.SubmitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#submit}.
	 * @param ctx the parse tree
	 */
	void exitSubmit(HTMLPHPPARSER.SubmitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(HTMLPHPPARSER.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(HTMLPHPPARSER.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#controller}.
	 * @param ctx the parse tree
	 */
	void enterController(HTMLPHPPARSER.ControllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#controller}.
	 * @param ctx the parse tree
	 */
	void exitController(HTMLPHPPARSER.ControllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(HTMLPHPPARSER.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(HTMLPHPPARSER.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#controller_body}.
	 * @param ctx the parse tree
	 */
	void enterController_body(HTMLPHPPARSER.Controller_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#controller_body}.
	 * @param ctx the parse tree
	 */
	void exitController_body(HTMLPHPPARSER.Controller_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(HTMLPHPPARSER.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(HTMLPHPPARSER.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(HTMLPHPPARSER.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(HTMLPHPPARSER.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#else_end}.
	 * @param ctx the parse tree
	 */
	void enterElse_end(HTMLPHPPARSER.Else_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#else_end}.
	 * @param ctx the parse tree
	 */
	void exitElse_end(HTMLPHPPARSER.Else_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#define_array}.
	 * @param ctx the parse tree
	 */
	void enterDefine_array(HTMLPHPPARSER.Define_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#define_array}.
	 * @param ctx the parse tree
	 */
	void exitDefine_array(HTMLPHPPARSER.Define_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#array_values}.
	 * @param ctx the parse tree
	 */
	void enterArray_values(HTMLPHPPARSER.Array_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#array_values}.
	 * @param ctx the parse tree
	 */
	void exitArray_values(HTMLPHPPARSER.Array_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(HTMLPHPPARSER.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(HTMLPHPPARSER.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#var_or_number}.
	 * @param ctx the parse tree
	 */
	void enterVar_or_number(HTMLPHPPARSER.Var_or_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#var_or_number}.
	 * @param ctx the parse tree
	 */
	void exitVar_or_number(HTMLPHPPARSER.Var_or_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HTMLPHPPARSER.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HTMLPHPPARSER.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#add_function}.
	 * @param ctx the parse tree
	 */
	void enterAdd_function(HTMLPHPPARSER.Add_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#add_function}.
	 * @param ctx the parse tree
	 */
	void exitAdd_function(HTMLPHPPARSER.Add_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#to_lower_function}.
	 * @param ctx the parse tree
	 */
	void enterTo_lower_function(HTMLPHPPARSER.To_lower_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#to_lower_function}.
	 * @param ctx the parse tree
	 */
	void exitTo_lower_function(HTMLPHPPARSER.To_lower_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#to_upper_function}.
	 * @param ctx the parse tree
	 */
	void enterTo_upper_function(HTMLPHPPARSER.To_upper_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#to_upper_function}.
	 * @param ctx the parse tree
	 */
	void exitTo_upper_function(HTMLPHPPARSER.To_upper_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#goto_page}.
	 * @param ctx the parse tree
	 */
	void enterGoto_page(HTMLPHPPARSER.Goto_pageContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#goto_page}.
	 * @param ctx the parse tree
	 */
	void exitGoto_page(HTMLPHPPARSER.Goto_pageContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#exepression}.
	 * @param ctx the parse tree
	 */
	void enterExepression(HTMLPHPPARSER.ExepressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#exepression}.
	 * @param ctx the parse tree
	 */
	void exitExepression(HTMLPHPPARSER.ExepressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#left_expression}.
	 * @param ctx the parse tree
	 */
	void enterLeft_expression(HTMLPHPPARSER.Left_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#left_expression}.
	 * @param ctx the parse tree
	 */
	void exitLeft_expression(HTMLPHPPARSER.Left_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#right_expression}.
	 * @param ctx the parse tree
	 */
	void enterRight_expression(HTMLPHPPARSER.Right_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#right_expression}.
	 * @param ctx the parse tree
	 */
	void exitRight_expression(HTMLPHPPARSER.Right_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#exepression_var}.
	 * @param ctx the parse tree
	 */
	void enterExepression_var(HTMLPHPPARSER.Exepression_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#exepression_var}.
	 * @param ctx the parse tree
	 */
	void exitExepression_var(HTMLPHPPARSER.Exepression_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#exepression_operator}.
	 * @param ctx the parse tree
	 */
	void enterExepression_operator(HTMLPHPPARSER.Exepression_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#exepression_operator}.
	 * @param ctx the parse tree
	 */
	void exitExepression_operator(HTMLPHPPARSER.Exepression_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#opertator}.
	 * @param ctx the parse tree
	 */
	void enterOpertator(HTMLPHPPARSER.OpertatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#opertator}.
	 * @param ctx the parse tree
	 */
	void exitOpertator(HTMLPHPPARSER.OpertatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#array_bounds}.
	 * @param ctx the parse tree
	 */
	void enterArray_bounds(HTMLPHPPARSER.Array_boundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#array_bounds}.
	 * @param ctx the parse tree
	 */
	void exitArray_bounds(HTMLPHPPARSER.Array_boundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(HTMLPHPPARSER.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(HTMLPHPPARSER.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(HTMLPHPPARSER.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(HTMLPHPPARSER.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#field}.
	 * @param ctx the parse tree
	 */
	void enterField(HTMLPHPPARSER.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#field}.
	 * @param ctx the parse tree
	 */
	void exitField(HTMLPHPPARSER.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#input_field_type}.
	 * @param ctx the parse tree
	 */
	void enterInput_field_type(HTMLPHPPARSER.Input_field_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#input_field_type}.
	 * @param ctx the parse tree
	 */
	void exitInput_field_type(HTMLPHPPARSER.Input_field_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(HTMLPHPPARSER.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(HTMLPHPPARSER.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(HTMLPHPPARSER.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(HTMLPHPPARSER.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#multiple_choice_field}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_choice_field(HTMLPHPPARSER.Multiple_choice_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#multiple_choice_field}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_choice_field(HTMLPHPPARSER.Multiple_choice_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#image_path}.
	 * @param ctx the parse tree
	 */
	void enterImage_path(HTMLPHPPARSER.Image_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#image_path}.
	 * @param ctx the parse tree
	 */
	void exitImage_path(HTMLPHPPARSER.Image_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#input_text}.
	 * @param ctx the parse tree
	 */
	void enterInput_text(HTMLPHPPARSER.Input_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#input_text}.
	 * @param ctx the parse tree
	 */
	void exitInput_text(HTMLPHPPARSER.Input_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#string}.
	 * @param ctx the parse tree
	 */
	void enterString(HTMLPHPPARSER.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#string}.
	 * @param ctx the parse tree
	 */
	void exitString(HTMLPHPPARSER.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#double_quotations_string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quotations_string(HTMLPHPPARSER.Double_quotations_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#double_quotations_string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quotations_string(HTMLPHPPARSER.Double_quotations_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#single_quotations_string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quotations_string(HTMLPHPPARSER.Single_quotations_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#single_quotations_string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quotations_string(HTMLPHPPARSER.Single_quotations_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(HTMLPHPPARSER.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(HTMLPHPPARSER.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#checkbox}.
	 * @param ctx the parse tree
	 */
	void enterCheckbox(HTMLPHPPARSER.CheckboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#checkbox}.
	 * @param ctx the parse tree
	 */
	void exitCheckbox(HTMLPHPPARSER.CheckboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#dropdown}.
	 * @param ctx the parse tree
	 */
	void enterDropdown(HTMLPHPPARSER.DropdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#dropdown}.
	 * @param ctx the parse tree
	 */
	void exitDropdown(HTMLPHPPARSER.DropdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#radio}.
	 * @param ctx the parse tree
	 */
	void enterRadio(HTMLPHPPARSER.RadioContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#radio}.
	 * @param ctx the parse tree
	 */
	void exitRadio(HTMLPHPPARSER.RadioContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLPHPPARSER#outputText}.
	 * @param ctx the parse tree
	 */
	void enterOutputText(HTMLPHPPARSER.OutputTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLPHPPARSER#outputText}.
	 * @param ctx the parse tree
	 */
	void exitOutputText(HTMLPHPPARSER.OutputTextContext ctx);
}