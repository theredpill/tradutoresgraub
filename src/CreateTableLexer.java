// Generated from CreateTable.g4 by ANTLR 4.2.2

import java.util.ArrayList;
import java.util.List;

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
		T__2=1, T__1=2, T__0=3, LEFT_PAREN=4, RIGHT_PAREN=5, COMMA=6, SEMICOLON=7, 
		DOT=8, NUMBER=9, DECIMAL=10, ID=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'table'", "'create'", "'TODO:COMPLETAR'", "'('", "')'", "','", "';'", 
		"'.'", "NUMBER", "DECIMAL", "ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "SEMICOLON", 
		"DOT", "NUMBER", "DECIMAL", "ID", "WS", "DIGIT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16a\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\nE\n\n\r\n\16\nF\3\13"+
		"\6\13J\n\13\r\13\16\13K\3\f\3\f\7\fP\n\f\f\f\16\fS\13\f\6\fU\n\f\r\f\16"+
		"\fV\3\r\6\rZ\n\r\r\r\16\r[\3\r\3\r\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\3\2\4\5\2C\\aac|\5\2\13\f"+
		"\17\17\"\"d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\3\35\3\2\2\2\5#\3\2\2\2\7*\3\2\2\2\t9\3\2\2\2\13"+
		";\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23D\3\2\2\2\25I\3\2\2\2\27"+
		"T\3\2\2\2\31Y\3\2\2\2\33_\3\2\2\2\35\36\7v\2\2\36\37\7c\2\2\37 \7d\2\2"+
		" !\7n\2\2!\"\7g\2\2\"\4\3\2\2\2#$\7e\2\2$%\7t\2\2%&\7g\2\2&\'\7c\2\2\'"+
		"(\7v\2\2()\7g\2\2)\6\3\2\2\2*+\7V\2\2+,\7Q\2\2,-\7F\2\2-.\7Q\2\2./\7<"+
		"\2\2/\60\7E\2\2\60\61\7Q\2\2\61\62\7O\2\2\62\63\7R\2\2\63\64\7N\2\2\64"+
		"\65\7G\2\2\65\66\7V\2\2\66\67\7C\2\2\678\7T\2\28\b\3\2\2\29:\7*\2\2:\n"+
		"\3\2\2\2;<\7+\2\2<\f\3\2\2\2=>\7.\2\2>\16\3\2\2\2?@\7=\2\2@\20\3\2\2\2"+
		"AB\7\60\2\2B\22\3\2\2\2CE\5\33\16\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3"+
		"\2\2\2G\24\3\2\2\2HJ\5\33\16\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2"+
		"L\26\3\2\2\2MQ\t\2\2\2NP\5\33\16\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2"+
		"\2\2RU\3\2\2\2SQ\3\2\2\2TM\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\30\3"+
		"\2\2\2XZ\t\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]"+
		"^\b\r\2\2^\32\3\2\2\2_`\4\62;\2`\34\3\2\2\2\b\2FKQV[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}