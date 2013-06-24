// Define a Wagner language grammar
grammar JWagner;
@header {
    package ru.obolensk.afff.wagner.jwac.grammar;
}

melodyDeclaration // melody block
	: 'melody' ID (melodyBody)?	
;

melodyBody //melody body
	: playNote
;

//Wagner commands
playNote //playing single note command
 : 'play' INT INT INT
;

ID : [a-zA-Z0-9]+ ;             // match lower-case identifiers
INT : [0-9]+ ;			  // match number
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines