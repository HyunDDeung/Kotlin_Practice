package com.example.myapplication

fun main() {
    forAndWhile()
}

fun forAndWhile() {
    val students = arrayListOf("Lee", "Kim", "Hong", "Choi")

    // for 반복문의 여러 종류
    for(name in students) {
        println("${name}")
    }

    var sum : Int = 0
    for (i in 1..10 step 2) {       // 1, 3, 5, 7, 9
        sum += i
    }

    for (i in 10 downTo 1) {        // 10 9 8 ... 1 까지
        sum += i
    }

    for (i in 1 until 100) {       // 1 .. 99 까지
        sum += i
    }

    println(sum)

    // while 문
    var index = 0
    while (index < 10) {
        println("current index = ${index}")
        index++
    }

    // 인덱스의 위치와 name읠 함께 사용하고 싶은 경우
    for ((index, name) in students.withIndex()) {
        println("${index+1}번쨰 학생 : ${name}")
    }
}