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
	 commands
	 //more commands here
	 '}' 
;

commands // generic commands block
 	: ((nopCmd
 		| playNoteCmd
 		| goCmd) NEWLINE)*
;

nopCmd // do nothing
 	: 
;

playNoteCmd // playing single note command
 	: 'play' INT INT INT
;

goCmd // go forward for N or 1 (by default) tacts 
 	: 'go' INT?
;

ID : LETTER (LETTER | DIGIT)+ ;
INT : DIGIT+ ;
LETTER : [a-zA-Z] ;
DIGIT : [0-9] ;
NEWLINE : [;]+ ;

// comments
ROWCOMMENT : '#' .*? [\r\n] -> skip ; // skip one row comments
BLOCKCOMMENT : '/*' .*? '*/' -> skip ; // .*? matches anything until the first */

// spaces and new lines
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
