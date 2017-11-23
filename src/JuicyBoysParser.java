// Generated from JuicyBoys.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuicyBoysParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUOTE1=1, QUOTE2=2, INTEGER_LITERAL=3, CHAR_LITERAL=4, FLOAT_LITERAL=5, 
		STRING_LITERAL=6, VARIABLE_IDENTIFIER=7, COMMENT_BLOCK=8, TERMINATOR=9, 
		RETURN_KEYWORD=10, INTEGER_KEYWORD=11, BOOLEAN_KEYWORD=12, FLOAT_KEYWORD=13, 
		STRING_KEYWORD=14, CHAR_KEYWORD=15, VOID_KEYWORD=16, DOUBLE_KEYWORD=17, 
		DO_LOOP=18, WHILE_LOOP=19, FOR_LOOP=20, OUTPUT_FUNCTION=21, INPUT_FUNCTION=22, 
		MAIN_KEYWORD=23, IF_STATEMENT=24, ELSE_STATEMENT=25, COLON=26, ADDITION_OPERATOR=27, 
		SUBTRACTION_OPERATOR=28, MULTIPLICATION_OPERATOR=29, DIVISION_OPERATOR=30, 
		MODULO_OPERATOR=31, INCREMENTAL_OPERATOR=32, DECREMENTAL_OPERATOR=33, 
		AND_operator=34, OR_operator=35, NOT_operator=36, ASSIGNMENT_OPERATOR=37, 
		PLUS_EQUAL_OPERATOR=38, MINUS_EQUAL_OPERATOR=39, TIMES_EQUAL_OPERATOR=40, 
		DIVIDE_EQUAL_OPERATOR=41, MODULO_EQUAL_OPERATOR=42, GREATER_THAN_OPERATOR=43, 
		LESS_THAN_OPERATOR=44, LESS_EQUAL_OPERATOR=45, GREATER_EQUAL_OPERATOR=46, 
		NOT_EQUAL_OPERATOR=47, EQUALS_OPERATOR=48, OPEN_BRACE=49, CLOSE_BRACE=50, 
		OPEN_BRACKET=51, CLOSE_BRACKET=52, OPEN_PAR=53, CLOSE_PAR=54, COMMA=55, 
		ARRAY_IDENTIFIER=56, FUNCTION_IDENTIFIER=57, CONSTANT_KEYWORD=58, TRUE_LITERAL=59, 
		FALSE_LITERAL=60, WS=61;
	public static final int
		RULE_start = 0, RULE_funcdecl_list = 1, RULE_function_declaration = 2, 
		RULE_function_return = 3, RULE_function_noreturn = 4, RULE_parameter_list = 5, 
		RULE_parameters = 6, RULE_function_content = 7, RULE_main_function = 8, 
		RULE_vardecl_list = 9, RULE_functiondec_vardecl = 10, RULE_functioncall_vardecl = 11, 
		RULE_var_decl = 12, RULE_data_type = 13, RULE_array = 14, RULE_identifier_list = 15, 
		RULE_statement = 16, RULE_operator = 17, RULE_special_operator = 18, RULE_double_sign_operator = 19, 
		RULE_assignment_statement = 20, RULE_funccall_statement = 21, RULE_actual_parameter_list = 22, 
		RULE_actual_params = 23, RULE_multiple_actual_parameters = 24, RULE_return_statement = 25, 
		RULE_if_statement = 26, RULE_while_statement = 27, RULE_do_while_statement = 28, 
		RULE_for_statement = 29, RULE_statement_list = 30, RULE_literals = 31, 
		RULE_expression = 32, RULE_string_expression = 33, RULE_num_expression = 34, 
		RULE_num_term = 35, RULE_num_factor = 36, RULE_num_identifier = 37, RULE_bool_expression = 38, 
		RULE_bool_expression_for = 39, RULE_rel_op = 40, RULE_bool_logical = 41, 
		RULE_bool_term = 42, RULE_bool_factor = 43, RULE_bool_identifier = 44, 
		RULE_constdecl_list = 45, RULE_const_statement = 46, RULE_constant = 47, 
		RULE_sign = 48, RULE_output = 49, RULE_output_list = 50, RULE_input = 51, 
		RULE_input_list = 52;
	public static final String[] ruleNames = {
		"start", "funcdecl_list", "function_declaration", "function_return", "function_noreturn", 
		"parameter_list", "parameters", "function_content", "main_function", "vardecl_list", 
		"functiondec_vardecl", "functioncall_vardecl", "var_decl", "data_type", 
		"array", "identifier_list", "statement", "operator", "special_operator", 
		"double_sign_operator", "assignment_statement", "funccall_statement", 
		"actual_parameter_list", "actual_params", "multiple_actual_parameters", 
		"return_statement", "if_statement", "while_statement", "do_while_statement", 
		"for_statement", "statement_list", "literals", "expression", "string_expression", 
		"num_expression", "num_term", "num_factor", "num_identifier", "bool_expression", 
		"bool_expression_for", "rel_op", "bool_logical", "bool_term", "bool_factor", 
		"bool_identifier", "constdecl_list", "const_statement", "constant", "sign", 
		"output", "output_list", "input", "input_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "';'", "'return'", 
		"'int'", "'boolean'", "'float'", "'string'", "'char'", "'void'", "'double'", 
		"'do'", "'while'", "'for'", "'output'", "'input'", "'main'", "'if'", "'else'", 
		"':'", "'+'", "'-'", "'*'", "'/'", "'%'", "'padagdag'", "'pabawas'", "'tsaka'", 
		"'pwede rin'", "'hindi'", null, "'+='", "'-='", "'*='", null, "'%='", 
		"'>'", "'<'", null, "'>='", "'!='", "'=='", "'{'", "'}'", "'['", "']'", 
		"'('", "')'", "','", null, null, "'kunstant'", "'totoo'", "'talon'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "QUOTE1", "QUOTE2", "INTEGER_LITERAL", "CHAR_LITERAL", "FLOAT_LITERAL", 
		"STRING_LITERAL", "VARIABLE_IDENTIFIER", "COMMENT_BLOCK", "TERMINATOR", 
		"RETURN_KEYWORD", "INTEGER_KEYWORD", "BOOLEAN_KEYWORD", "FLOAT_KEYWORD", 
		"STRING_KEYWORD", "CHAR_KEYWORD", "VOID_KEYWORD", "DOUBLE_KEYWORD", "DO_LOOP", 
		"WHILE_LOOP", "FOR_LOOP", "OUTPUT_FUNCTION", "INPUT_FUNCTION", "MAIN_KEYWORD", 
		"IF_STATEMENT", "ELSE_STATEMENT", "COLON", "ADDITION_OPERATOR", "SUBTRACTION_OPERATOR", 
		"MULTIPLICATION_OPERATOR", "DIVISION_OPERATOR", "MODULO_OPERATOR", "INCREMENTAL_OPERATOR", 
		"DECREMENTAL_OPERATOR", "AND_operator", "OR_operator", "NOT_operator", 
		"ASSIGNMENT_OPERATOR", "PLUS_EQUAL_OPERATOR", "MINUS_EQUAL_OPERATOR", 
		"TIMES_EQUAL_OPERATOR", "DIVIDE_EQUAL_OPERATOR", "MODULO_EQUAL_OPERATOR", 
		"GREATER_THAN_OPERATOR", "LESS_THAN_OPERATOR", "LESS_EQUAL_OPERATOR", 
		"GREATER_EQUAL_OPERATOR", "NOT_EQUAL_OPERATOR", "EQUALS_OPERATOR", "OPEN_BRACE", 
		"CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PAR", "CLOSE_PAR", 
		"COMMA", "ARRAY_IDENTIFIER", "FUNCTION_IDENTIFIER", "CONSTANT_KEYWORD", 
		"TRUE_LITERAL", "FALSE_LITERAL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JuicyBoys.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JuicyBoysParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public Constdecl_listContext constdecl_list() {
			return getRuleContext(Constdecl_listContext.class,0);
		}
		public Funcdecl_listContext funcdecl_list() {
			return getRuleContext(Funcdecl_listContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT_KEYWORD) {
				{
				setState(106);
				constdecl_list();
				}
			}

			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(109);
				funcdecl_list();
				}
				break;
			}
			setState(112);
			main_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funcdecl_listContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Funcdecl_listContext funcdecl_list() {
			return getRuleContext(Funcdecl_listContext.class,0);
		}
		public Funcdecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFuncdecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFuncdecl_list(this);
		}
	}

	public final Funcdecl_listContext funcdecl_list() throws RecognitionException {
		Funcdecl_listContext _localctx = new Funcdecl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcdecl_list);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				function_declaration();
				setState(115);
				funcdecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				function_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Function_noreturnContext function_noreturn() {
			return getRuleContext(Function_noreturnContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_declaration);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_KEYWORD:
			case BOOLEAN_KEYWORD:
			case FLOAT_KEYWORD:
			case STRING_KEYWORD:
			case CHAR_KEYWORD:
			case DOUBLE_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				function_return();
				}
				break;
			case VOID_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				function_noreturn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_returnContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(JuicyBoysParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Functiondec_vardeclContext functiondec_vardecl() {
			return getRuleContext(Functiondec_vardeclContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public Function_contentContext function_content() {
			return getRuleContext(Function_contentContext.class,0);
		}
		public Function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunction_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunction_return(this);
		}
	}

	public final Function_returnContext function_return() throws RecognitionException {
		Function_returnContext _localctx = new Function_returnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_return);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				data_type();
				setState(125);
				match(FUNCTION_IDENTIFIER);
				setState(126);
				match(OPEN_PAR);
				setState(127);
				functiondec_vardecl();
				setState(128);
				match(CLOSE_PAR);
				setState(129);
				function_content();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				data_type();
				setState(132);
				match(FUNCTION_IDENTIFIER);
				setState(133);
				match(OPEN_PAR);
				setState(134);
				match(CLOSE_PAR);
				setState(135);
				function_content();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_noreturnContext extends ParserRuleContext {
		public TerminalNode VOID_KEYWORD() { return getToken(JuicyBoysParser.VOID_KEYWORD, 0); }
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(JuicyBoysParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Functiondec_vardeclContext functiondec_vardecl() {
			return getRuleContext(Functiondec_vardeclContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public Function_contentContext function_content() {
			return getRuleContext(Function_contentContext.class,0);
		}
		public Function_noreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_noreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunction_noreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunction_noreturn(this);
		}
	}

	public final Function_noreturnContext function_noreturn() throws RecognitionException {
		Function_noreturnContext _localctx = new Function_noreturnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_noreturn);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(VOID_KEYWORD);
				setState(140);
				match(FUNCTION_IDENTIFIER);
				setState(141);
				match(OPEN_PAR);
				setState(142);
				functiondec_vardecl();
				setState(143);
				match(CLOSE_PAR);
				setState(144);
				function_content();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(VOID_KEYWORD);
				setState(147);
				match(FUNCTION_IDENTIFIER);
				setState(148);
				match(OPEN_PAR);
				setState(149);
				match(CLOSE_PAR);
				setState(150);
				function_content();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JuicyBoysParser.COMMA, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				var_decl();
				setState(156);
				match(COMMA);
				setState(157);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				var_decl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_contentContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(JuicyBoysParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(JuicyBoysParser.CLOSE_BRACE, 0); }
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Function_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunction_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunction_content(this);
		}
	}

	public final Function_contentContext function_content() throws RecognitionException {
		Function_contentContext _localctx = new Function_contentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(OPEN_BRACE);
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(163);
				vardecl_list();
				}
				break;
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << CHAR_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << VARIABLE_IDENTIFIER) | (1L << COMMENT_BLOCK) | (1L << RETURN_KEYWORD) | (1L << DO_LOOP) | (1L << WHILE_LOOP) | (1L << FOR_LOOP) | (1L << OUTPUT_FUNCTION) | (1L << IF_STATEMENT) | (1L << NOT_operator) | (1L << OPEN_BRACE) | (1L << OPEN_PAR) | (1L << FUNCTION_IDENTIFIER) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL))) != 0)) {
				{
				setState(166);
				statement_list();
				}
			}

			setState(169);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode VOID_KEYWORD() { return getToken(JuicyBoysParser.VOID_KEYWORD, 0); }
		public TerminalNode MAIN_KEYWORD() { return getToken(JuicyBoysParser.MAIN_KEYWORD, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public Function_contentContext function_content() {
			return getRuleContext(Function_contentContext.class,0);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitMain_function(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_main_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(VOID_KEYWORD);
			setState(172);
			match(MAIN_KEYWORD);
			setState(173);
			match(OPEN_PAR);
			setState(174);
			match(CLOSE_PAR);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(175);
				function_content();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vardecl_listContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(JuicyBoysParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public Vardecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterVardecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitVardecl_list(this);
		}
	}

	public final Vardecl_listContext vardecl_list() throws RecognitionException {
		Vardecl_listContext _localctx = new Vardecl_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vardecl_list);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				var_decl();
				setState(179);
				match(ASSIGNMENT_OPERATOR);
				setState(180);
				expression(0);
				setState(181);
				match(TERMINATOR);
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(182);
					vardecl_list();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				input();
				setState(186);
				match(TERMINATOR);
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(187);
					vardecl_list();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				var_decl();
				setState(191);
				match(TERMINATOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functiondec_vardeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JuicyBoysParser.COMMA, 0); }
		public Functiondec_vardeclContext functiondec_vardecl() {
			return getRuleContext(Functiondec_vardeclContext.class,0);
		}
		public Functiondec_vardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondec_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunctiondec_vardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunctiondec_vardecl(this);
		}
	}

	public final Functiondec_vardeclContext functiondec_vardecl() throws RecognitionException {
		Functiondec_vardeclContext _localctx = new Functiondec_vardeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functiondec_vardecl);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				var_decl();
				setState(196);
				match(COMMA);
				setState(197);
				functiondec_vardecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				var_decl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functioncall_vardeclContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Functioncall_vardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunctioncall_vardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunctioncall_vardecl(this);
		}
	}

	public final Functioncall_vardeclContext functioncall_vardecl() throws RecognitionException {
		Functioncall_vardeclContext _localctx = new Functioncall_vardeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functioncall_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			identifier_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_decl);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				data_type();
				setState(205);
				identifier_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER_KEYWORD() { return getToken(JuicyBoysParser.INTEGER_KEYWORD, 0); }
		public TerminalNode DOUBLE_KEYWORD() { return getToken(JuicyBoysParser.DOUBLE_KEYWORD, 0); }
		public TerminalNode CHAR_KEYWORD() { return getToken(JuicyBoysParser.CHAR_KEYWORD, 0); }
		public TerminalNode STRING_KEYWORD() { return getToken(JuicyBoysParser.STRING_KEYWORD, 0); }
		public TerminalNode BOOLEAN_KEYWORD() { return getToken(JuicyBoysParser.BOOLEAN_KEYWORD, 0); }
		public TerminalNode FLOAT_KEYWORD() { return getToken(JuicyBoysParser.FLOAT_KEYWORD, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_KEYWORD) | (1L << BOOLEAN_KEYWORD) | (1L << FLOAT_KEYWORD) | (1L << STRING_KEYWORD) | (1L << CHAR_KEYWORD) | (1L << DOUBLE_KEYWORD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ARRAY_IDENTIFIER() { return getToken(JuicyBoysParser.ARRAY_IDENTIFIER, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			data_type();
			setState(213);
			match(ARRAY_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(JuicyBoysParser.COMMA, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitIdentifier_list(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifier_list);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(VARIABLE_IDENTIFIER);
				setState(216);
				match(COMMA);
				setState(217);
				identifier_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(JuicyBoysParser.OPEN_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(JuicyBoysParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMENT_BLOCK() { return getToken(JuicyBoysParser.COMMENT_BLOCK, 0); }
		public Output_listContext output_list() {
			return getRuleContext(Output_listContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				assignment_statement();
				setState(222);
				match(TERMINATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				funccall_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				do_while_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				for_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(229);
				return_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(230);
				match(OPEN_BRACE);
				setState(231);
				statement_list();
				setState(232);
				match(CLOSE_BRACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(234);
				match(COMMENT_BLOCK);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(235);
				output_list();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(236);
				output();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode ADDITION_OPERATOR() { return getToken(JuicyBoysParser.ADDITION_OPERATOR, 0); }
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(JuicyBoysParser.SUBTRACTION_OPERATOR, 0); }
		public TerminalNode MULTIPLICATION_OPERATOR() { return getToken(JuicyBoysParser.MULTIPLICATION_OPERATOR, 0); }
		public TerminalNode DIVISION_OPERATOR() { return getToken(JuicyBoysParser.DIVISION_OPERATOR, 0); }
		public TerminalNode MODULO_OPERATOR() { return getToken(JuicyBoysParser.MODULO_OPERATOR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITION_OPERATOR) | (1L << SUBTRACTION_OPERATOR) | (1L << MULTIPLICATION_OPERATOR) | (1L << DIVISION_OPERATOR) | (1L << MODULO_OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.PLUS_EQUAL_OPERATOR, 0); }
		public TerminalNode MINUS_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.MINUS_EQUAL_OPERATOR, 0); }
		public TerminalNode DIVIDE_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.DIVIDE_EQUAL_OPERATOR, 0); }
		public TerminalNode TIMES_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.TIMES_EQUAL_OPERATOR, 0); }
		public TerminalNode MODULO_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.MODULO_EQUAL_OPERATOR, 0); }
		public Special_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterSpecial_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitSpecial_operator(this);
		}
	}

	public final Special_operatorContext special_operator() throws RecognitionException {
		Special_operatorContext _localctx = new Special_operatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_special_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_EQUAL_OPERATOR) | (1L << MINUS_EQUAL_OPERATOR) | (1L << TIMES_EQUAL_OPERATOR) | (1L << DIVIDE_EQUAL_OPERATOR) | (1L << MODULO_EQUAL_OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_sign_operatorContext extends ParserRuleContext {
		public TerminalNode INCREMENTAL_OPERATOR() { return getToken(JuicyBoysParser.INCREMENTAL_OPERATOR, 0); }
		public TerminalNode DECREMENTAL_OPERATOR() { return getToken(JuicyBoysParser.DECREMENTAL_OPERATOR, 0); }
		public Double_sign_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_sign_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterDouble_sign_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitDouble_sign_operator(this);
		}
	}

	public final Double_sign_operatorContext double_sign_operator() throws RecognitionException {
		Double_sign_operatorContext _localctx = new Double_sign_operatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_double_sign_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==INCREMENTAL_OPERATOR || _la==DECREMENTAL_OPERATOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(JuicyBoysParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public Double_sign_operatorContext double_sign_operator() {
			return getRuleContext(Double_sign_operatorContext.class,0);
		}
		public Special_operatorContext special_operator() {
			return getRuleContext(Special_operatorContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment_statement);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(VARIABLE_IDENTIFIER);
				setState(246);
				match(ASSIGNMENT_OPERATOR);
				setState(247);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(VARIABLE_IDENTIFIER);
				setState(249);
				match(ASSIGNMENT_OPERATOR);
				setState(250);
				input();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(VARIABLE_IDENTIFIER);
				setState(252);
				double_sign_operator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(VARIABLE_IDENTIFIER);
				setState(254);
				special_operator();
				setState(255);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funccall_statementContext extends ParserRuleContext {
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(JuicyBoysParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public Funccall_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunccall_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunccall_statement(this);
		}
	}

	public final Funccall_statementContext funccall_statement() throws RecognitionException {
		Funccall_statementContext _localctx = new Funccall_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funccall_statement);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(FUNCTION_IDENTIFIER);
				setState(260);
				match(OPEN_PAR);
				setState(261);
				actual_parameter_list();
				setState(262);
				match(CLOSE_PAR);
				setState(263);
				match(TERMINATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(FUNCTION_IDENTIFIER);
				setState(266);
				match(OPEN_PAR);
				setState(267);
				match(CLOSE_PAR);
				setState(268);
				match(TERMINATOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_parameter_listContext extends ParserRuleContext {
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public Actual_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterActual_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitActual_parameter_list(this);
		}
	}

	public final Actual_parameter_listContext actual_parameter_list() throws RecognitionException {
		Actual_parameter_listContext _localctx = new Actual_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_actual_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			actual_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_paramsContext extends ParserRuleContext {
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public Multiple_actual_parametersContext multiple_actual_parameters() {
			return getRuleContext(Multiple_actual_parametersContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(JuicyBoysParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(JuicyBoysParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JuicyBoysParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Actual_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterActual_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitActual_params(this);
		}
	}

	public final Actual_paramsContext actual_params() throws RecognitionException {
		Actual_paramsContext _localctx = new Actual_paramsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_actual_params);
		int _la;
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				funccall_statement();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(274);
					multiple_actual_parameters();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(VARIABLE_IDENTIFIER);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(278);
					multiple_actual_parameters();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(INTEGER_LITERAL);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(282);
					multiple_actual_parameters();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(FLOAT_LITERAL);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(286);
					multiple_actual_parameters();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(289);
				match(CHAR_LITERAL);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(290);
					multiple_actual_parameters();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				match(STRING_LITERAL);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(294);
					multiple_actual_parameters();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
				expression(0);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(298);
					multiple_actual_parameters();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiple_actual_parametersContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(JuicyBoysParser.COMMA, 0); }
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public Multiple_actual_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_actual_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterMultiple_actual_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitMultiple_actual_parameters(this);
		}
	}

	public final Multiple_actual_parametersContext multiple_actual_parameters() throws RecognitionException {
		Multiple_actual_parametersContext _localctx = new Multiple_actual_parametersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multiple_actual_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(COMMA);
			setState(304);
			actual_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN_KEYWORD() { return getToken(JuicyBoysParser.RETURN_KEYWORD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(RETURN_KEYWORD);
			setState(307);
			expression(0);
			setState(308);
			match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF_STATEMENT() { return getToken(JuicyBoysParser.IF_STATEMENT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE_STATEMENT() { return getToken(JuicyBoysParser.ELSE_STATEMENT, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if_statement);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(IF_STATEMENT);
				setState(311);
				match(OPEN_PAR);
				setState(312);
				bool_expression();
				setState(313);
				match(CLOSE_PAR);
				setState(314);
				statement();
				setState(315);
				match(ELSE_STATEMENT);
				setState(316);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(IF_STATEMENT);
				setState(319);
				match(OPEN_PAR);
				setState(320);
				bool_expression();
				setState(321);
				match(CLOSE_PAR);
				setState(322);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(IF_STATEMENT);
				setState(325);
				match(OPEN_PAR);
				setState(326);
				bool_expression();
				notifyErrorListeners("Missing ')' ");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE_LOOP() { return getToken(JuicyBoysParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(WHILE_LOOP);
			setState(332);
			match(OPEN_PAR);
			setState(333);
			bool_expression();
			setState(334);
			match(CLOSE_PAR);
			setState(335);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO_LOOP() { return getToken(JuicyBoysParser.DO_LOOP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE_LOOP() { return getToken(JuicyBoysParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Bool_expression_forContext bool_expression_for() {
			return getRuleContext(Bool_expression_forContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(DO_LOOP);
			setState(338);
			statement();
			setState(339);
			match(WHILE_LOOP);
			setState(340);
			match(OPEN_PAR);
			setState(341);
			bool_expression_for();
			setState(342);
			match(CLOSE_PAR);
			setState(343);
			match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR_LOOP() { return getToken(JuicyBoysParser.FOR_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public TerminalNode INTEGER_KEYWORD() { return getToken(JuicyBoysParser.INTEGER_KEYWORD, 0); }
		public List<Assignment_statementContext> assignment_statement() {
			return getRuleContexts(Assignment_statementContext.class);
		}
		public Assignment_statementContext assignment_statement(int i) {
			return getRuleContext(Assignment_statementContext.class,i);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(JuicyBoysParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(JuicyBoysParser.TERMINATOR, i);
		}
		public Bool_expression_forContext bool_expression_for() {
			return getRuleContext(Bool_expression_forContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(FOR_LOOP);
			setState(346);
			match(OPEN_PAR);
			setState(347);
			match(INTEGER_KEYWORD);
			setState(348);
			assignment_statement();
			setState(349);
			match(TERMINATOR);
			setState(350);
			bool_expression_for();
			setState(351);
			match(TERMINATOR);
			setState(352);
			assignment_statement();
			setState(353);
			match(CLOSE_PAR);
			setState(354);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement_list);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				statement();
				setState(357);
				statement_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralsContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(JuicyBoysParser.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JuicyBoysParser.CHAR_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(JuicyBoysParser.FLOAT_LITERAL, 0); }
		public TerminalNode TRUE_LITERAL() { return getToken(JuicyBoysParser.TRUE_LITERAL, 0); }
		public TerminalNode FALSE_LITERAL() { return getToken(JuicyBoysParser.FALSE_LITERAL, 0); }
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitLiterals(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << CHAR_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode NOT_operator() { return getToken(JuicyBoysParser.NOT_operator, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(JuicyBoysParser.FUNCTION_IDENTIFIER, 0); }
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Special_operatorContext special_operator() {
			return getRuleContext(Special_operatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(365);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(366);
				literals();
				}
				break;
			case 3:
				{
				setState(367);
				match(NOT_operator);
				setState(368);
				match(OPEN_PAR);
				setState(369);
				expression(0);
				setState(370);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(372);
				match(FUNCTION_IDENTIFIER);
				setState(373);
				match(OPEN_PAR);
				setState(374);
				actual_parameter_list();
				setState(375);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(377);
				match(FUNCTION_IDENTIFIER);
				setState(378);
				match(OPEN_PAR);
				setState(379);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(380);
				match(OPEN_PAR);
				setState(381);
				expression(0);
				setState(382);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(384);
				match(OPEN_PAR);
				setState(385);
				expression(0);
				setState(386);
				match(CLOSE_PAR);
				setState(387);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(403);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(391);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(392);
						operator();
						setState(393);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(395);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(396);
						rel_op();
						setState(397);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(399);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(400);
						special_operator();
						setState(401);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class String_expressionContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ADDITION_OPERATOR() { return getToken(JuicyBoysParser.ADDITION_OPERATOR, 0); }
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public TerminalNode NOT_operator() { return getToken(JuicyBoysParser.NOT_operator, 0); }
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(JuicyBoysParser.SUBTRACTION_OPERATOR, 0); }
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterString_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitString_expression(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_string_expression);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(VARIABLE_IDENTIFIER);
				setState(409);
				match(ADDITION_OPERATOR);
				setState(410);
				string_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(STRING_LITERAL);
				setState(412);
				match(ADDITION_OPERATOR);
				setState(413);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(416);
				match(NOT_operator);
				setState(417);
				string_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(418);
				match(SUBTRACTION_OPERATOR);
				setState(419);
				string_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_expressionContext extends ParserRuleContext {
		public Num_termContext num_term() {
			return getRuleContext(Num_termContext.class,0);
		}
		public TerminalNode ADDITION_OPERATOR() { return getToken(JuicyBoysParser.ADDITION_OPERATOR, 0); }
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(JuicyBoysParser.SUBTRACTION_OPERATOR, 0); }
		public Num_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterNum_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitNum_expression(this);
		}
	}

	public final Num_expressionContext num_expression() throws RecognitionException {
		Num_expressionContext _localctx = new Num_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_num_expression);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				num_term();
				setState(423);
				match(ADDITION_OPERATOR);
				setState(424);
				num_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				num_term();
				setState(427);
				match(SUBTRACTION_OPERATOR);
				setState(428);
				num_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				num_term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_termContext extends ParserRuleContext {
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public TerminalNode MULTIPLICATION_OPERATOR() { return getToken(JuicyBoysParser.MULTIPLICATION_OPERATOR, 0); }
		public Num_termContext num_term() {
			return getRuleContext(Num_termContext.class,0);
		}
		public TerminalNode DIVISION_OPERATOR() { return getToken(JuicyBoysParser.DIVISION_OPERATOR, 0); }
		public TerminalNode MODULO_OPERATOR() { return getToken(JuicyBoysParser.MODULO_OPERATOR, 0); }
		public TerminalNode INCREMENTAL_OPERATOR() { return getToken(JuicyBoysParser.INCREMENTAL_OPERATOR, 0); }
		public TerminalNode DECREMENTAL_OPERATOR() { return getToken(JuicyBoysParser.DECREMENTAL_OPERATOR, 0); }
		public Num_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterNum_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitNum_term(this);
		}
	}

	public final Num_termContext num_term() throws RecognitionException {
		Num_termContext _localctx = new Num_termContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_num_term);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				num_factor();
				setState(434);
				match(MULTIPLICATION_OPERATOR);
				setState(435);
				num_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				num_factor();
				setState(438);
				match(DIVISION_OPERATOR);
				setState(439);
				num_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				num_factor();
				setState(442);
				match(MODULO_OPERATOR);
				setState(443);
				num_term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(445);
				num_factor();
				setState(446);
				match(INCREMENTAL_OPERATOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				num_factor();
				setState(449);
				match(DECREMENTAL_OPERATOR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(451);
				num_factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_factorContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JuicyBoysParser.CHAR_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(JuicyBoysParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(JuicyBoysParser.FLOAT_LITERAL, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(JuicyBoysParser.GREATER_THAN_OPERATOR, 0); }
		public Num_identifierContext num_identifier() {
			return getRuleContext(Num_identifierContext.class,0);
		}
		public Num_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterNum_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitNum_factor(this);
		}
	}

	public final Num_factorContext num_factor() throws RecognitionException {
		Num_factorContext _localctx = new Num_factorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_num_factor);
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(OPEN_PAR);
				setState(455);
				num_expression();
				setState(456);
				match(CLOSE_PAR);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(CHAR_LITERAL);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				match(INTEGER_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				match(FLOAT_LITERAL);
				}
				break;
			case GREATER_THAN_OPERATOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				match(GREATER_THAN_OPERATOR);
				setState(462);
				num_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_identifierContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public Num_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterNum_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitNum_identifier(this);
		}
	}

	public final Num_identifierContext num_identifier() throws RecognitionException {
		Num_identifierContext _localctx = new Num_identifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_num_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expressionContext extends ParserRuleContext {
		public Bool_expression_forContext bool_expression_for() {
			return getRuleContext(Bool_expression_forContext.class,0);
		}
		public TerminalNode TRUE_LITERAL() { return getToken(JuicyBoysParser.TRUE_LITERAL, 0); }
		public TerminalNode FALSE_LITERAL() { return getToken(JuicyBoysParser.FALSE_LITERAL, 0); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_bool_expression);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case CHAR_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case VARIABLE_IDENTIFIER:
			case SUBTRACTION_OPERATOR:
			case NOT_operator:
			case GREATER_THAN_OPERATOR:
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				bool_expression_for();
				}
				break;
			case TRUE_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(TRUE_LITERAL);
				}
				break;
			case FALSE_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				match(FALSE_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expression_forContext extends ParserRuleContext {
		public List<Num_expressionContext> num_expression() {
			return getRuleContexts(Num_expressionContext.class);
		}
		public Num_expressionContext num_expression(int i) {
			return getRuleContext(Num_expressionContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public TerminalNode EQUALS_OPERATOR() { return getToken(JuicyBoysParser.EQUALS_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.NOT_EQUAL_OPERATOR, 0); }
		public Bool_logicalContext bool_logical() {
			return getRuleContext(Bool_logicalContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public List<TerminalNode> VARIABLE_IDENTIFIER() { return getTokens(JuicyBoysParser.VARIABLE_IDENTIFIER); }
		public TerminalNode VARIABLE_IDENTIFIER(int i) {
			return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, i);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(JuicyBoysParser.INTEGER_LITERAL, 0); }
		public Bool_expression_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBool_expression_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBool_expression_for(this);
		}
	}

	public final Bool_expression_forContext bool_expression_for() throws RecognitionException {
		Bool_expression_forContext _localctx = new Bool_expression_forContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bool_expression_for);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				num_expression();
				setState(473);
				rel_op();
				setState(474);
				num_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				string_expression();
				setState(477);
				match(EQUALS_OPERATOR);
				setState(478);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				string_expression();
				setState(481);
				match(NOT_EQUAL_OPERATOR);
				setState(482);
				string_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				bool_logical();
				setState(485);
				match(EQUALS_OPERATOR);
				setState(486);
				bool_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				bool_logical();
				setState(489);
				match(NOT_EQUAL_OPERATOR);
				setState(490);
				bool_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(492);
				bool_logical();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
				match(VARIABLE_IDENTIFIER);
				setState(494);
				rel_op();
				setState(495);
				match(INTEGER_LITERAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(497);
				match(VARIABLE_IDENTIFIER);
				setState(498);
				rel_op();
				setState(499);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode EQUALS_OPERATOR() { return getToken(JuicyBoysParser.EQUALS_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.NOT_EQUAL_OPERATOR, 0); }
		public TerminalNode LESS_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.LESS_EQUAL_OPERATOR, 0); }
		public TerminalNode GREATER_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.GREATER_EQUAL_OPERATOR, 0); }
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(JuicyBoysParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(JuicyBoysParser.GREATER_THAN_OPERATOR, 0); }
		public TerminalNode AND_operator() { return getToken(JuicyBoysParser.AND_operator, 0); }
		public TerminalNode OR_operator() { return getToken(JuicyBoysParser.OR_operator, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND_operator) | (1L << OR_operator) | (1L << GREATER_THAN_OPERATOR) | (1L << LESS_THAN_OPERATOR) | (1L << LESS_EQUAL_OPERATOR) | (1L << GREATER_EQUAL_OPERATOR) | (1L << NOT_EQUAL_OPERATOR) | (1L << EQUALS_OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_logicalContext extends ParserRuleContext {
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public TerminalNode OR_operator() { return getToken(JuicyBoysParser.OR_operator, 0); }
		public Bool_logicalContext bool_logical() {
			return getRuleContext(Bool_logicalContext.class,0);
		}
		public Bool_logicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBool_logical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBool_logical(this);
		}
	}

	public final Bool_logicalContext bool_logical() throws RecognitionException {
		Bool_logicalContext _localctx = new Bool_logicalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bool_logical);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				bool_term();
				setState(506);
				match(OR_operator);
				setState(507);
				bool_logical();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				bool_term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_termContext extends ParserRuleContext {
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public TerminalNode AND_operator() { return getToken(JuicyBoysParser.AND_operator, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_bool_term);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				bool_factor();
				setState(513);
				match(AND_operator);
				setState(514);
				bool_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				bool_factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_factorContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Bool_logicalContext bool_logical() {
			return getRuleContext(Bool_logicalContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public TerminalNode NOT_operator() { return getToken(JuicyBoysParser.NOT_operator, 0); }
		public Bool_identifierContext bool_identifier() {
			return getRuleContext(Bool_identifierContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBool_factor(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_bool_factor);
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(OPEN_PAR);
				setState(520);
				bool_logical();
				setState(521);
				match(CLOSE_PAR);
				}
				break;
			case NOT_operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(NOT_operator);
				setState(524);
				bool_logical();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				bool_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_identifierContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public Bool_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBool_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBool_identifier(this);
		}
	}

	public final Bool_identifierContext bool_identifier() throws RecognitionException {
		Bool_identifierContext _localctx = new Bool_identifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_bool_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constdecl_listContext extends ParserRuleContext {
		public Const_statementContext const_statement() {
			return getRuleContext(Const_statementContext.class,0);
		}
		public Constdecl_listContext constdecl_list() {
			return getRuleContext(Constdecl_listContext.class,0);
		}
		public Constdecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConstdecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConstdecl_list(this);
		}
	}

	public final Constdecl_listContext constdecl_list() throws RecognitionException {
		Constdecl_listContext _localctx = new Constdecl_listContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constdecl_list);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				const_statement();
				setState(531);
				constdecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				const_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_statementContext extends ParserRuleContext {
		public TerminalNode CONSTANT_KEYWORD() { return getToken(JuicyBoysParser.CONSTANT_KEYWORD, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(JuicyBoysParser.ASSIGNMENT_OPERATOR, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public Const_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConst_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConst_statement(this);
		}
	}

	public final Const_statementContext const_statement() throws RecognitionException {
		Const_statementContext _localctx = new Const_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_const_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(CONSTANT_KEYWORD);
			setState(537);
			data_type();
			setState(538);
			match(VARIABLE_IDENTIFIER);
			setState(539);
			match(ASSIGNMENT_OPERATOR);
			setState(540);
			constant();
			setState(541);
			match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(JuicyBoysParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(JuicyBoysParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JuicyBoysParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constant);
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				sign();
				setState(544);
				match(INTEGER_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				sign();
				setState(547);
				match(FLOAT_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(550);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(551);
				match(INTEGER_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(552);
				match(FLOAT_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode ADDITION_OPERATOR() { return getToken(JuicyBoysParser.ADDITION_OPERATOR, 0); }
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(JuicyBoysParser.SUBTRACTION_OPERATOR, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if ( !(_la==ADDITION_OPERATOR || _la==SUBTRACTION_OPERATOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUTPUT_FUNCTION() { return getToken(JuicyBoysParser.OUTPUT_FUNCTION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_output);
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(OUTPUT_FUNCTION);
				setState(558);
				match(OPEN_PAR);
				setState(559);
				match(STRING_LITERAL);
				setState(560);
				match(CLOSE_PAR);
				setState(561);
				match(TERMINATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				match(OUTPUT_FUNCTION);
				setState(563);
				match(OPEN_PAR);
				setState(564);
				match(VARIABLE_IDENTIFIER);
				setState(565);
				match(CLOSE_PAR);
				setState(566);
				match(TERMINATOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public Output_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterOutput_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitOutput_list(this);
		}
	}

	public final Output_listContext output_list() throws RecognitionException {
		Output_listContext _localctx = new Output_listContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_output_list);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				funccall_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(JuicyBoysParser.ASSIGNMENT_OPERATOR, 0); }
		public TerminalNode INPUT_FUNCTION() { return getToken(JuicyBoysParser.INPUT_FUNCTION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Input_listContext input_list() {
			return getRuleContext(Input_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_input);
		try {
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				match(VARIABLE_IDENTIFIER);
				setState(576);
				match(ASSIGNMENT_OPERATOR);
				setState(577);
				match(INPUT_FUNCTION);
				setState(578);
				match(OPEN_PAR);
				setState(579);
				input_list();
				setState(580);
				match(CLOSE_PAR);
				}
				break;
			case INPUT_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(INPUT_FUNCTION);
				setState(583);
				match(OPEN_PAR);
				setState(584);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_listContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(JuicyBoysParser.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JuicyBoysParser.CHAR_LITERAL, 0); }
		public Input_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInput_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInput_list(this);
		}
	}

	public final Input_listContext input_list() throws RecognitionException {
		Input_listContext _localctx = new Input_listContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_input_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0250\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\5\2n\n\2\3\2\5\2q\n\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\5\3y\n\3\3\4\3\4\5\4}\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u008c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u009a\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u00a3\n\b\3\t\3\t\5"+
		"\t\u00a7\n\t\3\t\5\t\u00aa\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00b3\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\5\13\u00ba\n\13\3\13\3\13\3\13\5\13\u00bf"+
		"\n\13\3\13\3\13\3\13\5\13\u00c4\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00cb\n\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00d3\n\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\5\21\u00de\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f0\n\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0104\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0110\n\27\3\30\3\30\3\31\3\31\5\31\u0116\n\31\3\31\3\31\5"+
		"\31\u011a\n\31\3\31\3\31\5\31\u011e\n\31\3\31\3\31\5\31\u0122\n\31\3\31"+
		"\3\31\5\31\u0126\n\31\3\31\3\31\5\31\u012a\n\31\3\31\3\31\5\31\u012e\n"+
		"\31\5\31\u0130\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u014c\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \5 \u016b\n \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0188\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0196"+
		"\n\"\f\"\16\"\u0199\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01a7"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01b2\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01c7\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\5&\u01d2\n&\3\'\3\'\3(\3(\3(\5(\u01d9\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01f8\n"+
		")\3*\3*\3+\3+\3+\3+\3+\5+\u0201\n+\3,\3,\3,\3,\3,\5,\u0208\n,\3-\3-\3"+
		"-\3-\3-\3-\3-\5-\u0211\n-\3.\3.\3/\3/\3/\3/\5/\u0219\n/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u022c\n\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u023a\n\63\3\64\3\64\3\64\3\64\5\64\u0240\n\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u024c\n\65\3\66\3\66\3\66"+
		"\2\3B\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhj\2\n\4\2\r\21\23\23\3\2\35!\3\2(,\3\2\"#\4\2"+
		"\5\b=>\4\2$%-\62\3\2\35\36\4\2\5\6\b\b\2\u027a\2m\3\2\2\2\4x\3\2\2\2\6"+
		"|\3\2\2\2\b\u008b\3\2\2\2\n\u0099\3\2\2\2\f\u009b\3\2\2\2\16\u00a2\3\2"+
		"\2\2\20\u00a4\3\2\2\2\22\u00ad\3\2\2\2\24\u00c3\3\2\2\2\26\u00ca\3\2\2"+
		"\2\30\u00cc\3\2\2\2\32\u00d2\3\2\2\2\34\u00d4\3\2\2\2\36\u00d6\3\2\2\2"+
		" \u00dd\3\2\2\2\"\u00ef\3\2\2\2$\u00f1\3\2\2\2&\u00f3\3\2\2\2(\u00f5\3"+
		"\2\2\2*\u0103\3\2\2\2,\u010f\3\2\2\2.\u0111\3\2\2\2\60\u012f\3\2\2\2\62"+
		"\u0131\3\2\2\2\64\u0134\3\2\2\2\66\u014b\3\2\2\28\u014d\3\2\2\2:\u0153"+
		"\3\2\2\2<\u015b\3\2\2\2>\u016a\3\2\2\2@\u016c\3\2\2\2B\u0187\3\2\2\2D"+
		"\u01a6\3\2\2\2F\u01b1\3\2\2\2H\u01c6\3\2\2\2J\u01d1\3\2\2\2L\u01d3\3\2"+
		"\2\2N\u01d8\3\2\2\2P\u01f7\3\2\2\2R\u01f9\3\2\2\2T\u0200\3\2\2\2V\u0207"+
		"\3\2\2\2X\u0210\3\2\2\2Z\u0212\3\2\2\2\\\u0218\3\2\2\2^\u021a\3\2\2\2"+
		"`\u022b\3\2\2\2b\u022d\3\2\2\2d\u0239\3\2\2\2f\u023f\3\2\2\2h\u024b\3"+
		"\2\2\2j\u024d\3\2\2\2ln\5\\/\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oq\5\4\3\2"+
		"po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\5\22\n\2s\3\3\2\2\2tu\5\6\4\2uv\5\4\3"+
		"\2vy\3\2\2\2wy\5\6\4\2xt\3\2\2\2xw\3\2\2\2y\5\3\2\2\2z}\5\b\5\2{}\5\n"+
		"\6\2|z\3\2\2\2|{\3\2\2\2}\7\3\2\2\2~\177\5\34\17\2\177\u0080\7;\2\2\u0080"+
		"\u0081\7\67\2\2\u0081\u0082\5\26\f\2\u0082\u0083\78\2\2\u0083\u0084\5"+
		"\20\t\2\u0084\u008c\3\2\2\2\u0085\u0086\5\34\17\2\u0086\u0087\7;\2\2\u0087"+
		"\u0088\7\67\2\2\u0088\u0089\78\2\2\u0089\u008a\5\20\t\2\u008a\u008c\3"+
		"\2\2\2\u008b~\3\2\2\2\u008b\u0085\3\2\2\2\u008c\t\3\2\2\2\u008d\u008e"+
		"\7\22\2\2\u008e\u008f\7;\2\2\u008f\u0090\7\67\2\2\u0090\u0091\5\26\f\2"+
		"\u0091\u0092\78\2\2\u0092\u0093\5\20\t\2\u0093\u009a\3\2\2\2\u0094\u0095"+
		"\7\22\2\2\u0095\u0096\7;\2\2\u0096\u0097\7\67\2\2\u0097\u0098\78\2\2\u0098"+
		"\u009a\5\20\t\2\u0099\u008d\3\2\2\2\u0099\u0094\3\2\2\2\u009a\13\3\2\2"+
		"\2\u009b\u009c\5\16\b\2\u009c\r\3\2\2\2\u009d\u009e\5\32\16\2\u009e\u009f"+
		"\79\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\5\32\16\2"+
		"\u00a2\u009d\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a6"+
		"\7\63\2\2\u00a5\u00a7\5\24\13\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2"+
		"\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa\5> \2\u00a9\u00a8\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\64\2\2\u00ac\21\3\2\2\2\u00ad"+
		"\u00ae\7\22\2\2\u00ae\u00af\7\31\2\2\u00af\u00b0\7\67\2\2\u00b0\u00b2"+
		"\78\2\2\u00b1\u00b3\5\20\t\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\23\3\2\2\2\u00b4\u00b5\5\32\16\2\u00b5\u00b6\7\'\2\2\u00b6\u00b7\5B\""+
		"\2\u00b7\u00b9\7\13\2\2\u00b8\u00ba\5\24\13\2\u00b9\u00b8\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00c4\3\2\2\2\u00bb\u00bc\5h\65\2\u00bc\u00be\7\13"+
		"\2\2\u00bd\u00bf\5\24\13\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c4\3\2\2\2\u00c0\u00c1\5\32\16\2\u00c1\u00c2\7\13\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00b4\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4"+
		"\25\3\2\2\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\79\2\2\u00c7\u00c8\5\26"+
		"\f\2\u00c8\u00cb\3\2\2\2\u00c9\u00cb\5\32\16\2\u00ca\u00c5\3\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\27\3\2\2\2\u00cc\u00cd\5 \21\2\u00cd\31\3\2\2\2\u00ce"+
		"\u00cf\5\34\17\2\u00cf\u00d0\5 \21\2\u00d0\u00d3\3\2\2\2\u00d1\u00d3\5"+
		"\36\20\2\u00d2\u00ce\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\33\3\2\2\2\u00d4"+
		"\u00d5\t\2\2\2\u00d5\35\3\2\2\2\u00d6\u00d7\5\34\17\2\u00d7\u00d8\7:\2"+
		"\2\u00d8\37\3\2\2\2\u00d9\u00da\7\t\2\2\u00da\u00db\79\2\2\u00db\u00de"+
		"\5 \21\2\u00dc\u00de\7\t\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"!\3\2\2\2\u00df\u00e0\5*\26\2\u00e0\u00e1\7\13\2\2\u00e1\u00f0\3\2\2\2"+
		"\u00e2\u00f0\5,\27\2\u00e3\u00f0\5\66\34\2\u00e4\u00f0\58\35\2\u00e5\u00f0"+
		"\5:\36\2\u00e6\u00f0\5<\37\2\u00e7\u00f0\5\64\33\2\u00e8\u00e9\7\63\2"+
		"\2\u00e9\u00ea\5> \2\u00ea\u00eb\7\64\2\2\u00eb\u00f0\3\2\2\2\u00ec\u00f0"+
		"\7\n\2\2\u00ed\u00f0\5f\64\2\u00ee\u00f0\5d\63\2\u00ef\u00df\3\2\2\2\u00ef"+
		"\u00e2\3\2\2\2\u00ef\u00e3\3\2\2\2\u00ef\u00e4\3\2\2\2\u00ef\u00e5\3\2"+
		"\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef"+
		"\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0#\3\2\2\2"+
		"\u00f1\u00f2\t\3\2\2\u00f2%\3\2\2\2\u00f3\u00f4\t\4\2\2\u00f4\'\3\2\2"+
		"\2\u00f5\u00f6\t\5\2\2\u00f6)\3\2\2\2\u00f7\u00f8\7\t\2\2\u00f8\u00f9"+
		"\7\'\2\2\u00f9\u0104\5B\"\2\u00fa\u00fb\7\t\2\2\u00fb\u00fc\7\'\2\2\u00fc"+
		"\u0104\5h\65\2\u00fd\u00fe\7\t\2\2\u00fe\u0104\5(\25\2\u00ff\u0100\7\t"+
		"\2\2\u0100\u0101\5&\24\2\u0101\u0102\5B\"\2\u0102\u0104\3\2\2\2\u0103"+
		"\u00f7\3\2\2\2\u0103\u00fa\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u00ff\3\2"+
		"\2\2\u0104+\3\2\2\2\u0105\u0106\7;\2\2\u0106\u0107\7\67\2\2\u0107\u0108"+
		"\5.\30\2\u0108\u0109\78\2\2\u0109\u010a\7\13\2\2\u010a\u0110\3\2\2\2\u010b"+
		"\u010c\7;\2\2\u010c\u010d\7\67\2\2\u010d\u010e\78\2\2\u010e\u0110\7\13"+
		"\2\2\u010f\u0105\3\2\2\2\u010f\u010b\3\2\2\2\u0110-\3\2\2\2\u0111\u0112"+
		"\5\60\31\2\u0112/\3\2\2\2\u0113\u0115\5,\27\2\u0114\u0116\5\62\32\2\u0115"+
		"\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0130\3\2\2\2\u0117\u0119\7\t"+
		"\2\2\u0118\u011a\5\62\32\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0130\3\2\2\2\u011b\u011d\7\5\2\2\u011c\u011e\5\62\32\2\u011d\u011c\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u0130\3\2\2\2\u011f\u0121\7\7\2\2\u0120"+
		"\u0122\5\62\32\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0130\3"+
		"\2\2\2\u0123\u0125\7\6\2\2\u0124\u0126\5\62\32\2\u0125\u0124\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0130\3\2\2\2\u0127\u0129\7\b\2\2\u0128\u012a\5\62"+
		"\32\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0130\3\2\2\2\u012b"+
		"\u012d\5B\"\2\u012c\u012e\5\62\32\2\u012d\u012c\3\2\2\2\u012d\u012e\3"+
		"\2\2\2\u012e\u0130\3\2\2\2\u012f\u0113\3\2\2\2\u012f\u0117\3\2\2\2\u012f"+
		"\u011b\3\2\2\2\u012f\u011f\3\2\2\2\u012f\u0123\3\2\2\2\u012f\u0127\3\2"+
		"\2\2\u012f\u012b\3\2\2\2\u0130\61\3\2\2\2\u0131\u0132\79\2\2\u0132\u0133"+
		"\5\60\31\2\u0133\63\3\2\2\2\u0134\u0135\7\f\2\2\u0135\u0136\5B\"\2\u0136"+
		"\u0137\7\13\2\2\u0137\65\3\2\2\2\u0138\u0139\7\32\2\2\u0139\u013a\7\67"+
		"\2\2\u013a\u013b\5N(\2\u013b\u013c\78\2\2\u013c\u013d\5\"\22\2\u013d\u013e"+
		"\7\33\2\2\u013e\u013f\5\"\22\2\u013f\u014c\3\2\2\2\u0140\u0141\7\32\2"+
		"\2\u0141\u0142\7\67\2\2\u0142\u0143\5N(\2\u0143\u0144\78\2\2\u0144\u0145"+
		"\5\"\22\2\u0145\u014c\3\2\2\2\u0146\u0147\7\32\2\2\u0147\u0148\7\67\2"+
		"\2\u0148\u0149\5N(\2\u0149\u014a\b\34\1\2\u014a\u014c\3\2\2\2\u014b\u0138"+
		"\3\2\2\2\u014b\u0140\3\2\2\2\u014b\u0146\3\2\2\2\u014c\67\3\2\2\2\u014d"+
		"\u014e\7\25\2\2\u014e\u014f\7\67\2\2\u014f\u0150\5N(\2\u0150\u0151\78"+
		"\2\2\u0151\u0152\5\"\22\2\u01529\3\2\2\2\u0153\u0154\7\24\2\2\u0154\u0155"+
		"\5\"\22\2\u0155\u0156\7\25\2\2\u0156\u0157\7\67\2\2\u0157\u0158\5P)\2"+
		"\u0158\u0159\78\2\2\u0159\u015a\7\13\2\2\u015a;\3\2\2\2\u015b\u015c\7"+
		"\26\2\2\u015c\u015d\7\67\2\2\u015d\u015e\7\r\2\2\u015e\u015f\5*\26\2\u015f"+
		"\u0160\7\13\2\2\u0160\u0161\5P)\2\u0161\u0162\7\13\2\2\u0162\u0163\5*"+
		"\26\2\u0163\u0164\78\2\2\u0164\u0165\5\"\22\2\u0165=\3\2\2\2\u0166\u0167"+
		"\5\"\22\2\u0167\u0168\5> \2\u0168\u016b\3\2\2\2\u0169\u016b\5\"\22\2\u016a"+
		"\u0166\3\2\2\2\u016a\u0169\3\2\2\2\u016b?\3\2\2\2\u016c\u016d\t\6\2\2"+
		"\u016dA\3\2\2\2\u016e\u016f\b\"\1\2\u016f\u0188\7\t\2\2\u0170\u0188\5"+
		"@!\2\u0171\u0172\7&\2\2\u0172\u0173\7\67\2\2\u0173\u0174\5B\"\2\u0174"+
		"\u0175\78\2\2\u0175\u0188\3\2\2\2\u0176\u0177\7;\2\2\u0177\u0178\7\67"+
		"\2\2\u0178\u0179\5.\30\2\u0179\u017a\78\2\2\u017a\u0188\3\2\2\2\u017b"+
		"\u017c\7;\2\2\u017c\u017d\7\67\2\2\u017d\u0188\78\2\2\u017e\u017f\7\67"+
		"\2\2\u017f\u0180\5B\"\2\u0180\u0181\78\2\2\u0181\u0188\3\2\2\2\u0182\u0183"+
		"\7\67\2\2\u0183\u0184\5B\"\2\u0184\u0185\78\2\2\u0185\u0186\5B\"\3\u0186"+
		"\u0188\3\2\2\2\u0187\u016e\3\2\2\2\u0187\u0170\3\2\2\2\u0187\u0171\3\2"+
		"\2\2\u0187\u0176\3\2\2\2\u0187\u017b\3\2\2\2\u0187\u017e\3\2\2\2\u0187"+
		"\u0182\3\2\2\2\u0188\u0197\3\2\2\2\u0189\u018a\f\t\2\2\u018a\u018b\5$"+
		"\23\2\u018b\u018c\5B\"\n\u018c\u0196\3\2\2\2\u018d\u018e\f\b\2\2\u018e"+
		"\u018f\5R*\2\u018f\u0190\5B\"\t\u0190\u0196\3\2\2\2\u0191\u0192\f\7\2"+
		"\2\u0192\u0193\5&\24\2\u0193\u0194\5B\"\b\u0194\u0196\3\2\2\2\u0195\u0189"+
		"\3\2\2\2\u0195\u018d\3\2\2\2\u0195\u0191\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198C\3\2\2\2\u0199\u0197\3\2\2\2"+
		"\u019a\u019b\7\t\2\2\u019b\u019c\7\35\2\2\u019c\u01a7\5D#\2\u019d\u019e"+
		"\7\b\2\2\u019e\u019f\7\35\2\2\u019f\u01a7\5D#\2\u01a0\u01a7\7\t\2\2\u01a1"+
		"\u01a7\7\b\2\2\u01a2\u01a3\7&\2\2\u01a3\u01a7\5D#\2\u01a4\u01a5\7\36\2"+
		"\2\u01a5\u01a7\5D#\2\u01a6\u019a\3\2\2\2\u01a6\u019d\3\2\2\2\u01a6\u01a0"+
		"\3\2\2\2\u01a6\u01a1\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"E\3\2\2\2\u01a8\u01a9\5H%\2\u01a9\u01aa\7\35\2\2\u01aa\u01ab\5F$\2\u01ab"+
		"\u01b2\3\2\2\2\u01ac\u01ad\5H%\2\u01ad\u01ae\7\36\2\2\u01ae\u01af\5F$"+
		"\2\u01af\u01b2\3\2\2\2\u01b0\u01b2\5H%\2\u01b1\u01a8\3\2\2\2\u01b1\u01ac"+
		"\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2G\3\2\2\2\u01b3\u01b4\5J&\2\u01b4\u01b5"+
		"\7\37\2\2\u01b5\u01b6\5H%\2\u01b6\u01c7\3\2\2\2\u01b7\u01b8\5J&\2\u01b8"+
		"\u01b9\7 \2\2\u01b9\u01ba\5H%\2\u01ba\u01c7\3\2\2\2\u01bb\u01bc\5J&\2"+
		"\u01bc\u01bd\7!\2\2\u01bd\u01be\5H%\2\u01be\u01c7\3\2\2\2\u01bf\u01c0"+
		"\5J&\2\u01c0\u01c1\7\"\2\2\u01c1\u01c7\3\2\2\2\u01c2\u01c3\5J&\2\u01c3"+
		"\u01c4\7#\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c7\5J&\2\u01c6\u01b3\3\2\2"+
		"\2\u01c6\u01b7\3\2\2\2\u01c6\u01bb\3\2\2\2\u01c6\u01bf\3\2\2\2\u01c6\u01c2"+
		"\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7I\3\2\2\2\u01c8\u01c9\7\67\2\2\u01c9"+
		"\u01ca\5F$\2\u01ca\u01cb\78\2\2\u01cb\u01d2\3\2\2\2\u01cc\u01d2\7\6\2"+
		"\2\u01cd\u01d2\7\5\2\2\u01ce\u01d2\7\7\2\2\u01cf\u01d0\7-\2\2\u01d0\u01d2"+
		"\5L\'\2\u01d1\u01c8\3\2\2\2\u01d1\u01cc\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d1"+
		"\u01ce\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2K\3\2\2\2\u01d3\u01d4\7\b\2\2"+
		"\u01d4M\3\2\2\2\u01d5\u01d9\5P)\2\u01d6\u01d9\7=\2\2\u01d7\u01d9\7>\2"+
		"\2\u01d8\u01d5\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9O"+
		"\3\2\2\2\u01da\u01db\5F$\2\u01db\u01dc\5R*\2\u01dc\u01dd\5F$\2\u01dd\u01f8"+
		"\3\2\2\2\u01de\u01df\5D#\2\u01df\u01e0\7\62\2\2\u01e0\u01e1\5D#\2\u01e1"+
		"\u01f8\3\2\2\2\u01e2\u01e3\5D#\2\u01e3\u01e4\7\61\2\2\u01e4\u01e5\5D#"+
		"\2\u01e5\u01f8\3\2\2\2\u01e6\u01e7\5T+\2\u01e7\u01e8\7\62\2\2\u01e8\u01e9"+
		"\5N(\2\u01e9\u01f8\3\2\2\2\u01ea\u01eb\5T+\2\u01eb\u01ec\7\61\2\2\u01ec"+
		"\u01ed\5N(\2\u01ed\u01f8\3\2\2\2\u01ee\u01f8\5T+\2\u01ef\u01f0\7\t\2\2"+
		"\u01f0\u01f1\5R*\2\u01f1\u01f2\7\5\2\2\u01f2\u01f8\3\2\2\2\u01f3\u01f4"+
		"\7\t\2\2\u01f4\u01f5\5R*\2\u01f5\u01f6\7\t\2\2\u01f6\u01f8\3\2\2\2\u01f7"+
		"\u01da\3\2\2\2\u01f7\u01de\3\2\2\2\u01f7\u01e2\3\2\2\2\u01f7\u01e6\3\2"+
		"\2\2\u01f7\u01ea\3\2\2\2\u01f7\u01ee\3\2\2\2\u01f7\u01ef\3\2\2\2\u01f7"+
		"\u01f3\3\2\2\2\u01f8Q\3\2\2\2\u01f9\u01fa\t\7\2\2\u01faS\3\2\2\2\u01fb"+
		"\u01fc\5V,\2\u01fc\u01fd\7%\2\2\u01fd\u01fe\5T+\2\u01fe\u0201\3\2\2\2"+
		"\u01ff\u0201\5V,\2\u0200\u01fb\3\2\2\2\u0200\u01ff\3\2\2\2\u0201U\3\2"+
		"\2\2\u0202\u0203\5X-\2\u0203\u0204\7$\2\2\u0204\u0205\5V,\2\u0205\u0208"+
		"\3\2\2\2\u0206\u0208\5X-\2\u0207\u0202\3\2\2\2\u0207\u0206\3\2\2\2\u0208"+
		"W\3\2\2\2\u0209\u020a\7\67\2\2\u020a\u020b\5T+\2\u020b\u020c\78\2\2\u020c"+
		"\u0211\3\2\2\2\u020d\u020e\7&\2\2\u020e\u0211\5T+\2\u020f\u0211\5Z.\2"+
		"\u0210\u0209\3\2\2\2\u0210\u020d\3\2\2\2\u0210\u020f\3\2\2\2\u0211Y\3"+
		"\2\2\2\u0212\u0213\7\b\2\2\u0213[\3\2\2\2\u0214\u0215\5^\60\2\u0215\u0216"+
		"\5\\/\2\u0216\u0219\3\2\2\2\u0217\u0219\5^\60\2\u0218\u0214\3\2\2\2\u0218"+
		"\u0217\3\2\2\2\u0219]\3\2\2\2\u021a\u021b\7<\2\2\u021b\u021c\5\34\17\2"+
		"\u021c\u021d\7\t\2\2\u021d\u021e\7\'\2\2\u021e\u021f\5`\61\2\u021f\u0220"+
		"\7\13\2\2\u0220_\3\2\2\2\u0221\u0222\5b\62\2\u0222\u0223\7\5\2\2\u0223"+
		"\u022c\3\2\2\2\u0224\u0225\5b\62\2\u0225\u0226\7\7\2\2\u0226\u022c\3\2"+
		"\2\2\u0227\u022c\7\6\2\2\u0228\u022c\7\b\2\2\u0229\u022c\7\5\2\2\u022a"+
		"\u022c\7\7\2\2\u022b\u0221\3\2\2\2\u022b\u0224\3\2\2\2\u022b\u0227\3\2"+
		"\2\2\u022b\u0228\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022a\3\2\2\2\u022c"+
		"a\3\2\2\2\u022d\u022e\t\b\2\2\u022ec\3\2\2\2\u022f\u0230\7\27\2\2\u0230"+
		"\u0231\7\67\2\2\u0231\u0232\7\b\2\2\u0232\u0233\78\2\2\u0233\u023a\7\13"+
		"\2\2\u0234\u0235\7\27\2\2\u0235\u0236\7\67\2\2\u0236\u0237\7\t\2\2\u0237"+
		"\u0238\78\2\2\u0238\u023a\7\13\2\2\u0239\u022f\3\2\2\2\u0239\u0234\3\2"+
		"\2\2\u023ae\3\2\2\2\u023b\u0240\5B\"\2\u023c\u0240\7\t\2\2\u023d\u0240"+
		"\5,\27\2\u023e\u0240\7\b\2\2\u023f\u023b\3\2\2\2\u023f\u023c\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240g\3\2\2\2\u0241\u0242\7\t\2\2"+
		"\u0242\u0243\7\'\2\2\u0243\u0244\7\30\2\2\u0244\u0245\7\67\2\2\u0245\u0246"+
		"\5j\66\2\u0246\u0247\78\2\2\u0247\u024c\3\2\2\2\u0248\u0249\7\30\2\2\u0249"+
		"\u024a\7\67\2\2\u024a\u024c\78\2\2\u024b\u0241\3\2\2\2\u024b\u0248\3\2"+
		"\2\2\u024ci\3\2\2\2\u024d\u024e\t\t\2\2\u024ek\3\2\2\2\60mpx|\u008b\u0099"+
		"\u00a2\u00a6\u00a9\u00b2\u00b9\u00be\u00c3\u00ca\u00d2\u00dd\u00ef\u0103"+
		"\u010f\u0115\u0119\u011d\u0121\u0125\u0129\u012d\u012f\u014b\u016a\u0187"+
		"\u0195\u0197\u01a6\u01b1\u01c6\u01d1\u01d8\u01f7\u0200\u0207\u0210\u0218"+
		"\u022b\u0239\u023f\u024b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}