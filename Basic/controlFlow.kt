package com.example.controlFlow
fun main() {
    checkNum(1)
}

fun maxBy2(a : Int, b : Int) = if (a > b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
    }

    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3       // else 문이 필수적으로 들어가야 한다.
    }

    println("b : ${b}")

    when(score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

//Expression 과 Statement 의 차이점
//Expression은 특정한 값을 반환하는 것이고, Statement 는 명령을 지시하는 것임.
//코틀린의 모든 함수는 Expression 으로 사용된다.
