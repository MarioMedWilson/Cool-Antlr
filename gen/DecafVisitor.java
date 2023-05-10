// Generated from /Users/apple/IdeaProjects/Antlr_project_phase1-2_v4/src/Decaf.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DecafParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DecafVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#vardeclr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclr(DecafParser.VardeclrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#field_declr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_declr(DecafParser.Field_declrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#array_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id(DecafParser.Array_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#field_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_var(DecafParser.Field_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#var_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_id(DecafParser.Var_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#method_declr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declr(DecafParser.Method_declrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(DecafParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DecafParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DecafParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#method_call_inter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call_inter(DecafParser.Method_call_interContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(DecafParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DecafParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(DecafParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallout_arg(DecafParser.Callout_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(DecafParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(DecafParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(DecafParser.Eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(DecafParser.Cond_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DecafParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(DecafParser.Bin_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_op(DecafParser.Arith_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(DecafParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(DecafParser.Assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(DecafParser.Method_nameContext ctx);
}