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
		( (playNow)? 'tune' ID melodyBody )
	          | ( playNow 'tune' ID CMDEND )
	)
;

command // generic commands block
 	: (playNoteCmd
 	   | goCmd) CMDEND
;

playNoteCmd // playing single note command
 	: 'play' note tactLenght? channel?
;

goCmd // go forward for N or 1 (by default) tacts 
 	: 'go' tactLenght?
;

playNow 
	: 'play'
;

note : NOTE ;

NOTE
	: NOTEKEY DIEZ? OCTAVE
;

tactLenght : TACTS ;

channel : INT ;

TACTS : INT ;

NOTEKEY : LETTER ;
DIEZ : '#' ;
OCTAVE : DIGIT ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;

ID : LETTER (LETTER | DIGIT)+ ;
INT : DIGIT+ ;
CMDEND : [;]+ ;

// comments
ROWCOMMENT : '//' .*? [\r\n] -> skip ; // skip one row comments
BLOCKCOMMENT : '/*' .*? '*/' -> skip ; // .*? matches anything until the first */

// spaces and new lines
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
