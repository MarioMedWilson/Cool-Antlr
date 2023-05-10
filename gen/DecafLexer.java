// Generated from /Users/apple/IdeaProjects/Antlr_project_phase1-2_v4/src/Decaf.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, PROGRAM=2, IF=3, ELSE=4, FOR=5, RETURN=6, BREAK=7, CONTINUE=8, 
		BOOLEAN=9, CHAR=10, INT=11, STRING=12, TRUE=13, FALSE=14, VOID=15, CALLOUT=16, 
		SEMICOLON=17, LCURLY=18, RCURLY=19, LSQUARE=20, RSQUARE=21, LROUND=22, 
		RROUND=23, COMMA=24, QUOTES=25, APOSTROPHE=26, ADD=27, SUB=28, MULTIPLY=29, 
		DIVIDE=30, REMINDER=31, AND=32, OR=33, NOT=34, GREATER_OP=35, LESS_OP=36, 
		GREATER_eq_op=37, LESS_eq_op=38, EQUAL_OP=39, ADD_eq_op=40, SUB_eq_op=41, 
		EQUALITY_OP=42, UNEQUALITY_OP=43, ID=44, ALPHA=45, CHAR_LITERAL=46, DECIMAL_LITERAL=47, 
		DIGIT=48, HEX_LITERAL=49, BOOL_LITERAL=50, STRING_LITERAL=51, ALPHA_NUM=52, 
		HEX_DIGIT=53, LINE_COMMENT=54, COMMENT=55, NEWLINE=56, WHITESPACE=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "PROGRAM", "IF", "ELSE", "FOR", "RETURN", "BREAK", "CONTINUE", 
			"BOOLEAN", "CHAR", "INT", "STRING", "TRUE", "FALSE", "VOID", "CALLOUT", 
			"SEMICOLON", "LCURLY", "RCURLY", "LSQUARE", "RSQUARE", "LROUND", "RROUND", 
			"COMMA", "QUOTES", "APOSTROPHE", "ADD", "SUB", "MULTIPLY", "DIVIDE", 
			"REMINDER", "AND", "OR", "NOT", "GREATER_OP", "LESS_OP", "GREATER_eq_op", 
			"LESS_eq_op", "EQUAL_OP", "ADD_eq_op", "SUB_eq_op", "EQUALITY_OP", "UNEQUALITY_OP", 
			"ID", "ALPHA", "CHAR_LITERAL", "DECIMAL_LITERAL", "DIGIT", "HEX_LITERAL", 
			"BOOL_LITERAL", "STRING_LITERAL", "ALPHA_NUM", "HEX_DIGIT", "LINE_COMMENT", 
			"COMMENT", "NEWLINE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'Program'", "'if'", "'else'", "'for'", "'return'", 
			"'break'", "'continue'", "'boolean'", "'char'", "'int'", "'string'", 
			"'True'", "'False'", "'void'", "'callout'", "';'", "'{'", "'}'", "'['", 
			"']'", "'('", "')'", "','", "'\"'", "'''", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'='", "'+='", 
			"'-='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "PROGRAM", "IF", "ELSE", "FOR", "RETURN", "BREAK", "CONTINUE", 
			"BOOLEAN", "CHAR", "INT", "STRING", "TRUE", "FALSE", "VOID", "CALLOUT", 
			"SEMICOLON", "LCURLY", "RCURLY", "LSQUARE", "RSQUARE", "LROUND", "RROUND", 
			"COMMA", "QUOTES", "APOSTROPHE", "ADD", "SUB", "MULTIPLY", "DIVIDE", 
			"REMINDER", "AND", "OR", "NOT", "GREATER_OP", "LESS_OP", "GREATER_eq_op", 
			"LESS_eq_op", "EQUAL_OP", "ADD_eq_op", "SUB_eq_op", "EQUALITY_OP", "UNEQUALITY_OP", 
			"ID", "ALPHA", "CHAR_LITERAL", "DECIMAL_LITERAL", "DIGIT", "HEX_LITERAL", 
			"BOOL_LITERAL", "STRING_LITERAL", "ALPHA_NUM", "HEX_DIGIT", "LINE_COMMENT", 
			"COMMENT", "NEWLINE", "WHITESPACE"
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


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g4"; }

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
		"\u0004\u00009\u0172\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0005+\u0114\b+\n+"+
		"\f+\u0117\t+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0003-\u011f\b"+
		"-\u0001-\u0001-\u0001.\u0004.\u0124\b.\u000b.\f.\u0125\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00040\u012d\b0\u000b0\f0\u012e\u00011\u00011\u00031\u0133"+
		"\b1\u00012\u00012\u00012\u00012\u00052\u0139\b2\n2\f2\u013c\t2\u00012"+
		"\u00012\u00013\u00013\u00033\u0142\b3\u00014\u00014\u00014\u00034\u0147"+
		"\b4\u00015\u00015\u00015\u00015\u00055\u014d\b5\n5\f5\u0150\t5\u00015"+
		"\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00056\u015a\b6\n6\f"+
		"6\u015d\t6\u00016\u00016\u00016\u00016\u00016\u00017\u00037\u0165\b7\u0001"+
		"7\u00017\u00047\u0169\b7\u000b7\f7\u016a\u00017\u00017\u00018\u00018\u0001"+
		"8\u00018\u0002\u014e\u015b\u00009\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6"+
		"m7o8q9\u0001\u0000\u0007\u0003\u0000AZ__az\b\u0000\"\"\'\'\\\\bbffnnr"+
		"rtt\u0004\u0000\n\n\r\r\"\"\\\\\u0001\u000009\u0002\u0000XXxx\u0003\u0000"+
		"09AFaf\u0003\u0000\t\n\r\r  \u017e\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000"+
		"W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001"+
		"\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000"+
		"\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000"+
		"e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001"+
		"\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000"+
		"\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0001"+
		"s\u0001\u0000\u0000\u0000\u0003y\u0001\u0000\u0000\u0000\u0005\u0081\u0001"+
		"\u0000\u0000\u0000\u0007\u0084\u0001\u0000\u0000\u0000\t\u0089\u0001\u0000"+
		"\u0000\u0000\u000b\u008d\u0001\u0000\u0000\u0000\r\u0094\u0001\u0000\u0000"+
		"\u0000\u000f\u009a\u0001\u0000\u0000\u0000\u0011\u00a3\u0001\u0000\u0000"+
		"\u0000\u0013\u00ab\u0001\u0000\u0000\u0000\u0015\u00b0\u0001\u0000\u0000"+
		"\u0000\u0017\u00b4\u0001\u0000\u0000\u0000\u0019\u00bb\u0001\u0000\u0000"+
		"\u0000\u001b\u00c0\u0001\u0000\u0000\u0000\u001d\u00c6\u0001\u0000\u0000"+
		"\u0000\u001f\u00cb\u0001\u0000\u0000\u0000!\u00d3\u0001\u0000\u0000\u0000"+
		"#\u00d5\u0001\u0000\u0000\u0000%\u00d7\u0001\u0000\u0000\u0000\'\u00d9"+
		"\u0001\u0000\u0000\u0000)\u00db\u0001\u0000\u0000\u0000+\u00dd\u0001\u0000"+
		"\u0000\u0000-\u00df\u0001\u0000\u0000\u0000/\u00e1\u0001\u0000\u0000\u0000"+
		"1\u00e3\u0001\u0000\u0000\u00003\u00e5\u0001\u0000\u0000\u00005\u00e7"+
		"\u0001\u0000\u0000\u00007\u00e9\u0001\u0000\u0000\u00009\u00eb\u0001\u0000"+
		"\u0000\u0000;\u00ed\u0001\u0000\u0000\u0000=\u00ef\u0001\u0000\u0000\u0000"+
		"?\u00f1\u0001\u0000\u0000\u0000A\u00f4\u0001\u0000\u0000\u0000C\u00f7"+
		"\u0001\u0000\u0000\u0000E\u00f9\u0001\u0000\u0000\u0000G\u00fb\u0001\u0000"+
		"\u0000\u0000I\u00fd\u0001\u0000\u0000\u0000K\u0100\u0001\u0000\u0000\u0000"+
		"M\u0103\u0001\u0000\u0000\u0000O\u0105\u0001\u0000\u0000\u0000Q\u0108"+
		"\u0001\u0000\u0000\u0000S\u010b\u0001\u0000\u0000\u0000U\u010e\u0001\u0000"+
		"\u0000\u0000W\u0111\u0001\u0000\u0000\u0000Y\u0118\u0001\u0000\u0000\u0000"+
		"[\u011a\u0001\u0000\u0000\u0000]\u0123\u0001\u0000\u0000\u0000_\u0127"+
		"\u0001\u0000\u0000\u0000a\u0129\u0001\u0000\u0000\u0000c\u0132\u0001\u0000"+
		"\u0000\u0000e\u0134\u0001\u0000\u0000\u0000g\u0141\u0001\u0000\u0000\u0000"+
		"i\u0143\u0001\u0000\u0000\u0000k\u0148\u0001\u0000\u0000\u0000m\u0155"+
		"\u0001\u0000\u0000\u0000o\u0168\u0001\u0000\u0000\u0000q\u016e\u0001\u0000"+
		"\u0000\u0000st\u0005c\u0000\u0000tu\u0005l\u0000\u0000uv\u0005a\u0000"+
		"\u0000vw\u0005s\u0000\u0000wx\u0005s\u0000\u0000x\u0002\u0001\u0000\u0000"+
		"\u0000yz\u0005P\u0000\u0000z{\u0005r\u0000\u0000{|\u0005o\u0000\u0000"+
		"|}\u0005g\u0000\u0000}~\u0005r\u0000\u0000~\u007f\u0005a\u0000\u0000\u007f"+
		"\u0080\u0005m\u0000\u0000\u0080\u0004\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005i\u0000\u0000\u0082\u0083\u0005f\u0000\u0000\u0083\u0006\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u0086\u0005l\u0000\u0000"+
		"\u0086\u0087\u0005s\u0000\u0000\u0087\u0088\u0005e\u0000\u0000\u0088\b"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005f\u0000\u0000\u008a\u008b\u0005"+
		"o\u0000\u0000\u008b\u008c\u0005r\u0000\u0000\u008c\n\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005r\u0000\u0000\u008e\u008f\u0005e\u0000\u0000\u008f"+
		"\u0090\u0005t\u0000\u0000\u0090\u0091\u0005u\u0000\u0000\u0091\u0092\u0005"+
		"r\u0000\u0000\u0092\u0093\u0005n\u0000\u0000\u0093\f\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005b\u0000\u0000\u0095\u0096\u0005r\u0000\u0000\u0096"+
		"\u0097\u0005e\u0000\u0000\u0097\u0098\u0005a\u0000\u0000\u0098\u0099\u0005"+
		"k\u0000\u0000\u0099\u000e\u0001\u0000\u0000\u0000\u009a\u009b\u0005c\u0000"+
		"\u0000\u009b\u009c\u0005o\u0000\u0000\u009c\u009d\u0005n\u0000\u0000\u009d"+
		"\u009e\u0005t\u0000\u0000\u009e\u009f\u0005i\u0000\u0000\u009f\u00a0\u0005"+
		"n\u0000\u0000\u00a0\u00a1\u0005u\u0000\u0000\u00a1\u00a2\u0005e\u0000"+
		"\u0000\u00a2\u0010\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005b\u0000\u0000"+
		"\u00a4\u00a5\u0005o\u0000\u0000\u00a5\u00a6\u0005o\u0000\u0000\u00a6\u00a7"+
		"\u0005l\u0000\u0000\u00a7\u00a8\u0005e\u0000\u0000\u00a8\u00a9\u0005a"+
		"\u0000\u0000\u00a9\u00aa\u0005n\u0000\u0000\u00aa\u0012\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005c\u0000\u0000\u00ac\u00ad\u0005h\u0000\u0000\u00ad"+
		"\u00ae\u0005a\u0000\u0000\u00ae\u00af\u0005r\u0000\u0000\u00af\u0014\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005i\u0000\u0000\u00b1\u00b2\u0005n\u0000"+
		"\u0000\u00b2\u00b3\u0005t\u0000\u0000\u00b3\u0016\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005s\u0000\u0000\u00b5\u00b6\u0005t\u0000\u0000\u00b6\u00b7"+
		"\u0005r\u0000\u0000\u00b7\u00b8\u0005i\u0000\u0000\u00b8\u00b9\u0005n"+
		"\u0000\u0000\u00b9\u00ba\u0005g\u0000\u0000\u00ba\u0018\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005T\u0000\u0000\u00bc\u00bd\u0005r\u0000\u0000\u00bd"+
		"\u00be\u0005u\u0000\u0000\u00be\u00bf\u0005e\u0000\u0000\u00bf\u001a\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005F\u0000\u0000\u00c1\u00c2\u0005a\u0000"+
		"\u0000\u00c2\u00c3\u0005l\u0000\u0000\u00c3\u00c4\u0005s\u0000\u0000\u00c4"+
		"\u00c5\u0005e\u0000\u0000\u00c5\u001c\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0005v\u0000\u0000\u00c7\u00c8\u0005o\u0000\u0000\u00c8\u00c9\u0005i"+
		"\u0000\u0000\u00c9\u00ca\u0005d\u0000\u0000\u00ca\u001e\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005c\u0000\u0000\u00cc\u00cd\u0005a\u0000\u0000\u00cd"+
		"\u00ce\u0005l\u0000\u0000\u00ce\u00cf\u0005l\u0000\u0000\u00cf\u00d0\u0005"+
		"o\u0000\u0000\u00d0\u00d1\u0005u\u0000\u0000\u00d1\u00d2\u0005t\u0000"+
		"\u0000\u00d2 \u0001\u0000\u0000\u0000\u00d3\u00d4\u0005;\u0000\u0000\u00d4"+
		"\"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005{\u0000\u0000\u00d6$\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0005}\u0000\u0000\u00d8&\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005[\u0000\u0000\u00da(\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0005]\u0000\u0000\u00dc*\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"(\u0000\u0000\u00de,\u0001\u0000\u0000\u0000\u00df\u00e0\u0005)\u0000"+
		"\u0000\u00e0.\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005,\u0000\u0000\u00e2"+
		"0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\"\u0000\u0000\u00e42\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005\'\u0000\u0000\u00e64\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005+\u0000\u0000\u00e86\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0005-\u0000\u0000\u00ea8\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0005*\u0000\u0000\u00ec:\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005/"+
		"\u0000\u0000\u00ee<\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005%\u0000\u0000"+
		"\u00f0>\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005&\u0000\u0000\u00f2\u00f3"+
		"\u0005&\u0000\u0000\u00f3@\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005|"+
		"\u0000\u0000\u00f5\u00f6\u0005|\u0000\u0000\u00f6B\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0005!\u0000\u0000\u00f8D\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0005>\u0000\u0000\u00faF\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005<"+
		"\u0000\u0000\u00fcH\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005>\u0000\u0000"+
		"\u00fe\u00ff\u0005=\u0000\u0000\u00ffJ\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0005<\u0000\u0000\u0101\u0102\u0005=\u0000\u0000\u0102L\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0005=\u0000\u0000\u0104N\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0005+\u0000\u0000\u0106\u0107\u0005=\u0000\u0000\u0107P"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0005-\u0000\u0000\u0109\u010a\u0005"+
		"=\u0000\u0000\u010aR\u0001\u0000\u0000\u0000\u010b\u010c\u0005=\u0000"+
		"\u0000\u010c\u010d\u0005=\u0000\u0000\u010dT\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0005!\u0000\u0000\u010f\u0110\u0005=\u0000\u0000\u0110V\u0001"+
		"\u0000\u0000\u0000\u0111\u0115\u0003Y,\u0000\u0112\u0114\u0003g3\u0000"+
		"\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000"+
		"\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000"+
		"\u0116X\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0007\u0000\u0000\u0000\u0119Z\u0001\u0000\u0000\u0000\u011a\u011e"+
		"\u00033\u0019\u0000\u011b\u011c\u0005\\\u0000\u0000\u011c\u011f\u0007"+
		"\u0001\u0000\u0000\u011d\u011f\b\u0002\u0000\u0000\u011e\u011b\u0001\u0000"+
		"\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u00033\u0019\u0000\u0121\\\u0001\u0000\u0000"+
		"\u0000\u0122\u0124\u0007\u0003\u0000\u0000\u0123\u0122\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126^\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0007\u0003\u0000\u0000\u0128`\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u00050\u0000\u0000\u012a\u012c\u0007\u0004\u0000\u0000\u012b\u012d"+
		"\u0007\u0005\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0001\u0000\u0000\u0000\u012fb\u0001\u0000\u0000\u0000\u0130\u0133\u0003"+
		"\u0019\f\u0000\u0131\u0133\u0003\u001b\r\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133d\u0001\u0000\u0000"+
		"\u0000\u0134\u013a\u0005\"\u0000\u0000\u0135\u0136\u0005\\\u0000\u0000"+
		"\u0136\u0139\u0007\u0001\u0000\u0000\u0137\u0139\b\u0002\u0000\u0000\u0138"+
		"\u0135\u0001\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c"+
		"\u013a\u0001\u0000\u0000\u0000\u013d\u013e\u0005\"\u0000\u0000\u013ef"+
		"\u0001\u0000\u0000\u0000\u013f\u0142\u0003Y,\u0000\u0140\u0142\u0003_"+
		"/\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000"+
		"\u0000\u0142h\u0001\u0000\u0000\u0000\u0143\u0144\u00050\u0000\u0000\u0144"+
		"\u0146\u0007\u0004\u0000\u0000\u0145\u0147\u0007\u0005\u0000\u0000\u0146"+
		"\u0145\u0001\u0000\u0000\u0000\u0147j\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0005/\u0000\u0000\u0149\u014a\u0005/\u0000\u0000\u014a\u014e\u0001\u0000"+
		"\u0000\u0000\u014b\u014d\t\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000"+
		"\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0151\u0001\u0000\u0000"+
		"\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0152\u0005\n\u0000\u0000"+
		"\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u00065\u0000\u0000\u0154"+
		"l\u0001\u0000\u0000\u0000\u0155\u0156\u0005/\u0000\u0000\u0156\u0157\u0005"+
		"*\u0000\u0000\u0157\u015b\u0001\u0000\u0000\u0000\u0158\u015a\t\u0000"+
		"\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0005*\u0000\u0000\u015f\u0160\u0005/\u0000\u0000"+
		"\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u00066\u0000\u0000\u0162"+
		"n\u0001\u0000\u0000\u0000\u0163\u0165\u0005\r\u0000\u0000\u0164\u0163"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166\u0169\u0005\n\u0000\u0000\u0167\u0169\u0005"+
		"\r\u0000\u0000\u0168\u0164\u0001\u0000\u0000\u0000\u0168\u0167\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u00067\u0000\u0000\u016dp\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0007\u0006\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u00068\u0000\u0000\u0171r\u0001\u0000\u0000\u0000\u000f\u0000"+
		"\u0115\u011e\u0125\u012e\u0132\u0138\u013a\u0141\u0146\u014e\u015b\u0164"+
		"\u0168\u016a\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}