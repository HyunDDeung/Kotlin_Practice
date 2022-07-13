package com.example.myapplication

// name property 값을 줌과 동시에 default 값 또한 줄 수 있다.
open class Human(val name : String = "Anonymous") {
    // 주 생성자이므로 먼저 생성되고 먼저 실행된다.
    init{
        println("New human has been born!!")
    }
    // 부 생성자
    constructor(name : String, age : Int) : this(name) {
        println("My name is ${name}, ${age}years old")
    }

    val names = "Lee"
    fun eatingCake() {
        println("I Love Cake")
    }

    open fun singAsong() {
        println("lalala")
    }
}

// 기본적으로 코틀린의 class는 final이다.
class Korean : Human() {
    override fun singAsong() {
        super.singAsong()
        println("라라라")
    }
}


fun main() {
//    val human = Human("Lee")
//    human.eatingCake()
//    val person = Human("Kim", 23)
    val korean = Korean()
    korean.singAsong()
}