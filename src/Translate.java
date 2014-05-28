// import ANTLR's runtime libraries
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Translate {

	public static void main(String[] args) throws Exception {
		
		String inputFile = null;
		if ( args.length>0 ) inputFile = args[0];
		InputStream is = System.in;
		if ( inputFile!=null ) {
			is = new FileInputStream(inputFile);
		}
		
		// create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(is);
        // create a lexer that feeds off of input CharStream
        CreateTableLexer lexer = new CreateTableLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        CreateTableParser parser = new CreateTableParser(tokens);
        //
        ParseTree tree = parser.tableList();
        ParseTreeWalker walker = new ParseTreeWalker();
        MyCreateTableListener listener = new MyCreateTableListener(parser);
        walker.walk(listener, tree);
                
		Table table = listener.getTable();
		List<Column> cols = table.getColumns();
		for (Column column : cols) {
			System.out.println("	Nome Coluna: " + column.getName());
			System.out.println("	É chave....: " + column.isKey());
			System.out.println("	Datatype...: " + column.getDataType());
			System.out.println("	Tamanho int: " + column.getLengthInteger());
			System.out.println("	Tamanho dec: " + column.getLengthDecimal());
			System.out.println("	Constraint.: " + column.getConstraint());
		}

	}

	public static void objectToCobolFD(Table table){
		//Imprime cabeçalho da FD;
		System.out.println("FD\t" + table.getName() + " RECORD CONTAINS " + "999" + " CHARACTERS.");
		System.out.println("01  REGISTRO");
		List<Column> cols = table.getColumns();
		for (Column column : cols) {
			System.out.println("   10 " + column.getName());			
		}	
	}
}
