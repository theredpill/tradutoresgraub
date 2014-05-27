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
        System.out.println("Foi!!!!");
        System.out.println(listener.column.getName());
        
        
//        List<Table> tables = (List<Table>) parser.tableList().tables;
//        for (Table table : tables) {
//			System.out.println("Tabela: " + table.getName());
//			
//			List<Column> cols = table.getColumns();
//			for (Column column : cols) {
//				System.out.println("	Nome Coluna: " + column.getName());
//				System.out.println("	Datatype...: " + column.getDataType());
//				System.out.println("	Tamanho....: " + column.getLength());
//				System.out.println("	Constraint.: " + column.getConstraint());
//			}
//			
//		}
//        Table table = tables.get(0);
//        objectToCobolFD(table);
//        
        
        //System.out.println(tree.toStringTree(parser)); // print LISP-style tree

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
