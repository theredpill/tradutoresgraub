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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, STRING=8, LEFT_PAREN=9, 
		RIGHT_PAREN=10, COMMA=11, SEMICOLON=12, DOT=13, NUMBER=14, DECIMAL=15, 
		ID=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'not null'", "'table'", "'key'", "'create'", "'primary'", "'constraint'", 
		"'comment'", "STRING", "'('", "')'", "','", "';'", "'.'", "NUMBER", "DECIMAL", 
		"ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "STRING", "LEFT_PAREN", 
		"RIGHT_PAREN", "COMMA", "SEMICOLON", "DOT", "NUMBER", "DECIMAL", "ID", 
		"WS", "DIGIT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\ta\n\t\f\t\16\td\13\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17s\n\17\r\17\16\17t\3"+
		"\20\6\20x\n\20\r\20\16\20y\3\21\3\21\7\21~\n\21\f\21\16\21\u0081\13\21"+
		"\6\21\u0083\n\21\r\21\16\21\u0084\3\22\6\22\u0088\n\22\r\22\16\22\u0089"+
		"\3\22\3\22\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\3\2\5\3\2))\5\2C\\aac|\5\2"+
		"\13\f\17\17\"\"\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\3\'\3\2\2\2\5\60\3\2\2\2\7\66\3\2\2\2\t:\3"+
		"\2\2\2\13A\3\2\2\2\rI\3\2\2\2\17T\3\2\2\2\21\\\3\2\2\2\23g\3\2\2\2\25"+
		"i\3\2\2\2\27k\3\2\2\2\31m\3\2\2\2\33o\3\2\2\2\35r\3\2\2\2\37w\3\2\2\2"+
		"!\u0082\3\2\2\2#\u0087\3\2\2\2%\u008d\3\2\2\2\'(\7p\2\2()\7q\2\2)*\7v"+
		"\2\2*+\7\"\2\2+,\7p\2\2,-\7w\2\2-.\7n\2\2./\7n\2\2/\4\3\2\2\2\60\61\7"+
		"v\2\2\61\62\7c\2\2\62\63\7d\2\2\63\64\7n\2\2\64\65\7g\2\2\65\6\3\2\2\2"+
		"\66\67\7m\2\2\678\7g\2\289\7{\2\29\b\3\2\2\2:;\7e\2\2;<\7t\2\2<=\7g\2"+
		"\2=>\7c\2\2>?\7v\2\2?@\7g\2\2@\n\3\2\2\2AB\7r\2\2BC\7t\2\2CD\7k\2\2DE"+
		"\7o\2\2EF\7c\2\2FG\7t\2\2GH\7{\2\2H\f\3\2\2\2IJ\7e\2\2JK\7q\2\2KL\7p\2"+
		"\2LM\7u\2\2MN\7v\2\2NO\7t\2\2OP\7c\2\2PQ\7k\2\2QR\7p\2\2RS\7v\2\2S\16"+
		"\3\2\2\2TU\7e\2\2UV\7q\2\2VW\7o\2\2WX\7o\2\2XY\7g\2\2YZ\7p\2\2Z[\7v\2"+
		"\2[\20\3\2\2\2\\b\7)\2\2]a\n\2\2\2^_\7)\2\2_a\7)\2\2`]\3\2\2\2`^\3\2\2"+
		"\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7)\2\2f\22\3\2"+
		"\2\2gh\7*\2\2h\24\3\2\2\2ij\7+\2\2j\26\3\2\2\2kl\7.\2\2l\30\3\2\2\2mn"+
		"\7=\2\2n\32\3\2\2\2op\7\60\2\2p\34\3\2\2\2qs\5%\23\2rq\3\2\2\2st\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2u\36\3\2\2\2vx\5%\23\2wv\3\2\2\2xy\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z \3\2\2\2{\177\t\3\2\2|~\5%\23\2}|\3\2\2\2~\u0081\3\2\2"+
		"\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082{\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\"\3\2\2\2\u0086\u0088\t\4\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\b\22\2\2\u008c$\3\2\2\2\u008d\u008e\4\62;\2\u008e&\3"+
		"\2\2\2\n\2`bty\177\u0084\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}