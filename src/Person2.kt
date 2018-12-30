import kotlin.math.ln

data class Person2(val name : String, val age : Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person2("영희"),Person2("철수",29))
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

}
/*

fun max(a: Int, b: Int): Int{
    return if(a>b) a else b
}
*/

fun max(a: Int, b: Int): Int = if(a>b) a else b

fun getMneomnic(color: Color) =
    when (color){
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        else  -> throw Exception("else")
    }

fun mix(c1: Color, c2: Color) =
    when(setOf(c1,c2)){
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

