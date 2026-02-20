package com.example.myspecial.application

import org.junit.Test
import java.lang.NumberFormatException

fun isEven(a: Int): String {
    /* // Длинная запись
    return if (a % 2 == 0) {
        "it's even"
    } else {
        "it's odd"
    }
    */
    // Короткая запись
    return if (a % 2 == 0) "it's even" else "it's odd"
}

fun stringToInt(x: String): Int {
    return try {
        x.toInt()
    } catch(e: NumberFormatException) {
        0
    }
}

class ExpressionsTest {

    @Test
    fun ifAsExpression() {
        // TODO: print the results of the isEven function with `2`
        println(isEven(2))
        // it's even

        // TODO: print the results of the isEven function with `3`
        println(isEven(3))
        // it's odd
    }

    @Test
    fun tryCatchAsExpression() {
        // TODO: print the results of the stringToInt function with `"2"`
        println(stringToInt("2"))
        // 2

        // TODO: print the results of the stringToInt function with `"cake"`
        println(stringToInt("cake"))
        // 0 - сработало исключение
    }

}