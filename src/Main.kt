package aas
import Color
import java.io.BufferedReader
import Calculator

fun Calculator.plus(a:Int, b:Int) = print("1234")
fun Calculator.test() = print("1234")

data class Main(val name: String, val age: Int? = null) {
//    fun String.lastChar() : Char = get(this.length-1)
//    fun String.lastChar() : Char = get(this.length-155)

    companion object {
        fun a(): Int {
            "aa".lastChar()

            return 1
        }

    }

    private fun b(): Int {
        return 1
    }


}
fun String.lastChar() : Char = get(this.length-1)



fun view() {
    val view: View = Button()
    view.click()
}


fun normalFunCall(a:Int=3, b:Int=5):Int{
    println("a: ${a}, b: ${b}")
    return a+b
}

fun main(args: Array<String>) {
    Test.test("one","two")
    /* val persons = listOf(Main("영희"),Main("철수",29))
     val oldest = persons.maxBy { it.age ?: 0}
     println("나이가 가장 많은 사람: ${oldest}")
     println(max(1,2))

     val name = if(args.size > 0) args[0] else "Kotlin"
     println("Hello, $name")

     println(Color.BLUE.rgb())
     println(mix(Color.YELLOW,Color.RED))
     println(mix(Color.RED,Color.YELLOW))
     println(mixOptimized(Color.RED,Color.RED))

     println(eval(Sum(Sum(Num(1),Num(2)),Num(4))))

     for(i in 1..10){
         print(fizzBuzz(i))
     }
     println()
     for(i in 100 downTo 1 step 2){
         print(fizzBuzz(i)+" ")
     }

     mapIteration()

     iteration2()

     println(isLetter('q'))
     println(isNotDigit('x'))

     println(recognize('8'))


     println("Kotlin" in "Java".."Scala")
     println("K" in "A".."B")
*/
//    println("inin")
//    println("Kotlin" in setOf("Java", "Kotlin")) // 여기는 Kotlin이 들어있지 않다.//
//    println("Kotlin" in setOf("Kotlin", "Java")) // 여기는 Kotlin이 들어있지 않다.//
//
//    val set = hashSetOf(1, 7, 53)
    val list = listOf<Int>(1, 7, 53)
    list.max()
//    var map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
//
//    println(map.get(1))
//    println(map.get(7))
//    println(map.get(8))
//
//    println(set.javaClass)
//    println(list.javaClass)
//    println(map.javaClass)
//    var strings = listOf("first", "second", "fourteenth")
//    println(strings.last())
    val numbers = setOf(1, 14, 2)
    println(numbers.max())
//
//    joinToString(list, ", ", "", "")
//    joinToString(list)
//    joinToString(list, "; ")
//    joinToString(list, postfix = ";", prefix = "# ")
//
    val view: View = Button()
    view.showOff()
//
////    readNumber(BufferedReader(StringReader("1234")))
//    readNumber(BufferedReader(StringReader("test")))
//
//    gram()
//    println("asdad")

    println("일반 호출 문밥"+normalFunCall(8))
    println("일반 호출 문밥"+normalFunCall(2,3))

    view()

    val calculator: Calculator = Calculator()
    calculator.plus(1,2)

}

fun gram() :Unit{
    throw Exception()
}

//fun gram2():Nothing{
//
//}
fun readNumber(reader: BufferedReader) {
    val number = try {
        throw NumberFormatException()
    } catch (e: NumberFormatException) {
        gram()
    }
    println("ReadNumber")
    println(number)
}

/*
fun max(a: Int, b: Int): Int{
    return if(a>b) a else b
}
*/

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun getMneomnic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        else -> throw Exception("else")
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.INDIGO
        else -> Color.INDIGO
    }

fun mixOptimized(c1: Color, c2: Color): Color {
    val color = when {
        (c1 == Color.RED && c2 == Color.YELLOW) ||
            (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
        else -> Color.INDIGO
    }
    return color
}

fun String.asd(): Char = this.get(this.length - 1)

/*data class Main(val name: String, val age: Int? = null){
    fun a():Int {return 1}
}*/

//fun Main.makeFuntion2(): Int = this.b()
open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view")
fun Button.showOff() = println("I'm a button")




fun iteration2() {

    var list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) { //인덱스와 함께 컬렉션을 이터레이션한다.
        println("$index: $element")
    }
}
