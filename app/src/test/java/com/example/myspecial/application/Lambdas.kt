package com.example.myspecial.application

import org.junit.Test

// класс
data class User(val name: String)

// объекты
val users = listOf(
    User(name = "Android"),
    User(name = "Learners"),
    User(name = "")
)

class LamdasTest {
    @Test
    fun lambdaWithType() {
        // TODO: create lambda variable
        // лямбда, объявленная с помощью переменной

        val filter: (User) -> Boolean = { it.name.isNotEmpty() }

        // встроенная функция фильтрации массива объектов
        // по тому, что возвращает лямбда
        val usersWithNames = users.filter(filter)

        println(usersWithNames)
    }

    @Test
    fun lambdaInlined() {
        // TODO: inline lambda
        // лямбда, объявленная встроенно, без переменной

        // фильтрация массива объектов по значению, возвращаемому лямбдой
        // val usersWithNoNames = users.filter( {it.name.isEmpty()} )

        // другая равнозначная запись без скобок
        val usersWithNoNames = users.filter { it.name.isEmpty() }


        println(usersWithNoNames)
    }
}