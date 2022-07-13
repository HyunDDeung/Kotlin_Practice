package com.example.controlflow

fun main() {

}

// 5. Array and List

// Array
// List에는 2가지 종류가 있다. 1.MutableList 2. ImmutableList
fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    // list 값은 get을 이용하여 가져올수만 있지, 직접적으로 변경하지는 못한다.

    // arrayList의 주소값이 변하는 것은 아니기 때문에 val을 사용해도 상관없다.
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}
