package com.example.myspecial.application

import org.junit.Test

class VariablesTest {

    @Test
    fun readOnly() {
        val flavor = "Vanilla"

        // TODO: change the flavor
        // flavor = "Mint"
        // val не может быть изменено
        println(flavor)
    }

    @Test
    fun mutable() {
        var flavor = "Vanilla"

        // TODO: change the flavor
        flavor = "Mint"
        println(flavor)
        // var может быть изменено
    }

}