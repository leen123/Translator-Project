// Generated from D:/Mriwed/src\HTMLPHPPARSER.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLPHPPARSER extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		APP_WS=1, CONTROLLER_ATTR=2, PAGE_ATTR=3, PAGE_WS=4, EXTENDES=5, PAGE_ID=6, 
		OPEN_CURLY_BRACKETS=7, CONTROLLER_WS=8, CONTROLES_ATTR=9, ID=10, CONTROLLER_OPEN_BRACKETS=11, 
		CONTROLLER_SIMICOLON=12, CONTROLLER_BODY_WS=13, CLOSE_BRACKETS=14, IF=15, 
		ELSE_IF=16, ELSE=17, FOR=18, DEF=19, ADD_FUNC=20, TO_LOWER_FUNC=21, TO_UPPER_FUNC=22, 
		GOTO=23, TO_LOWER_FUNCTION_OPEN_BRACKETS=24, TO_LOWER_FUNCTION_VAR=25, 
		TO_LOWER_ARRAY_OPEN_BRACKETS=26, TO_LOWER_FUNCTION_CLOSE_BRACKETS=27, 
		TO_UPPER_FUNCTION_OPEN_BRACKETS=28, TO_UPPER_FUNCTION_VAR=29, TO_UPPER_ARRAY_OPEN_BRACKETS=30, 
		TO_UPPER_FUNCTION_CLOSE_BRACKETS=31, ADD_VAR=32, ADD_VAR_ARRAY_OPEN_BRACKETS=33, 
		ADD_VALUE=34, ADD_FUNCTION_COMMA=35, ADD_CLOSE_BRACKETS=36, ARRAY_DEF_WS=37, 
		ARRAY=38, ARRAY_WS=39, ARRAY_NAME=40, ARRAY_VALUES_COMMA=41, DEFIEND_ARRAY_OPEN_BRACKETS=42, 
		DEFIEND_ARRAY_CLOSE_BRACKETS=43, ARRAY_VAR_VALUES=44, ARRAY_INT_VALUES=45, 
		ARRAY_STRING_VALUES=46, GOTO_OPEN_BRACKETS=47, GOTO_COMMA=48, GOTO_PAGE_ID=49, 
		GOTO_CLOSE_BRACKETS=50, GOTO_WS=51, GOTO_VAR=52, IF_WS=53, IF_OPEN_ARCH=54, 
		IF_OPEN_BRACKETS=55, FOR_MODE_OPEN_ARCH=56, FOR_MODE_CLOSE_ARCH=57, FOR_MODE_OPEN_BRACKETS=58, 
		EXPRESSION_WS=59, AND_AND_OPERATOR=60, OR_OPERATOR=61, BIGGER_OPERATOR=62, 
		SMALLER_OPERATOR=63, BIGGER_AND_EQUALS_OPERATOR=64, SMALLER_AND_EQUALS_OPERATOR=65, 
		EQUALS_OPERATOR=66, EXPRESSION_STRING=67, EXPRESSION_VAR=68, EXPRESSION_NUMBER=69, 
		EXPRESSION_ARRAY_OPEN_BRACKETS=70, IF_CLOSE_ARCH=71, ARRAY_INDEX_NUMER=72, 
		ARRAY_INDEX_VAR=73, EXPRESSION_ARRAY_CLOSE_BRACKETS=74, FOR_WS=75, RANGE=76, 
		IN=77, FOR_EXPRESSION_VAR=78, FOR_EXPRESSION_NUMBER=79, FOR_EXPRESSION_ARRAY_VAR_OPEN_BREACKETS=80, 
		FOR_RANGE_CLOSE_ARCH=81, FOR_RANGE_OPEN_ARCH=82, COMMA_EXPRESSION_COMMA=83, 
		IO_WS=84, IO_NEW_LINE=85, IN_ATTR=86, OUT_ATT=87, LOCATION=88, REQUIRED=89, 
		SUBMIT=90, CLOSED_CURLY_BRACKETS=91, INTPUT_WS=92, INPUT_COLON=93, INPUT_SIMICOLON=94, 
		FIELD=95, CHECKBOX=96, DROPDOWN=97, RADIO=98, FILE=99, INPUT_PARAM_OPEN_PARA=100, 
		INPUT_PARAM_CLOSE_PARA=101, OUTPUT_WS=102, OUTPUT_COLON=103, OUT_TEXT=104, 
		OUT_IMAGE=105, OUTPUT_SIMICOLON=106, INPUT_FIELD_OPEN_ARCH=107, INPUT_COMMA=108, 
		INPUT_FIELD=109, INPUT_FIELD_CLOSE_ARCH=110, TYPE=111, TYPE_EQUALS=112, 
		EMAIL=113, PASSWORD=114, URL=115, NUMBER=116, TEXT=117, INPUT_WS=118, 
		CHOICE_NAME=119, INPUT_CHOCIE_OPEN_ARCH=120, INPUT_CHOICE_CLOSE__ARCH=121, 
		INPUT_CHOICE_COMMA=122, INPUT_DOUBLE_QUOTATION=123, INPUT_SINGLE_QUOTATION=124, 
		INPUT_NUMBER=125, DOUBLE_QUOT_INPUT_STRING=126, CLOSED_DOUBLE_QUOTATION=127, 
		SINGLE_QUOT_INPUT_STRING=128, CLOSED_SINGLE_QUOTATION=129, OUTPUT_PARAMS_WS=130, 
		OUTPUT_PARAM_OPEN_PARA=131, OUTPUT_TEXT=132, OUTPUT_PARAM_CLOSE_PARA=133, 
		IMAGE_PATH_DOUBLE_QUOTATIONS=134, OUTPUT_IMAGE_OPEN_PARA=135, OUTPUT_IMAGE_CLOSE_PARA=136, 
		LOCATION_OPEN_ARCH=137, CENTER=138, LEFT_UPPER=139, RIGHT_UPPER=140, LEFT_DOWN=141, 
		RIGHT_DOWN=142, LOCATION_CLOSE_ARCH=143;
	public static final int
		RULE_app = 0, RULE_define_page = 1, RULE_define_controller = 2, RULE_submit = 3, 
		RULE_body = 4, RULE_controller = 5, RULE_location = 6, RULE_controller_body = 7, 
		RULE_if_statement = 8, RULE_else_if = 9, RULE_else_end = 10, RULE_define_array = 11, 
		RULE_array_values = 12, RULE_for_loop = 13, RULE_var_or_number = 14, RULE_function = 15, 
		RULE_add_function = 16, RULE_to_lower_function = 17, RULE_to_upper_function = 18, 
		RULE_goto_page = 19, RULE_exepression = 20, RULE_left_expression = 21, 
		RULE_right_expression = 22, RULE_exepression_var = 23, RULE_exepression_operator = 24, 
		RULE_opertator = 25, RULE_array_bounds = 26, RULE_input = 27, RULE_output = 28, 
		RULE_field = 29, RULE_input_field_type = 30, RULE_file = 31, RULE_image = 32, 
		RULE_multiple_choice_field = 33, RULE_image_path = 34, RULE_input_text = 35, 
		RULE_string = 36, RULE_double_quotations_string = 37, RULE_single_quotations_string = 38, 
		RULE_integer = 39, RULE_checkbox = 40, RULE_dropdown = 41, RULE_radio = 42, 
		RULE_outputText = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "define_page", "define_controller", "submit", "body", "controller", 
			"location", "controller_body", "if_statement", "else_if", "else_end", 
			"define_array", "array_values", "for_loop", "var_or_number", "function", 
			"add_function", "to_lower_function", "to_upper_function", "goto_page", 
			"exepression", "left_expression", "right_expression", "exepression_var", 
			"exepression_operator", "opertator", "array_bounds", "input", "output", 
			"field", "input_field_type", "file", "image", "multiple_choice_field", 
			"image_path", "input_text", "string", "double_quotations_string", "single_quotations_string", 
			"integer", "checkbox", "dropdown", "radio", "outputText"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'controller'", "'page'", null, "'extends'", null, null, 
			null, "'controls'", null, null, null, null, null, "'if'", "'else if'", 
			"'else'", "'for'", "'def'", "'add('", "'toLower('", "'toUpper('", "'goto'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'array'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'&&'", "'||'", "'>'", "'<'", "'>='", "'<='", "'=='", null, null, 
			null, null, null, null, null, "']'", null, "'range'", null, null, null, 
			null, null, null, null, null, null, null, "'out'", "'location'", "'required'", 
			"'submit'", null, null, null, null, "'field'", "'checkbox'", "'dropdown'", 
			"'radio'", "'file'", null, null, null, null, null, "'image'", null, null, 
			null, null, null, "'type'", "'='", "'email'", "'password'", "'url'", 
			"'number'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'center'", 
			"'left_upper'", "'right_upper'", "'left_down'", "'right_down'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "APP_WS", "CONTROLLER_ATTR", "PAGE_ATTR", "PAGE_WS", "EXTENDES", 
			"PAGE_ID", "OPEN_CURLY_BRACKETS", "CONTROLLER_WS", "CONTROLES_ATTR", 
			"ID", "CONTROLLER_OPEN_BRACKETS", "CONTROLLER_SIMICOLON", "CONTROLLER_BODY_WS", 
			"CLOSE_BRACKETS", "IF", "ELSE_IF", "ELSE", "FOR", "DEF", "ADD_FUNC", 
			"TO_LOWER_FUNC", "TO_UPPER_FUNC", "GOTO", "TO_LOWER_FUNCTION_OPEN_BRACKETS", 
			"TO_LOWER_FUNCTION_VAR", "TO_LOWER_ARRAY_OPEN_BRACKETS", "TO_LOWER_FUNCTION_CLOSE_BRACKETS", 
			"TO_UPPER_FUNCTION_OPEN_BRACKETS", "TO_UPPER_FUNCTION_VAR", "TO_UPPER_ARRAY_OPEN_BRACKETS", 
			"TO_UPPER_FUNCTION_CLOSE_BRACKETS", "ADD_VAR", "ADD_VAR_ARRAY_OPEN_BRACKETS", 
			"ADD_VALUE", "ADD_FUNCTION_COMMA", "ADD_CLOSE_BRACKETS", "ARRAY_DEF_WS", 
			"ARRAY", "ARRAY_WS", "ARRAY_NAME", "ARRAY_VALUES_COMMA", "DEFIEND_ARRAY_OPEN_BRACKETS", 
			"DEFIEND_ARRAY_CLOSE_BRACKETS", "ARRAY_VAR_VALUES", "ARRAY_INT_VALUES", 
			"ARRAY_STRING_VALUES", "GOTO_OPEN_BRACKETS", "GOTO_COMMA", "GOTO_PAGE_ID", 
			"GOTO_CLOSE_BRACKETS", "GOTO_WS", "GOTO_VAR", "IF_WS", "IF_OPEN_ARCH", 
			"IF_OPEN_BRACKETS", "FOR_MODE_OPEN_ARCH", "FOR_MODE_CLOSE_ARCH", "FOR_MODE_OPEN_BRACKETS", 
			"EXPRESSION_WS", "AND_AND_OPERATOR", "OR_OPERATOR", "BIGGER_OPERATOR", 
			"SMALLER_OPERATOR", "BIGGER_AND_EQUALS_OPERATOR", "SMALLER_AND_EQUALS_OPERATOR", 
			"EQUALS_OPERATOR", "EXPRESSION_STRING", "EXPRESSION_VAR", "EXPRESSION_NUMBER", 
			"EXPRESSION_ARRAY_OPEN_BRACKETS", "IF_CLOSE_ARCH", "ARRAY_INDEX_NUMER", 
			"ARRAY_INDEX_VAR", "EXPRESSION_ARRAY_CLOSE_BRACKETS", "FOR_WS", "RANGE", 
			"IN", "FOR_EXPRESSION_VAR", "FOR_EXPRESSION_NUMBER", "FOR_EXPRESSION_ARRAY_VAR_OPEN_BREACKETS", 
			"FOR_RANGE_CLOSE_ARCH", "FOR_RANGE_OPEN_ARCH", "COMMA_EXPRESSION_COMMA", 
			"IO_WS", "IO_NEW_LINE", "IN_ATTR", "OUT_ATT", "LOCATION", "REQUIRED", 
			"SUBMIT", "CLOSED_CURLY_BRACKETS", "INTPUT_WS", "INPUT_COLON", "INPUT_SIMICOLON", 
			"FIELD", "CHECKBOX", "DROPDOWN", "RADIO", "FILE", "INPUT_PARAM_OPEN_PARA", 
			"INPUT_PARAM_CLOSE_PARA", "OUTPUT_WS", "OUTPUT_COLON", "OUT_TEXT", "OUT_IMAGE", 
			"OUTPUT_SIMICOLON", "INPUT_FIELD_OPEN_ARCH", "INPUT_COMMA", "INPUT_FIELD", 
			"INPUT_FIELD_CLOSE_ARCH", "TYPE", "TYPE_EQUALS", "EMAIL", "PASSWORD", 
			"URL", "NUMBER", "TEXT", "INPUT_WS", "CHOICE_NAME", "INPUT_CHOCIE_OPEN_ARCH", 
			"INPUT_CHOICE_CLOSE__ARCH", "INPUT_CHOICE_COMMA", "INPUT_DOUBLE_QUOTATION", 
			"INPUT_SINGLE_QUOTATION", "INPUT_NUMBER", "DOUBLE_QUOT_INPUT_STRING", 
			"CLOSED_DOUBLE_QUOTATION", "SINGLE_QUOT_INPUT_STRING", "CLOSED_SINGLE_QUOTATION", 
			"OUTPUT_PARAMS_WS", "OUTPUT_PARAM_OPEN_PARA", "OUTPUT_TEXT", "OUTPUT_PARAM_CLOSE_PARA", 
			"IMAGE_PATH_DOUBLE_QUOTATIONS", "OUTPUT_IMAGE_OPEN_PARA", "OUTPUT_IMAGE_CLOSE_PARA", 
			"LOCATION_OPEN_ARCH", "CENTER", "LEFT_UPPER", "RIGHT_UPPER", "LEFT_DOWN", 
			"RIGHT_DOWN", "LOCATION_CLOSE_ARCH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HTMLPHPPARSER.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLPHPPARSER(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AppContext extends ParserRuleContext {
		public List<Define_pageContext> define_page() {
			return getRuleContexts(Define_pageContext.class);
		}
		public Define_pageContext define_page(int i) {
			return getRuleContext(Define_pageContext.class,i);
		}
		public List<Define_controllerContext> define_controller() {
			return getRuleContexts(Define_controllerContext.class);
		}
		public Define_controllerContext define_controller(int i) {
			return getRuleContext(Define_controllerContext.class,i);
		}
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_app);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				define_page();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PAGE_ATTR );
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				define_controller();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONTROLLER_ATTR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_pageContext extends ParserRuleContext {
		public TerminalNode PAGE_ATTR() { return getToken(HTMLPHPPARSER.PAGE_ATTR, 0); }
		public List<TerminalNode> PAGE_ID() { return getTokens(HTMLPHPPARSER.PAGE_ID); }
		public TerminalNode PAGE_ID(int i) {
			return getToken(HTMLPHPPARSER.PAGE_ID, i);
		}
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(HTMLPHPPARSER.OPEN_CURLY_BRACKETS, 0); }
		public List<TerminalNode> IO_NEW_LINE() { return getTokens(HTMLPHPPARSER.IO_NEW_LINE); }
		public TerminalNode IO_NEW_LINE(int i) {
			return getToken(HTMLPHPPARSER.IO_NEW_LINE, i);
		}
		public SubmitContext submit() {
			return getRuleContext(SubmitContext.class,0);
		}
		public TerminalNode CLOSED_CURLY_BRACKETS() { return getToken(HTMLPHPPARSER.CLOSED_CURLY_BRACKETS, 0); }
		public TerminalNode EXTENDES() { return getToken(HTMLPHPPARSER.EXTENDES, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public Define_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterDefine_page(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitDefine_page(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitDefine_page(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_pageContext define_page() throws RecognitionException {
		Define_pageContext _localctx = new Define_pageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_define_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(PAGE_ATTR);
			setState(99);
			match(PAGE_ID);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDES) {
				{
				setState(100);
				match(EXTENDES);
				setState(101);
				match(PAGE_ID);
				}
			}

			setState(104);
			match(OPEN_CURLY_BRACKETS);
			setState(105);
			match(IO_NEW_LINE);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN_ATTR || _la==OUT_ATT) {
				{
				{
				setState(106);
				body();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			submit();
			setState(113);
			match(IO_NEW_LINE);
			setState(114);
			match(CLOSED_CURLY_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_controllerContext extends ParserRuleContext {
		public TerminalNode CONTROLLER_ATTR() { return getToken(HTMLPHPPARSER.CONTROLLER_ATTR, 0); }
		public List<TerminalNode> ID() { return getTokens(HTMLPHPPARSER.ID); }
		public TerminalNode ID(int i) {
			return getToken(HTMLPHPPARSER.ID, i);
		}
		public TerminalNode CONTROLES_ATTR() { return getToken(HTMLPHPPARSER.CONTROLES_ATTR, 0); }
		public ControllerContext controller() {
			return getRuleContext(ControllerContext.class,0);
		}
		public Define_controllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_controller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterDefine_controller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitDefine_controller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitDefine_controller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_controllerContext define_controller() throws RecognitionException {
		Define_controllerContext _localctx = new Define_controllerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define_controller);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CONTROLLER_ATTR);
			setState(117);
			match(ID);
			setState(118);
			match(CONTROLES_ATTR);
			setState(119);
			match(ID);
			setState(120);
			controller();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubmitContext extends ParserRuleContext {
		public TerminalNode SUBMIT() { return getToken(HTMLPHPPARSER.SUBMIT, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public SubmitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_submit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterSubmit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitSubmit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitSubmit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubmitContext submit() throws RecognitionException {
		SubmitContext _localctx = new SubmitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_submit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(SUBMIT);
			setState(123);
			location();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public TerminalNode IO_NEW_LINE() { return getToken(HTMLPHPPARSER.IO_NEW_LINE, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN_ATTR:
				{
				setState(125);
				input();
				}
				break;
			case OUT_ATT:
				{
				setState(126);
				output();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IO_NEW_LINE) {
				{
				setState(129);
				match(IO_NEW_LINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControllerContext extends ParserRuleContext {
		public TerminalNode CONTROLLER_OPEN_BRACKETS() { return getToken(HTMLPHPPARSER.CONTROLLER_OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(HTMLPHPPARSER.CLOSE_BRACKETS, 0); }
		public TerminalNode CONTROLLER_SIMICOLON() { return getToken(HTMLPHPPARSER.CONTROLLER_SIMICOLON, 0); }
		public List<Controller_bodyContext> controller_body() {
			return getRuleContexts(Controller_bodyContext.class);
		}
		public Controller_bodyContext controller_body(int i) {
			return getRuleContext(Controller_bodyContext.class,i);
		}
		public ControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControllerContext controller() throws RecognitionException {
		ControllerContext _localctx = new ControllerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_controller);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(CONTROLLER_OPEN_BRACKETS);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << DEF) | (1L << ADD_FUNC) | (1L << TO_LOWER_FUNC) | (1L << TO_UPPER_FUNC) | (1L << GOTO))) != 0)) {
				{
				{
				setState(133);
				controller_body();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(CLOSE_BRACKETS);
			setState(140);
			match(CONTROLLER_SIMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(HTMLPHPPARSER.LOCATION, 0); }
		public TerminalNode LOCATION_OPEN_ARCH() { return getToken(HTMLPHPPARSER.LOCATION_OPEN_ARCH, 0); }
		public TerminalNode LOCATION_CLOSE_ARCH() { return getToken(HTMLPHPPARSER.LOCATION_CLOSE_ARCH, 0); }
		public TerminalNode CENTER() { return getToken(HTMLPHPPARSER.CENTER, 0); }
		public TerminalNode LEFT_UPPER() { return getToken(HTMLPHPPARSER.LEFT_UPPER, 0); }
		public TerminalNode RIGHT_UPPER() { return getToken(HTMLPHPPARSER.RIGHT_UPPER, 0); }
		public TerminalNode LEFT_DOWN() { return getToken(HTMLPHPPARSER.LEFT_DOWN, 0); }
		public TerminalNode RIGHT_DOWN() { return getToken(HTMLPHPPARSER.RIGHT_DOWN, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(LOCATION);
			setState(143);
			match(LOCATION_OPEN_ARCH);
			setState(144);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (CENTER - 138)) | (1L << (LEFT_UPPER - 138)) | (1L << (RIGHT_UPPER - 138)) | (1L << (LEFT_DOWN - 138)) | (1L << (RIGHT_DOWN - 138)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(145);
			match(LOCATION_CLOSE_ARCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Controller_bodyContext extends ParserRuleContext {
		public Define_arrayContext define_array() {
			return getRuleContext(Define_arrayContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Goto_pageContext goto_page() {
			return getRuleContext(Goto_pageContext.class,0);
		}
		public Controller_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controller_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterController_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitController_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitController_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Controller_bodyContext controller_body() throws RecognitionException {
		Controller_bodyContext _localctx = new Controller_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_controller_body);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				define_array();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				if_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				for_loop();
				}
				break;
			case ADD_FUNC:
			case TO_LOWER_FUNC:
			case TO_UPPER_FUNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				function();
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				goto_page();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HTMLPHPPARSER.IF, 0); }
		public TerminalNode IF_OPEN_ARCH() { return getToken(HTMLPHPPARSER.IF_OPEN_ARCH, 0); }
		public ExepressionContext exepression() {
			return getRuleContext(ExepressionContext.class,0);
		}
		public TerminalNode IF_CLOSE_ARCH() { return getToken(HTMLPHPPARSER.IF_CLOSE_ARCH, 0); }
		public TerminalNode IF_OPEN_BRACKETS() { return getToken(HTMLPHPPARSER.IF_OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(HTMLPHPPARSER.CLOSE_BRACKETS, 0); }
		public List<Controller_bodyContext> controller_body() {
			return getRuleContexts(Controller_bodyContext.class);
		}
		public Controller_bodyContext controller_body(int i) {
			return getRuleContext(Controller_bodyContext.class,i);
		}
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public Else_endContext else_end() {
			return getRuleContext(Else_endContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(IF);
			setState(155);
			match(IF_OPEN_ARCH);
			setState(156);
			exepression();
			setState(157);
			match(IF_CLOSE_ARCH);
			setState(158);
			match(IF_OPEN_BRACKETS);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << DEF) | (1L << ADD_FUNC) | (1L << TO_LOWER_FUNC) | (1L << TO_UPPER_FUNC) | (1L << GOTO))) != 0)) {
				{
				{
				setState(159);
				controller_body();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(CLOSE_BRACKETS);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(166);
				else_if();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(172);
				else_end();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(HTMLPHPPARSER.ELSE_IF, 0); }
		public TerminalNode IF_OPEN_ARCH() { return getToken(HTMLPHPPARSER.IF_OPEN_ARCH, 0); }
		public ExepressionContext exepression() {
			return getRuleContext(ExepressionContext.class,0);
		}
		public TerminalNode IF_CLOSE_ARCH() { return getToken(HTMLPHPPARSER.IF_CLOSE_ARCH, 0); }
		public TerminalNode IF_OPEN_BRACKETS() { return getToken(HTMLPHPPARSER.IF_OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(HTMLPHPPARSER.CLOSE_BRACKETS, 0); }
		public List<Controller_bodyContext> controller_body() {
			return getRuleContexts(Controller_bodyContext.class);
		}
		public Controller_bodyContext controller_body(int i) {
			return getRuleContext(Controller_bodyContext.class,i);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitElse_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitElse_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ELSE_IF);
			setState(176);
			match(IF_OPEN_ARCH);
			setState(177);
			exepression();
			setState(178);
			match(IF_CLOSE_ARCH);
			setState(179);
			match(IF_OPEN_BRACKETS);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << DEF) | (1L << ADD_FUNC) | (1L << TO_LOWER_FUNC) | (1L << TO_UPPER_FUNC) | (1L << GOTO))) != 0)) {
				{
				{
				setState(180);
				controller_body();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(CLOSE_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_endContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(HTMLPHPPARSER.ELSE, 0); }
		public TerminalNode IF_OPEN_BRACKETS() { return getToken(HTMLPHPPARSER.IF_OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(HTMLPHPPARSER.CLOSE_BRACKETS, 0); }
		public List<Controller_bodyContext> controller_body() {
			return getRuleContexts(Controller_bodyContext.class);
		}
		public Controller_bodyContext controller_body(int i) {
			return getRuleContext(Controller_bodyContext.class,i);
		}
		public Else_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterElse_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitElse_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitElse_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_endContext else_end() throws RecognitionException {
		Else_endContext _localctx = new Else_endContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ELSE);
			setState(189);
			match(IF_OPEN_BRACKETS);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << DEF) | (1L << ADD_FUNC) | (1L << TO_LOWER_FUNC) | (1L << TO_UPPER_FUNC) | (1L << GOTO))) != 0)) {
				{
				{
				setState(190);
				controller_body();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(CLOSE_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_arrayContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(HTMLPHPPARSER.DEF, 0); }
		public TerminalNode ARRAY() { return getToken(HTMLPHPPARSER.ARRAY, 0); }
		public TerminalNode ARRAY_NAME() { return getToken(HTMLPHPPARSER.ARRAY_NAME, 0); }
		public TerminalNode DEFIEND_ARRAY_OPEN_BRACKETS() { return getToken(HTMLPHPPARSER.DEFIEND_ARRAY_OPEN_BRACKETS, 0); }
		public TerminalNode DEFIEND_ARRAY_CLOSE_BRACKETS() { return getToken(HTMLPHPPARSER.DEFIEND_ARRAY_CLOSE_BRACKETS, 0); }
		public List<Array_valuesContext> array_values() {
			return getRuleContexts(Array_valuesContext.class);
		}
		public Array_valuesContext array_values(int i) {
			return getRuleContext(Array_valuesContext.class,i);
		}
		public List<TerminalNode> ARRAY_VALUES_COMMA() { return getTokens(HTMLPHPPARSER.ARRAY_VALUES_COMMA); }
		public TerminalNode ARRAY_VALUES_COMMA(int i) {
			return getToken(HTMLPHPPARSER.ARRAY_VALUES_COMMA, i);
		}
		public Define_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterDefine_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitDefine_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitDefine_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_arrayContext define_array() throws RecognitionException {
		Define_arrayContext _localctx = new Define_arrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_define_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(DEF);
			setState(199);
			match(ARRAY);
			setState(200);
			match(ARRAY_NAME);
			setState(201);
			match(DEFIEND_ARRAY_OPEN_BRACKETS);
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				array_values();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_VALUES_COMMA) {
					{
					setState(203);
					match(ARRAY_VALUES_COMMA);
					}
				}

				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_VAR_VALUES) | (1L << ARRAY_INT_VALUES) | (1L << ARRAY_STRING_VALUES))) != 0) );
			setState(210);
			match(DEFIEND_ARRAY_CLOSE_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_valuesContext extends ParserRuleContext {
		public TerminalNode ARRAY_VAR_VALUES() { return getToken(HTMLPHPPARSER.ARRAY_VAR_VALUES, 0); }
		public TerminalNode ARRAY_INT_VALUES() { return getToken(HTMLPHPPARSER.ARRAY_INT_VALUES, 0); }
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(HTMLPHPPARSER.ARRAY_STRING_VALUES, 0); }
		public Array_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterArray_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitArray_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitArray_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_valuesContext array_values() throws RecognitionException {
		Array_valuesContext _localctx = new Array_valuesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_VAR_VALUES) | (1L << ARRAY_INT_VALUES) | (1L << ARRAY_STRING_VALUES))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(HTMLPHPPARSER.FOR, 0); }
		public TerminalNode FOR_MODE_OPEN_ARCH() { return getToken(HTMLPHPPARSER.FOR_MODE_OPEN_ARCH, 0); }
		public TerminalNode FOR_EXPRESSION_VAR() { return getToken(HTMLPHPPARSER.FOR_EXPRESSION_VAR, 0); }
		public TerminalNode IN() { return getToken(HTMLPHPPARSER.IN, 0); }
		public TerminalNode RANGE() { return getToken(HTMLPHPPARSER.RANGE, 0); }
		public TerminalNode FOR_RANGE_OPEN_ARCH() { return getToken(HTMLPHPPARSER.FOR_RANGE_OPEN_ARCH, 0); }
		public List<Var_or_numberContext> var_or_number() {
			return getRuleContexts(Var_or_numberContext.class);
		}
		public Var_or_numberContext var_or_number(int i) {
			return getRuleContext(Var_or_numberContext.class,i);
		}
		public TerminalNode COMMA_EXPRESSION_COMMA() { return getToken(HTMLPHPPARSER.COMMA_EXPRESSION_COMMA, 0); }
		public TerminalNode FOR_RANGE_CLOSE_ARCH() { return getToken(HTMLPHPPARSER.FOR_RANGE_CLOSE_ARCH, 0); }
		public TerminalNode FOR_MODE_CLOSE_ARCH() { return getToken(HTMLPHPPARSER.FOR_MODE_CLOSE_ARCH, 0); }
		public TerminalNode FOR_MODE_OPEN_BRACKETS() { return getToken(HTMLPHPPARSER.FOR_MODE_OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(HTMLPHPPARSER.CLOSE_BRACKETS, 0); }
		public List<Controller_bodyContext> controller_body() {
			return getRuleContexts(Controller_bodyContext.class);
		}
		public Controller_bodyContext controller_body(int i) {
			return getRuleContext(Controller_bodyContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(FOR);
			setState(215);
			match(FOR_MODE_OPEN_ARCH);
			setState(216);
			match(FOR_EXPRESSION_VAR);
			setState(217);
			match(IN);
			setState(218);
			match(RANGE);
			setState(219);
			match(FOR_RANGE_OPEN_ARCH);
			setState(220);
			var_or_number();
			setState(221);
			match(COMMA_EXPRESSION_COMMA);
			setState(222);
			var_or_number();
			setState(223);
			match(FOR_RANGE_CLOSE_ARCH);
			setState(224);
			match(FOR_MODE_CLOSE_ARCH);
			setState(225);
			match(FOR_MODE_OPEN_BRACKETS);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << DEF) | (1L << ADD_FUNC) | (1L << TO_LOWER_FUNC) | (1L << TO_UPPER_FUNC) | (1L << GOTO))) != 0)) {
				{
				{
				setState(226);
				controller_body();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(CLOSE_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_or_numberContext extends ParserRuleContext {
		public TerminalNode FOR_EXPRESSION_VAR() { return getToken(HTMLPHPPARSER.FOR_EXPRESSION_VAR, 0); }
		public List<Array_boundsContext> array_bounds() {
			return getRuleContexts(Array_boundsContext.class);
		}
		public Array_boundsContext array_bounds(int i) {
			return getRuleContext(Array_boundsContext.class,i);
		}
		public TerminalNode FOR_EXPRESSION_NUMBER() { return getToken(HTMLPHPPARSER.FOR_EXPRESSION_NUMBER, 0); }
		public Var_or_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_or_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterVar_or_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitVar_or_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitVar_or_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_or_numberContext var_or_number() throws RecognitionException {
		Var_or_numberContext _localctx = new Var_or_numberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_or_number);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_EXPRESSION_VAR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(234);
				match(FOR_EXPRESSION_VAR);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (TO_LOWER_ARRAY_OPEN_BRACKETS - 26)) | (1L << (TO_UPPER_ARRAY_OPEN_BRACKETS - 26)) | (1L << (ADD_VAR_ARRAY_OPEN_BRACKETS - 26)) | (1L << (EXPRESSION_ARRAY_OPEN_BRACKETS - 26)) | (1L << (FOR_EXPRESSION_ARRAY_VAR_OPEN_BREACKETS - 26)))) != 0)) {
					{
					{
					setState(235);
					array_bounds();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case FOR_EXPRESSION_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(FOR_EXPRESSION_NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Add_functionContext add_function() {
			return getRuleContext(Add_functionContext.class,0);
		}
		public To_lower_functionContext to_lower_function() {
			return getRuleContext(To_lower_functionContext.class,0);
		}
		public To_upper_functionContext to_upper_function() {
			return getRuleContext(To_upper_functionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_FUNC:
				{
				setState(244);
				add_function();
				}
				break;
			case TO_LOWER_FUNC:
				{
				setState(245);
				to_lower_function();
				}
				break;
			case TO_UPPER_FUNC:
				{
				setState(246);
				to_upper_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_functionContext extends ParserRuleContext {
		public TerminalNode ADD_FUNC() { return getToken(HTMLPHPPARSER.ADD_FUNC, 0); }
		public TerminalNode ADD_VAR() { return getToken(HTMLPHPPARSER.ADD_VAR, 0); }
		public TerminalNode ADD_FUNCTION_COMMA() { return getToken(HTMLPHPPARSER.ADD_FUNCTION_COMMA, 0); }
		public TerminalNode ADD_VALUE() { return getToken(HTMLPHPPARSER.ADD_VALUE, 0); }
		public TerminalNode ADD_CLOSE_BRACKETS() { return getToken(HTMLPHPPARSER.ADD_CLOSE_BRACKETS, 0); }
		public List<Array_boundsContext> array_bounds() {
			return getRuleContexts(Array_boundsContext.class);
		}
		public Array_boundsContext array_bounds(int i) {
			return getRuleContext(Array_boundsContext.class,i);
		}
		public Add_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterAdd_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitAdd_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitAdd_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_functionContext add_function() throws RecognitionException {
		Add_functionContext _localctx = new Add_functionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_add_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ADD_FUNC);
			setState(250);
			match(ADD_VAR);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (TO_LOWER_ARRAY_OPEN_BRACKETS - 26)) | (1L << (TO_UPPER_ARRAY_OPEN_BRACKETS - 26)) | (1L << (ADD_VAR_ARRAY_OPEN_BRACKETS - 26)) | (1L << (EXPRESSION_ARRAY_OPEN_BRACKETS - 26)) | (1L << (FOR_EXPRESSION_ARRAY_VAR_OPEN_BREACKETS - 26)))) != 0)) {
				{
				{
				setState(251);
				array_bounds();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(ADD_FUNCTION_COMMA);
			setState(258);
			match(ADD_VALUE);
			setState(259);
			match(ADD_CLOSE_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class To_lower_functionContext extends ParserRuleContext {
		public TerminalNode TO_LOWER_FUNC() { return getToken(HTMLPHPPARSER.TO_LOWER_FUNC, 0); }
		public TerminalNode TO_LOWER_FUNCTION_VAR() { return getToken(HTMLPHPPARSER.TO_LOWER_FUNCTION_VAR, 0); }
		public TerminalNode TO_LOWER_FUNCTION_CLOSE_BRACKETS() { return getToken(HTMLPHPPARSER.TO_LOWER_FUNCTION_CLOSE_BRACKETS, 0); }
		public List<Array_boundsContext> array_bounds() {
			return getRuleContexts(Array_boundsContext.class);
		}
		public Array_boundsContext array_bounds(int i) {
			return getRuleContext(Array_boundsContext.class,i);
		}
		public To_lower_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to_lower_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterTo_lower_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitTo_lower_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitTo_lower_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final To_lower_functionContext to_lower_function() throws RecognitionException {
		To_lower_functionContext _localctx = new To_lower_functionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_to_lower_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(TO_LOWER_FUNC);
			setState(262);
			match(TO_LOWER_FUNCTION_VAR);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (TO_LOWER_ARRAY_OPEN_BRACKETS - 26)) | (1L << (TO_UPPER_ARRAY_OPEN_BRACKETS - 26)) | (1L << (ADD_VAR_ARRAY_OPEN_BRACKETS - 26)) | (1L << (EXPRESSION_ARRAY_OPEN_BRACKETS - 26)) | (1L << (FOR_EXPRESSION_ARRAY_VAR_OPEN_BREACKETS - 26)))) != 0)) {
				{
				{
				setState(263);
				array_bounds();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(TO_LOWER_FUNCTION_CLOSE_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class To_upper_functionContext extends ParserRuleContext {
		public TerminalNode TO_UPPER_FUNC() { return getToken(HTMLPHPPARSER.TO_UPPER_FUNC, 0); }
		public TerminalNode TO_UPPER_FUNCTION_VAR() { return getToken(HTMLPHPPARSER.TO_UPPER_FUNCTION_VAR, 0); }
		public TerminalNode TO_UPPER_FUNCTION_CLOSE_BRACKETS() { return getToken(HTMLPHPPARSER.TO_UPPER_FUNCTION_CLOSE_BRACKETS, 0); }
		public List<Array_boundsContext> array_bounds() {
			return getRuleContexts(Array_boundsContext.class);
		}
		public Array_boundsContext array_bounds(int i) {
			return getRuleContext(Array_boundsContext.class,i);
		}
		public To_upper_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to_upper_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterTo_upper_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitTo_upper_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitTo_upper_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final To_upper_functionContext to_upper_function() throws RecognitionException {
		To_upper_functionContext _localctx = new To_upper_functionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_to_upper_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(TO_UPPER_FUNC);
			setState(272);
			match(TO_UPPER_FUNCTION_VAR);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (TO_LOWER_ARRAY_OPEN_BRACKETS - 26)) | (1L << (TO_UPPER_ARRAY_OPEN_BRACKETS - 26)) | (1L << (ADD_VAR_ARRAY_OPEN_BRACKETS - 26)) | (1L << (EXPRESSION_ARRAY_OPEN_BRACKETS - 26)) | (1L << (FOR_EXPRESSION_ARRAY_VAR_OPEN_BREACKETS - 26)))) != 0)) {
				{
				{
				setState(273);
				array_bounds();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(TO_UPPER_FUNCTION_CLOSE_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Goto_pageContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(HTMLPHPPARSER.GOTO, 0); }
		public TerminalNode GOTO_OPEN_BRACKETS() { return getToken(HTMLPHPPARSER.GOTO_OPEN_BRACKETS, 0); }
		public TerminalNode GOTO_PAGE_ID() { return getToken(HTMLPHPPARSER.GOTO_PAGE_ID, 0); }
		public TerminalNode GOTO_CLOSE_BRACKETS() { return getToken(HTMLPHPPARSER.GOTO_CLOSE_BRACKETS, 0); }
		public List<TerminalNode> GOTO_COMMA() { return getTokens(HTMLPHPPARSER.GOTO_COMMA); }
		public TerminalNode GOTO_COMMA(int i) {
			return getToken(HTMLPHPPARSER.GOTO_COMMA, i);
		}
		public List<TerminalNode> GOTO_VAR() { return getTokens(HTMLPHPPARSER.GOTO_VAR); }
		public TerminalNode GOTO_VAR(int i) {
			return getToken(HTMLPHPPARSER.GOTO_VAR, i);
		}
		public Goto_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterGoto_page(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitGoto_page(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitGoto_page(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Goto_pageContext goto_page() throws RecognitionException {
		Goto_pageContext _localctx = new Goto_pageContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_goto_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(GOTO);
			setState(282);
			match(GOTO_OPEN_BRACKETS);
			setState(283);
			match(GOTO_PAGE_ID);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GOTO_COMMA) {
				{
				{
				setState(284);
				match(GOTO_COMMA);
				setState(285);
				match(GOTO_VAR);
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(GOTO_CLOSE_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExepressionContext extends ParserRuleContext {
		public Left_expressionContext left_expression() {
			return getRuleContext(Left_expressionContext.class,0);
		}
		public OpertatorContext opertator() {
			return getRuleContext(OpertatorContext.class,0);
		}
		public Right_expressionContext right_expression() {
			return getRuleContext(Right_expressionContext.class,0);
		}
		public Exepression_operatorContext exepression_operator() {
			return getRuleContext(Exepression_operatorContext.class,0);
		}
		public ExepressionContext exepression() {
			return getRuleContext(ExepressionContext.class,0);
		}
		public ExepressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exepression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterExepression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitExepression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitExepression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExepressionContext exepression() throws RecognitionException {
		ExepressionContext _localctx = new ExepressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exepression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			left_expression();
			setState(294);
			opertator();
			setState(295);
			right_expression();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND_AND_OPERATOR || _la==OR_OPERATOR) {
				{
				setState(296);
				exepression_operator();
				setState(297);
				exepression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Left_expressionContext extends ParserRuleContext {
		public TerminalNode EXPRESSION_NUMBER() { return getToken(HTMLPHPPARSER.EXPRESSION_NUMBER, 0); }
		public TerminalNode EXPRESSION_STRING() { return getToken(HTMLPHPPARSER.EXPRESSION_STRING, 0); }
		public Exepression_varContext exepression_var() {
			return getRuleContext(Exepression_varContext.class,0);
		}
		public Left_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterLeft_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitLeft_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitLeft_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_expressionContext left_expression() throws RecognitionException {
		Left_expressionContext _localctx = new Left_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_left_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPRESSION_NUMBER:
				{
				setState(301);
				match(EXPRESSION_NUMBER);
				}
				break;
			case EXPRESSION_STRING:
				{
				setState(302);
				match(EXPRESSION_STRING);
				}
				break;
			case EXPRESSION_VAR:
				{
				setState(303);
				exepression_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_expressionContext extends ParserRuleContext {
		public TerminalNode EXPRESSION_NUMBER() { return getToken(HTMLPHPPARSER.EXPRESSION_NUMBER, 0); }
		public TerminalNode EXPRESSION_STRING() { return getToken(HTMLPHPPARSER.EXPRESSION_STRING, 0); }
		public Exepression_varContext exepression_var() {
			return getRuleContext(Exepression_varContext.class,0);
		}
		public Right_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterRight_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitRight_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitRight_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_expressionContext right_expression() throws RecognitionException {
		Right_expressionContext _localctx = new Right_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_right_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPRESSION_NUMBER:
				{
				setState(306);
				match(EXPRESSION_NUMBER);
				}
				break;
			case EXPRESSION_STRING:
				{
				setState(307);
				match(EXPRESSION_STRING);
				}
				break;
			case EXPRESSION_VAR:
				{
				setState(308);
				exepression_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exepression_varContext extends ParserRuleContext {
		public TerminalNode EXPRESSION_VAR() { return getToken(HTMLPHPPARSER.EXPRESSION_VAR, 0); }
		public List<Array_boundsContext> array_bounds() {
			return getRuleContexts(Array_boundsContext.class);
		}
		public Array_boundsContext array_bounds(int i) {
			return getRuleContext(Array_boundsContext.class,i);
		}
		public Exepression_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exepression_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterExepression_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitExepression_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitExepression_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exepression_varContext exepression_var() throws RecognitionException {
		Exepression_varContext _localctx = new Exepression_varContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exepression_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(EXPRESSION_VAR);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (TO_LOWER_ARRAY_OPEN_BRACKETS - 26)) | (1L << (TO_UPPER_ARRAY_OPEN_BRACKETS - 26)) | (1L << (ADD_VAR_ARRAY_OPEN_BRACKETS - 26)) | (1L << (EXPRESSION_ARRAY_OPEN_BRACKETS - 26)) | (1L << (FOR_EXPRESSION_ARRAY_VAR_OPEN_BREACKETS - 26)))) != 0)) {
				{
				{
				setState(312);
				array_bounds();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exepression_operatorContext extends ParserRuleContext {
		public TerminalNode AND_AND_OPERATOR() { return getToken(HTMLPHPPARSER.AND_AND_OPERATOR, 0); }
		public TerminalNode OR_OPERATOR() { return getToken(HTMLPHPPARSER.OR_OPERATOR, 0); }
		public Exepression_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exepression_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterExepression_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitExepression_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitExepression_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exepression_operatorContext exepression_operator() throws RecognitionException {
		Exepression_operatorContext _localctx = new Exepression_operatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exepression_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==AND_AND_OPERATOR || _la==OR_OPERATOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpertatorContext extends ParserRuleContext {
		public TerminalNode BIGGER_OPERATOR() { return getToken(HTMLPHPPARSER.BIGGER_OPERATOR, 0); }
		public TerminalNode SMALLER_OPERATOR() { return getToken(HTMLPHPPARSER.SMALLER_OPERATOR, 0); }
		public TerminalNode BIGGER_AND_EQUALS_OPERATOR() { return getToken(HTMLPHPPARSER.BIGGER_AND_EQUALS_OPERATOR, 0); }
		public TerminalNode SMALLER_AND_EQUALS_OPERATOR() { return getToken(HTMLPHPPARSER.SMALLER_AND_EQUALS_OPERATOR, 0); }
		public TerminalNode EQUALS_OPERATOR() { return getToken(HTMLPHPPARSER.EQUALS_OPERATOR, 0); }
		public OpertatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opertator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterOpertator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitOpertator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitOpertator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpertatorContext opertator() throws RecognitionException {
		OpertatorContext _localctx = new OpertatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opertator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (BIGGER_OPERATOR - 62)) | (1L << (SMALLER_OPERATOR - 62)) | (1L << (BIGGER_AND_EQUALS_OPERATOR - 62)) | (1L << (SMALLER_AND_EQUALS_OPERATOR - 62)) | (1L << (EQUALS_OPERATOR - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_boundsContext extends ParserRuleContext {
		public TerminalNode EXPRESSION_ARRAY_OPEN_BRACKETS() { return getToken(HTMLPHPPARSER.EXPRESSION_ARRAY_OPEN_BRACKETS, 0); }
		public TerminalNode FOR_EXPRESSION_ARRAY_VAR_OPEN_BREACKETS() { return getToken(HTMLPHPPARSER.FOR_EXPRESSION_ARRAY_VAR_OPEN_BREACKETS, 0); }
		public TerminalNode ADD_VAR_ARRAY_OPEN_BRACKETS() { return getToken(HTMLPHPPARSER.ADD_VAR_ARRAY_OPEN_BRACKETS, 0); }
		public TerminalNode TO_LOWER_ARRAY_OPEN_BRACKETS() { return getToken(HTMLPHPPARSER.TO_LOWER_ARRAY_OPEN_BRACKETS, 0); }
		public TerminalNode TO_UPPER_ARRAY_OPEN_BRACKETS() { return getToken(HTMLPHPPARSER.TO_UPPER_ARRAY_OPEN_BRACKETS, 0); }
		public TerminalNode ARRAY_INDEX_NUMER() { return getToken(HTMLPHPPARSER.ARRAY_INDEX_NUMER, 0); }
		public TerminalNode ARRAY_INDEX_VAR() { return getToken(HTMLPHPPARSER.ARRAY_INDEX_VAR, 0); }
		public List<TerminalNode> EXPRESSION_ARRAY_CLOSE_BRACKETS() { return getTokens(HTMLPHPPARSER.EXPRESSION_ARRAY_CLOSE_BRACKETS); }
		public TerminalNode EXPRESSION_ARRAY_CLOSE_BRACKETS(int i) {
			return getToken(HTMLPHPPARSER.EXPRESSION_ARRAY_CLOSE_BRACKETS, i);
		}
		public Array_boundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_bounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterArray_bounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitArray_bounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitArray_bounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_boundsContext array_bounds() throws RecognitionException {
		Array_boundsContext _localctx = new Array_boundsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array_bounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (TO_LOWER_ARRAY_OPEN_BRACKETS - 26)) | (1L << (TO_UPPER_ARRAY_OPEN_BRACKETS - 26)) | (1L << (ADD_VAR_ARRAY_OPEN_BRACKETS - 26)) | (1L << (EXPRESSION_ARRAY_OPEN_BRACKETS - 26)) | (1L << (FOR_EXPRESSION_ARRAY_VAR_OPEN_BREACKETS - 26)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(323);
			_la = _input.LA(1);
			if ( !(_la==ARRAY_INDEX_NUMER || _la==ARRAY_INDEX_VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPRESSION_ARRAY_CLOSE_BRACKETS) {
				{
				{
				setState(324);
				match(EXPRESSION_ARRAY_CLOSE_BRACKETS);
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public TerminalNode IN_ATTR() { return getToken(HTMLPHPPARSER.IN_ATTR, 0); }
		public TerminalNode INPUT_COLON() { return getToken(HTMLPHPPARSER.INPUT_COLON, 0); }
		public TerminalNode INPUT_SIMICOLON() { return getToken(HTMLPHPPARSER.INPUT_SIMICOLON, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Multiple_choice_fieldContext multiple_choice_field() {
			return getRuleContext(Multiple_choice_fieldContext.class,0);
		}
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode REQUIRED() { return getToken(HTMLPHPPARSER.REQUIRED, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(IN_ATTR);
			setState(331);
			match(INPUT_COLON);
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIELD:
				{
				setState(332);
				field();
				}
				break;
			case CHECKBOX:
			case DROPDOWN:
			case RADIO:
				{
				setState(333);
				multiple_choice_field();
				}
				break;
			case FILE:
				{
				setState(334);
				file();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(337);
			match(INPUT_SIMICOLON);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRED) {
				{
				setState(338);
				match(REQUIRED);
				}
			}

			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(341);
				location();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUT_ATT() { return getToken(HTMLPHPPARSER.OUT_ATT, 0); }
		public TerminalNode OUTPUT_COLON() { return getToken(HTMLPHPPARSER.OUTPUT_COLON, 0); }
		public TerminalNode OUTPUT_SIMICOLON() { return getToken(HTMLPHPPARSER.OUTPUT_SIMICOLON, 0); }
		public OutputTextContext outputText() {
			return getRuleContext(OutputTextContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(OUT_ATT);
			setState(345);
			match(OUTPUT_COLON);
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUT_TEXT:
				{
				setState(346);
				outputText();
				}
				break;
			case OUT_IMAGE:
				{
				setState(347);
				image();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(350);
			match(OUTPUT_SIMICOLON);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(351);
				location();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(HTMLPHPPARSER.FIELD, 0); }
		public TerminalNode INPUT_FIELD_OPEN_ARCH() { return getToken(HTMLPHPPARSER.INPUT_FIELD_OPEN_ARCH, 0); }
		public Input_field_typeContext input_field_type() {
			return getRuleContext(Input_field_typeContext.class,0);
		}
		public TerminalNode INPUT_COMMA() { return getToken(HTMLPHPPARSER.INPUT_COMMA, 0); }
		public TerminalNode INPUT_FIELD() { return getToken(HTMLPHPPARSER.INPUT_FIELD, 0); }
		public TerminalNode INPUT_FIELD_CLOSE_ARCH() { return getToken(HTMLPHPPARSER.INPUT_FIELD_CLOSE_ARCH, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(FIELD);
			setState(355);
			match(INPUT_FIELD_OPEN_ARCH);
			setState(356);
			input_field_type();
			setState(357);
			match(INPUT_COMMA);
			setState(358);
			match(INPUT_FIELD);
			setState(359);
			match(INPUT_FIELD_CLOSE_ARCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_field_typeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(HTMLPHPPARSER.TYPE, 0); }
		public TerminalNode TYPE_EQUALS() { return getToken(HTMLPHPPARSER.TYPE_EQUALS, 0); }
		public TerminalNode EMAIL() { return getToken(HTMLPHPPARSER.EMAIL, 0); }
		public TerminalNode PASSWORD() { return getToken(HTMLPHPPARSER.PASSWORD, 0); }
		public TerminalNode URL() { return getToken(HTMLPHPPARSER.URL, 0); }
		public TerminalNode NUMBER() { return getToken(HTMLPHPPARSER.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(HTMLPHPPARSER.TEXT, 0); }
		public Input_field_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_field_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterInput_field_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitInput_field_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitInput_field_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_field_typeContext input_field_type() throws RecognitionException {
		Input_field_typeContext _localctx = new Input_field_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_input_field_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(TYPE);
			setState(362);
			match(TYPE_EQUALS);
			setState(363);
			_la = _input.LA(1);
			if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (EMAIL - 113)) | (1L << (PASSWORD - 113)) | (1L << (URL - 113)) | (1L << (NUMBER - 113)) | (1L << (TEXT - 113)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(HTMLPHPPARSER.FILE, 0); }
		public TerminalNode INPUT_CHOCIE_OPEN_ARCH() { return getToken(HTMLPHPPARSER.INPUT_CHOCIE_OPEN_ARCH, 0); }
		public TerminalNode CHOICE_NAME() { return getToken(HTMLPHPPARSER.CHOICE_NAME, 0); }
		public TerminalNode INPUT_CHOICE_CLOSE__ARCH() { return getToken(HTMLPHPPARSER.INPUT_CHOICE_CLOSE__ARCH, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(FILE);
			setState(366);
			match(INPUT_CHOCIE_OPEN_ARCH);
			setState(367);
			match(CHOICE_NAME);
			setState(368);
			match(INPUT_CHOICE_CLOSE__ARCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode OUT_IMAGE() { return getToken(HTMLPHPPARSER.OUT_IMAGE, 0); }
		public TerminalNode OUTPUT_IMAGE_OPEN_PARA() { return getToken(HTMLPHPPARSER.OUTPUT_IMAGE_OPEN_PARA, 0); }
		public Image_pathContext image_path() {
			return getRuleContext(Image_pathContext.class,0);
		}
		public TerminalNode OUTPUT_IMAGE_CLOSE_PARA() { return getToken(HTMLPHPPARSER.OUTPUT_IMAGE_CLOSE_PARA, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(OUT_IMAGE);
			setState(371);
			match(OUTPUT_IMAGE_OPEN_PARA);
			setState(372);
			image_path();
			setState(373);
			match(OUTPUT_IMAGE_CLOSE_PARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiple_choice_fieldContext extends ParserRuleContext {
		public CheckboxContext checkbox() {
			return getRuleContext(CheckboxContext.class,0);
		}
		public DropdownContext dropdown() {
			return getRuleContext(DropdownContext.class,0);
		}
		public RadioContext radio() {
			return getRuleContext(RadioContext.class,0);
		}
		public Multiple_choice_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_choice_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterMultiple_choice_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitMultiple_choice_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitMultiple_choice_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choice_fieldContext multiple_choice_field() throws RecognitionException {
		Multiple_choice_fieldContext _localctx = new Multiple_choice_fieldContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multiple_choice_field);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHECKBOX:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				checkbox();
				}
				break;
			case DROPDOWN:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				dropdown();
				}
				break;
			case RADIO:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				radio();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Image_pathContext extends ParserRuleContext {
		public TerminalNode IMAGE_PATH_DOUBLE_QUOTATIONS() { return getToken(HTMLPHPPARSER.IMAGE_PATH_DOUBLE_QUOTATIONS, 0); }
		public TerminalNode DOUBLE_QUOT_INPUT_STRING() { return getToken(HTMLPHPPARSER.DOUBLE_QUOT_INPUT_STRING, 0); }
		public TerminalNode CLOSED_DOUBLE_QUOTATION() { return getToken(HTMLPHPPARSER.CLOSED_DOUBLE_QUOTATION, 0); }
		public Image_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterImage_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitImage_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitImage_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Image_pathContext image_path() throws RecognitionException {
		Image_pathContext _localctx = new Image_pathContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_image_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(IMAGE_PATH_DOUBLE_QUOTATIONS);
			setState(381);
			match(DOUBLE_QUOT_INPUT_STRING);
			setState(382);
			match(CLOSED_DOUBLE_QUOTATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_textContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Input_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterInput_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitInput_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitInput_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_textContext input_text() throws RecognitionException {
		Input_textContext _localctx = new Input_textContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_input_text);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT_DOUBLE_QUOTATION:
			case INPUT_SINGLE_QUOTATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				string();
				}
				break;
			case INPUT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public Double_quotations_stringContext double_quotations_string() {
			return getRuleContext(Double_quotations_stringContext.class,0);
		}
		public Single_quotations_stringContext single_quotations_string() {
			return getRuleContext(Single_quotations_stringContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_string);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT_DOUBLE_QUOTATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				double_quotations_string();
				}
				break;
			case INPUT_SINGLE_QUOTATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				single_quotations_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_quotations_stringContext extends ParserRuleContext {
		public TerminalNode INPUT_DOUBLE_QUOTATION() { return getToken(HTMLPHPPARSER.INPUT_DOUBLE_QUOTATION, 0); }
		public TerminalNode DOUBLE_QUOT_INPUT_STRING() { return getToken(HTMLPHPPARSER.DOUBLE_QUOT_INPUT_STRING, 0); }
		public TerminalNode CLOSED_DOUBLE_QUOTATION() { return getToken(HTMLPHPPARSER.CLOSED_DOUBLE_QUOTATION, 0); }
		public Double_quotations_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_quotations_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterDouble_quotations_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitDouble_quotations_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitDouble_quotations_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_quotations_stringContext double_quotations_string() throws RecognitionException {
		Double_quotations_stringContext _localctx = new Double_quotations_stringContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_double_quotations_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(INPUT_DOUBLE_QUOTATION);
			setState(393);
			match(DOUBLE_QUOT_INPUT_STRING);
			setState(394);
			match(CLOSED_DOUBLE_QUOTATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_quotations_stringContext extends ParserRuleContext {
		public TerminalNode INPUT_SINGLE_QUOTATION() { return getToken(HTMLPHPPARSER.INPUT_SINGLE_QUOTATION, 0); }
		public TerminalNode SINGLE_QUOT_INPUT_STRING() { return getToken(HTMLPHPPARSER.SINGLE_QUOT_INPUT_STRING, 0); }
		public TerminalNode CLOSED_SINGLE_QUOTATION() { return getToken(HTMLPHPPARSER.CLOSED_SINGLE_QUOTATION, 0); }
		public Single_quotations_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_quotations_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterSingle_quotations_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitSingle_quotations_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitSingle_quotations_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_quotations_stringContext single_quotations_string() throws RecognitionException {
		Single_quotations_stringContext _localctx = new Single_quotations_stringContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_single_quotations_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(INPUT_SINGLE_QUOTATION);
			setState(397);
			match(SINGLE_QUOT_INPUT_STRING);
			setState(398);
			match(CLOSED_SINGLE_QUOTATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INPUT_NUMBER() { return getToken(HTMLPHPPARSER.INPUT_NUMBER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(INPUT_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckboxContext extends ParserRuleContext {
		public TerminalNode CHECKBOX() { return getToken(HTMLPHPPARSER.CHECKBOX, 0); }
		public TerminalNode INPUT_CHOCIE_OPEN_ARCH() { return getToken(HTMLPHPPARSER.INPUT_CHOCIE_OPEN_ARCH, 0); }
		public TerminalNode CHOICE_NAME() { return getToken(HTMLPHPPARSER.CHOICE_NAME, 0); }
		public List<TerminalNode> INPUT_CHOICE_COMMA() { return getTokens(HTMLPHPPARSER.INPUT_CHOICE_COMMA); }
		public TerminalNode INPUT_CHOICE_COMMA(int i) {
			return getToken(HTMLPHPPARSER.INPUT_CHOICE_COMMA, i);
		}
		public TerminalNode INPUT_CHOICE_CLOSE__ARCH() { return getToken(HTMLPHPPARSER.INPUT_CHOICE_CLOSE__ARCH, 0); }
		public List<Input_textContext> input_text() {
			return getRuleContexts(Input_textContext.class);
		}
		public Input_textContext input_text(int i) {
			return getRuleContext(Input_textContext.class,i);
		}
		public CheckboxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkbox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterCheckbox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitCheckbox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitCheckbox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckboxContext checkbox() throws RecognitionException {
		CheckboxContext _localctx = new CheckboxContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_checkbox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(CHECKBOX);
			setState(403);
			match(INPUT_CHOCIE_OPEN_ARCH);
			setState(404);
			match(CHOICE_NAME);
			setState(405);
			match(INPUT_CHOICE_COMMA);
			{
			setState(406);
			input_text();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INPUT_CHOICE_COMMA) {
				{
				{
				setState(407);
				match(INPUT_CHOICE_COMMA);
				setState(408);
				input_text();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(414);
			match(INPUT_CHOICE_CLOSE__ARCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropdownContext extends ParserRuleContext {
		public TerminalNode DROPDOWN() { return getToken(HTMLPHPPARSER.DROPDOWN, 0); }
		public TerminalNode INPUT_CHOCIE_OPEN_ARCH() { return getToken(HTMLPHPPARSER.INPUT_CHOCIE_OPEN_ARCH, 0); }
		public TerminalNode CHOICE_NAME() { return getToken(HTMLPHPPARSER.CHOICE_NAME, 0); }
		public List<TerminalNode> INPUT_CHOICE_COMMA() { return getTokens(HTMLPHPPARSER.INPUT_CHOICE_COMMA); }
		public TerminalNode INPUT_CHOICE_COMMA(int i) {
			return getToken(HTMLPHPPARSER.INPUT_CHOICE_COMMA, i);
		}
		public TerminalNode INPUT_CHOICE_CLOSE__ARCH() { return getToken(HTMLPHPPARSER.INPUT_CHOICE_CLOSE__ARCH, 0); }
		public List<Input_textContext> input_text() {
			return getRuleContexts(Input_textContext.class);
		}
		public Input_textContext input_text(int i) {
			return getRuleContext(Input_textContext.class,i);
		}
		public DropdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropdown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterDropdown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitDropdown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitDropdown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropdownContext dropdown() throws RecognitionException {
		DropdownContext _localctx = new DropdownContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dropdown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(DROPDOWN);
			setState(417);
			match(INPUT_CHOCIE_OPEN_ARCH);
			setState(418);
			match(CHOICE_NAME);
			setState(419);
			match(INPUT_CHOICE_COMMA);
			{
			setState(420);
			input_text();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INPUT_CHOICE_COMMA) {
				{
				{
				setState(421);
				match(INPUT_CHOICE_COMMA);
				setState(422);
				input_text();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(428);
			match(INPUT_CHOICE_CLOSE__ARCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RadioContext extends ParserRuleContext {
		public TerminalNode RADIO() { return getToken(HTMLPHPPARSER.RADIO, 0); }
		public TerminalNode INPUT_CHOCIE_OPEN_ARCH() { return getToken(HTMLPHPPARSER.INPUT_CHOCIE_OPEN_ARCH, 0); }
		public TerminalNode CHOICE_NAME() { return getToken(HTMLPHPPARSER.CHOICE_NAME, 0); }
		public List<TerminalNode> INPUT_CHOICE_COMMA() { return getTokens(HTMLPHPPARSER.INPUT_CHOICE_COMMA); }
		public TerminalNode INPUT_CHOICE_COMMA(int i) {
			return getToken(HTMLPHPPARSER.INPUT_CHOICE_COMMA, i);
		}
		public TerminalNode INPUT_CHOICE_CLOSE__ARCH() { return getToken(HTMLPHPPARSER.INPUT_CHOICE_CLOSE__ARCH, 0); }
		public List<Input_textContext> input_text() {
			return getRuleContexts(Input_textContext.class);
		}
		public Input_textContext input_text(int i) {
			return getRuleContext(Input_textContext.class,i);
		}
		public RadioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_radio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterRadio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitRadio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitRadio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RadioContext radio() throws RecognitionException {
		RadioContext _localctx = new RadioContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_radio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(RADIO);
			setState(431);
			match(INPUT_CHOCIE_OPEN_ARCH);
			setState(432);
			match(CHOICE_NAME);
			setState(433);
			match(INPUT_CHOICE_COMMA);
			{
			setState(434);
			input_text();
			setState(435);
			match(INPUT_CHOICE_COMMA);
			setState(436);
			input_text();
			}
			setState(438);
			match(INPUT_CHOICE_CLOSE__ARCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputTextContext extends ParserRuleContext {
		public TerminalNode OUT_TEXT() { return getToken(HTMLPHPPARSER.OUT_TEXT, 0); }
		public TerminalNode OUTPUT_PARAM_OPEN_PARA() { return getToken(HTMLPHPPARSER.OUTPUT_PARAM_OPEN_PARA, 0); }
		public TerminalNode OUTPUT_TEXT() { return getToken(HTMLPHPPARSER.OUTPUT_TEXT, 0); }
		public TerminalNode OUTPUT_PARAM_CLOSE_PARA() { return getToken(HTMLPHPPARSER.OUTPUT_PARAM_CLOSE_PARA, 0); }
		public OutputTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).enterOutputText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLPHPPARSERListener ) ((HTMLPHPPARSERListener)listener).exitOutputText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLPHPPARSERVisitor ) return ((HTMLPHPPARSERVisitor<? extends T>)visitor).visitOutputText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputTextContext outputText() throws RecognitionException {
		OutputTextContext _localctx = new OutputTextContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_outputText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(OUT_TEXT);
			setState(441);
			match(OUTPUT_PARAM_OPEN_PARA);
			setState(442);
			match(OUTPUT_TEXT);
			setState(443);
			match(OUTPUT_PARAM_CLOSE_PARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0091\u01c0\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\6\2\\\n\2\r\2\16\2]\3\2\6\2a\n\2\r\2\16\2b\3\3\3\3\3\3"+
		"\3\3\5\3i\n\3\3\3\3\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\5\6\u0082\n\6\3\6\5\6\u0085\n"+
		"\6\3\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a3"+
		"\n\n\f\n\16\n\u00a6\13\n\3\n\3\n\7\n\u00aa\n\n\f\n\16\n\u00ad\13\n\3\n"+
		"\5\n\u00b0\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b8\n\13\f\13\16\13"+
		"\u00bb\13\13\3\13\3\13\3\f\3\f\3\f\7\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00cf\n\r\6\r\u00d1\n\r\r\r\16\r\u00d2"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u00e6\n\17\f\17\16\17\u00e9\13\17\3\17\3\17\3\20\3"+
		"\20\7\20\u00ef\n\20\f\20\16\20\u00f2\13\20\3\20\5\20\u00f5\n\20\3\21\3"+
		"\21\3\21\5\21\u00fa\n\21\3\22\3\22\3\22\7\22\u00ff\n\22\f\22\16\22\u0102"+
		"\13\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u010b\n\23\f\23\16\23\u010e"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\7\24\u0115\n\24\f\24\16\24\u0118\13\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0121\n\25\f\25\16\25\u0124\13"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u012e\n\26\3\27\3\27"+
		"\3\27\5\27\u0133\n\27\3\30\3\30\3\30\5\30\u0138\n\30\3\31\3\31\7\31\u013c"+
		"\n\31\f\31\16\31\u013f\13\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\7\34\u0148"+
		"\n\34\f\34\16\34\u014b\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u0152\n\35"+
		"\3\35\3\35\5\35\u0156\n\35\3\35\5\35\u0159\n\35\3\36\3\36\3\36\3\36\5"+
		"\36\u015f\n\36\3\36\3\36\5\36\u0163\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u017d"+
		"\n#\3$\3$\3$\3$\3%\3%\5%\u0185\n%\3&\3&\5&\u0189\n&\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\7*\u019c\n*\f*\16*\u019f\13*\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3+\7+\u01aa\n+\f+\16+\u01ad\13+\3+\3+\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\t\3\2\u008c\u0090"+
		"\3\2.\60\3\2>?\3\2@D\7\2\34\34  ##HHRR\3\2JK\3\2sw\2\u01c1\2[\3\2\2\2"+
		"\4d\3\2\2\2\6v\3\2\2\2\b|\3\2\2\2\n\u0081\3\2\2\2\f\u0086\3\2\2\2\16\u0090"+
		"\3\2\2\2\20\u009a\3\2\2\2\22\u009c\3\2\2\2\24\u00b1\3\2\2\2\26\u00be\3"+
		"\2\2\2\30\u00c8\3\2\2\2\32\u00d6\3\2\2\2\34\u00d8\3\2\2\2\36\u00f4\3\2"+
		"\2\2 \u00f9\3\2\2\2\"\u00fb\3\2\2\2$\u0107\3\2\2\2&\u0111\3\2\2\2(\u011b"+
		"\3\2\2\2*\u0127\3\2\2\2,\u0132\3\2\2\2.\u0137\3\2\2\2\60\u0139\3\2\2\2"+
		"\62\u0140\3\2\2\2\64\u0142\3\2\2\2\66\u0144\3\2\2\28\u014c\3\2\2\2:\u015a"+
		"\3\2\2\2<\u0164\3\2\2\2>\u016b\3\2\2\2@\u016f\3\2\2\2B\u0174\3\2\2\2D"+
		"\u017c\3\2\2\2F\u017e\3\2\2\2H\u0184\3\2\2\2J\u0188\3\2\2\2L\u018a\3\2"+
		"\2\2N\u018e\3\2\2\2P\u0192\3\2\2\2R\u0194\3\2\2\2T\u01a2\3\2\2\2V\u01b0"+
		"\3\2\2\2X\u01ba\3\2\2\2Z\\\5\4\3\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^`\3\2\2\2_a\5\6\4\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\3"+
		"\3\2\2\2de\7\5\2\2eh\7\b\2\2fg\7\7\2\2gi\7\b\2\2hf\3\2\2\2hi\3\2\2\2i"+
		"j\3\2\2\2jk\7\t\2\2ko\7W\2\2ln\5\n\6\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2o"+
		"p\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\5\b\5\2st\7W\2\2tu\7]\2\2u\5\3\2\2\2v"+
		"w\7\4\2\2wx\7\f\2\2xy\7\13\2\2yz\7\f\2\2z{\5\f\7\2{\7\3\2\2\2|}\7\\\2"+
		"\2}~\5\16\b\2~\t\3\2\2\2\177\u0082\58\35\2\u0080\u0082\5:\36\2\u0081\177"+
		"\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\7W\2\2\u0084"+
		"\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\13\3\2\2\2\u0086\u008a\7\r\2"+
		"\2\u0087\u0089\5\20\t\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\7\20\2\2\u008e\u008f\7\16\2\2\u008f\r\3\2\2\2\u0090\u0091"+
		"\7Z\2\2\u0091\u0092\7\u008b\2\2\u0092\u0093\t\2\2\2\u0093\u0094\7\u0091"+
		"\2\2\u0094\17\3\2\2\2\u0095\u009b\5\30\r\2\u0096\u009b\5\22\n\2\u0097"+
		"\u009b\5\34\17\2\u0098\u009b\5 \21\2\u0099\u009b\5(\25\2\u009a\u0095\3"+
		"\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\21\3\2\2\2\u009c\u009d\7\21\2\2\u009d\u009e\78\2"+
		"\2\u009e\u009f\5*\26\2\u009f\u00a0\7I\2\2\u00a0\u00a4\79\2\2\u00a1\u00a3"+
		"\5\20\t\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ab"+
		"\7\20\2\2\u00a8\u00aa\5\24\13\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2"+
		"\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00b0\5\26\f\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\23\3\2\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3\78\2\2\u00b3\u00b4"+
		"\5*\26\2\u00b4\u00b5\7I\2\2\u00b5\u00b9\79\2\2\u00b6\u00b8\5\20\t\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\20\2\2\u00bd"+
		"\25\3\2\2\2\u00be\u00bf\7\23\2\2\u00bf\u00c3\79\2\2\u00c0\u00c2\5\20\t"+
		"\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\20\2\2"+
		"\u00c7\27\3\2\2\2\u00c8\u00c9\7\25\2\2\u00c9\u00ca\7(\2\2\u00ca\u00cb"+
		"\7*\2\2\u00cb\u00d0\7,\2\2\u00cc\u00ce\5\32\16\2\u00cd\u00cf\7+\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cc\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\7-\2\2\u00d5\31\3\2\2\2\u00d6\u00d7\t\3\2\2"+
		"\u00d7\33\3\2\2\2\u00d8\u00d9\7\24\2\2\u00d9\u00da\7:\2\2\u00da\u00db"+
		"\7P\2\2\u00db\u00dc\7O\2\2\u00dc\u00dd\7N\2\2\u00dd\u00de\7T\2\2\u00de"+
		"\u00df\5\36\20\2\u00df\u00e0\7U\2\2\u00e0\u00e1\5\36\20\2\u00e1\u00e2"+
		"\7S\2\2\u00e2\u00e3\7;\2\2\u00e3\u00e7\7<\2\2\u00e4\u00e6\5\20\t\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\20\2\2\u00eb"+
		"\35\3\2\2\2\u00ec\u00f0\7P\2\2\u00ed\u00ef\5\66\34\2\u00ee\u00ed\3\2\2"+
		"\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f5"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\7Q\2\2\u00f4\u00ec\3\2\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\37\3\2\2\2\u00f6\u00fa\5\"\22\2\u00f7\u00fa\5$\23"+
		"\2\u00f8\u00fa\5&\24\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa!\3\2\2\2\u00fb\u00fc\7\26\2\2\u00fc\u0100\7\"\2\2\u00fd"+
		"\u00ff\5\66\34\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0104\7%\2\2\u0104\u0105\7$\2\2\u0105\u0106\7&\2\2\u0106#\3\2\2\2\u0107"+
		"\u0108\7\27\2\2\u0108\u010c\7\33\2\2\u0109\u010b\5\66\34\2\u010a\u0109"+
		"\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\35\2\2\u0110%\3\2\2\2"+
		"\u0111\u0112\7\30\2\2\u0112\u0116\7\37\2\2\u0113\u0115\5\66\34\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7!\2\2\u011a"+
		"\'\3\2\2\2\u011b\u011c\7\31\2\2\u011c\u011d\7\61\2\2\u011d\u0122\7\63"+
		"\2\2\u011e\u011f\7\62\2\2\u011f\u0121\7\66\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\64\2\2\u0126)\3\2\2\2\u0127\u0128"+
		"\5,\27\2\u0128\u0129\5\64\33\2\u0129\u012d\5.\30\2\u012a\u012b\5\62\32"+
		"\2\u012b\u012c\5*\26\2\u012c\u012e\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e+\3\2\2\2\u012f\u0133\7G\2\2\u0130\u0133\7E\2\2\u0131\u0133"+
		"\5\60\31\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2"+
		"\u0133-\3\2\2\2\u0134\u0138\7G\2\2\u0135\u0138\7E\2\2\u0136\u0138\5\60"+
		"\31\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138"+
		"/\3\2\2\2\u0139\u013d\7F\2\2\u013a\u013c\5\66\34\2\u013b\u013a\3\2\2\2"+
		"\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\61"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\t\4\2\2\u0141\63\3\2\2\2\u0142"+
		"\u0143\t\5\2\2\u0143\65\3\2\2\2\u0144\u0145\t\6\2\2\u0145\u0149\t\7\2"+
		"\2\u0146\u0148\7L\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\67\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014d\7X\2\2\u014d\u0151\7_\2\2\u014e\u0152\5<\37\2\u014f\u0152\5D#\2"+
		"\u0150\u0152\5@!\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\7`\2\2\u0154\u0156\7[\2\2\u0155"+
		"\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\5\16"+
		"\b\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u01599\3\2\2\2\u015a\u015b"+
		"\7Y\2\2\u015b\u015e\7i\2\2\u015c\u015f\5X-\2\u015d\u015f\5B\"\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\7l"+
		"\2\2\u0161\u0163\5\16\b\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		";\3\2\2\2\u0164\u0165\7a\2\2\u0165\u0166\7m\2\2\u0166\u0167\5> \2\u0167"+
		"\u0168\7n\2\2\u0168\u0169\7o\2\2\u0169\u016a\7p\2\2\u016a=\3\2\2\2\u016b"+
		"\u016c\7q\2\2\u016c\u016d\7r\2\2\u016d\u016e\t\b\2\2\u016e?\3\2\2\2\u016f"+
		"\u0170\7e\2\2\u0170\u0171\7z\2\2\u0171\u0172\7y\2\2\u0172\u0173\7{\2\2"+
		"\u0173A\3\2\2\2\u0174\u0175\7k\2\2\u0175\u0176\7\u0089\2\2\u0176\u0177"+
		"\5F$\2\u0177\u0178\7\u008a\2\2\u0178C\3\2\2\2\u0179\u017d\5R*\2\u017a"+
		"\u017d\5T+\2\u017b\u017d\5V,\2\u017c\u0179\3\2\2\2\u017c\u017a\3\2\2\2"+
		"\u017c\u017b\3\2\2\2\u017dE\3\2\2\2\u017e\u017f\7\u0088\2\2\u017f\u0180"+
		"\7\u0080\2\2\u0180\u0181\7\u0081\2\2\u0181G\3\2\2\2\u0182\u0185\5J&\2"+
		"\u0183\u0185\5P)\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185I\3\2"+
		"\2\2\u0186\u0189\5L\'\2\u0187\u0189\5N(\2\u0188\u0186\3\2\2\2\u0188\u0187"+
		"\3\2\2\2\u0189K\3\2\2\2\u018a\u018b\7}\2\2\u018b\u018c\7\u0080\2\2\u018c"+
		"\u018d\7\u0081\2\2\u018dM\3\2\2\2\u018e\u018f\7~\2\2\u018f\u0190\7\u0082"+
		"\2\2\u0190\u0191\7\u0083\2\2\u0191O\3\2\2\2\u0192\u0193\7\177\2\2\u0193"+
		"Q\3\2\2\2\u0194\u0195\7b\2\2\u0195\u0196\7z\2\2\u0196\u0197\7y\2\2\u0197"+
		"\u0198\7|\2\2\u0198\u019d\5H%\2\u0199\u019a\7|\2\2\u019a\u019c\5H%\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7{\2\2\u01a1"+
		"S\3\2\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7z\2\2\u01a4\u01a5\7y\2\2\u01a5"+
		"\u01a6\7|\2\2\u01a6\u01ab\5H%\2\u01a7\u01a8\7|\2\2\u01a8\u01aa\5H%\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7{\2\2\u01af"+
		"U\3\2\2\2\u01b0\u01b1\7d\2\2\u01b1\u01b2\7z\2\2\u01b2\u01b3\7y\2\2\u01b3"+
		"\u01b4\7|\2\2\u01b4\u01b5\5H%\2\u01b5\u01b6\7|\2\2\u01b6\u01b7\5H%\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b9\7{\2\2\u01b9W\3\2\2\2\u01ba\u01bb\7j\2\2\u01bb"+
		"\u01bc\7\u0085\2\2\u01bc\u01bd\7\u0086\2\2\u01bd\u01be\7\u0087\2\2\u01be"+
		"Y\3\2\2\2(]bho\u0081\u0084\u008a\u009a\u00a4\u00ab\u00af\u00b9\u00c3\u00ce"+
		"\u00d2\u00e7\u00f0\u00f4\u00f9\u0100\u010c\u0116\u0122\u012d\u0132\u0137"+
		"\u013d\u0149\u0151\u0155\u0158\u015e\u0162\u017c\u0184\u0188\u019d\u01ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}