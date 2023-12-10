// Generated from D:/Mriwed/src\HTMLPHPLEXER.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLPHPLEXER extends Lexer {
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
		PAGE_MODE=1, CONTROLLER_MODE=2, CONTROLLER_BODY_MODE=3, TO_LOWER_FUNCTION_MODE=4, 
		TO_UPPER_FUNCTION_MODE=5, ADD_FUNCTION_MODE=6, DEFINE_MODE=7, ARRAY_MODE=8, 
		ARRAY_VALUES_MODE=9, GOTO_MODE=10, GOTO_VAR_MODE=11, IF_MODE=12, FOR_MODE=13, 
		EXPRESSION_MODE=14, ARRAY_VAR_MODE=15, FOR_EXPRESSION=16, IO_MODE=17, 
		INPUT_MODE=18, OUTPUT_MODE=19, INPUT_FIELD_MODE=20, INPUT_FIELD_TYPE=21, 
		INPUT_CHOCIES=22, DOUBLE_QUOTATIONS_STRING=23, SINGLE_QUOTATION_STRING=24, 
		OUTPUT_PARAMS=25, IMAGE_MODE=26, LOCATION_MODE=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "PAGE_MODE", "CONTROLLER_MODE", "CONTROLLER_BODY_MODE", 
		"TO_LOWER_FUNCTION_MODE", "TO_UPPER_FUNCTION_MODE", "ADD_FUNCTION_MODE", 
		"DEFINE_MODE", "ARRAY_MODE", "ARRAY_VALUES_MODE", "GOTO_MODE", "GOTO_VAR_MODE", 
		"IF_MODE", "FOR_MODE", "EXPRESSION_MODE", "ARRAY_VAR_MODE", "FOR_EXPRESSION", 
		"IO_MODE", "INPUT_MODE", "OUTPUT_MODE", "INPUT_FIELD_MODE", "INPUT_FIELD_TYPE", 
		"INPUT_CHOCIES", "DOUBLE_QUOTATIONS_STRING", "SINGLE_QUOTATION_STRING", 
		"OUTPUT_PARAMS", "IMAGE_MODE", "LOCATION_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "APP_WS", "CONTROLLER_ATTR", "PAGE_ATTR", "PAGE_WS", "EXTENDES", 
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


	public HTMLPHPLEXER(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLPHPLEXER.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u0091\u044d\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1"+
		"\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4"+
		"\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16"+
		"\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25"+
		"\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34"+
		"\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4"+
		"%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60"+
		"\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67"+
		"\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\t"+
		"B\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4"+
		"N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\t"+
		"Y\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td"+
		"\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p"+
		"\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{"+
		"\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080\4\u0081\t\u0081\4\u0082"+
		"\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085\t\u0085\4\u0086\t\u0086"+
		"\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089\4\u008a\t\u008a\4\u008b"+
		"\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e\t\u008e\4\u008f\t\u008f"+
		"\4\u0090\t\u0090\4\u0091\t\u0091\3\2\6\2\u0140\n\2\r\2\16\2\u0141\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\7\b\u016a\n\b\f\b\16\b\u016d\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\f\u0181\n\f\r"+
		"\f\16\f\u0182\3\f\7\f\u0186\n\f\f\f\16\f\u0189\13\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\7\33\u01e5\n\33\f\33\16\33\u01e8\13\33\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\7\37\u01f6\n\37\f\37\16\37\u01f9"+
		"\13\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\7\"\u0205\n\"\f\"\16\"\u0208\13"+
		"\"\3#\3#\3#\3#\3$\6$\u020f\n$\r$\16$\u0210\3%\3%\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\7*\u022b\n*\f*\16*\u022e"+
		"\13*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\7.\u023f\n.\f.\16.\u0242"+
		"\13.\3.\3.\3/\6/\u0247\n/\r/\16/\u0248\3/\3/\3\60\3\60\6\60\u024f\n\60"+
		"\r\60\16\60\u0250\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\7\63\u025f\n\63\f\63\16\63\u0262\13\63\3\64\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\66\3\66\7\66\u026e\n\66\f\66\16\66\u0271\13\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3;\3"+
		";\3<\3<\3<\3<\3=\6=\u028c\n=\r=\16=\u028d\3=\3=\3>\3>\3>\3?\3?\3?\3@\3"+
		"@\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\6E\u02a7\nE\rE\16E\u02a8\3E\3"+
		"E\3F\3F\7F\u02af\nF\fF\16F\u02b2\13F\3G\6G\u02b5\nG\rG\16G\u02b6\3H\3"+
		"H\3H\3H\3I\3I\3I\3I\3J\6J\u02c2\nJ\rJ\16J\u02c3\3K\3K\7K\u02c8\nK\fK\16"+
		"K\u02cb\13K\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3O\3O\3O\3P\3P\7"+
		"P\u02e0\nP\fP\16P\u02e3\13P\3Q\6Q\u02e6\nQ\rQ\16Q\u02e7\3R\3R\3R\3R\3"+
		"S\3S\3S\3S\3T\3T\3U\3U\3V\6V\u02f7\nV\rV\16V\u02f8\3V\3V\3W\3W\3X\3X\3"+
		"X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\6^\u032b"+
		"\n^\r^\16^\u032c\3^\3^\3_\3_\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3b\3"+
		"b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3e\3f\3f\3g\3g\3g\3g\3h\6h\u036b\n"+
		"h\rh\16h\u036c\3h\3h\3i\3i\3j\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3k\3k\3k\3"+
		"k\3l\3l\3l\3l\3m\3m\3m\3m\3n\3n\3o\3o\7o\u038e\no\fo\16o\u0391\13o\3p"+
		"\3p\3p\3p\3q\3q\3q\3q\3q\3r\3r\3s\3s\3s\3s\3s\3s\3s\3s\3t\3t\3t\3t\3t"+
		"\3t\3t\3t\3t\3t\3t\3u\3u\3u\3u\3u\3u\3v\3v\3v\3v\3v\3v\3v\3v\3v\3w\3w"+
		"\3w\3w\3w\3w\3w\3x\3x\3x\3x\3y\3y\7y\u03cd\ny\fy\16y\u03d0\13y\3z\3z\3"+
		"{\3{\3{\3{\3|\3|\3}\3}\3}\3}\3~\3~\3~\3~\3\177\6\177\u03e3\n\177\r\177"+
		"\16\177\u03e4\3\u0080\6\u0080\u03e8\n\u0080\r\u0080\16\u0080\u03e9\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0082\6\u0082\u03f1\n\u0082\r\u0082\16\u0082"+
		"\u03f2\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084\6\u0084\u03fa\n\u0084\r"+
		"\u0084\16\u0084\u03fb\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\6\u0086"+
		"\u0403\n\u0086\r\u0086\16\u0086\u0404\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\2\2\u0092\36\2 \3\"\4$\5&\6(\7*\b,\t"+
		".\n\60\13\62\f\64\r\66\168\17:\20<\21>\22@\23B\24D\25F\26H\27J\30L\31"+
		"N\32P\33R\34T\35V\36X\37Z \\!^\"`#b$d%f&h\'j(l)n*p+r,t-v.x/z\60|\61~\62"+
		"\u0080\63\u0082\64\u0084\65\u0086\66\u0088\67\u008a8\u008c9\u008e:\u0090"+
		";\u0092<\u0094=\u0096>\u0098?\u009a@\u009cA\u009eB\u00a0C\u00a2D\u00a4"+
		"E\u00a6F\u00a8G\u00aaH\u00acI\u00aeJ\u00b0K\u00b2L\u00b4M\u00b6N\u00b8"+
		"O\u00baP\u00bcQ\u00beR\u00c0S\u00c2T\u00c4U\u00c6V\u00c8W\u00caX\u00cc"+
		"Y\u00ceZ\u00d0[\u00d2\\\u00d4]\u00d6^\u00d8_\u00da`\u00dca\u00deb\u00e0"+
		"c\u00e2d\u00e4e\u00e6f\u00e8g\u00eah\u00eci\u00eej\u00f0k\u00f2l\u00f4"+
		"m\u00f6n\u00f8o\u00fap\u00fcq\u00fer\u0100s\u0102t\u0104u\u0106v\u0108"+
		"w\u010ax\u010cy\u010ez\u0110{\u0112|\u0114}\u0116~\u0118\177\u011a\u0080"+
		"\u011c\u0081\u011e\u0082\u0120\u0083\u0122\u0084\u0124\u0085\u0126\u0086"+
		"\u0128\u0087\u012a\u0088\u012c\u0089\u012e\u008a\u0130\u008b\u0132\u008c"+
		"\u0134\u008d\u0136\u008e\u0138\u008f\u013a\u0090\u013c\u0091\36\2\3\4"+
		"\5\6\7\b\t\n\13\f\r\16\17\20\21\22\23\24\25\26\27\30\31\32\33\34\35\f"+
		"\5\2\13\f\17\17\"\"\4\2C\\c|\5\2\62;C\\c|\6\2\62;C\\aac|\3\2\62;\13\2"+
		"\13\f\17\17\"\"$$*+..==}}\177\177\5\2\13\13\17\17\"\"\3\2\f\f\13\2\13"+
		"\f\17\17\"\"$$)+..==}}\177\177\13\2\13\f\17\17\"\"*+..\60\60<=}}\177\177"+
		"\2\u0450\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3"+
		"\2\2\2\3,\3\2\2\2\4.\3\2\2\2\4\60\3\2\2\2\4\62\3\2\2\2\4\64\3\2\2\2\4"+
		"\66\3\2\2\2\58\3\2\2\2\5:\3\2\2\2\5<\3\2\2\2\5>\3\2\2\2\5@\3\2\2\2\5B"+
		"\3\2\2\2\5D\3\2\2\2\5F\3\2\2\2\5H\3\2\2\2\5J\3\2\2\2\5L\3\2\2\2\6N\3\2"+
		"\2\2\6P\3\2\2\2\6R\3\2\2\2\6T\3\2\2\2\7V\3\2\2\2\7X\3\2\2\2\7Z\3\2\2\2"+
		"\7\\\3\2\2\2\b^\3\2\2\2\b`\3\2\2\2\bb\3\2\2\2\bd\3\2\2\2\bf\3\2\2\2\t"+
		"h\3\2\2\2\tj\3\2\2\2\nl\3\2\2\2\nn\3\2\2\2\np\3\2\2\2\nr\3\2\2\2\nt\3"+
		"\2\2\2\13v\3\2\2\2\13x\3\2\2\2\13z\3\2\2\2\f|\3\2\2\2\f~\3\2\2\2\f\u0080"+
		"\3\2\2\2\f\u0082\3\2\2\2\f\u0084\3\2\2\2\r\u0086\3\2\2\2\16\u0088\3\2"+
		"\2\2\16\u008a\3\2\2\2\16\u008c\3\2\2\2\17\u008e\3\2\2\2\17\u0090\3\2\2"+
		"\2\17\u0092\3\2\2\2\20\u0094\3\2\2\2\20\u0096\3\2\2\2\20\u0098\3\2\2\2"+
		"\20\u009a\3\2\2\2\20\u009c\3\2\2\2\20\u009e\3\2\2\2\20\u00a0\3\2\2\2\20"+
		"\u00a2\3\2\2\2\20\u00a4\3\2\2\2\20\u00a6\3\2\2\2\20\u00a8\3\2\2\2\20\u00aa"+
		"\3\2\2\2\20\u00ac\3\2\2\2\21\u00ae\3\2\2\2\21\u00b0\3\2\2\2\21\u00b2\3"+
		"\2\2\2\22\u00b4\3\2\2\2\22\u00b6\3\2\2\2\22\u00b8\3\2\2\2\22\u00ba\3\2"+
		"\2\2\22\u00bc\3\2\2\2\22\u00be\3\2\2\2\22\u00c0\3\2\2\2\22\u00c2\3\2\2"+
		"\2\22\u00c4\3\2\2\2\23\u00c6\3\2\2\2\23\u00c8\3\2\2\2\23\u00ca\3\2\2\2"+
		"\23\u00cc\3\2\2\2\23\u00ce\3\2\2\2\23\u00d0\3\2\2\2\23\u00d2\3\2\2\2\23"+
		"\u00d4\3\2\2\2\24\u00d6\3\2\2\2\24\u00d8\3\2\2\2\24\u00da\3\2\2\2\24\u00dc"+
		"\3\2\2\2\24\u00de\3\2\2\2\24\u00e0\3\2\2\2\24\u00e2\3\2\2\2\24\u00e4\3"+
		"\2\2\2\24\u00e6\3\2\2\2\24\u00e8\3\2\2\2\25\u00ea\3\2\2\2\25\u00ec\3\2"+
		"\2\2\25\u00ee\3\2\2\2\25\u00f0\3\2\2\2\25\u00f2\3\2\2\2\26\u00f4\3\2\2"+
		"\2\26\u00f6\3\2\2\2\26\u00f8\3\2\2\2\26\u00fa\3\2\2\2\27\u00fc\3\2\2\2"+
		"\27\u00fe\3\2\2\2\27\u0100\3\2\2\2\27\u0102\3\2\2\2\27\u0104\3\2\2\2\27"+
		"\u0106\3\2\2\2\27\u0108\3\2\2\2\30\u010a\3\2\2\2\30\u010c\3\2\2\2\30\u010e"+
		"\3\2\2\2\30\u0110\3\2\2\2\30\u0112\3\2\2\2\30\u0114\3\2\2\2\30\u0116\3"+
		"\2\2\2\30\u0118\3\2\2\2\31\u011a\3\2\2\2\31\u011c\3\2\2\2\32\u011e\3\2"+
		"\2\2\32\u0120\3\2\2\2\33\u0122\3\2\2\2\33\u0124\3\2\2\2\33\u0126\3\2\2"+
		"\2\33\u0128\3\2\2\2\34\u012a\3\2\2\2\34\u012c\3\2\2\2\34\u012e\3\2\2\2"+
		"\35\u0130\3\2\2\2\35\u0132\3\2\2\2\35\u0134\3\2\2\2\35\u0136\3\2\2\2\35"+
		"\u0138\3\2\2\2\35\u013a\3\2\2\2\35\u013c\3\2\2\2\36\u013f\3\2\2\2 \u0143"+
		"\3\2\2\2\"\u0147\3\2\2\2$\u0154\3\2\2\2&\u015b\3\2\2\2(\u015f\3\2\2\2"+
		"*\u0167\3\2\2\2,\u016e\3\2\2\2.\u0172\3\2\2\2\60\u0176\3\2\2\2\62\u0180"+
		"\3\2\2\2\64\u018a\3\2\2\2\66\u018e\3\2\2\28\u0192\3\2\2\2:\u0196\3\2\2"+
		"\2<\u019a\3\2\2\2>\u019f\3\2\2\2@\u01a9\3\2\2\2B\u01b0\3\2\2\2D\u01b6"+
		"\3\2\2\2F\u01bc\3\2\2\2H\u01c3\3\2\2\2J\u01ce\3\2\2\2L\u01d9\3\2\2\2N"+
		"\u01e0\3\2\2\2P\u01e2\3\2\2\2R\u01e9\3\2\2\2T\u01ed\3\2\2\2V\u01f1\3\2"+
		"\2\2X\u01f3\3\2\2\2Z\u01fa\3\2\2\2\\\u01fe\3\2\2\2^\u0202\3\2\2\2`\u0209"+
		"\3\2\2\2b\u020e\3\2\2\2d\u0212\3\2\2\2f\u0214\3\2\2\2h\u0218\3\2\2\2j"+
		"\u021c\3\2\2\2l\u0224\3\2\2\2n\u0228\3\2\2\2p\u022f\3\2\2\2r\u0233\3\2"+
		"\2\2t\u0237\3\2\2\2v\u023c\3\2\2\2x\u0246\3\2\2\2z\u024c\3\2\2\2|\u0256"+
		"\3\2\2\2~\u0258\3\2\2\2\u0080\u025c\3\2\2\2\u0082\u0263\3\2\2\2\u0084"+
		"\u0267\3\2\2\2\u0086\u026b\3\2\2\2\u0088\u0274\3\2\2\2\u008a\u0278\3\2"+
		"\2\2\u008c\u027c\3\2\2\2\u008e\u0280\3\2\2\2\u0090\u0284\3\2\2\2\u0092"+
		"\u0286\3\2\2\2\u0094\u028b\3\2\2\2\u0096\u0291\3\2\2\2\u0098\u0294\3\2"+
		"\2\2\u009a\u0297\3\2\2\2\u009c\u0299\3\2\2\2\u009e\u029b\3\2\2\2\u00a0"+
		"\u029e\3\2\2\2\u00a2\u02a1\3\2\2\2\u00a4\u02a4\3\2\2\2\u00a6\u02ac\3\2"+
		"\2\2\u00a8\u02b4\3\2\2\2\u00aa\u02b8\3\2\2\2\u00ac\u02bc\3\2\2\2\u00ae"+
		"\u02c1\3\2\2\2\u00b0\u02c5\3\2\2\2\u00b2\u02cc\3\2\2\2\u00b4\u02d0\3\2"+
		"\2\2\u00b6\u02d4\3\2\2\2\u00b8\u02da\3\2\2\2\u00ba\u02dd\3\2\2\2\u00bc"+
		"\u02e5\3\2\2\2\u00be\u02e9\3\2\2\2\u00c0\u02ed\3\2\2\2\u00c2\u02f1\3\2"+
		"\2\2\u00c4\u02f3\3\2\2\2\u00c6\u02f6\3\2\2\2\u00c8\u02fc\3\2\2\2\u00ca"+
		"\u02fe\3\2\2\2\u00cc\u0303\3\2\2\2\u00ce\u0309\3\2\2\2\u00d0\u0314\3\2"+
		"\2\2\u00d2\u031d\3\2\2\2\u00d4\u0324\3\2\2\2\u00d6\u032a\3\2\2\2\u00d8"+
		"\u0330\3\2\2\2\u00da\u0332\3\2\2\2\u00dc\u0336\3\2\2\2\u00de\u033e\3\2"+
		"\2\2\u00e0\u0349\3\2\2\2\u00e2\u0354\3\2\2\2\u00e4\u035c\3\2\2\2\u00e6"+
		"\u0363\3\2\2\2\u00e8\u0365\3\2\2\2\u00ea\u036a\3\2\2\2\u00ec\u0370\3\2"+
		"\2\2\u00ee\u0372\3\2\2\2\u00f0\u0379\3\2\2\2\u00f2\u0381\3\2\2\2\u00f4"+
		"\u0385\3\2\2\2\u00f6\u0389\3\2\2\2\u00f8\u038b\3\2\2\2\u00fa\u0392\3\2"+
		"\2\2\u00fc\u0396\3\2\2\2\u00fe\u039b\3\2\2\2\u0100\u039d\3\2\2\2\u0102"+
		"\u03a5\3\2\2\2\u0104\u03b0\3\2\2\2\u0106\u03b6\3\2\2\2\u0108\u03bf\3\2"+
		"\2\2\u010a\u03c6\3\2\2\2\u010c\u03ca\3\2\2\2\u010e\u03d1\3\2\2\2\u0110"+
		"\u03d3\3\2\2\2\u0112\u03d7\3\2\2\2\u0114\u03d9\3\2\2\2\u0116\u03dd\3\2"+
		"\2\2\u0118\u03e2\3\2\2\2\u011a\u03e7\3\2\2\2\u011c\u03eb\3\2\2\2\u011e"+
		"\u03f0\3\2\2\2\u0120\u03f4\3\2\2\2\u0122\u03f9\3\2\2\2\u0124\u03ff\3\2"+
		"\2\2\u0126\u0402\3\2\2\2\u0128\u0406\3\2\2\2\u012a\u040a\3\2\2\2\u012c"+
		"\u040e\3\2\2\2\u012e\u0410\3\2\2\2\u0130\u0414\3\2\2\2\u0132\u0416\3\2"+
		"\2\2\u0134\u041d\3\2\2\2\u0136\u0428\3\2\2\2\u0138\u0434\3\2\2\2\u013a"+
		"\u043e\3\2\2\2\u013c\u0449\3\2\2\2\u013e\u0140\t\2\2\2\u013f\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\37\3\2\2\2\u0143\u0144\5\36\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b\3\2"+
		"\2\u0146!\3\2\2\2\u0147\u0148\7e\2\2\u0148\u0149\7q\2\2\u0149\u014a\7"+
		"p\2\2\u014a\u014b\7v\2\2\u014b\u014c\7t\2\2\u014c\u014d\7q\2\2\u014d\u014e"+
		"\7n\2\2\u014e\u014f\7n\2\2\u014f\u0150\7g\2\2\u0150\u0151\7t\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\b\4\3\2\u0153#\3\2\2\2\u0154\u0155\7r\2\2\u0155"+
		"\u0156\7c\2\2\u0156\u0157\7i\2\2\u0157\u0158\7g\2\2\u0158\u0159\3\2\2"+
		"\2\u0159\u015a\b\5\4\2\u015a%\3\2\2\2\u015b\u015c\5\36\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015e\b\6\2\2\u015e\'\3\2\2\2\u015f\u0160\7g\2\2\u0160"+
		"\u0161\7z\2\2\u0161\u0162\7v\2\2\u0162\u0163\7g\2\2\u0163\u0164\7p\2\2"+
		"\u0164\u0165\7f\2\2\u0165\u0166\7u\2\2\u0166)\3\2\2\2\u0167\u016b\t\3"+
		"\2\2\u0168\u016a\t\4\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c+\3\2\2\2\u016d\u016b\3\2\2\2"+
		"\u016e\u016f\7}\2\2\u016f\u0170\3\2\2\2\u0170\u0171\b\t\5\2\u0171-\3\2"+
		"\2\2\u0172\u0173\5\36\2\2\u0173\u0174\3\2\2\2\u0174\u0175\b\n\2\2\u0175"+
		"/\3\2\2\2\u0176\u0177\7e\2\2\u0177\u0178\7q\2\2\u0178\u0179\7p\2\2\u0179"+
		"\u017a\7v\2\2\u017a\u017b\7t\2\2\u017b\u017c\7q\2\2\u017c\u017d\7n\2\2"+
		"\u017d\u017e\7u\2\2\u017e\61\3\2\2\2\u017f\u0181\t\3\2\2\u0180\u017f\3"+
		"\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0187\3\2\2\2\u0184\u0186\t\4\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\63\3\2\2\2\u0189\u0187"+
		"\3\2\2\2\u018a\u018b\7}\2\2\u018b\u018c\3\2\2\2\u018c\u018d\b\r\6\2\u018d"+
		"\65\3\2\2\2\u018e\u018f\7=\2\2\u018f\u0190\3\2\2\2\u0190\u0191\b\16\7"+
		"\2\u0191\67\3\2\2\2\u0192\u0193\5\36\2\2\u0193\u0194\3\2\2\2\u0194\u0195"+
		"\b\17\2\2\u01959\3\2\2\2\u0196\u0197\7\177\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\b\20\7\2\u0199;\3\2\2\2\u019a\u019b\7k\2\2\u019b\u019c\7h\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019e\b\21\b\2\u019e=\3\2\2\2\u019f\u01a0\7g\2\2"+
		"\u01a0\u01a1\7n\2\2\u01a1\u01a2\7u\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4"+
		"\7\"\2\2\u01a4\u01a5\7k\2\2\u01a5\u01a6\7h\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\b\22\b\2\u01a8?\3\2\2\2\u01a9\u01aa\7g\2\2\u01aa\u01ab\7n\2\2\u01ab"+
		"\u01ac\7u\2\2\u01ac\u01ad\7g\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\b\23"+
		"\b\2\u01afA\3\2\2\2\u01b0\u01b1\7h\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3"+
		"\7t\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\b\24\t\2\u01b5C\3\2\2\2\u01b6"+
		"\u01b7\7f\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7h\2\2\u01b9\u01ba\3\2\2"+
		"\2\u01ba\u01bb\b\25\n\2\u01bbE\3\2\2\2\u01bc\u01bd\7c\2\2\u01bd\u01be"+
		"\7f\2\2\u01be\u01bf\7f\2\2\u01bf\u01c0\7*\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c2\b\26\13\2\u01c2G\3\2\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7q\2\2"+
		"\u01c5\u01c6\7N\2\2\u01c6\u01c7\7q\2\2\u01c7\u01c8\7y\2\2\u01c8\u01c9"+
		"\7g\2\2\u01c9\u01ca\7t\2\2\u01ca\u01cb\7*\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cd\b\27\f\2\u01cdI\3\2\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7q\2\2\u01d0"+
		"\u01d1\7W\2\2\u01d1\u01d2\7r\2\2\u01d2\u01d3\7r\2\2\u01d3\u01d4\7g\2\2"+
		"\u01d4\u01d5\7t\2\2\u01d5\u01d6\7*\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8"+
		"\b\30\r\2\u01d8K\3\2\2\2\u01d9\u01da\7i\2\2\u01da\u01db\7q\2\2\u01db\u01dc"+
		"\7v\2\2\u01dc\u01dd\7q\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\b\31\16\2\u01df"+
		"M\3\2\2\2\u01e0\u01e1\7*\2\2\u01e1O\3\2\2\2\u01e2\u01e6\t\3\2\2\u01e3"+
		"\u01e5\t\5\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7Q\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea"+
		"\7]\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\b\34\17\2\u01ecS\3\2\2\2\u01ed"+
		"\u01ee\7+\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\b\35\7\2\u01f0U\3\2\2\2"+
		"\u01f1\u01f2\7*\2\2\u01f2W\3\2\2\2\u01f3\u01f7\t\3\2\2\u01f4\u01f6\t\5"+
		"\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8Y\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\7]\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\b \17\2\u01fd[\3\2\2\2\u01fe\u01ff\7+\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0201\b!\7\2\u0201]\3\2\2\2\u0202\u0206\t\3\2\2\u0203"+
		"\u0205\t\5\2\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0206\u0207\3\2\2\2\u0207_\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a"+
		"\7]\2\2\u020a\u020b\3\2\2\2\u020b\u020c\b#\17\2\u020ca\3\2\2\2\u020d\u020f"+
		"\t\6\2\2\u020e\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211c\3\2\2\2\u0212\u0213\7.\2\2\u0213e\3\2\2\2\u0214"+
		"\u0215\7+\2\2\u0215\u0216\3\2\2\2\u0216\u0217\b&\7\2\u0217g\3\2\2\2\u0218"+
		"\u0219\5\36\2\2\u0219\u021a\3\2\2\2\u021a\u021b\b\'\2\2\u021bi\3\2\2\2"+
		"\u021c\u021d\7c\2\2\u021d\u021e\7t\2\2\u021e\u021f\7t\2\2\u021f\u0220"+
		"\7c\2\2\u0220\u0221\7{\2\2\u0221\u0222\3\2\2\2\u0222\u0223\b(\20\2\u0223"+
		"k\3\2\2\2\u0224\u0225\5\36\2\2\u0225\u0226\3\2\2\2\u0226\u0227\b)\2\2"+
		"\u0227m\3\2\2\2\u0228\u022c\t\3\2\2\u0229\u022b\t\5\2\2\u022a\u0229\3"+
		"\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"o\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0230\7.\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0232\b+\21\2\u0232q\3\2\2\2\u0233\u0234\7*\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0236\b,\21\2\u0236s\3\2\2\2\u0237\u0238\7+\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u023a\b-\7\2\u023a\u023b\b-\7\2\u023bu\3\2\2\2\u023c\u0240\t\3\2\2\u023d"+
		"\u023f\t\5\2\2\u023e\u023d\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243"+
		"\u0244\b.\7\2\u0244w\3\2\2\2\u0245\u0247\t\6\2\2\u0246\u0245\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024b\b/\7\2\u024by\3\2\2\2\u024c\u024e\7$\2\2\u024d\u024f"+
		"\n\7\2\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u024e\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\7$\2\2\u0253\u0254\3\2"+
		"\2\2\u0254\u0255\b\60\7\2\u0255{\3\2\2\2\u0256\u0257\7*\2\2\u0257}\3\2"+
		"\2\2\u0258\u0259\7.\2\2\u0259\u025a\3\2\2\2\u025a\u025b\b\62\22\2\u025b"+
		"\177\3\2\2\2\u025c\u0260\t\3\2\2\u025d\u025f\t\4\2\2\u025e\u025d\3\2\2"+
		"\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0081"+
		"\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\7+\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0266\b\64\7\2\u0266\u0083\3\2\2\2\u0267\u0268\5\36\2\2\u0268\u0269\3"+
		"\2\2\2\u0269\u026a\b\65\2\2\u026a\u0085\3\2\2\2\u026b\u026f\t\3\2\2\u026c"+
		"\u026e\t\5\2\2\u026d\u026c\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2"+
		"\2\2\u026f\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u026f\3\2\2\2\u0272"+
		"\u0273\b\66\7\2\u0273\u0087\3\2\2\2\u0274\u0275\5\36\2\2\u0275\u0276\3"+
		"\2\2\2\u0276\u0277\b\67\2\2\u0277\u0089\3\2\2\2\u0278\u0279\7*\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u027b\b8\23\2\u027b\u008b\3\2\2\2\u027c\u027d\7}"+
		"\2\2\u027d\u027e\3\2\2\2\u027e\u027f\b9\24\2\u027f\u008d\3\2\2\2\u0280"+
		"\u0281\7*\2\2\u0281\u0282\3\2\2\2\u0282\u0283\b:\25\2\u0283\u008f\3\2"+
		"\2\2\u0284\u0285\7+\2\2\u0285\u0091\3\2\2\2\u0286\u0287\7}\2\2\u0287\u0288"+
		"\3\2\2\2\u0288\u0289\b<\24\2\u0289\u0093\3\2\2\2\u028a\u028c\t\2\2\2\u028b"+
		"\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028e\u028f\3\2\2\2\u028f\u0290\b=\2\2\u0290\u0095\3\2\2\2\u0291"+
		"\u0292\7(\2\2\u0292\u0293\7(\2\2\u0293\u0097\3\2\2\2\u0294\u0295\7~\2"+
		"\2\u0295\u0296\7~\2\2\u0296\u0099\3\2\2\2\u0297\u0298\7@\2\2\u0298\u009b"+
		"\3\2\2\2\u0299\u029a\7>\2\2\u029a\u009d\3\2\2\2\u029b\u029c\7@\2\2\u029c"+
		"\u029d\7?\2\2\u029d\u009f\3\2\2\2\u029e\u029f\7>\2\2\u029f\u02a0\7?\2"+
		"\2\u02a0\u00a1\3\2\2\2\u02a1\u02a2\7?\2\2\u02a2\u02a3\7?\2\2\u02a3\u00a3"+
		"\3\2\2\2\u02a4\u02a6\7$\2\2\u02a5\u02a7\n\7\2\2\u02a6\u02a5\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa\u02ab\7$\2\2\u02ab\u00a5\3\2\2\2\u02ac\u02b0\t\3\2\2\u02ad"+
		"\u02af\t\5\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2"+
		"\2\2\u02b0\u02b1\3\2\2\2\u02b1\u00a7\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3"+
		"\u02b5\t\6\2\2\u02b4\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b4\3\2"+
		"\2\2\u02b6\u02b7\3\2\2\2\u02b7\u00a9\3\2\2\2\u02b8\u02b9\7]\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bb\bH\17\2\u02bb\u00ab\3\2\2\2\u02bc\u02bd\7+"+
		"\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\bI\7\2\u02bf\u00ad\3\2\2\2\u02c0"+
		"\u02c2\t\6\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c1\3\2"+
		"\2\2\u02c3\u02c4\3\2\2\2\u02c4\u00af\3\2\2\2\u02c5\u02c9\t\3\2\2\u02c6"+
		"\u02c8\t\5\2\2\u02c7\u02c6\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2"+
		"\2\2\u02c9\u02ca\3\2\2\2\u02ca\u00b1\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc"+
		"\u02cd\7_\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\bL\7\2\u02cf\u00b3\3\2\2"+
		"\2\u02d0\u02d1\5\36\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\bM\2\2\u02d3\u00b5"+
		"\3\2\2\2\u02d4\u02d5\7t\2\2\u02d5\u02d6\7c\2\2\u02d6\u02d7\7p\2\2\u02d7"+
		"\u02d8\7i\2\2\u02d8\u02d9\7g\2\2\u02d9\u00b7\3\2\2\2\u02da\u02db\7k\2"+
		"\2\u02db\u02dc\7p\2\2\u02dc\u00b9\3\2\2\2\u02dd\u02e1\t\3\2\2\u02de\u02e0"+
		"\t\5\2\2\u02df\u02de\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e2\u00bb\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02e6\t\6"+
		"\2\2\u02e5\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u00bd\3\2\2\2\u02e9\u02ea\7]\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02ec\bR\17\2\u02ec\u00bf\3\2\2\2\u02ed\u02ee\7+\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\bS\7\2\u02f0\u00c1\3\2\2\2\u02f1\u02f2\7*\2"+
		"\2\u02f2\u00c3\3\2\2\2\u02f3\u02f4\7.\2\2\u02f4\u00c5\3\2\2\2\u02f5\u02f7"+
		"\t\b\2\2\u02f6\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\bV\2\2\u02fb\u00c7\3\2"+
		"\2\2\u02fc\u02fd\t\t\2\2\u02fd\u00c9\3\2\2\2\u02fe\u02ff\7k\2\2\u02ff"+
		"\u0300\7p\2\2\u0300\u0301\3\2\2\2\u0301\u0302\bX\26\2\u0302\u00cb\3\2"+
		"\2\2\u0303\u0304\7q\2\2\u0304\u0305\7w\2\2\u0305\u0306\7v\2\2\u0306\u0307"+
		"\3\2\2\2\u0307\u0308\bY\27\2\u0308\u00cd\3\2\2\2\u0309\u030a\7n\2\2\u030a"+
		"\u030b\7q\2\2\u030b\u030c\7e\2\2\u030c\u030d\7c\2\2\u030d\u030e\7v\2\2"+
		"\u030e\u030f\7k\2\2\u030f\u0310\7q\2\2\u0310\u0311\7p\2\2\u0311\u0312"+
		"\3\2\2\2\u0312\u0313\bZ\30\2\u0313\u00cf\3\2\2\2\u0314\u0315\7t\2\2\u0315"+
		"\u0316\7g\2\2\u0316\u0317\7s\2\2\u0317\u0318\7w\2\2\u0318\u0319\7k\2\2"+
		"\u0319\u031a\7t\2\2\u031a\u031b\7g\2\2\u031b\u031c\7f\2\2\u031c\u00d1"+
		"\3\2\2\2\u031d\u031e\7u\2\2\u031e\u031f\7w\2\2\u031f\u0320\7d\2\2\u0320"+
		"\u0321\7o\2\2\u0321\u0322\7k\2\2\u0322\u0323\7v\2\2\u0323\u00d3\3\2\2"+
		"\2\u0324\u0325\7\177\2\2\u0325\u0326\3\2\2\2\u0326\u0327\b]\7\2\u0327"+
		"\u0328\b]\7\2\u0328\u00d5\3\2\2\2\u0329\u032b\t\2\2\2\u032a\u0329\3\2"+
		"\2\2\u032b\u032c\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u032e\3\2\2\2\u032e\u032f\b^\2\2\u032f\u00d7\3\2\2\2\u0330\u0331\7<\2"+
		"\2\u0331\u00d9\3\2\2\2\u0332\u0333\7=\2\2\u0333\u0334\3\2\2\2\u0334\u0335"+
		"\b`\7\2\u0335\u00db\3\2\2\2\u0336\u0337\7h\2\2\u0337\u0338\7k\2\2\u0338"+
		"\u0339\7g\2\2\u0339\u033a\7n\2\2\u033a\u033b\7f\2\2\u033b\u033c\3\2\2"+
		"\2\u033c\u033d\ba\31\2\u033d\u00dd\3\2\2\2\u033e\u033f\7e\2\2\u033f\u0340"+
		"\7j\2\2\u0340\u0341\7g\2\2\u0341\u0342\7e\2\2\u0342\u0343\7m\2\2\u0343"+
		"\u0344\7d\2\2\u0344\u0345\7q\2\2\u0345\u0346\7z\2\2\u0346\u0347\3\2\2"+
		"\2\u0347\u0348\bb\32\2\u0348\u00df\3\2\2\2\u0349\u034a\7f\2\2\u034a\u034b"+
		"\7t\2\2\u034b\u034c\7q\2\2\u034c\u034d\7r\2\2\u034d\u034e\7f\2\2\u034e"+
		"\u034f\7q\2\2\u034f\u0350\7y\2\2\u0350\u0351\7p\2\2\u0351\u0352\3\2\2"+
		"\2\u0352\u0353\bc\32\2\u0353\u00e1\3\2\2\2\u0354\u0355\7t\2\2\u0355\u0356"+
		"\7c\2\2\u0356\u0357\7f\2\2\u0357\u0358\7k\2\2\u0358\u0359\7q\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035b\bd\32\2\u035b\u00e3\3\2\2\2\u035c\u035d\7h"+
		"\2\2\u035d\u035e\7k\2\2\u035e\u035f\7n\2\2\u035f\u0360\7g\2\2\u0360\u0361"+
		"\3\2\2\2\u0361\u0362\be\32\2\u0362\u00e5\3\2\2\2\u0363\u0364\7*\2\2\u0364"+
		"\u00e7\3\2\2\2\u0365\u0366\7+\2\2\u0366\u0367\3\2\2\2\u0367\u0368\bg\7"+
		"\2\u0368\u00e9\3\2\2\2\u0369\u036b\t\2\2\2\u036a\u0369\3\2\2\2\u036b\u036c"+
		"\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u036f\bh\2\2\u036f\u00eb\3\2\2\2\u0370\u0371\7<\2\2\u0371\u00ed\3\2\2"+
		"\2\u0372\u0373\7v\2\2\u0373\u0374\7g\2\2\u0374\u0375\7z\2\2\u0375\u0376"+
		"\7v\2\2\u0376\u0377\3\2\2\2\u0377\u0378\bj\33\2\u0378\u00ef\3\2\2\2\u0379"+
		"\u037a\7k\2\2\u037a\u037b\7o\2\2\u037b\u037c\7c\2\2\u037c\u037d\7i\2\2"+
		"\u037d\u037e\7g\2\2\u037e\u037f\3\2\2\2\u037f\u0380\bk\34\2\u0380\u00f1"+
		"\3\2\2\2\u0381\u0382\7=\2\2\u0382\u0383\3\2\2\2\u0383\u0384\bl\7\2\u0384"+
		"\u00f3\3\2\2\2\u0385\u0386\7*\2\2\u0386\u0387\3\2\2\2\u0387\u0388\bm\35"+
		"\2\u0388\u00f5\3\2\2\2\u0389\u038a\7.\2\2\u038a\u00f7\3\2\2\2\u038b\u038f"+
		"\t\3\2\2\u038c\u038e\t\5\2\2\u038d\u038c\3\2\2\2\u038e\u0391\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u00f9\3\2\2\2\u0391\u038f\3\2"+
		"\2\2\u0392\u0393\7+\2\2\u0393\u0394\3\2\2\2\u0394\u0395\bp\7\2\u0395\u00fb"+
		"\3\2\2\2\u0396\u0397\7v\2\2\u0397\u0398\7{\2\2\u0398\u0399\7r\2\2\u0399"+
		"\u039a\7g\2\2\u039a\u00fd\3\2\2\2\u039b\u039c\7?\2\2\u039c\u00ff\3\2\2"+
		"\2\u039d\u039e\7g\2\2\u039e\u039f\7o\2\2\u039f\u03a0\7c\2\2\u03a0\u03a1"+
		"\7k\2\2\u03a1\u03a2\7n\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\bs\7\2\u03a4"+
		"\u0101\3\2\2\2\u03a5\u03a6\7r\2\2\u03a6\u03a7\7c\2\2\u03a7\u03a8\7u\2"+
		"\2\u03a8\u03a9\7u\2\2\u03a9\u03aa\7y\2\2\u03aa\u03ab\7q\2\2\u03ab\u03ac"+
		"\7t\2\2\u03ac\u03ad\7f\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\bt\7\2\u03af"+
		"\u0103\3\2\2\2\u03b0\u03b1\7w\2\2\u03b1\u03b2\7t\2\2\u03b2\u03b3\7n\2"+
		"\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\bu\7\2\u03b5\u0105\3\2\2\2\u03b6\u03b7"+
		"\7p\2\2\u03b7\u03b8\7w\2\2\u03b8\u03b9\7o\2\2\u03b9\u03ba\7d\2\2\u03ba"+
		"\u03bb\7g\2\2\u03bb\u03bc\7t\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\bv\7"+
		"\2\u03be\u0107\3\2\2\2\u03bf\u03c0\7v\2\2\u03c0\u03c1\7g\2\2\u03c1\u03c2"+
		"\7z\2\2\u03c2\u03c3\7v\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\bw\7\2\u03c5"+
		"\u0109\3\2\2\2\u03c6\u03c7\5\36\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\b"+
		"x\2\2\u03c9\u010b\3\2\2\2\u03ca\u03ce\t\3\2\2\u03cb\u03cd\t\5\2\2\u03cc"+
		"\u03cb\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2"+
		"\2\2\u03cf\u010d\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d2\7*\2\2\u03d2"+
		"\u010f\3\2\2\2\u03d3\u03d4\7+\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\b{\7"+
		"\2\u03d6\u0111\3\2\2\2\u03d7\u03d8\7.\2\2\u03d8\u0113\3\2\2\2\u03d9\u03da"+
		"\7$\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\b}\36\2\u03dc\u0115\3\2\2\2\u03dd"+
		"\u03de\7)\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\b~\37\2\u03e0\u0117\3\2"+
		"\2\2\u03e1\u03e3\t\6\2\2\u03e2\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u0119\3\2\2\2\u03e6\u03e8\n\7"+
		"\2\2\u03e7\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u011b\3\2\2\2\u03eb\u03ec\7$\2\2\u03ec\u03ed\3\2"+
		"\2\2\u03ed\u03ee\b\u0081\7\2\u03ee\u011d\3\2\2\2\u03ef\u03f1\n\n\2\2\u03f0"+
		"\u03ef\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2"+
		"\2\2\u03f3\u011f\3\2\2\2\u03f4\u03f5\7)\2\2\u03f5\u03f6\3\2\2\2\u03f6"+
		"\u03f7\b\u0083\7\2\u03f7\u0121\3\2\2\2\u03f8\u03fa\t\2\2\2\u03f9\u03f8"+
		"\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fd\3\2\2\2\u03fd\u03fe\b\u0084\2\2\u03fe\u0123\3\2\2\2\u03ff\u0400"+
		"\7*\2\2\u0400\u0125\3\2\2\2\u0401\u0403\n\13\2\2\u0402\u0401\3\2\2\2\u0403"+
		"\u0404\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0127\3\2"+
		"\2\2\u0406\u0407\7+\2\2\u0407\u0408\3\2\2\2\u0408\u0409\b\u0087\7\2\u0409"+
		"\u0129\3\2\2\2\u040a\u040b\7$\2\2\u040b\u040c\3\2\2\2\u040c\u040d\b\u0088"+
		"\36\2\u040d\u012b\3\2\2\2\u040e\u040f\5\u0124\u0085\2\u040f\u012d\3\2"+
		"\2\2\u0410\u0411\5\u0128\u0087\2\u0411\u0412\3\2\2\2\u0412\u0413\b\u008a"+
		"\7\2\u0413\u012f\3\2\2\2\u0414\u0415\7*\2\2\u0415\u0131\3\2\2\2\u0416"+
		"\u0417\7e\2\2\u0417\u0418\7g\2\2\u0418\u0419\7p\2\2\u0419\u041a\7v\2\2"+
		"\u041a\u041b\7g\2\2\u041b\u041c\7t\2\2\u041c\u0133\3\2\2\2\u041d\u041e"+
		"\7n\2\2\u041e\u041f\7g\2\2\u041f\u0420\7h\2\2\u0420\u0421\7v\2\2\u0421"+
		"\u0422\7a\2\2\u0422\u0423\7w\2\2\u0423\u0424\7r\2\2\u0424\u0425\7r\2\2"+
		"\u0425\u0426\7g\2\2\u0426\u0427\7t\2\2\u0427\u0135\3\2\2\2\u0428\u0429"+
		"\7t\2\2\u0429\u042a\7k\2\2\u042a\u042b\7i\2\2\u042b\u042c\7j\2\2\u042c"+
		"\u042d\7v\2\2\u042d\u042e\7a\2\2\u042e\u042f\7w\2\2\u042f\u0430\7r\2\2"+
		"\u0430\u0431\7r\2\2\u0431\u0432\7g\2\2\u0432\u0433\7t\2\2\u0433\u0137"+
		"\3\2\2\2\u0434\u0435\7n\2\2\u0435\u0436\7g\2\2\u0436\u0437\7h\2\2\u0437"+
		"\u0438\7v\2\2\u0438\u0439\7a\2\2\u0439\u043a\7f\2\2\u043a\u043b\7q\2\2"+
		"\u043b\u043c\7y\2\2\u043c\u043d\7p\2\2\u043d\u0139\3\2\2\2\u043e\u043f"+
		"\7t\2\2\u043f\u0440\7k\2\2\u0440\u0441\7i\2\2\u0441\u0442\7j\2\2\u0442"+
		"\u0443\7v\2\2\u0443\u0444\7a\2\2\u0444\u0445\7f\2\2\u0445\u0446\7q\2\2"+
		"\u0446\u0447\7y\2\2\u0447\u0448\7p\2\2\u0448\u013b\3\2\2\2\u0449\u044a"+
		"\7+\2\2\u044a\u044b\3\2\2\2\u044b\u044c\b\u0091\7\2\u044c\u013d\3\2\2"+
		"\2L\2\3\4\5\6\7\b\t\n\13\f\r\16\17\20\21\22\23\24\25\26\27\30\31\32\33"+
		"\34\35\u0141\u0169\u016b\u0182\u0185\u0187\u01e4\u01e6\u01f5\u01f7\u0204"+
		"\u0206\u0210\u022a\u022c\u023e\u0240\u0248\u0250\u025e\u0260\u026d\u026f"+
		"\u028d\u02a8\u02ae\u02b0\u02b6\u02c3\u02c7\u02c9\u02df\u02e1\u02e7\u02f8"+
		"\u032c\u036c\u038d\u038f\u03cc\u03ce\u03e4\u03e9\u03f2\u03fb\u0404 \b"+
		"\2\2\7\4\2\7\3\2\7\23\2\7\5\2\6\2\2\7\16\2\7\17\2\7\t\2\7\b\2\7\6\2\7"+
		"\7\2\7\f\2\7\21\2\7\n\2\7\13\2\7\r\2\7\20\2\4\5\2\7\22\2\7\24\2\7\25\2"+
		"\7\35\2\7\26\2\7\30\2\7\33\2\7\34\2\7\27\2\7\31\2\7\32\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}