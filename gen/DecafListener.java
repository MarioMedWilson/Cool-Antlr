// Generated from /Users/apple/IdeaProjects/Antlr_project_phase1-2_v4/src/Decaf.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#vardeclr}.
	 * @param ctx the parse tree
	 */
	void enterVardeclr(DecafParser.VardeclrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#vardeclr}.
	 * @param ctx the parse tree
	 */
	void exitVardeclr(DecafParser.VardeclrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#field_declr}.
	 * @param ctx the parse tree
	 */
	void enterField_declr(DecafParser.Field_declrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#field_declr}.
	 * @param ctx the parse tree
	 */
	void exitField_declr(DecafParser.Field_declrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#array_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_id(DecafParser.Array_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#array_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_id(DecafParser.Array_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#field_var}.
	 * @param ctx the parse tree
	 */
	void enterField_var(DecafParser.Field_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#field_var}.
	 * @param ctx the parse tree
	 */
	void exitField_var(DecafParser.Field_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#var_id}.
	 * @param ctx the parse tree
	 */
	void enterVar_id(DecafParser.Var_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#var_id}.
	 * @param ctx the parse tree
	 */
	void exitVar_id(DecafParser.Var_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_declr}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declr(DecafParser.Method_declrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_declr}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declr(DecafParser.Method_declrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(DecafParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(DecafParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DecafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DecafParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DecafParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DecafParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_call_inter}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call_inter(DecafParser.Method_call_interContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_call_inter}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call_inter(DecafParser.Method_call_interContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(DecafParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(DecafParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DecafParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DecafParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(DecafParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(DecafParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(DecafParser.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(DecafParser.Callout_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(DecafParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(DecafParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(DecafParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(DecafParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(DecafParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(DecafParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(DecafParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(DecafParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DecafParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DecafParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(DecafParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(DecafParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(DecafParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(DecafParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(DecafParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(DecafParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(DecafParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(DecafParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(DecafParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(DecafParser.Method_nameContext ctx);
}