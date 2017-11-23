grammar JuicyBoys;

start           	: (constdecl_list)? (funcdecl_list)? main_function
                    ;

//Productions for function declaration

funcdecl_list     	: function_declaration funcdecl_list
                    | function_declaration
                    	;
function_declaration 	: function_return
	                    | function_noreturn
	                    ;
function_return   	: data_type FUNCTION_IDENTIFIER OPEN_PAR functiondec_vardecl CLOSE_PAR function_content
                    | data_type FUNCTION_IDENTIFIER OPEN_PAR CLOSE_PAR function_content
                    ;
function_noreturn 	: VOID_KEYWORD FUNCTION_IDENTIFIER OPEN_PAR functiondec_vardecl CLOSE_PAR function_content
                    | VOID_KEYWORD FUNCTION_IDENTIFIER OPEN_PAR CLOSE_PAR function_content
                    ;
parameter_list    	: parameters
                    ;
parameters        	: var_decl COMMA parameters
                   	| var_decl
                    ;
function_content  	: OPEN_BRACE (vardecl_list)? (statement_list)? CLOSE_BRACE
                    ;
main_function     	: VOID_KEYWORD MAIN_KEYWORD OPEN_PAR CLOSE_PAR (function_content)?
                    ;

//Productions for variable declaration

vardecl_list      	: var_decl ASSIGNMENT_OPERATOR expression TERMINATOR (vardecl_list)?
                    | input TERMINATOR (vardecl_list)?
                    | var_decl TERMINATOR
                    ;
functiondec_vardecl    : var_decl COMMA functiondec_vardecl
                        | var_decl
                        ;

functioncall_vardecl    : identifier_list
                        ;

var_decl          	: data_type identifier_list
                    | array
                    ;
data_type         	: INTEGER_KEYWORD
                    | DOUBLE_KEYWORD
                    | CHAR_KEYWORD
                    | STRING_KEYWORD
                    | BOOLEAN_KEYWORD
                    | FLOAT_KEYWORD
                    ;
array               : data_type ARRAY_IDENTIFIER
                    ;
identifier_list   	: VARIABLE_IDENTIFIER COMMA identifier_list
                   	| VARIABLE_IDENTIFIER
                    ;

//Productions for statements

statement         	    : assignment_statement TERMINATOR
                    	| funccall_statement
                    	| if_statement
                    	| while_statement
                    	| do_while_statement
                    	| for_statement
                    	| return_statement
                    	| OPEN_BRACE  statement_list CLOSE_BRACE
                    	| COMMENT_BLOCK
                    	| output_list
                    	| output
                        ;

operator                : ADDITION_OPERATOR
                        | SUBTRACTION_OPERATOR
                        | MULTIPLICATION_OPERATOR
                        | DIVISION_OPERATOR
                        | MODULO_OPERATOR
                        ;

special_operator        : PLUS_EQUAL_OPERATOR
                        | MINUS_EQUAL_OPERATOR
                        | DIVIDE_EQUAL_OPERATOR
                        | TIMES_EQUAL_OPERATOR
                        | MODULO_EQUAL_OPERATOR
                        ;

double_sign_operator    : INCREMENTAL_OPERATOR
                        | DECREMENTAL_OPERATOR
                        ;

assignment_statement 	: VARIABLE_IDENTIFIER ASSIGNMENT_OPERATOR expression
                        | VARIABLE_IDENTIFIER ASSIGNMENT_OPERATOR input
                        | VARIABLE_IDENTIFIER double_sign_operator
                        | VARIABLE_IDENTIFIER special_operator expression
                        ;
funccall_statement  	: FUNCTION_IDENTIFIER OPEN_PAR actual_parameter_list CLOSE_PAR TERMINATOR
                        | FUNCTION_IDENTIFIER OPEN_PAR CLOSE_PAR TERMINATOR
                        ;
actual_parameter_list	: actual_params
                        ;
actual_params     	: funccall_statement (multiple_actual_parameters)?
                        | VARIABLE_IDENTIFIER (multiple_actual_parameters)?
                    	| INTEGER_LITERAL  (multiple_actual_parameters)?
                        | FLOAT_LITERAL (multiple_actual_parameters)?
                        | CHAR_LITERAL (multiple_actual_parameters)?
                        | STRING_LITERAL (multiple_actual_parameters)?
                        | expression (multiple_actual_parameters)?
                        ;
multiple_actual_parameters	: COMMA actual_params
                        ;
return_statement  	    : RETURN_KEYWORD expression TERMINATOR
                        ;
if_statement        	: IF_STATEMENT OPEN_PAR  bool_expression CLOSE_PAR statement ELSE_STATEMENT statement
                        | IF_STATEMENT OPEN_PAR bool_expression  CLOSE_PAR statement
                        | IF_STATEMENT OPEN_PAR bool_expression  {notifyErrorListeners("Missing ')' ");}
                        ;
while_statement   	    : WHILE_LOOP OPEN_PAR bool_expression CLOSE_PAR statement
                        ;
do_while_statement	    : DO_LOOP statement WHILE_LOOP OPEN_PAR bool_expression_for CLOSE_PAR TERMINATOR
                        ;
for_statement     	    : FOR_LOOP OPEN_PAR INTEGER_KEYWORD assignment_statement TERMINATOR bool_expression_for TERMINATOR assignment_statement CLOSE_PAR statement
                        ;
statement_list    	    : statement statement_list
                    	| statement
                        ;

//Productions for expressions

literals                : INTEGER_LITERAL
                        | STRING_LITERAL
                        | CHAR_LITERAL
                        | FLOAT_LITERAL
                        | TRUE_LITERAL
                        | FALSE_LITERAL
                        ;

expression        	    : VARIABLE_IDENTIFIER
                        | literals
                    	| NOT_operator OPEN_PAR expression CLOSE_PAR
                    	| expression operator expression
                    	| expression rel_op expression
                    	| expression special_operator expression
                    	| FUNCTION_IDENTIFIER OPEN_PAR actual_parameter_list CLOSE_PAR
                    	| FUNCTION_IDENTIFIER OPEN_PAR CLOSE_PAR
                    	| OPEN_PAR expression CLOSE_PAR
                    	| OPEN_PAR expression CLOSE_PAR expression
                        ;


string_expression 	    : VARIABLE_IDENTIFIER ADDITION_OPERATOR string_expression
                    	| STRING_LITERAL ADDITION_OPERATOR string_expression
                    	| VARIABLE_IDENTIFIER
                    	| STRING_LITERAL
                    	| NOT_operator string_expression
                    	| SUBTRACTION_OPERATOR string_expression
                        ;
num_expression    	    : num_term ADDITION_OPERATOR  num_expression
                    	| num_term SUBTRACTION_OPERATOR num_expression
                    	| num_term
                        ;
num_term          	    : num_factor MULTIPLICATION_OPERATOR num_term
                    	| num_factor DIVISION_OPERATOR num_term
                    	| num_factor MODULO_OPERATOR  num_term
                        | num_factor INCREMENTAL_OPERATOR
                        | num_factor DECREMENTAL_OPERATOR
                        | num_factor
                        ;
num_factor        	    : OPEN_PAR num_expression CLOSE_PAR
                    	| CHAR_LITERAL
                    	| INTEGER_LITERAL
                    	| FLOAT_LITERAL
                    	| GREATER_THAN_OPERATOR num_identifier
                        ;
num_identifier    	: STRING_LITERAL
                        ;
bool_expression   	: bool_expression_for
                        | TRUE_LITERAL
                        | FALSE_LITERAL
                        ;
bool_expression_for   : num_expression rel_op num_expression
                    	| string_expression EQUALS_OPERATOR string_expression
                    	| string_expression NOT_EQUAL_OPERATOR string_expression
                    	| bool_logical EQUALS_OPERATOR bool_expression
                    	| bool_logical NOT_EQUAL_OPERATOR bool_expression
                    	| bool_logical
                    	| VARIABLE_IDENTIFIER rel_op INTEGER_LITERAL
                    	| VARIABLE_IDENTIFIER rel_op VARIABLE_IDENTIFIER
                        ;
rel_op            	: EQUALS_OPERATOR
                    	| NOT_EQUAL_OPERATOR
                    	| LESS_EQUAL_OPERATOR
                    	| GREATER_EQUAL_OPERATOR
                    	| LESS_THAN_OPERATOR
                    	| GREATER_THAN_OPERATOR
                    	| AND_operator
                    	| OR_operator
                        ;
bool_logical      	: bool_term OR_operator bool_logical
                    	| bool_term

                        ;
bool_term         	: bool_factor AND_operator bool_term
                    	| bool_factor
                        ;
bool_factor       	: OPEN_PAR bool_logical CLOSE_PAR
                    	| NOT_operator bool_logical
                    	| bool_identifier
                        ;
bool_identifier   	: STRING_LITERAL
                        ;

//Productions for Constants

constdecl_list    	: const_statement constdecl_list
                    	| const_statement
                        ;
const_statement   	: CONSTANT_KEYWORD data_type VARIABLE_IDENTIFIER ASSIGNMENT_OPERATOR constant TERMINATOR
                        ;
constant          	: sign INTEGER_LITERAL
                        | sign FLOAT_LITERAL
                        | CHAR_LITERAL
                        | STRING_LITERAL
                        | INTEGER_LITERAL
                        | FLOAT_LITERAL
                        ;
sign              	: ADDITION_OPERATOR
                    	| SUBTRACTION_OPERATOR
                        ;

//Productions for Input and Output

output              	: OUTPUT_FUNCTION OPEN_PAR STRING_LITERAL CLOSE_PAR TERMINATOR
                        | OUTPUT_FUNCTION OPEN_PAR VARIABLE_IDENTIFIER CLOSE_PAR TERMINATOR
/*
                        | OUTPUT_FUNCTION OPEN_PAR STRING_LITERAL CLOSE_PAR {notifyErrorListeners("Missing ';' ");}
*/
                        ;
output_list	        : expression
                        | VARIABLE_IDENTIFIER
                        | funccall_statement
                        | STRING_LITERAL
                        ;
input	                : VARIABLE_IDENTIFIER ASSIGNMENT_OPERATOR INPUT_FUNCTION OPEN_PAR input_list CLOSE_PAR
                        | INPUT_FUNCTION OPEN_PAR CLOSE_PAR

                        ;
input_list	        : INTEGER_LITERAL
                        | STRING_LITERAL
                        | CHAR_LITERAL
                        | STRING_LITERAL
                        ;

//Terminals

QUOTE1                   : '"'
                        ;
QUOTE2                   : '"'
                        ;
INTEGER_LITERAL         : [0-9]+
                        ;
CHAR_LITERAL	: QUOTE1 [0-9a-zA-Z] QUOTE1
                        ;
FLOAT_LITERAL	: [0-9]+'.'[0-9]+
                        ;
STRING_LITERAL	: QUOTE2 [ A-Za-z0-9!:.]* QUOTE2
                        ;
VARIABLE_IDENTIFIER	: 'variable ' [A-Za-z_]+[0-9]*
                        ;
COMMENT_BLOCK	: 'comment! '  [A-Za-z0-9]* ' !comment'
                        ;
TERMINATOR	:   ';'
                        ;
RETURN_KEYWORD	: 'return'
                        ;
INTEGER_KEYWORD	: 'int'
                        ;
BOOLEAN_KEYWORD : 'boolean'
                        ;
FLOAT_KEYWORD	: 'float'
                        ;
STRING_KEYWORD	: 'string'
                        ;
CHAR_KEYWORD	: 'char'
                        ;
VOID_KEYWORD	: 'void'
                        ;
DOUBLE_KEYWORD	: 'double'
                        ;
DO_LOOP	: 'do'
                        ;
WHILE_LOOP	: 'while'
                        ;
FOR_LOOP	: 'for'
                        ;
OUTPUT_FUNCTION	: 'output'
                        ;
INPUT_FUNCTION	: 'input'
                        ;
MAIN_KEYWORD	: 'main'
                        ;
IF_STATEMENT	: 'if'
                        ;
ELSE_STATEMENT	: 'else'
                        ;
COLON	: ':'
                        ;
ADDITION_OPERATOR	: '+'
                        ;
SUBTRACTION_OPERATOR	: '-'
                        ;
MULTIPLICATION_OPERATOR	: '*'
                        ;
DIVISION_OPERATOR	: '/'
                        ;
MODULO_OPERATOR	: '%'
                        ;
INCREMENTAL_OPERATOR	: 'padagdag'
                        ;
DECREMENTAL_OPERATOR	: 'pabawas'
                        ;
AND_operator	: 'tsaka'
                        ;
OR_operator	: 'pwede rin'
                        ;
NOT_operator	: 'hindi'
                        ;
ASSIGNMENT_OPERATOR	: '='
                        ;
PLUS_EQUAL_OPERATOR	: '+='
                        ;
MINUS_EQUAL_OPERATOR	: '-='
                        ;
TIMES_EQUAL_OPERATOR	: '*='
                        ;
DIVIDE_EQUAL_OPERATOR	: '='
                        ;
MODULO_EQUAL_OPERATOR	: '%='
                        ;
GREATER_THAN_OPERATOR	: '>'
                        ;
LESS_THAN_OPERATOR	: '<'
                        ;
LESS_EQUAL_OPERATOR	: '='
                        ;
GREATER_EQUAL_OPERATOR	: '>='
                        ;
NOT_EQUAL_OPERATOR	: '!='
                        ;
EQUALS_OPERATOR	: '=='
                        ;
OPEN_BRACE	: '{'
                        ;
CLOSE_BRACE	: '}'
                        ;
OPEN_BRACKET	: '['
                        ;
CLOSE_BRACKET	: ']'
                        ;
OPEN_PAR	: '('
                        ;
CLOSE_PAR	: ')'
                        ;
COMMA	: ','
                        ;
ARRAY_IDENTIFIER	: 'array ' [A-Za-z]+ '[' [0-9]+ ']'
                        ;
FUNCTION_IDENTIFIER	: 'function ' [A-Za-z]+
                        ;
CONSTANT_KEYWORD	: 'kunstant'
                        ;
TRUE_LITERAL	: 'totoo'
                        ;
FALSE_LITERAL	: 'talon'
                        ;




WS  : [ \t\r\n]+ -> skip;
