import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import freemarker.template.TemplateException;

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
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new TratamentoError()); // add ours
        //
        ParseTree tree = parser.tableList();
        ParseTreeWalker walker = new ParseTreeWalker();
        MyCreateTableListener listener = new MyCreateTableListener(parser);
        walker.walk(listener, tree);
                
		geraCodigo(listener.getTable());
	}

	private static void geraCodigo(Table table) throws TemplateException, IOException {
		Map map = new HashMap();
		map.put("tabela", table);

		gravaArquivoFisico("FD.CPY", FreemarkerUtils.parseTemplate(map, "FD.ftl"));
		gravaArquivoFisico("FileStatus.CPY", FreemarkerUtils.parseTemplate(map, "FileStatus.ftl"));
		gravaArquivoFisico("Select.CPY", FreemarkerUtils.parseTemplate(map, "Select.ftl"));
		gravaArquivoFisico("CRUD.CBL", FreemarkerUtils.parseTemplate(map, "CRUD.ftl"));
		gravaArquivoFisico("Open.CPY", FreemarkerUtils.parseTemplate(map, "Open.ftl"));
		gravaArquivoFisico("Create.CPY", FreemarkerUtils.parseTemplate(map, "Create.ftl"));
		gravaArquivoFisico("Read.CPY", FreemarkerUtils.parseTemplate(map, "Read.ftl"));
		gravaArquivoFisico("Update.CPY", FreemarkerUtils.parseTemplate(map, "Update.ftl"));
		gravaArquivoFisico("Delete.CPY", FreemarkerUtils.parseTemplate(map, "Delete.ftl"));
		gravaArquivoFisico("Close.CPY", FreemarkerUtils.parseTemplate(map, "Close.ftl"));
	}

	private static void gravaArquivoFisico(String nome, String conteudo) throws IOException {
		File arquivo = new File("C:\\TMP\\gerados\\" + nome);
		FileOutputStream fos = new FileOutputStream(arquivo);
		fos.write(conteudo.getBytes());
		fos.close();
	}
}
