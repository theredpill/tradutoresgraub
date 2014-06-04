// Generated from CreateTable.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CreateTableParser}.
 */
public interface CreateTableListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(@NotNull CreateTableParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(@NotNull CreateTableParser.SchemaContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(@NotNull CreateTableParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(@NotNull CreateTableParser.DataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(@NotNull CreateTableParser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(@NotNull CreateTableParser.ColumnDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void enterTableElementList(@NotNull CreateTableParser.TableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void exitTableElementList(@NotNull CreateTableParser.TableElementListContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#tablename}.
	 * @param ctx the parse tree
	 */
	void enterTablename(@NotNull CreateTableParser.TablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#tablename}.
	 * @param ctx the parse tree
	 */
	void exitTablename(@NotNull CreateTableParser.TablenameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#dataTypeDef}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeDef(@NotNull CreateTableParser.DataTypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#dataTypeDef}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeDef(@NotNull CreateTableParser.DataTypeDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(@NotNull CreateTableParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(@NotNull CreateTableParser.ColumnNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraint(@NotNull CreateTableParser.ColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraint(@NotNull CreateTableParser.ColumnConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(@NotNull CreateTableParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(@NotNull CreateTableParser.TableContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull CreateTableParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull CreateTableParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#lengthDef}.
	 * @param ctx the parse tree
	 */
	void enterLengthDef(@NotNull CreateTableParser.LengthDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#lengthDef}.
	 * @param ctx the parse tree
	 */
	void exitLengthDef(@NotNull CreateTableParser.LengthDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#tableDef}.
	 * @param ctx the parse tree
	 */
	void enterTableDef(@NotNull CreateTableParser.TableDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#tableDef}.
	 * @param ctx the parse tree
	 */
	void exitTableDef(@NotNull CreateTableParser.TableDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(@NotNull CreateTableParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(@NotNull CreateTableParser.TableConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link CreateTableParser#tableList}.
	 * @param ctx the parse tree
	 */
	void enterTableList(@NotNull CreateTableParser.TableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#tableList}.
	 * @param ctx the parse tree
	 */
	void exitTableList(@NotNull CreateTableParser.TableListContext ctx);
}