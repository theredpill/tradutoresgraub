grammar CreateTable;

tableList
	:	(tableDef)*	
	;
 
tableDef
	:	'create' 'table' tablename tableElementList SEMICOLON		
	;
 
tablename
	:	(schema DOT)? table;
 
tableElementList
	:	LEFT_PAREN columnDef (COMMA columnDef)* (COMMA tableConstraint)* RIGHT_PAREN;
 
columnDef
	:	columnName dataTypeDef? columnConstraint?;
 
dataTypeDef
	:	dataType lengthDef? comment?;

dataType 
	:	ID;
	
lengthDef
	:	LEFT_PAREN NUMBER RIGHT_PAREN | LEFT_PAREN NUMBER COMMA NUMBER RIGHT_PAREN;
	
comment
	:	'comment' STRING;

tableConstraint
    :	('constraint' ID)? 'primary' 'key'  '(' columnName ')';	
    
columnConstraint
	:	'not null';
         
schema
	:	ID;
 
table
	:	ID;
 
columnName
	:	ID;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
STRING		: '\'' ( ~'\'' | '\'\'' )* '\'';
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
