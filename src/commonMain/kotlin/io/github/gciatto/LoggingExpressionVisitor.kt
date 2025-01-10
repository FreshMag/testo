package io.github.gciatto

import io.github.testo.parsers.generated.ExpressionBaseVisitor
import io.github.testo.parsers.generated.ExpressionParser

/**
 * A simple debug visitor to log the expression tree.
 */
class LoggingExpressionVisitor : ExpressionBaseVisitor<Unit>() {
    override fun defaultResult() {
        // do nothing
    }

    override fun visitCall(ctx: ExpressionParser.CallContext) {
        println("Visiting call ${ctx.text}")
        super.visitCall(ctx)
    }

    override fun visitModuleCall(ctx: ExpressionParser.ModuleCallContext) {
        println("Visiting module call ${ctx.text}")
        super.visitModuleCall(ctx)
    }

    override fun visitVariable(ctx: ExpressionParser.VariableContext) {
        println("Visiting variable ${ctx.text}")
        super.visitVariable(ctx)
    }

    override fun visitPlusExpr(ctx: ExpressionParser.PlusExprContext) {
        println("Visiting plus expression ${ctx.text}")
        super.visitPlusExpr(ctx)
    }

    override fun visitLiteral(ctx: ExpressionParser.LiteralContext) {
        println("Visiting literal ${ctx.text}")
        super.visitLiteral(ctx)
    }

    override fun visitMacroCall(ctx: ExpressionParser.MacroCallContext) {
        println("Visiting macro call ${ctx.text}")
        super.visitMacroCall(ctx)
    }

    override fun visitDotCall(ctx: ExpressionParser.DotCallContext) {
        println("Visiting dot call ${ctx.text}")
        super.visitDotCall(ctx)
    }
}
