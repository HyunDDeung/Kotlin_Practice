package com.example.myapplication

// companion object
// 정적인 static 메소드를 선언할 때 사용된다.

class Book private constructor(val id:Int, val name:String) {

    companion object BookFactory : IdProvider{       // 메소드의 이름은 따로 정할 수 있다. 정하지 않으면 Companion이 default로 사용된다.
        override fun getId() : Int {
            return 123
        }

        val myBook = "name"

        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId() : Int
}

fun main() {
    val book = Book.create()

    println("${book.id}  ${book.name}")
}