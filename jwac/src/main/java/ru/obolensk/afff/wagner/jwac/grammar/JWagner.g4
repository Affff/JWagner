// Define a Wagner language grammar
grammar JWagner;
@header {
    package ru.obolensk.afff.wagner.jwac.grammar;
}

melodyDeclaration // melody block
	: 'melody' ID melodyBody
;

melodyBody //melody body
	: '{'
	 ( command
	 | tune
	 )*
	 '}' 
;

tune // procedure block  
	: (
		( (mute)? 'tune' ID melodyBody )
	          | ( 'tune' ID CMDEND )
	)
;

mute 
	: 'mute'
;

command // generic commands block
 	: (playNoteCmd
 	   | goCmd) CMDEND
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
CMDEND : [;]+ ;

// comments
ROWCOMMENT : '#' .*? [\r\n] -> skip ; // skip one row comments
BLOCKCOMMENT : '/*' .*? '*/' -> skip ; // .*? matches anything until the first */

// spaces and new lines
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
