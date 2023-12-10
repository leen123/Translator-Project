// Generated from D:/Mriwed/src\HTMLPHPPARSER.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLPHPPARSER}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLPHPPARSERVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(HTMLPHPPARSER.AppContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#define_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_page(HTMLPHPPARSER.Define_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#define_controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_controller(HTMLPHPPARSER.Define_controllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#submit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubmit(HTMLPHPPARSER.SubmitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(HTMLPHPPARSER.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitController(HTMLPHPPARSER.ControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(HTMLPHPPARSER.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#controller_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitController_body(HTMLPHPPARSER.Controller_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(HTMLPHPPARSER.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(HTMLPHPPARSER.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#else_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_end(HTMLPHPPARSER.Else_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#define_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_array(HTMLPHPPARSER.Define_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#array_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_values(HTMLPHPPARSER.Array_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(HTMLPHPPARSER.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#var_or_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_or_number(HTMLPHPPARSER.Var_or_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(HTMLPHPPARSER.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#add_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_function(HTMLPHPPARSER.Add_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#to_lower_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_lower_function(HTMLPHPPARSER.To_lower_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#to_upper_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_upper_function(HTMLPHPPARSER.To_upper_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#goto_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_page(HTMLPHPPARSER.Goto_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#exepression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExepression(HTMLPHPPARSER.ExepressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#left_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_expression(HTMLPHPPARSER.Left_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#right_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_expression(HTMLPHPPARSER.Right_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#exepression_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExepression_var(HTMLPHPPARSER.Exepression_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#exepression_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExepression_operator(HTMLPHPPARSER.Exepression_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#opertator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpertator(HTMLPHPPARSER.OpertatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#array_bounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_bounds(HTMLPHPPARSER.Array_boundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(HTMLPHPPARSER.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(HTMLPHPPARSER.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(HTMLPHPPARSER.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#input_field_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_field_type(HTMLPHPPARSER.Input_field_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(HTMLPHPPARSER.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(HTMLPHPPARSER.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#multiple_choice_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_choice_field(HTMLPHPPARSER.Multiple_choice_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#image_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_path(HTMLPHPPARSER.Image_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#input_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_text(HTMLPHPPARSER.Input_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(HTMLPHPPARSER.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#double_quotations_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotations_string(HTMLPHPPARSER.Double_quotations_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#single_quotations_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotations_string(HTMLPHPPARSER.Single_quotations_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(HTMLPHPPARSER.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#checkbox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckbox(HTMLPHPPARSER.CheckboxContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#dropdown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropdown(HTMLPHPPARSER.DropdownContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#radio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadio(HTMLPHPPARSER.RadioContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLPHPPARSER#outputText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputText(HTMLPHPPARSER.OutputTextContext ctx);
}