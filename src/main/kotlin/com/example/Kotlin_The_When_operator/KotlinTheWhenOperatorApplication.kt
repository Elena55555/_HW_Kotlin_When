package com.example.Kotlin_The_When_operator



fun main() {
	println( "First task")
	val numberOfMonths = 1
	when {
		numberOfMonths == 1 -> println("Winter: January")
		numberOfMonths == 2 -> println("Winter: February")
		numberOfMonths == 3 -> println("Spring:   March")
		numberOfMonths == 4 -> println("Spring: April")
		numberOfMonths == 5 -> println("Spring: May")
		numberOfMonths == 6 -> println("Summer:  June")
		numberOfMonths == 7 -> println("Summer:  July")
		numberOfMonths == 8 -> println("Summer: August ")
		numberOfMonths == 9 -> println("Autumn: September")
		numberOfMonths == 10 -> println("Autumn: October")
		numberOfMonths == 11 -> println("Autumn: November")
		numberOfMonths == 12 -> println("Winter: December")
		else -> println("There is no such time of year or month")

	}
	println( " ")
	println( "Second task")
	val myInput = 3.1
	when {
		myInput == 3.1 -> println("%.0f".format(myInput))
	}
	println( " ")
	println( "Third  task")
	val timeOfDay  = 0..5
	when {
		timeOfDay == 0..5 -> println("Early morning")
		timeOfDay == 5..11 -> println("Morning")
		timeOfDay == 11..17 -> println("Afternoon")
		timeOfDay == 17..20 -> println("Evening")
		timeOfDay == 20..23 -> println("Saturday evening")
		else -> println("There is no such time")
	}
	println( " ")
	println( "Fourth task")
	var a =   8
	var b =  5
	val f =  a
	a = b
	b = f
	println("a = $a")
	println("b = $b")
}
















