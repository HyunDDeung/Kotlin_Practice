package com.example.controlflow

fun main() {
    helloWorld()
}

// 1. 함수
fun helloWorld() {
    println("Hello World!")
}

// 리턴값이 없는 경우는 자료형을 생략해도 되지만, 무언가를 리턴하는 경우는 자료형을 꼭 붙여줘야 한다.
fun add(a : Int, b : Int) : Int {
    return a + b
}