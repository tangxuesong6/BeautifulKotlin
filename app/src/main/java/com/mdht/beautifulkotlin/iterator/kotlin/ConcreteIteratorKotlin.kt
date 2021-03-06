package com.mdht.beautifulkotlin.iterator.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.iterator.kotlin
 */
class ConcreteIteratorKotlin<out T>(val list: List<T>) : IteratorKotlin<T> {
    private var cursor: Int = 0
    override fun hasNext(): Boolean {
        return cursor != list.size
    }

    override fun next(): T? {
        var obj: T? = null
        if (this.hasNext()) {
            obj = list[cursor++]
        }
        return obj
    }
}