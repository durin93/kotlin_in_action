fun main(args: Array<String>) {

}

fun strLenSafe(s: String?): Int =
    if(s != null) s.length else 0

fun printAllCaps(s: String?){
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

class MyService{
fun per(): String ="foo"

}

class MyTest{
    private var myService: MyService? = null

    fun setUp(){
        myService = MyService()
    }

    fun a(){
        myService!!.per()
    }
}

fun verifyUserInput(input: String?){
    if(input.isNullOrBlank()){
        println("Please fill!")
    }
}

class NullableStringPrinter : StringProccessor {
    override fun process(value: String) {
    }
}