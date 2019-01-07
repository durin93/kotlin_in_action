import aas.view
import aas.iteration2
import aaa.lastChar
import aas.Main
import aas.Main.Companion.a
import aas.lastChar as last

fun fizzBuzz(i: Int)
    = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun b(){
    val c = "Kotlin".last()
    var d : Char = "Kotlin".lastChar()
    view()

    a()

    "".lastChar()
//    "".aaa.lastChar()
    aaa.iteration2()
}


