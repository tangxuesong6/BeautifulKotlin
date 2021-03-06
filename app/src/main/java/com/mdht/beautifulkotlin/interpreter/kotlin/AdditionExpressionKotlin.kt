package com.mdht.beautifulkotlin.interpreter.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.interpreter.kotlin
 */
class AdditionExpressionKotlin(exp1: ArithmeticExpressionKotlin, exp2: ArithmeticExpressionKotlin) :
    OpretatorExpressionKotlin(exp1, exp2) {
    override fun interpret(): Int {
        return exp1.interpret() + exp2.interpret()

    }
}