// Define a Wagner language grammar
grammar JWagner;
@header {
    package ru.obolensk.afff.wagner.jwac.grammar;
}

melodyDeclaration // melody block
	: 'melody' ID (melodyBody)?	
;

melodyBody //melody body
	: '{'
	 command
	 //more commands here
	 '}' 
;

command // generic command block
 	: ((playNote)? ';')*
;

playNote //playing single note command
 : 'play' INT INT INT
;

ID : LETTER (LETTER | DIGIT)+ ;
INT : DIGIT+ ;
LETTER : [a-zA-Z] ;
DIGIT : [0-9] ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines