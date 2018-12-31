import java.util.*

val binaryReps = TreeMap<Char, String>() // 키에 대한 정렬을 위해 TreeMap
fun mapIteration(){
    for (c in 'A'..'F') { //A 부터 F 까지 문자의 범위를 사용해 이터레이션
        val binary = Integer.toBinaryString(c.toInt()) //아스키 코드를 2진수로 변형
        binaryReps[c] = binary // c를 키로 c의 2진수를 맵에 넣는다.
    }
    for ((letter, binary) in binaryReps) { //맵에 대해 이터레이션. 맵의 키와 값을 두 변수에 각각 대입.
        println("$letter = $binary")
    }
}

fun iteration2() {

    var list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) { //인덱스와 함께 컬렉션을 이터레이션한다.
        println("$index: $element")
    }
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when(c){
    in '0'..'9' -> "It's a digit!" //c 값이 0~9 에 속하는지 체크
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!" //여러 범위도 체크가능
    else -> "I dont know..."
}
