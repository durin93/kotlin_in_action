@file:JvmName("ChangeName")
package strings
import java.lang.StringBuilder

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

const val opCount = 0
fun performOperation(){
    opCount
}
fun reportOpertationCount(){
    println("operation performed $opCount times")
}