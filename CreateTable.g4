grammar CreateTable;

@header {
import java.util.ArrayList;
import java.util.List;
}

tableList
	:	(tableDef)*	
	;
 
tableDef
	:	'create' 'table' tablename tableElementList SEMICOLON		
	;
 
tablename
	:	(schema DOT)? table;
 
tableElementList
	:	LEFT_PAREN columnDef (COMMA columnDef)* (COMMA tableConstraint )* RIGHT_PAREN;
 
columnDef
	:	columnName dataTypeDef? columnConstraint?;
 
dataTypeDef
	:	dataType lengthDef?;

dataType 
	:	ID;
	
lengthDef
	:	LEFT_PAREN NUMBER RIGHT_PAREN | LEFT_PAREN NUMBER COMMA DECIMAL RIGHT_PAREN;
	
tableConstraint
    :	'TODO:COMPLETAR';	
    
columnConstraint
	:	'TODO:COMPLETAR';
         
schema
	:	ID;
 
table
	:	ID;
 
columnName
	:	ID;

 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
 
LEFT_PAREN 	: '(';
RIGHT_PAREN : ')';
COMMA 		: ',';
SEMICOLON 	: ';';
DOT 		: '.';
NUMBER  	: (DIGIT)+;
DECIMAL  	: (DIGIT)+;   
ID  		: (('a'..'z'|'A'..'Z' | '_') ((DIGIT)*))+ ;
WS 			: [ \t\r\n]+ -> skip ;
fragment DIGIT :   '0'..'9' ;
