package com.example.myapplication


data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// 위 data class를 컴파일하게 된다면 자동으로 여러 메소드들을 만들어 준다. e.g.) toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main() {
    val ticketA = Ticket("koreanAir", "LeeHS", "2022-07-14", 15)
    val ticketB = TicketNormal("koreanAir", "LeeHS", "2022-07-14", 15)

    println(ticketA)
    println(ticketB)
}


