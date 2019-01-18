import java.io.File
import java.io.Serializable
import javax.naming.Context
import javax.swing.text.AttributeSet

fun main(args: Array<String>) {
//  Button().click()
//
//    val button = Button()
//    button.showOff()
//    button.setFocus(true)
//    button.click()

    println(SubscribingUser("a@d").nickname)

    val buser = Buser("ALikce")
    buser.address = "panhyo 47, 91, 10"

    val client = Client("gram", 1234)
    println(client)

    Payroll.allEmployees.add(Person("gram",2))
    Payroll.calculateSalary()

    val files = listOf(File("/Z"),File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
//    println(CaseInsensitiveFileComparator.compare())
}

interface Clickable {
    fun click() //일반메서드
    fun showOff() = println("I'm clickable!") //디폴트  구현이 있는 메서
}

////class Button: Clickable, Focusable {
////    override fun showOff() = super<Clickable>.showOff()
////
//////    override fun showOff() {
//////        super<Clickable>.showOff()
//////        super<Focusable>.showOff()
//////    }
////
//
//
//    override fun click() = print("I wasㅇ Clicked")
//}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

open class RichButton : Clickable {
    final override fun click() {}

}

class A : RichButton() {

    fun a() {
        click()

    }

}

fun kakaka() {

}

sealed class Expr2 {
    class Num2(val value: Int) : Expr2()
    class Sum2(val left: Expr2, val right: Expr2) : Expr2()
//    class Son() : Expr2()
}

fun eval2(e: Expr2): Int =
    when (e) {
        is Expr2.Num2 -> e.value /* is에 의해  e가 자동으로 Num으로 캐스팅 된다 */
        is Expr2.Sum2 -> eval2(e.right) + eval2(e.left)
    }

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

internal fun TalkativeButton.giveSpeech() {
//    yell()
//    whisper()
}

interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button2 : View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState : State {}
}

class UserGram(val nickname: String)

/*

class UserGram constructor(_nickname: String){
 val nickname: String
 init{
 nickname = _nickname
 }
}

 */


open class Piew {
    constructor(ctx: Context) {

    }

    constructor(ctx: Context, attr: AttributeSet) {

    }
}
/*
class MyPutton : Piew {

    constructor(ctx: Context):this(ctx,MY_STYLE){

    }
    constructor(ctx: Context, attr: AttributeSet):super(ctx, attr){

    }

}*/


interface User2 {
    val nickname: String
}
/* 인터페이스의 프로퍼티 구현하기 */
/* 방법 1 */

class PrivateUser(override val nickname: String) : User2  /* <-- 주 생성자에 있는 프로퍼티 */

/* 방법 2 */
class SubscribingUser(val email: String) : User2 {
    override val nickname: String
        get() = email.substringBefore('@')  /* <-- 커스텀 Getter */
}
//
///* 방법 3 */
//class FacebookUser(val accountId: Int) : User2 {
//    override val nickname = getFacebookName(accountId)  /* <-- 프로퍼티 초기화 식 */
//}

class Buser(val name: String) {
    var address: String = "unspecified"
    var address2: String = "unspecified"
        set(value: String) {
            println("""Address $name: "$field" -> "$value".""".trimIndent())
            field = value
        }
}

class Client(val name: String, val postalCode: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (postalCode != other.postalCode) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode
        return result
    }

    override fun toString(): String {
        return "Client(name='$name', postalCode=$postalCode)"
    }

    fun copy(name: String = this.name, postalCode: Int = this.postalCode) = Client(name, postalCode)

}

class DelegatingCollection<T> : Collection<T> {
    override val size: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun contains(element: T): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun iterator(): Iterator<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val innerList = arrayListOf<T>()

}

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {

        }
    }
}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}


data class Berson(val name: String){
    object NameComparator : Comparator<Berson>{
        override fun compare(o1: Berson?, o2: Berson?): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}

class Fuser{
    val nickname: String

    constructor(email: String) {
        this.nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int){
        nickname = "1234"
    }

}

class PPerson(val name: String){
    companion object Loader{
        fun fromJSON(jsonText: String): String = "dd"
    }

}

