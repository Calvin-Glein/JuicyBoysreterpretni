// Generated from JuicyBoys.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JuicyBoysParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JuicyBoysVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(JuicyBoysParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#funcdecl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdecl_list(JuicyBoysParser.Funcdecl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(JuicyBoysParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_return(JuicyBoysParser.Function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#function_noreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_noreturn(JuicyBoysParser.Function_noreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(JuicyBoysParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(JuicyBoysParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#function_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_content(JuicyBoysParser.Function_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(JuicyBoysParser.Main_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#vardecl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl_list(JuicyBoysParser.Vardecl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#functiondec_vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondec_vardecl(JuicyBoysParser.Functiondec_vardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#functioncall_vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall_vardecl(JuicyBoysParser.Functioncall_vardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(JuicyBoysParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(JuicyBoysParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JuicyBoysParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(JuicyBoysParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JuicyBoysParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(JuicyBoysParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#special_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_operator(JuicyBoysParser.Special_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#double_sign_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_sign_operator(JuicyBoysParser.Double_sign_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(JuicyBoysParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#funccall_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall_statement(JuicyBoysParser.Funccall_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_parameter_list(JuicyBoysParser.Actual_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#actual_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_params(JuicyBoysParser.Actual_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#multiple_actual_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_actual_parameters(JuicyBoysParser.Multiple_actual_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(JuicyBoysParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(JuicyBoysParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(JuicyBoysParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(JuicyBoysParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(JuicyBoysParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(JuicyBoysParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(JuicyBoysParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JuicyBoysParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#string_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_expression(JuicyBoysParser.String_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#num_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expression(JuicyBoysParser.Num_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#num_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_term(JuicyBoysParser.Num_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#num_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_factor(JuicyBoysParser.Num_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#num_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_identifier(JuicyBoysParser.Num_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expression(JuicyBoysParser.Bool_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#bool_expression_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expression_for(JuicyBoysParser.Bool_expression_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(JuicyBoysParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#bool_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_logical(JuicyBoysParser.Bool_logicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#bool_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_term(JuicyBoysParser.Bool_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#bool_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_factor(JuicyBoysParser.Bool_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#bool_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_identifier(JuicyBoysParser.Bool_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#constdecl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstdecl_list(JuicyBoysParser.Constdecl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#const_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_statement(JuicyBoysParser.Const_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(JuicyBoysParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(JuicyBoysParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(JuicyBoysParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#output_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_list(JuicyBoysParser.Output_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(JuicyBoysParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#input_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_list(JuicyBoysParser.Input_listContext ctx);
}