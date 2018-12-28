data class Person(val name : String, val age : Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("영희"),Person("철수",29))
    val oldest = persons.maxBy { it.age ?: 0}
    println("나이가 가장 많은 사람: $oldest")

    println(max(1,2))
}

fun max(a: Int, b: Int): Int{
    return if(a>b) a else b
}