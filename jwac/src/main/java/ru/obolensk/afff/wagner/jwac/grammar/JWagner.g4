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
 	: (
 	    (playNoteCmd
 	   | goCmd
 	   | tempoCmd) CMDEND
 	  ) | emptyCmd
;

playNoteCmd // playing single note command
 	: noautofwd? play note tactLenght? channel?
;

goCmd // go forward for N or 1 (by default) tacts 
 	: 'go' tactLenght?
;

tempoCmd // config information
 	: 'tempo' tempoValue
;

emptyCmd // empty command (';')
	: CMDEND
;

playNow 
	: play (async)?
;

play 
	: 'play'
;

async 
	: 'async'
;

noautofwd
	: '~'
;

note : NOTE;

NOTE
	: NOTEKEY DIEZ? OCTAVE
;

tactLenght
	: tactLenghtPrefix? tactLenghtValue tactLenghtDot?
;

tactLenghtPrefix : '/' | '*' ;
tactLenghtValue : INT ;
tactLenghtDot : '.' ;

channel : INT ;

fragment NOTEKEY : LETTER ;
fragment DIEZ : LETTER ;
fragment OCTAVE : DIGIT ;

tempoValue
	: (
			'grave' | 'largo' | 'largamente' | 'adagio' | 'lento' | 'lentamente' |
			'larghetto' | 'andante assai' | 'adagietto' | 'andante' | 'andante maestoso' |
			'andante mosso' | 'comodo' | 'comodamente' | 'andante non troppo' | 'andante con moto' |
			'andantino' | 'moderato assai' | 'moderato' | 'con moto' | 'allegretto moderato' |
			'allegretto' | 'allegretto mosso' | 'animato' | 'animato assai' | 'allegro moderato' |
			'tempo di marcia' | 'allegro non troppo' | 'allegro tranquillo' | 'allegro' |
			'allegro molto' | 'allegro assai' | 'allegro agitato' | 'allegro animato' | 
			'allegro vivace' | 'vivo' | 'vivace' | 'presto' | 'prestissimo'
	  )
	  | tempoDigitValue
;

tempoDigitValue : INT ;

// lexer declarations
fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;

INT : DIGIT+ ;

ID : LETTER (LETTER | DIGIT)+ ;
CMDEND : ';' ;

// comments
ROWCOMMENT : '//' .*? [\r\n] -> skip ; // skip one row comments
BLOCKCOMMENT : '/*' .*? '*/' -> skip ; // .*? matches anything until the first */

// spaces and new lines
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
