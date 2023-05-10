// Generated from /Users/apple/IdeaProjects/Antlr_project_phase1-2_v4/src/Decaf.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DecafParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_vardeclr = 1, RULE_field_declr = 2, RULE_array_id = 3, 
		RULE_field_var = 4, RULE_var_id = 5, RULE_method_declr = 6, RULE_return_type = 7, 
		RULE_block = 8, RULE_statement = 9, RULE_method_call_inter = 10, RULE_method_call = 11, 
		RULE_expr = 12, RULE_location = 13, RULE_callout_arg = 14, RULE_int_literal = 15, 
		RULE_rel_op = 16, RULE_eq_op = 17, RULE_cond_op = 18, RULE_literal = 19, 
		RULE_bin_op = 20, RULE_arith_op = 21, RULE_var_type = 22, RULE_assign_op = 23, 
		RULE_method_name = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "vardeclr", "field_declr", "array_id", "field_var", "var_id", 
			"method_declr", "return_type", "block", "statement", "method_call_inter", 
			"method_call", "expr", "location", "callout_arg", "int_literal", "rel_op", 
			"eq_op", "cond_op", "literal", "bin_op", "arith_op", "var_type", "assign_op", 
			"method_name"
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

	@Override
	public String getGrammarFileName() { return "Decaf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DecafParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(DecafParser.PROGRAM, 0); }
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Field_declrContext> field_declr() {
			return getRuleContexts(Field_declrContext.class);
		}
		public Field_declrContext field_declr(int i) {
			return getRuleContext(Field_declrContext.class,i);
		}
		public List<Method_declrContext> method_declr() {
			return getRuleContexts(Method_declrContext.class);
		}
		public Method_declrContext method_declr(int i) {
			return getRuleContext(Method_declrContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(CLASS);
			setState(51);
			match(PROGRAM);
			setState(52);
			match(LCURLY);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					field_declr();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35328L) != 0)) {
				{
				{
				setState(59);
				method_declr();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VardeclrContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public List<Field_varContext> field_var() {
			return getRuleContexts(Field_varContext.class);
		}
		public Field_varContext field_var(int i) {
			return getRuleContext(Field_varContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public VardeclrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterVardeclr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitVardeclr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitVardeclr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclrContext vardeclr() throws RecognitionException {
		VardeclrContext _localctx = new VardeclrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vardeclr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(67);
			var_type();
			setState(68);
			field_var();
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(70);
				match(COMMA);
				setState(71);
				var_type();
				setState(72);
				field_var();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Field_declrContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<Field_varContext> field_var() {
			return getRuleContexts(Field_varContext.class);
		}
		public Field_varContext field_var(int i) {
			return getRuleContext(Field_varContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Field_declrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterField_declr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitField_declr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitField_declr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declrContext field_declr() throws RecognitionException {
		Field_declrContext _localctx = new Field_declrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_declr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			var_type();
			setState(82);
			field_var();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(83);
				match(COMMA);
				setState(84);
				field_var();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LSQUARE() { return getToken(DecafParser.LSQUARE, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(DecafParser.RSQUARE, 0); }
		public Array_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterArray_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitArray_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitArray_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_idContext array_id() throws RecognitionException {
		Array_idContext _localctx = new Array_idContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
			setState(93);
			match(LSQUARE);
			setState(94);
			int_literal();
			setState(95);
			match(RSQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Field_varContext extends ParserRuleContext {
		public Var_idContext var_id() {
			return getRuleContext(Var_idContext.class,0);
		}
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public Field_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterField_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitField_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitField_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_varContext field_var() throws RecognitionException {
		Field_varContext _localctx = new Field_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_var);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				var_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				array_id();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Var_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterVar_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitVar_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitVar_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_idContext var_id() throws RecognitionException {
		Var_idContext _localctx = new Var_idContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_declrContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode LROUND() { return getToken(DecafParser.LROUND, 0); }
		public TerminalNode RROUND() { return getToken(DecafParser.RROUND, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public List<Var_idContext> var_id() {
			return getRuleContexts(Var_idContext.class);
		}
		public Var_idContext var_id(int i) {
			return getRuleContext(Var_idContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Method_declrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_declr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_declr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitMethod_declr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declrContext method_declr() throws RecognitionException {
		Method_declrContext _localctx = new Method_declrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_method_declr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			return_type();
			setState(104);
			method_name();
			setState(105);
			match(LROUND);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(106);
				var_type();
				setState(107);
				var_id();
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(109);
					match(COMMA);
					setState(110);
					var_type();
					setState(111);
					var_id();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(120);
			match(RROUND);
			setState(121);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_typeContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				{
				setState(123);
				var_type();
				}
				break;
			case VOID:
				{
				setState(124);
				match(VOID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<VardeclrContext> vardeclr() {
			return getRuleContexts(VardeclrContext.class);
		}
		public VardeclrContext vardeclr(int i) {
			return getRuleContext(VardeclrContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(LCURLY);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(128);
				vardeclr();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592186110184L) != 0)) {
				{
				{
				setState(134);
				statement();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public TerminalNode LROUND() { return getToken(DecafParser.LROUND, 0); }
		public TerminalNode RROUND() { return getToken(DecafParser.RROUND, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public List<Var_idContext> var_id() {
			return getRuleContexts(Var_idContext.class);
		}
		public Var_idContext var_id(int i) {
			return getRuleContext(Var_idContext.class,i);
		}
		public List<TerminalNode> EQUAL_OP() { return getTokens(DecafParser.EQUAL_OP); }
		public TerminalNode EQUAL_OP(int i) {
			return getToken(DecafParser.EQUAL_OP, i);
		}
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode COMMA() { return getToken(DecafParser.COMMA, 0); }
		public List<Int_literalContext> int_literal() {
			return getRuleContexts(Int_literalContext.class);
		}
		public Int_literalContext int_literal(int i) {
			return getRuleContext(Int_literalContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				location();
				setState(143);
				assign_op();
				setState(144);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				location();
				setState(147);
				assign_op();
				setState(148);
				expr(0);
				setState(149);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				method_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(IF);
				setState(153);
				match(LROUND);
				setState(154);
				expr(0);
				setState(155);
				match(RROUND);
				setState(156);
				block();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(157);
					match(ELSE);
					setState(158);
					block();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				var_id();
				setState(162);
				match(EQUAL_OP);
				setState(163);
				expr(0);
				setState(164);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				match(RETURN);
				setState(167);
				expr(0);
				setState(168);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				match(FOR);
				setState(171);
				var_id();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL_OP) {
					{
					setState(172);
					match(EQUAL_OP);
					setState(173);
					int_literal();
					}
				}

				setState(176);
				match(COMMA);
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					{
					setState(177);
					var_id();
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQUAL_OP) {
						{
						setState(178);
						match(EQUAL_OP);
						setState(179);
						int_literal();
						}
					}

					}
					}
					break;
				case DECIMAL_LITERAL:
				case HEX_LITERAL:
					{
					setState(182);
					int_literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(187);
				match(BREAK);
				setState(188);
				match(SEMICOLON);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_call_interContext extends ParserRuleContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode LROUND() { return getToken(DecafParser.LROUND, 0); }
		public TerminalNode RROUND() { return getToken(DecafParser.RROUND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Method_call_interContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_inter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_call_inter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_call_inter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitMethod_call_inter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_call_interContext method_call_inter() throws RecognitionException {
		Method_call_interContext _localctx = new Method_call_interContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method_call_inter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			method_name();
			setState(192);
			match(LROUND);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1917565731405824L) != 0)) {
				{
				setState(193);
				expr(0);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(194);
					match(COMMA);
					setState(195);
					expr(0);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(203);
			match(RROUND);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_callContext extends ParserRuleContext {
		public Method_call_interContext method_call_inter() {
			return getRuleContext(Method_call_interContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public TerminalNode LROUND() { return getToken(DecafParser.LROUND, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public TerminalNode RROUND() { return getToken(DecafParser.RROUND, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_method_call);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				method_call_inter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				method_call_inter();
				setState(207);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(CALLOUT);
				setState(210);
				match(LROUND);
				setState(211);
				match(STRING_LITERAL);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(212);
					match(COMMA);
					setState(213);
					callout_arg();
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(214);
						match(COMMA);
						setState(215);
						callout_arg();
						}
						}
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(223);
				match(RROUND);
				setState(224);
				match(SEMICOLON);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DecafParser.NOT, 0); }
		public TerminalNode LROUND() { return getToken(DecafParser.LROUND, 0); }
		public TerminalNode RROUND() { return getToken(DecafParser.RROUND, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(228);
				location();
				}
				break;
			case 2:
				{
				setState(229);
				literal();
				}
				break;
			case 3:
				{
				setState(230);
				match(SUB);
				setState(231);
				expr(4);
				}
				break;
			case 4:
				{
				setState(232);
				method_call();
				}
				break;
			case 5:
				{
				setState(233);
				match(NOT);
				setState(234);
				expr(2);
				}
				break;
			case 6:
				{
				setState(235);
				match(LROUND);
				setState(236);
				expr(0);
				setState(237);
				match(RROUND);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(241);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(242);
					bin_op();
					setState(243);
					expr(6);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocationContext extends ParserRuleContext {
		public Var_idContext var_id() {
			return getRuleContext(Var_idContext.class,0);
		}
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_location);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				var_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				array_id();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCallout_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitCallout_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callout_arg);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALLOUT:
			case LROUND:
			case SUB:
			case NOT:
			case ID:
			case CHAR_LITERAL:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				expr(0);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(DecafParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(DecafParser.HEX_LITERAL, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitInt_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitInt_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL_LITERAL || _la==HEX_LITERAL) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode GREATER_OP() { return getToken(DecafParser.GREATER_OP, 0); }
		public TerminalNode LESS_OP() { return getToken(DecafParser.LESS_OP, 0); }
		public TerminalNode LESS_eq_op() { return getToken(DecafParser.LESS_eq_op, 0); }
		public TerminalNode GREATER_eq_op() { return getToken(DecafParser.GREATER_eq_op, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitRel_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQUALITY_OP() { return getToken(DecafParser.EQUALITY_OP, 0); }
		public TerminalNode UNEQUALITY_OP() { return getToken(DecafParser.UNEQUALITY_OP, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitEq_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitEq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==EQUALITY_OP || _la==UNEQUALITY_OP) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(DecafParser.AND, 0); }
		public TerminalNode OR() { return getToken(DecafParser.OR, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCond_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitCond_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(DecafParser.CHAR_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(DecafParser.BOOL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				int_literal();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(CHAR_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(BOOL_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_opContext extends ParserRuleContext {
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitBin_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bin_op);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case MULTIPLY:
			case DIVIDE:
			case REMINDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				arith_op();
				}
				break;
			case GREATER_OP:
			case LESS_OP:
			case GREATER_eq_op:
			case LESS_eq_op:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				rel_op();
				}
				break;
			case EQUALITY_OP:
			case UNEQUALITY_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				eq_op();
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				cond_op();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arith_opContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(DecafParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public TerminalNode MULTIPLY() { return getToken(DecafParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(DecafParser.DIVIDE, 0); }
		public TerminalNode REMINDER() { return getToken(DecafParser.REMINDER, 0); }
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitArith_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitArith_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(DecafParser.BOOLEAN, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitVar_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode EQUAL_OP() { return getToken(DecafParser.EQUAL_OP, 0); }
		public TerminalNode ADD_eq_op() { return getToken(DecafParser.ADD_eq_op, 0); }
		public TerminalNode SUB_eq_op() { return getToken(DecafParser.SUB_eq_op, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitAssign_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitAssign_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafVisitor ) return ((DecafVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u011e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00007\b\u0000"+
		"\n\u0000\f\u0000:\t\u0000\u0001\u0000\u0005\u0000=\b\u0000\n\u0000\f\u0000"+
		"@\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001K\b\u0001"+
		"\n\u0001\f\u0001N\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002V\b\u0002\n\u0002\f\u0002Y\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004d\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"r\b\u0006\n\u0006\f\u0006u\t\u0006\u0003\u0006w\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007~\b\u0007\u0001"+
		"\b\u0001\b\u0005\b\u0082\b\b\n\b\f\b\u0085\t\b\u0001\b\u0005\b\u0088\b"+
		"\b\n\b\f\b\u008b\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a0\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00af\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b5\b\t"+
		"\u0001\t\u0003\t\u00b8\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00be"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c5\b\n\n\n\f\n"+
		"\u00c8\t\n\u0003\n\u00ca\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d9\b\u000b\n\u000b\f\u000b"+
		"\u00dc\t\u000b\u0003\u000b\u00de\b\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00e2\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00f0\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00f6\b\f\n\f\f\f\u00f9\t\f\u0001\r\u0001\r"+
		"\u0003\r\u00fd\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u0101\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u010e"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0114"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0001\u0018\u0019\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.0\u0000\u0007\u0002\u0000//11\u0001\u0000#&\u0001\u0000"+
		"*+\u0001\u0000 !\u0001\u0000\u001b\u001f\u0002\u0000\t\t\u000b\u000b\u0001"+
		"\u0000\')\u012c\u00002\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000"+
		"\u0000\u0004Q\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000"+
		"\bc\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000\u0000\fg\u0001\u0000"+
		"\u0000\u0000\u000e}\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000\u0000"+
		"\u0000\u0012\u00bd\u0001\u0000\u0000\u0000\u0014\u00bf\u0001\u0000\u0000"+
		"\u0000\u0016\u00e1\u0001\u0000\u0000\u0000\u0018\u00ef\u0001\u0000\u0000"+
		"\u0000\u001a\u00fc\u0001\u0000\u0000\u0000\u001c\u0100\u0001\u0000\u0000"+
		"\u0000\u001e\u0102\u0001\u0000\u0000\u0000 \u0104\u0001\u0000\u0000\u0000"+
		"\"\u0106\u0001\u0000\u0000\u0000$\u0108\u0001\u0000\u0000\u0000&\u010d"+
		"\u0001\u0000\u0000\u0000(\u0113\u0001\u0000\u0000\u0000*\u0115\u0001\u0000"+
		"\u0000\u0000,\u0117\u0001\u0000\u0000\u0000.\u0119\u0001\u0000\u0000\u0000"+
		"0\u011b\u0001\u0000\u0000\u000023\u0005\u0001\u0000\u000034\u0005\u0002"+
		"\u0000\u000048\u0005\u0012\u0000\u000057\u0003\u0004\u0002\u000065\u0001"+
		"\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009>\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000;=\u0003\f\u0006\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u0013\u0000\u0000B\u0001"+
		"\u0001\u0000\u0000\u0000CD\u0003,\u0016\u0000DE\u0003\b\u0004\u0000EL"+
		"\u0001\u0000\u0000\u0000FG\u0005\u0018\u0000\u0000GH\u0003,\u0016\u0000"+
		"HI\u0003\b\u0004\u0000IK\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\u0011"+
		"\u0000\u0000P\u0003\u0001\u0000\u0000\u0000QR\u0003,\u0016\u0000RW\u0003"+
		"\b\u0004\u0000ST\u0005\u0018\u0000\u0000TV\u0003\b\u0004\u0000US\u0001"+
		"\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u0011\u0000\u0000[\u0005\u0001\u0000\u0000\u0000\\]\u0005"+
		",\u0000\u0000]^\u0005\u0014\u0000\u0000^_\u0003\u001e\u000f\u0000_`\u0005"+
		"\u0015\u0000\u0000`\u0007\u0001\u0000\u0000\u0000ad\u0003\n\u0005\u0000"+
		"bd\u0003\u0006\u0003\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000"+
		"\u0000d\t\u0001\u0000\u0000\u0000ef\u0005,\u0000\u0000f\u000b\u0001\u0000"+
		"\u0000\u0000gh\u0003\u000e\u0007\u0000hi\u00030\u0018\u0000iv\u0005\u0016"+
		"\u0000\u0000jk\u0003,\u0016\u0000kl\u0003\n\u0005\u0000ls\u0001\u0000"+
		"\u0000\u0000mn\u0005\u0018\u0000\u0000no\u0003,\u0016\u0000op\u0003\n"+
		"\u0005\u0000pr\u0001\u0000\u0000\u0000qm\u0001\u0000\u0000\u0000ru\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vj\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u0017"+
		"\u0000\u0000yz\u0003\u0010\b\u0000z\r\u0001\u0000\u0000\u0000{~\u0003"+
		",\u0016\u0000|~\u0005\u000f\u0000\u0000}{\u0001\u0000\u0000\u0000}|\u0001"+
		"\u0000\u0000\u0000~\u000f\u0001\u0000\u0000\u0000\u007f\u0083\u0005\u0012"+
		"\u0000\u0000\u0080\u0082\u0003\u0002\u0001\u0000\u0081\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0089\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0012"+
		"\t\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u0013\u0000\u0000\u008d\u0011\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0003\u001a\r\u0000\u008f\u0090\u0003.\u0017\u0000"+
		"\u0090\u0091\u0003\u0018\f\u0000\u0091\u00be\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0003\u001a\r\u0000\u0093\u0094\u0003.\u0017\u0000\u0094\u0095"+
		"\u0003\u0018\f\u0000\u0095\u0096\u0005\u0011\u0000\u0000\u0096\u00be\u0001"+
		"\u0000\u0000\u0000\u0097\u00be\u0003\u0016\u000b\u0000\u0098\u0099\u0005"+
		"\u0003\u0000\u0000\u0099\u009a\u0005\u0016\u0000\u0000\u009a\u009b\u0003"+
		"\u0018\f\u0000\u009b\u009c\u0005\u0017\u0000\u0000\u009c\u009f\u0003\u0010"+
		"\b\u0000\u009d\u009e\u0005\u0004\u0000\u0000\u009e\u00a0\u0003\u0010\b"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00be\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\n\u0005\u0000"+
		"\u00a2\u00a3\u0005\'\u0000\u0000\u00a3\u00a4\u0003\u0018\f\u0000\u00a4"+
		"\u00a5\u0005\u0011\u0000\u0000\u00a5\u00be\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0006\u0000\u0000\u00a7\u00a8\u0003\u0018\f\u0000\u00a8\u00a9"+
		"\u0005\u0011\u0000\u0000\u00a9\u00be\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0005\u0000\u0000\u00ab\u00ae\u0003\n\u0005\u0000\u00ac\u00ad\u0005"+
		"\'\u0000\u0000\u00ad\u00af\u0003\u001e\u000f\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b7\u0005\u0018\u0000\u0000\u00b1\u00b4\u0003\n\u0005"+
		"\u0000\u00b2\u00b3\u0005\'\u0000\u0000\u00b3\u00b5\u0003\u001e\u000f\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\u001e\u000f\u0000"+
		"\u00b7\u00b1\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003\u0010\b\u0000\u00ba"+
		"\u00be\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0007\u0000\u0000\u00bc"+
		"\u00be\u0005\u0011\u0000\u0000\u00bd\u008e\u0001\u0000\u0000\u0000\u00bd"+
		"\u0092\u0001\u0000\u0000\u0000\u00bd\u0097\u0001\u0000\u0000\u0000\u00bd"+
		"\u0098\u0001\u0000\u0000\u0000\u00bd\u00a1\u0001\u0000\u0000\u0000\u00bd"+
		"\u00a6\u0001\u0000\u0000\u0000\u00bd\u00aa\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00be\u0013\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u00030\u0018\u0000\u00c0\u00c9\u0005\u0016\u0000\u0000\u00c1\u00c6"+
		"\u0003\u0018\f\u0000\u00c2\u00c3\u0005\u0018\u0000\u0000\u00c3\u00c5\u0003"+
		"\u0018\f\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c1\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0017"+
		"\u0000\u0000\u00cc\u0015\u0001\u0000\u0000\u0000\u00cd\u00e2\u0003\u0014"+
		"\n\u0000\u00ce\u00cf\u0003\u0014\n\u0000\u00cf\u00d0\u0005\u0011\u0000"+
		"\u0000\u00d0\u00e2\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0010\u0000"+
		"\u0000\u00d2\u00d3\u0005\u0016\u0000\u0000\u00d3\u00dd\u00053\u0000\u0000"+
		"\u00d4\u00d5\u0005\u0018\u0000\u0000\u00d5\u00da\u0003\u001c\u000e\u0000"+
		"\u00d6\u00d7\u0005\u0018\u0000\u0000\u00d7\u00d9\u0003\u001c\u000e\u0000"+
		"\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dd\u00d4\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0017\u0000\u0000"+
		"\u00e0\u00e2\u0005\u0011\u0000\u0000\u00e1\u00cd\u0001\u0000\u0000\u0000"+
		"\u00e1\u00ce\u0001\u0000\u0000\u0000\u00e1\u00d1\u0001\u0000\u0000\u0000"+
		"\u00e2\u0017\u0001\u0000\u0000\u0000\u00e3\u00e4\u0006\f\uffff\uffff\u0000"+
		"\u00e4\u00f0\u0003\u001a\r\u0000\u00e5\u00f0\u0003&\u0013\u0000\u00e6"+
		"\u00e7\u0005\u001c\u0000\u0000\u00e7\u00f0\u0003\u0018\f\u0004\u00e8\u00f0"+
		"\u0003\u0016\u000b\u0000\u00e9\u00ea\u0005\"\u0000\u0000\u00ea\u00f0\u0003"+
		"\u0018\f\u0002\u00eb\u00ec\u0005\u0016\u0000\u0000\u00ec\u00ed\u0003\u0018"+
		"\f\u0000\u00ed\u00ee\u0005\u0017\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ef\u00e3\u0001\u0000\u0000\u0000\u00ef\u00e5\u0001\u0000\u0000"+
		"\u0000\u00ef\u00e6\u0001\u0000\u0000\u0000\u00ef\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ef\u00e9\u0001\u0000\u0000\u0000\u00ef\u00eb\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f7\u0001\u0000\u0000\u0000\u00f1\u00f2\n\u0005\u0000\u0000"+
		"\u00f2\u00f3\u0003(\u0014\u0000\u00f3\u00f4\u0003\u0018\f\u0006\u00f4"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f8\u0019\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fd\u0003\n\u0005\u0000\u00fb\u00fd"+
		"\u0003\u0006\u0003\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd\u001b\u0001\u0000\u0000\u0000\u00fe\u0101"+
		"\u0003\u0018\f\u0000\u00ff\u0101\u00053\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u001d\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0007\u0000\u0000\u0000\u0103\u001f\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0007\u0001\u0000\u0000\u0105!\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0007\u0002\u0000\u0000\u0107#\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0007\u0003\u0000\u0000\u0109%\u0001\u0000\u0000\u0000"+
		"\u010a\u010e\u0003\u001e\u000f\u0000\u010b\u010e\u0005.\u0000\u0000\u010c"+
		"\u010e\u00052\u0000\u0000\u010d\u010a\u0001\u0000\u0000\u0000\u010d\u010b"+
		"\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\'\u0001"+
		"\u0000\u0000\u0000\u010f\u0114\u0003*\u0015\u0000\u0110\u0114\u0003 \u0010"+
		"\u0000\u0111\u0114\u0003\"\u0011\u0000\u0112\u0114\u0003$\u0012\u0000"+
		"\u0113\u010f\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000\u0000"+
		"\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000"+
		"\u0114)\u0001\u0000\u0000\u0000\u0115\u0116\u0007\u0004\u0000\u0000\u0116"+
		"+\u0001\u0000\u0000\u0000\u0117\u0118\u0007\u0005\u0000\u0000\u0118-\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0007\u0006\u0000\u0000\u011a/\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0005,\u0000\u0000\u011c1\u0001\u0000\u0000\u0000"+
		"\u001a8>LWcsv}\u0083\u0089\u009f\u00ae\u00b4\u00b7\u00bd\u00c6\u00c9\u00da"+
		"\u00dd\u00e1\u00ef\u00f7\u00fc\u0100\u010d\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}