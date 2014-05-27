
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class MyCreateTableListener extends CreateTableBaseListener {
	
	private Table table;
	
	public Column column;
	
	private CreateTableParser parser;
	

	public MyCreateTableListener(CreateTableParser parser) {
		super();
		this.parser = parser;
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
		// TODO Auto-generated method stub
		super.exitTableConstraint(ctx);
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
		
		System.out.println("Entrou na tabela " + ctx.getText());
		
	}

	@Override
	public void exitTableDef(CreateTableParser.TableDefContext ctx) {
		System.out.println("Saiu tabela " + ctx.getText());
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
		// TODO Auto-generated method stub
		super.enterColumnDef(ctx);
	}

	@Override
	public void exitColumnDef(CreateTableParser.ColumnDefContext ctx) {
		// TODO Auto-generated method stub
		
		System.out.println(ctx.columnName().getText());
		System.out.println(ctx.dataTypeDef().dataType().getText());
		if (ctx.dataTypeDef().lengthDef() != null)
		System.out.println(ctx.dataTypeDef().lengthDef().NUMBER().getText());
		this.column =  new Column("teste", "teste", "teste", 999);
	}

	@Override
	public void enterTablename(CreateTableParser.TablenameContext ctx) {
		// TODO Auto-generated method stub
		super.enterTablename(ctx);
	}

	@Override
	public void exitTablename(CreateTableParser.TablenameContext ctx) {
		// TODO Auto-generated method stub
		super.exitTablename(ctx);
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
