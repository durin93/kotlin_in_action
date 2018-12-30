interface Expr
class Num(val value: Int) :Expr
class Sum(val left: Expr, val right: Expr) : Expr


fun eval(e: Expr): Int {
    if(e is Num){
        val n = e as Num //여기서 Num 으로 타입 변환을 하는데 이는 불피룡한 중복이다/
        return n.value
    }
    if(e is Sum){
        return eval(e.right) + eval(e.left) //변수 e에 대해 스마트 캐스트 사용
    }
    throw IllegalArgumentException("UnKnown expression")
}

fun eval2(e: Expr) {
    if(e is Num){
        e.value
    }else if(e is Sum){
        eval(e.right) + eval(e.left)
    }else {
        throw IllegalArgumentException("UnKnown expression")
    }
}