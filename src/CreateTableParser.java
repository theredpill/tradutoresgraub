// Generated from CreateTable.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreateTableParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, STRING=8, LEFT_PAREN=9, 
		RIGHT_PAREN=10, COMMA=11, SEMICOLON=12, DOT=13, NUMBER=14, DECIMAL=15, 
		ID=16, WS=17;
	public static final String[] tokenNames = {
		"<INVALID>", "'not null'", "'table'", "'key'", "'create'", "'primary'", 
		"'constraint'", "'comment'", "STRING", "'('", "')'", "','", "';'", "'.'", 
		"NUMBER", "DECIMAL", "ID", "WS"
	};
	public static final int
		RULE_tableList = 0, RULE_tableDef = 1, RULE_tablename = 2, RULE_tableElementList = 3, 
		RULE_columnDef = 4, RULE_dataTypeDef = 5, RULE_dataType = 6, RULE_lengthDef = 7, 
		RULE_comment = 8, RULE_tableConstraint = 9, RULE_columnConstraint = 10, 
		RULE_schema = 11, RULE_table = 12, RULE_columnName = 13;
	public static final String[] ruleNames = {
		"tableList", "tableDef", "tablename", "tableElementList", "columnDef", 
		"dataTypeDef", "dataType", "lengthDef", "comment", "tableConstraint", 
		"columnConstraint", "schema", "table", "columnName"
	};

	@Override
	public String getGrammarFileName() { return "CreateTable.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CreateTableParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TableListContext extends ParserRuleContext {
		public List<TableDefContext> tableDef() {
			return getRuleContexts(TableDefContext.class);
		}
		public TableDefContext tableDef(int i) {
			return getRuleContext(TableDefContext.class,i);
		}
		public TableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTableList(this);
		}
	}

	public final TableListContext tableList() throws RecognitionException {
		TableListContext _localctx = new TableListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(28); tableDef();
				}
				}
				setState(33);
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

	public static class TableDefContext extends ParserRuleContext {
		public TableElementListContext tableElementList() {
			return getRuleContext(TableElementListContext.class,0);
		}
		public TablenameContext tablename() {
			return getRuleContext(TablenameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CreateTableParser.SEMICOLON, 0); }
		public TableDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTableDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTableDef(this);
		}
	}

	public final TableDefContext tableDef() throws RecognitionException {
		TableDefContext _localctx = new TableDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tableDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(4);
			setState(35); match(2);
			setState(36); tablename();
			setState(37); tableElementList();
			setState(38); match(SEMICOLON);
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

	public static class TablenameContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CreateTableParser.DOT, 0); }
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public TablenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTablename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTablename(this);
		}
	}

	public final TablenameContext tablename() throws RecognitionException {
		TablenameContext _localctx = new TablenameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tablename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(40); schema();
				setState(41); match(DOT);
				}
				break;
			}
			setState(45); table();
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

	public static class TableElementListContext extends ParserRuleContext {
		public ColumnDefContext columnDef(int i) {
			return getRuleContext(ColumnDefContext.class,i);
		}
		public List<TableConstraintContext> tableConstraint() {
			return getRuleContexts(TableConstraintContext.class);
		}
		public TableConstraintContext tableConstraint(int i) {
			return getRuleContext(TableConstraintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CreateTableParser.COMMA); }
		public List<ColumnDefContext> columnDef() {
			return getRuleContexts(ColumnDefContext.class);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(CreateTableParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(CreateTableParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(CreateTableParser.COMMA, i);
		}
		public TableElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTableElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTableElementList(this);
		}
	}

	public final TableElementListContext tableElementList() throws RecognitionException {
		TableElementListContext _localctx = new TableElementListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tableElementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(LEFT_PAREN);
			setState(48); columnDef();
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49); match(COMMA);
					setState(50); columnDef();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(56); match(COMMA);
				setState(57); tableConstraint();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(RIGHT_PAREN);
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

	public static class ColumnDefContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeDefContext dataTypeDef() {
			return getRuleContext(DataTypeDefContext.class,0);
		}
		public ColumnConstraintContext columnConstraint() {
			return getRuleContext(ColumnConstraintContext.class,0);
		}
		public ColumnDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterColumnDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitColumnDef(this);
		}
	}

	public final ColumnDefContext columnDef() throws RecognitionException {
		ColumnDefContext _localctx = new ColumnDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columnDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); columnName();
			setState(67);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(66); dataTypeDef();
				}
			}

			setState(70);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(69); columnConstraint();
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

	public static class DataTypeDefContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public LengthDefContext lengthDef() {
			return getRuleContext(LengthDefContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DataTypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterDataTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitDataTypeDef(this);
		}
	}

	public final DataTypeDefContext dataTypeDef() throws RecognitionException {
		DataTypeDefContext _localctx = new DataTypeDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dataTypeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); dataType();
			setState(74);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(73); lengthDef();
				}
			}

			setState(77);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(76); comment();
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CreateTableParser.ID, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(ID);
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

	public static class LengthDefContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CreateTableParser.COMMA, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(CreateTableParser.NUMBER, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(CreateTableParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(CreateTableParser.NUMBER); }
		public TerminalNode LEFT_PAREN() { return getToken(CreateTableParser.LEFT_PAREN, 0); }
		public LengthDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterLengthDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitLengthDef(this);
		}
	}

	public final LengthDefContext lengthDef() throws RecognitionException {
		LengthDefContext _localctx = new LengthDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lengthDef);
		try {
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(LEFT_PAREN);
				setState(82); match(NUMBER);
				setState(83); match(RIGHT_PAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); match(LEFT_PAREN);
				setState(85); match(NUMBER);
				setState(86); match(COMMA);
				setState(87); match(NUMBER);
				setState(88); match(RIGHT_PAREN);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CreateTableParser.STRING, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(7);
			setState(92); match(STRING);
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

	public static class TableConstraintContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(CreateTableParser.ID, 0); }
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTableConstraint(this);
		}
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(94); match(6);
				setState(95); match(ID);
				}
			}

			setState(98); match(5);
			setState(99); match(3);
			setState(100); match(LEFT_PAREN);
			setState(101); columnName();
			setState(102); match(RIGHT_PAREN);
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

	public static class ColumnConstraintContext extends ParserRuleContext {
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterColumnConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitColumnConstraint(this);
		}
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_columnConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(1);
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

	public static class SchemaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CreateTableParser.ID, 0); }
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitSchema(this);
		}
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(ID);
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

	public static class TableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CreateTableParser.ID, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(ID);
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

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CreateTableParser.ID, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitColumnName(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23s\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4.\n\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\66\n"+
		"\5\f\5\16\59\13\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\5\3\5\3\6\3\6\5\6"+
		"F\n\6\3\6\5\6I\n\6\3\7\3\7\5\7M\n\7\3\7\5\7P\n\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\13\3\13\5\13c\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2n\2!\3\2\2\2\4$\3\2\2\2\6-\3\2\2"+
		"\2\b\61\3\2\2\2\nC\3\2\2\2\fJ\3\2\2\2\16Q\3\2\2\2\20[\3\2\2\2\22]\3\2"+
		"\2\2\24b\3\2\2\2\26j\3\2\2\2\30l\3\2\2\2\32n\3\2\2\2\34p\3\2\2\2\36 \5"+
		"\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#!\3"+
		"\2\2\2$%\7\6\2\2%&\7\4\2\2&\'\5\6\4\2\'(\5\b\5\2()\7\16\2\2)\5\3\2\2\2"+
		"*+\5\30\r\2+,\7\17\2\2,.\3\2\2\2-*\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\5\32"+
		"\16\2\60\7\3\2\2\2\61\62\7\13\2\2\62\67\5\n\6\2\63\64\7\r\2\2\64\66\5"+
		"\n\6\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28>\3\2\2\29"+
		"\67\3\2\2\2:;\7\r\2\2;=\5\24\13\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2"+
		"\2\2?A\3\2\2\2@>\3\2\2\2AB\7\f\2\2B\t\3\2\2\2CE\5\34\17\2DF\5\f\7\2ED"+
		"\3\2\2\2EF\3\2\2\2FH\3\2\2\2GI\5\26\f\2HG\3\2\2\2HI\3\2\2\2I\13\3\2\2"+
		"\2JL\5\16\b\2KM\5\20\t\2LK\3\2\2\2LM\3\2\2\2MO\3\2\2\2NP\5\22\n\2ON\3"+
		"\2\2\2OP\3\2\2\2P\r\3\2\2\2QR\7\22\2\2R\17\3\2\2\2ST\7\13\2\2TU\7\20\2"+
		"\2U\\\7\f\2\2VW\7\13\2\2WX\7\20\2\2XY\7\r\2\2YZ\7\20\2\2Z\\\7\f\2\2[S"+
		"\3\2\2\2[V\3\2\2\2\\\21\3\2\2\2]^\7\t\2\2^_\7\n\2\2_\23\3\2\2\2`a\7\b"+
		"\2\2ac\7\22\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\7\2\2ef\7\5\2\2fg\7"+
		"\13\2\2gh\5\34\17\2hi\7\f\2\2i\25\3\2\2\2jk\7\3\2\2k\27\3\2\2\2lm\7\22"+
		"\2\2m\31\3\2\2\2no\7\22\2\2o\33\3\2\2\2pq\7\22\2\2q\35\3\2\2\2\f!-\67"+
		">EHLO[b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}