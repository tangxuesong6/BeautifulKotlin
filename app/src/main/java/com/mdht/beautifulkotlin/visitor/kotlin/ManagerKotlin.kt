package com.mdht.beautifulkotlin.visitor.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.visitor.kotlin
 */
class ManagerKotlin(name: String) : StaffKotlin(name) {
    var product: Int

    init {
        product = java.util.Random().nextInt(10 * 10000)
    }

    override fun accept(visitorKotlin: VisitorKotlin) {
        visitorKotlin.visit(this)
    }
}