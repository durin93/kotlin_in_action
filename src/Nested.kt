fun main(args: Array<String>) {
    var ccc = AAA.BBB().bbb()
    ccc = AAA().CCC().ccc()
    print(ccc)
}



class AAA {
    private val aaa: Int = 10

    class BBB {
        fun bbb() = 100
    }


    inner class CCC {
        fun ccc() = 200
    }


}

class Outer {
    val a = 10
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}