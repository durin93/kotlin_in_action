import java.lang.IllegalArgumentException



fun main(args: Array<String>) {
    println("Kotlin".lastChar)

    print(
        Test.split().isEmpty())

    parsePath("/Users/yole/kotlin-book/chapter.adoc")
    parsePath2("/Users/yole/kotlin-book/chapter.adoc")
    parsePath2("/Users/yole.kotlin-book.adoc")
    println(kotlinLogo.trimMargin("."))
    println(price)

//    saveUser(User(1,"",""))
//    saveUser2(User(1,"gram",""))

    saveUser3(User(1,"gram","판교역로"))

    val a = arrayListOf(1,2,3,4,5);
    a.joinToString()

    kakaka()

}

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, fullName: $fullName name: $fileName, ext: $extension")
}

fun parsePath2(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, filename: $filename, ext: $extension")
    }
}

val kotlinLogo = """| //
                   .| //
                   .|/ \"""
val price = """${'$'}99.9"""

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {

    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Name")
    }
    if(user.address.isEmpty()){
        throw IllegalArgumentException("Can't save user ${user.id}: empty Address")
    }
  //user를 디비에 저장
}
fun saveUser2(user: User) {
    fun validate(value: String, fieldName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate( user.name, "Name")
    validate( user.address, "Address")
  //user를 디비에 저장
}

fun User.validateBeforeSave(){
    fun validte(value: String, fieldName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user $id: empty $fieldName") //User 프로퍼티 직접 사용 가능
        }
    }
    validte(name, "Name")
    validte(address, "Address")
}

fun saveUser3(user: User){
    user.validateBeforeSave() //확장 함수 호출
    //추가로직


}


