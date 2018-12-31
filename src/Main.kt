import apple.laf.JRSUIConstants
import java.lang.StringBuilder

data class Main(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
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

     println("Kotlin" in setOf("Java", "Kotlin")) // 여기는 Kotlin이 들어있지 않다.*/

    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    var map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
    var strings = listOf("first", "second", "fourteenth")
    println(strings.last())
    val numbers = setOf(1, 14, 2)
    println(numbers.max())

    joinToString(list, ", ", "", "")
    joinToString(list)
    joinToString(list, "; ")
    joinToString(list, postfix = ";", prefix = "# ")
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


fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator) //첫 원소 앞에는 구분자를 붙이면 안된다
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

