lexer grammar HTMLPHPLEXER;
fragment WS
    :[ \t\r\n]+
    ;
APP_WS
    :WS->skip
    ;
CONTROLLER_ATTR
    :'controller'->pushMode(CONTROLLER_MODE)
    ;
PAGE_ATTR
    : 'page' -> pushMode(PAGE_MODE)
    ;

mode PAGE_MODE;

PAGE_WS
    : WS -> skip
    ;
EXTENDES
    :'extends'
    ;
PAGE_ID
    :[a-zA-Z] ([a-zA-Z]|[0-9])*
    ;
OPEN_CURLY_BRACKETS
    :'{'->pushMode(IO_MODE)
    ;


mode CONTROLLER_MODE;

CONTROLLER_WS
:WS -> skip
;
CONTROLES_ATTR
    :'controls'
    ;
ID
    :([a-zA-Z])+([a-zA-Z] | [0-9])*
    ;

CONTROLLER_OPEN_BRACKETS
    :'{'->pushMode(CONTROLLER_BODY_MODE)
    ;
CONTROLLER_SIMICOLON
      :';'->popMode
      ;

mode CONTROLLER_BODY_MODE;
CONTROLLER_BODY_WS
    :WS->skip
    ;
CLOSE_BRACKETS
      :'}'->popMode
      ;

IF
    :'if'->pushMode(IF_MODE);
ELSE_IF
    :'else if'->pushMode(IF_MODE)
    ;
ELSE
    :'else'->pushMode(IF_MODE)
    ;

FOR
    :'for'->pushMode(FOR_MODE)
    ;

DEF
    :'def'->pushMode(DEFINE_MODE)
    ;
ADD_FUNC
    :'add('->pushMode(ADD_FUNCTION_MODE)
    ;
TO_LOWER_FUNC
    :'toLower('->pushMode(TO_LOWER_FUNCTION_MODE)
    ;
TO_UPPER_FUNC
    :'toUpper('->pushMode(TO_UPPER_FUNCTION_MODE)
    ;
GOTO
    :'goto'->pushMode(GOTO_MODE)
    ;


mode TO_LOWER_FUNCTION_MODE;
    TO_LOWER_FUNCTION_OPEN_BRACKETS
        :'('
        ;
        TO_LOWER_FUNCTION_VAR
        :[a-zA-Z]([a-zA-Z0-9]|'_')*
        ;
        TO_LOWER_ARRAY_OPEN_BRACKETS
        :'['->pushMode(ARRAY_VAR_MODE)
        ;
        TO_LOWER_FUNCTION_CLOSE_BRACKETS
        :')'->popMode
        ;
mode TO_UPPER_FUNCTION_MODE;

TO_UPPER_FUNCTION_OPEN_BRACKETS
        :'('
        ;
        TO_UPPER_FUNCTION_VAR
        :[a-zA-Z]([a-zA-Z0-9]|'_')*
        ;
        TO_UPPER_ARRAY_OPEN_BRACKETS
        :'['->pushMode(ARRAY_VAR_MODE)
        ;
        TO_UPPER_FUNCTION_CLOSE_BRACKETS
        :')'->popMode
        ;
mode ADD_FUNCTION_MODE;
    ADD_VAR
    :[a-zA-Z]([a-zA-Z0-9]|'_')*
    ;
    ADD_VAR_ARRAY_OPEN_BRACKETS
    :'['->pushMode(ARRAY_VAR_MODE)
    ;
    ADD_VALUE
    :[0-9]+
    ;
    ADD_FUNCTION_COMMA
    :','
    ;
    ADD_CLOSE_BRACKETS
    :')'->popMode
    ;

mode DEFINE_MODE;
ARRAY_DEF_WS
    :WS->skip
    ;
ARRAY
    :'array'->pushMode(ARRAY_MODE)
    ;
mode ARRAY_MODE;
    ARRAY_WS
        :WS->skip
        ;
    ARRAY_NAME
    :[a-zA-Z]([a-zA-Z0-9]|'_')*
    ;
    ARRAY_VALUES_COMMA
    :','->pushMode(ARRAY_VALUES_MODE)
    ;
    DEFIEND_ARRAY_OPEN_BRACKETS
    :'('->pushMode(ARRAY_VALUES_MODE)
    ;
    DEFIEND_ARRAY_CLOSE_BRACKETS
    :')'->popMode,popMode
    ;


mode ARRAY_VALUES_MODE;
    ARRAY_VAR_VALUES
    :[a-zA-Z]([a-zA-Z0-9]|'_')*->popMode
    ;
    ARRAY_INT_VALUES
    :[0-9]+->popMode
    ;
    ARRAY_STRING_VALUES
    :'"'~([ \t\r\n] |';'|','|'{'|'}'|'('|')'|'"')+'"'->popMode
    ;

mode GOTO_MODE;
GOTO_OPEN_BRACKETS
    :'('
    ;
GOTO_COMMA
    :','->pushMode(GOTO_VAR_MODE)
    ;

GOTO_PAGE_ID
    :[a-zA-Z] ([a-zA-Z]|[0-9])*
    ;
GOTO_CLOSE_BRACKETS
    :')'->popMode
    ;
GOTO_WS
    :WS->skip
    ;
mode GOTO_VAR_MODE;
GOTO_VAR
    :[a-zA-Z]([a-zA-Z0-9]|'_')*->popMode
    ;
mode IF_MODE;
    IF_WS
    :WS->skip
    ;
    IF_OPEN_ARCH
    :'('->pushMode(EXPRESSION_MODE)
    ;
    IF_OPEN_BRACKETS
    :'{'->mode(CONTROLLER_BODY_MODE)
    ;

mode FOR_MODE;
FOR_MODE_OPEN_ARCH
    :'('->pushMode(FOR_EXPRESSION)
    ;
FOR_MODE_CLOSE_ARCH
     :')'
     ;
FOR_MODE_OPEN_BRACKETS
    :'{'->mode(CONTROLLER_BODY_MODE)
    ;

mode EXPRESSION_MODE;
   EXPRESSION_WS
   :[ \t\r\n]+ -> skip
   ;
  AND_AND_OPERATOR
    :'&&'
    ;
   OR_OPERATOR
    :'||'
    ;
    BIGGER_OPERATOR
    :'>'
    ;
    SMALLER_OPERATOR
    :'<'
    ;
    BIGGER_AND_EQUALS_OPERATOR
    :'>='
    ;
    SMALLER_AND_EQUALS_OPERATOR
    :'<='
    ;
    EQUALS_OPERATOR
    :'=='
    ;
    EXPRESSION_STRING
                :'"'~([ \t\r\n] |';'|','|'{'|'}'|'('|')'|'"')+'"'
                ;
    EXPRESSION_VAR
            :[a-zA-Z]([a-zA-Z0-9]|'_')*
            ;
    EXPRESSION_NUMBER
            :[0-9]+
            ;

    EXPRESSION_ARRAY_OPEN_BRACKETS
            :'['->pushMode(ARRAY_VAR_MODE)
            ;
    IF_CLOSE_ARCH
         :')'->popMode
         ;

mode ARRAY_VAR_MODE;
    ARRAY_INDEX_NUMER
        :[0-9]+
        ;
     ARRAY_INDEX_VAR
        :[a-zA-Z]([a-zA-Z0-9]|'_')*
        ;
    EXPRESSION_ARRAY_CLOSE_BRACKETS
        :']'->popMode
        ;
mode FOR_EXPRESSION;
    FOR_WS
    :WS->skip
    ;
    RANGE
            :'range'
            ;
          IN
             :'in'
             ;
    FOR_EXPRESSION_VAR
                :[a-zA-Z]([a-zA-Z0-9]|'_')*
                ;
    FOR_EXPRESSION_NUMBER
                :[0-9]+
                ;
    FOR_EXPRESSION_ARRAY_VAR_OPEN_BREACKETS
                :'['->pushMode(ARRAY_VAR_MODE)
                ;
    FOR_RANGE_CLOSE_ARCH
             :')'->popMode
             ;
      FOR_RANGE_OPEN_ARCH
            :'('
            ;
       COMMA_EXPRESSION_COMMA
       :','
       ;

mode IO_MODE;
IO_WS
    : [ \t\r]+ -> skip
    ;
IO_NEW_LINE
    :[\n]
    ;
IN_ATTR
    :'in' -> pushMode(INPUT_MODE)
    ;
OUT_ATT
    :'out' -> pushMode(OUTPUT_MODE)
    ;
LOCATION
    : 'location'-> pushMode(LOCATION_MODE)
    ;
REQUIRED
    :'required'
    ;
SUBMIT
    :'submit'
    ;
CLOSED_CURLY_BRACKETS
    :'}' -> popMode,popMode
    ;

mode INPUT_MODE;
INTPUT_WS
    : [ \t\r\n]+ -> skip
    ;
INPUT_COLON
    :':'
    ;
INPUT_SIMICOLON
    : ';' -> popMode
    ;

FIELD
    : 'field'->pushMode(INPUT_FIELD_MODE)
    ;

CHECKBOX
    :'checkbox'->pushMode(INPUT_CHOCIES)
    ;

DROPDOWN
    : 'dropdown'->pushMode(INPUT_CHOCIES)
    ;

RADIO
    : 'radio'->pushMode(INPUT_CHOCIES)
    ;
FILE
    :'file'->pushMode(INPUT_CHOCIES);

INPUT_PARAM_OPEN_PARA
    :'('
    ;
INPUT_PARAM_CLOSE_PARA
    :')'->popMode
    ;
mode OUTPUT_MODE;

OUTPUT_WS
    :[ \t\r\n]+ -> skip
    ;
OUTPUT_COLON
    : ':'
    ;
OUT_TEXT
    :'text'->pushMode(OUTPUT_PARAMS)
    ;
OUT_IMAGE
    :'image'->pushMode(IMAGE_MODE)
    ;
OUTPUT_SIMICOLON
    :';'->popMode
    ;

mode INPUT_FIELD_MODE;
    INPUT_FIELD_OPEN_ARCH
    :'('->pushMode(INPUT_FIELD_TYPE)
    ;
    INPUT_COMMA
    :','
    ;
    INPUT_FIELD
        :[a-zA-Z]([a-zA-Z0-9]|'_')*
        ;
     INPUT_FIELD_CLOSE_ARCH
         :')'->popMode
         ;
mode INPUT_FIELD_TYPE;
    TYPE :'type'
     ;
     TYPE_EQUALS:'='
      ;
     EMAIL:'email'->popMode
       ;
     PASSWORD:'password'->popMode
        ;
     URL:'url'->popMode
         ;
    NUMBER:'number'->popMode
          ;
    TEXT:'text'->popMode
          ;
mode INPUT_CHOCIES;
        INPUT_WS
        :WS->skip
        ;
       CHOICE_NAME
           :[a-zA-Z]([a-zA-Z0-9]|'_')*
           ;

     INPUT_CHOCIE_OPEN_ARCH
     :'('
     ;
     INPUT_CHOICE_CLOSE__ARCH
     :')'->popMode
     ;
     INPUT_CHOICE_COMMA
         :','
         ;

INPUT_DOUBLE_QUOTATION
    :'"'->pushMode(DOUBLE_QUOTATIONS_STRING)
    ;
    INPUT_SINGLE_QUOTATION
    :'\''->pushMode(SINGLE_QUOTATION_STRING)
    ;
    INPUT_NUMBER
    :[0-9]+
    ;
mode DOUBLE_QUOTATIONS_STRING;
DOUBLE_QUOT_INPUT_STRING
    : ~([ \t\r\n] |';'|','|'{'|'}'|'('|')'|'"')+
    ;
CLOSED_DOUBLE_QUOTATION
    : '"'->popMode;

mode SINGLE_QUOTATION_STRING;
    SINGLE_QUOT_INPUT_STRING
        : ~([ \t\r\n] |';'|','|'{'|'}'|'('|')'|'"'|'\'')+
        ;
    CLOSED_SINGLE_QUOTATION
        : '\''->popMode;



mode OUTPUT_PARAMS;
OUTPUT_PARAMS_WS
    : [ \t\r\n]+ -> skip;

OUTPUT_PARAM_OPEN_PARA
        :'('
        ;
OUTPUT_TEXT
    :(~([ \t\r\n] |';'|':'|','|'{'|'}'|'('|')'|'.'))+
    ;
OUTPUT_PARAM_CLOSE_PARA
        :')'->popMode
        ;

mode IMAGE_MODE;

IMAGE_PATH_DOUBLE_QUOTATIONS
    :'"'->pushMode(DOUBLE_QUOTATIONS_STRING)
    ;


OUTPUT_IMAGE_OPEN_PARA
    :OUTPUT_PARAM_OPEN_PARA
    ;
OUTPUT_IMAGE_CLOSE_PARA
    :OUTPUT_PARAM_CLOSE_PARA->popMode
    ;
mode LOCATION_MODE;
    LOCATION_OPEN_ARCH
        :'('
        ;
        CENTER
        :'center'
        ;
        LEFT_UPPER
        :'left_upper'
        ;
        RIGHT_UPPER
        :'right_upper'
        ;
        LEFT_DOWN
        :'left_down'
        ;
        RIGHT_DOWN
        :'right_down'
        ;
        LOCATION_CLOSE_ARCH
        :')'->popMode
        ;


