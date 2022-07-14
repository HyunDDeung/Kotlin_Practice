package com.example.myapplication

// Lambda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수 있다. fun maxBuy(a : Int)
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본 정의
// val lambdaName : Type = {argumentsList -> codeBody}

// input이 Int형, Output이 Int형으로 설정.

// input을 Int형으로 선언하였기에 number은 int형으로 타입추론이 가능하다.
val square : (Int) -> (Int) = {number -> number * number}
// 혹은 다음과 같이 선언 가능하다.
val square2 = {number : Int -> number * number}

val nameAge = { name: String, age: Int ->
    "my name is ${name} I'm ${age}"
}

fun main() {
    println(square(12))
    println(nameAge("Lee", 23))

    val temp = "Lee said"
    println(temp.pizzaIsGreat())

    println(extendString("LHS", 23))


    // 다양한 람다 표현식
    val lambda :(Double) -> Boolean = { number : Double ->
        number == 4.3213
    }
    println(invokeLambda(lambda))

    println(invokeLambda({it > 3.22}))

    // 마지막 Parameter가 람다식일 때 이런 방식으로 사용 가능
    println(invokeLambda(){it > 3.22})      // 이 때의 'it'은 input이 하나 일때, 그 값을 의미함

}

// 확장 함수

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String {
    // this 는 이 확장함수의 값. 즉 name 을 의미하고
    // it 은 이 Int 값을 의미한다.
    // input parameter가 Int 단 하나뿐이기에 그냥 it으로 사용한다.
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

// 람다의 Return
// Input값은 값이 여러개일 수도 있으므로 소괄호를 이용하여 묶어줘야 햠.
// Output값은 오직 하나이므로 괄호를 이용하여 묶어주지 않아도 됨
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"     // else 값은 필수적으로 사용해야 된다.
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLambda(lambda : (Double) -> Boolean) : Boolean {
    return lambda(5.2343)
}