// Generated from JuicyBoys.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JuicyBoysParser}.
 */
public interface JuicyBoysListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JuicyBoysParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JuicyBoysParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#funcdecl_list}.
	 * @param ctx the parse tree
	 */
	void enterFuncdecl_list(JuicyBoysParser.Funcdecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#funcdecl_list}.
	 * @param ctx the parse tree
	 */
	void exitFuncdecl_list(JuicyBoysParser.Funcdecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(JuicyBoysParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(JuicyBoysParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#function_return}.
	 * @param ctx the parse tree
	 */
	void enterFunction_return(JuicyBoysParser.Function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#function_return}.
	 * @param ctx the parse tree
	 */
	void exitFunction_return(JuicyBoysParser.Function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#function_noreturn}.
	 * @param ctx the parse tree
	 */
	void enterFunction_noreturn(JuicyBoysParser.Function_noreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#function_noreturn}.
	 * @param ctx the parse tree
	 */
	void exitFunction_noreturn(JuicyBoysParser.Function_noreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(JuicyBoysParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(JuicyBoysParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(JuicyBoysParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(JuicyBoysParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#function_content}.
	 * @param ctx the parse tree
	 */
	void enterFunction_content(JuicyBoysParser.Function_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#function_content}.
	 * @param ctx the parse tree
	 */
	void exitFunction_content(JuicyBoysParser.Function_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(JuicyBoysParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(JuicyBoysParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#vardecl_list}.
	 * @param ctx the parse tree
	 */
	void enterVardecl_list(JuicyBoysParser.Vardecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#vardecl_list}.
	 * @param ctx the parse tree
	 */
	void exitVardecl_list(JuicyBoysParser.Vardecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#functiondec_vardecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondec_vardecl(JuicyBoysParser.Functiondec_vardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#functiondec_vardecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondec_vardecl(JuicyBoysParser.Functiondec_vardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#functioncall_vardecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall_vardecl(JuicyBoysParser.Functioncall_vardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#functioncall_vardecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall_vardecl(JuicyBoysParser.Functioncall_vardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(JuicyBoysParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(JuicyBoysParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(JuicyBoysParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(JuicyBoysParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JuicyBoysParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JuicyBoysParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(JuicyBoysParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(JuicyBoysParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JuicyBoysParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JuicyBoysParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(JuicyBoysParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(JuicyBoysParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#special_operator}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_operator(JuicyBoysParser.Special_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#special_operator}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_operator(JuicyBoysParser.Special_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#double_sign_operator}.
	 * @param ctx the parse tree
	 */
	void enterDouble_sign_operator(JuicyBoysParser.Double_sign_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#double_sign_operator}.
	 * @param ctx the parse tree
	 */
	void exitDouble_sign_operator(JuicyBoysParser.Double_sign_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(JuicyBoysParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(JuicyBoysParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#funccall_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunccall_statement(JuicyBoysParser.Funccall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#funccall_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunccall_statement(JuicyBoysParser.Funccall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterActual_parameter_list(JuicyBoysParser.Actual_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitActual_parameter_list(JuicyBoysParser.Actual_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#actual_params}.
	 * @param ctx the parse tree
	 */
	void enterActual_params(JuicyBoysParser.Actual_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#actual_params}.
	 * @param ctx the parse tree
	 */
	void exitActual_params(JuicyBoysParser.Actual_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#multiple_actual_parameters}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_actual_parameters(JuicyBoysParser.Multiple_actual_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#multiple_actual_parameters}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_actual_parameters(JuicyBoysParser.Multiple_actual_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(JuicyBoysParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(JuicyBoysParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(JuicyBoysParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(JuicyBoysParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(JuicyBoysParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(JuicyBoysParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(JuicyBoysParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(JuicyBoysParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(JuicyBoysParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(JuicyBoysParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(JuicyBoysParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(JuicyBoysParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(JuicyBoysParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(JuicyBoysParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JuicyBoysParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JuicyBoysParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(JuicyBoysParser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(JuicyBoysParser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void enterNum_expression(JuicyBoysParser.Num_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void exitNum_expression(JuicyBoysParser.Num_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#num_term}.
	 * @param ctx the parse tree
	 */
	void enterNum_term(JuicyBoysParser.Num_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#num_term}.
	 * @param ctx the parse tree
	 */
	void exitNum_term(JuicyBoysParser.Num_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void enterNum_factor(JuicyBoysParser.Num_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void exitNum_factor(JuicyBoysParser.Num_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#num_identifier}.
	 * @param ctx the parse tree
	 */
	void enterNum_identifier(JuicyBoysParser.Num_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#num_identifier}.
	 * @param ctx the parse tree
	 */
	void exitNum_identifier(JuicyBoysParser.Num_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_expression(JuicyBoysParser.Bool_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_expression(JuicyBoysParser.Bool_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#bool_expression_for}.
	 * @param ctx the parse tree
	 */
	void enterBool_expression_for(JuicyBoysParser.Bool_expression_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#bool_expression_for}.
	 * @param ctx the parse tree
	 */
	void exitBool_expression_for(JuicyBoysParser.Bool_expression_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(JuicyBoysParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(JuicyBoysParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#bool_logical}.
	 * @param ctx the parse tree
	 */
	void enterBool_logical(JuicyBoysParser.Bool_logicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#bool_logical}.
	 * @param ctx the parse tree
	 */
	void exitBool_logical(JuicyBoysParser.Bool_logicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void enterBool_term(JuicyBoysParser.Bool_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void exitBool_term(JuicyBoysParser.Bool_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#bool_factor}.
	 * @param ctx the parse tree
	 */
	void enterBool_factor(JuicyBoysParser.Bool_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#bool_factor}.
	 * @param ctx the parse tree
	 */
	void exitBool_factor(JuicyBoysParser.Bool_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#bool_identifier}.
	 * @param ctx the parse tree
	 */
	void enterBool_identifier(JuicyBoysParser.Bool_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#bool_identifier}.
	 * @param ctx the parse tree
	 */
	void exitBool_identifier(JuicyBoysParser.Bool_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constdecl_list}.
	 * @param ctx the parse tree
	 */
	void enterConstdecl_list(JuicyBoysParser.Constdecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constdecl_list}.
	 * @param ctx the parse tree
	 */
	void exitConstdecl_list(JuicyBoysParser.Constdecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void enterConst_statement(JuicyBoysParser.Const_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void exitConst_statement(JuicyBoysParser.Const_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(JuicyBoysParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(JuicyBoysParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(JuicyBoysParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(JuicyBoysParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(JuicyBoysParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(JuicyBoysParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#output_list}.
	 * @param ctx the parse tree
	 */
	void enterOutput_list(JuicyBoysParser.Output_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#output_list}.
	 * @param ctx the parse tree
	 */
	void exitOutput_list(JuicyBoysParser.Output_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(JuicyBoysParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(JuicyBoysParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#input_list}.
	 * @param ctx the parse tree
	 */
	void enterInput_list(JuicyBoysParser.Input_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#input_list}.
	 * @param ctx the parse tree
	 */
	void exitInput_list(JuicyBoysParser.Input_listContext ctx);
}