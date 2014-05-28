// Generated from CreateTable.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreateTableLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, LEFT_PAREN=7, RIGHT_PAREN=8, 
		COMMA=9, SEMICOLON=10, DOT=11, NUMBER=12, DECIMAL=13, ID=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'not null'", "'table'", "'key'", "'create'", "'primary'", "'constraint'", 
		"'('", "')'", "','", "';'", "'.'", "NUMBER", "DECIMAL", "ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "LEFT_PAREN", "RIGHT_PAREN", 
		"COMMA", "SEMICOLON", "DOT", "NUMBER", "DECIMAL", "ID", "WS", "DIGIT"
	};


	public CreateTableLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CreateTable.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\6\r\\\n\r\r\r\16\r]\3\16\6\16a\n\16\r\16\16\16b\3\17\3\17\7\17"+
		"g\n\17\f\17\16\17j\13\17\6\17l\n\17\r\17\16\17m\3\20\6\20q\n\20\r\20\16"+
		"\20r\3\20\3\20\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\2\3\2\4\5\2C\\aac|\5\2\13\f\17"+
		"\17\"\"{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3#\3\2\2"+
		"\2\5,\3\2\2\2\7\62\3\2\2\2\t\66\3\2\2\2\13=\3\2\2\2\rE\3\2\2\2\17P\3\2"+
		"\2\2\21R\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31[\3\2\2\2\33`\3"+
		"\2\2\2\35k\3\2\2\2\37p\3\2\2\2!v\3\2\2\2#$\7p\2\2$%\7q\2\2%&\7v\2\2&\'"+
		"\7\"\2\2\'(\7p\2\2()\7w\2\2)*\7n\2\2*+\7n\2\2+\4\3\2\2\2,-\7v\2\2-.\7"+
		"c\2\2./\7d\2\2/\60\7n\2\2\60\61\7g\2\2\61\6\3\2\2\2\62\63\7m\2\2\63\64"+
		"\7g\2\2\64\65\7{\2\2\65\b\3\2\2\2\66\67\7e\2\2\678\7t\2\289\7g\2\29:\7"+
		"c\2\2:;\7v\2\2;<\7g\2\2<\n\3\2\2\2=>\7r\2\2>?\7t\2\2?@\7k\2\2@A\7o\2\2"+
		"AB\7c\2\2BC\7t\2\2CD\7{\2\2D\f\3\2\2\2EF\7e\2\2FG\7q\2\2GH\7p\2\2HI\7"+
		"u\2\2IJ\7v\2\2JK\7t\2\2KL\7c\2\2LM\7k\2\2MN\7p\2\2NO\7v\2\2O\16\3\2\2"+
		"\2PQ\7*\2\2Q\20\3\2\2\2RS\7+\2\2S\22\3\2\2\2TU\7.\2\2U\24\3\2\2\2VW\7"+
		"=\2\2W\26\3\2\2\2XY\7\60\2\2Y\30\3\2\2\2Z\\\5!\21\2[Z\3\2\2\2\\]\3\2\2"+
		"\2][\3\2\2\2]^\3\2\2\2^\32\3\2\2\2_a\5!\21\2`_\3\2\2\2ab\3\2\2\2b`\3\2"+
		"\2\2bc\3\2\2\2c\34\3\2\2\2dh\t\2\2\2eg\5!\21\2fe\3\2\2\2gj\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2kd\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3"+
		"\2\2\2n\36\3\2\2\2oq\t\3\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s"+
		"t\3\2\2\2tu\b\20\2\2u \3\2\2\2vw\4\62;\2w\"\3\2\2\2\b\2]bhmr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}