fun main(args: Array<String>) {
println("Kotlin".lastChar)
    val sb = java.lang.StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

    val strings = listOf<String>("one","two","three")

    varargs(arrayOf("one","two","three"))
    varargs(arrayOf("one"))
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    val (number, name) = 1 to "one"
    println(number)
    println(name)

    val test = arrayListOf(1,2,3,4,5)

    for((index, element) in test.withIndex()){
        println("$index: $element")
    }




}

fun varargs(args: Array<String>){
    val list = listOf("Test : ", *args)
    println(list)

}

val String.lastChar:Char
    get() = get(length-1)

var StringBuilder.lastChar: Char
    get() = get(length-1) //프로퍼티 게터
    set(value: Char){
        this.setCharAt(length - 1, value) // 프로퍼티 세터
    }