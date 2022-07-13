package com.example.myapplication

fun main() {
    let()
}

fun nullCheck() {
    var name : String = "Lee"           // 기본적으로 null 값을 할당할 수 없다.
    var nullName : String? = null       // 그러나 자료형 뒤에 '?' 를 붙이게 된다면 null 값을 할당할 수 있다.

    var nameInUpperCase = name.uppercase()
    var nullNameInUpperCase = nullName?.uppercase()     // '?' 를 붙여서 null 타입인지 체크해줄 수 있다.

    // ?:
    val lastName : String? = null
    val fullName : String = name + (lastName?: "No lastName")

    println(fullName)
}

fun ignoreNulls(str : String?) {
    // !!
    // nullable 타입으로 지정되어 있지만, 이것이 null 이 아님을 보장해 줄 때 사용
    // 그러나 확실한 경우는 거의 없기에 지양해줘야 한다.

    val mNotNull : String = str!!
    val upper = mNotNull.uppercase()
}

fun let() {
    //val email : String? = "gustmd@naver.com"
    val email : String? = null

    // let
    // 만약 해당값이 null 이라면 다음 코드를 실행시키지 않는다.
    // null 값이 아니라면 실행시켜 준다.
    email?.let{
        println("my email is ${email}")
    }
}