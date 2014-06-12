
import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class MyCreateTableListener extends CreateTableBaseListener {
	
	private Table table;
	
	private Column column;
	
	private CreateTableParser parser;
	

	public MyCreateTableListener(CreateTableParser parser) {
		super();
		this.parser = parser;
	}
	
	public Table getTable() {
		// Calcular tamanho da tabela (utilizado na FD do Cobol)
		int tamanho = 0;
		for (Column column : table.getColumns()) {
			if (column.getDataType().equals("DATE")){
				// ddmmaaaa
				column.setLengthInteger(10);
			} 
			else if (column.getDataType().equals("DATETIME")){
				column.setLengthInteger(16);
			}  
			tamanho = tamanho + column.getLengthInteger();			
			if (column.getDataType().equals("VARCHAR")||column.getDataType().equals("CHAR")){
				column.setPic("X");
			} else {
				column.setPic("9");
			}			
		}
		this.table.setLength(tamanho);
		return this.table;
	}

	@Override
	public void enterSchema(CreateTableParser.SchemaContext ctx) {
		// TODO Auto-generated method stub
		super.enterSchema(ctx);
	}

	@Override
	public void exitSchema(CreateTableParser.SchemaContext ctx) {
		// TODO Auto-generated method stub
		super.exitSchema(ctx);
	}

	@Override
	public void enterLengthDef(CreateTableParser.LengthDefContext ctx) {
		// TODO Auto-generated method stub
		super.enterLengthDef(ctx);
	}

	@Override
	public void exitLengthDef(CreateTableParser.LengthDefContext ctx) {
		// TODO Auto-generated method stub
		super.exitLengthDef(ctx);
	}

	@Override
	public void enterDataType(CreateTableParser.DataTypeContext ctx) {
		// TODO Auto-generated method stub
		super.enterDataType(ctx);
	}

	@Override
	public void exitDataType(CreateTableParser.DataTypeContext ctx) {
		// TODO Auto-generated method stub
		super.exitDataType(ctx);
	}

	@Override
	public void enterTableConstraint(CreateTableParser.TableConstraintContext ctx) {
		// TODO Auto-generated method stub
		super.enterTableConstraint(ctx);
	}

	@Override
	public void exitTableConstraint(CreateTableParser.TableConstraintContext ctx) {
		String nameColumn = ctx.columnName().getText();
		List<Column> columns = this.table.getColumns();
		for (Column column : columns) {
			// Se encontrou a coluna da chave na lista de colunas
			if (column.getName().equals(nameColumn)){
				column.setKey(true);
				break;
			}
		}
	}

	@Override
	public void enterColumnConstraint(CreateTableParser.ColumnConstraintContext ctx) {
		// TODO Auto-generated method stub
		super.enterColumnConstraint(ctx);
	}

	@Override
	public void exitColumnConstraint(CreateTableParser.ColumnConstraintContext ctx) {
		// TODO Auto-generated method stub
		super.exitColumnConstraint(ctx);
	}

	@Override
	public void enterTableDef(CreateTableParser.TableDefContext ctx) {
		//Cria uma nova tabela
		this.table = new Table();		
	}

	@Override
	public void exitTableDef(CreateTableParser.TableDefContext ctx) {
		
	}

	@Override
	public void enterTableList(CreateTableParser.TableListContext ctx) {
		// TODO Auto-generated method stub
		super.enterTableList(ctx);
	}

	@Override
	public void exitTableList(CreateTableParser.TableListContext ctx) {
		// TODO Auto-generated method stub
		super.exitTableList(ctx);
	}

	@Override
	public void enterColumnDef(CreateTableParser.ColumnDefContext ctx) {
	}

	@Override
	public void exitColumnDef(CreateTableParser.ColumnDefContext ctx) {
		//Cria uma nova coluna
		this.column = new Column();		
	    if (ctx.columnName().getText().contains("-")) {
	    	System.out.println("Encontrado '_' no campo " + ctx.columnName().getText() + ", Será substituído por '-'");
	    }
	    //O caracter _ é inválido na linguagem, será trocado por "-"
		this.column.setName(ctx.columnName().getText().replace("_", "-"));
		//Valida o tamanho do campo, que de acordo com o COBOL, não pode ultrapassar 32 caracteres
		if (this.column.getName().length() > 32) {
			parser.notifyErrorListeners("Campo '" + this.column.getName() + "' ultrapassa número de caracteres permitidos pela linguagem, fixado em 32. Tamanho do campo: " + this.column.getName().length());
		}
		validaDataType(ctx.dataTypeDef().dataType().getText());
		this.column.setDataType(ctx.dataTypeDef().dataType().getText());
		if (ctx.dataTypeDef().lengthDef() != null){
			Integer num = Integer.parseInt(ctx.dataTypeDef().lengthDef().NUMBER(0).getText());
			this.column.setLengthInteger(num);		
			// Se o segundo número foi detectado, trata-se da parte decimal
			if (ctx.dataTypeDef().lengthDef().NUMBER(1) != null){
				num = Integer.parseInt(ctx.dataTypeDef().lengthDef().NUMBER(1).getText());
				this.column.setLengthDecimal(num);
			}
		}	
		if (ctx.dataTypeDef().comment() != null){
			this.column.setComment(ctx.dataTypeDef().comment().STRING().getText());;
		}
		
		this.table.addColumn(this.column);		
	}

	private void validaDataType(String text) {
		
		switch (text.toUpperCase()) {
			case "VARCHAR":
				break;
			case "DECIMAL":
				break;
			case "DATETIME":
				break;
			case "DATE":
				break;
			case "CHAR":
				break;
			case "NUMERIC":
				break;
			default:
				parser.notifyErrorListeners("Tipo de dado '"
						+ text
						+ "' não reconhecido pela gramática. Verificar tipos de dados suportados");
				break;
		}
		
	}

	@Override
	public void enterTablename(CreateTableParser.TablenameContext ctx) {
		// TODO Auto-generated method stub
		super.enterTablename(ctx);
	}

	@Override
	public void exitTablename(CreateTableParser.TablenameContext ctx) {
		// Define o nome da tabela
		this.table.setName(ctx.table().getText());		
	}

	@Override
	public void enterDataTypeDef(CreateTableParser.DataTypeDefContext ctx) {
		// TODO Auto-generated method stub
		super.enterDataTypeDef(ctx);
	}

	@Override
	public void exitDataTypeDef(CreateTableParser.DataTypeDefContext ctx) {
		// TODO Auto-generated method stub
		super.exitDataTypeDef(ctx);
	}

	@Override
	public void enterTableElementList(CreateTableParser.TableElementListContext ctx) {
		// TODO Auto-generated method stub
		super.enterTableElementList(ctx);
	}

	@Override
	public void exitTableElementList(CreateTableParser.TableElementListContext ctx) {
		// TODO Auto-generated method stub
		super.exitTableElementList(ctx);
	}

	@Override
	public void enterTable(CreateTableParser.TableContext ctx) {
		// TODO Auto-generated method stub
		super.enterTable(ctx);
	}

	@Override
	public void exitTable(CreateTableParser.TableContext ctx) {
		// TODO Auto-generated method stub
		super.exitTable(ctx);
	}

	@Override
	public void enterComment(CreateTableParser.CommentContext ctx) {
		// TODO Auto-generated method stub
		super.enterComment(ctx);
	}

	@Override
	public void exitComment(CreateTableParser.CommentContext ctx) {
		// TODO Auto-generated method stub		
		super.exitComment(ctx);
	}

	@Override
	public void enterColumnName(CreateTableParser.ColumnNameContext ctx) {
		// TODO Auto-generated method stub
		super.enterColumnName(ctx);
	}

	@Override
	public void exitColumnName(CreateTableParser.ColumnNameContext ctx) {
		// TODO Auto-generated method stub
		super.exitColumnName(ctx);
	}


	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		super.visitTerminal(node);
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		super.visitErrorNode(node);
	}
	
	
	
	

}
