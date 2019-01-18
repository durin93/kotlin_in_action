import java.awt.SystemColor.text
import java.lang.StringBuilder
import javax.naming.Context

fun main(args: Array<String>) {

// val people = listOf(Person("Alice",29), Person("Bob",31))
//    println(people.maxBy { it.age })
//
//    people.maxBy(Person::age )
//    people.maxBy({ p: Person -> p.age})
//    people.maxBy(){p: Person -> p.age}
//    people.maxBy{p: Person -> p.age}
//
//    var people2 = listOf(Person("lee",29),Person("sung",31))
//    val names = people2.joinToString(separator = " ", transform = {p: Person -> p.name})
//
//    people2.joinToString(" "){p:Person -> p.name  }
//
//    people2.maxBy { p: Person -> p.age}
//    people2.maxBy { p -> p.age}
//    people2.maxBy { it.age }
//
//    println(names)
//
//    val getAge = {p: Person -> p.age}
//    people2.maxBy(getAge)
//
//    val errors = listOf("403 Forbidden", "404 Not Found")
//    printMessagesWithPrefix(errors,"Error:")

//    val createPerson = ::Person
//     val p = createPerson("Alice",29)
//    println(p)
//
//
//    val predicate = Person5::isAdult
//
//
//    val p2 = Person("D",34)
//    val personsAgeFunction = Person::age
//    println(personsAgeFunction(p2))
//
//
//    val dmitysAgeFunction = p2::age
//    println(dmitysAgeFunction())

//    val list = listOf(1,2,3,4)
//    println(list.filter { it % 2 ==0 })

//    val list = listOf(1,2,3,4)
//
//    val list2 = list.map { it*it }
//    println(list.map { it*it })
//
//    val people = listOf(Person("Alice", 29), Person("Bob", 31))
//    println(people.map { it.name })
//    println(people.map(Person::name))
//
//    println(people.filter { it.age>=34 }.map(Person::name))
//
//    println(people.filter { it.age == people.maxBy{ p: Person -> p.age }!!.age })
//
//    val maxAge = people.maxBy(Person::age)!!.age
//    people.filter{it.age == maxAge}
//
//    val numbers = mapOf(0 to "zero", 1 to "one")
//    println(numbers.mapValues { it.value.toUpperCase() })

//    val canBeInClub27 = {p: Person -> p.age <=27}
//
    val people = listOf(Person("Alice", 27), Person("Bob", 31)
    ,Person("ttt",1234))
//
//    println(people.all(canBeInClub27))
//    println(people.any(canBeInClub27))
//    println(people.count(canBeInClub27))
//    println(people.find(canBeInClub27))

//    println(people.groupBy { it.age })
//
//    val list = listOf("a","ab","b")
//    println(list.groupBy (String::first))
//
//    val strings = listOf("abc", "def")
//    println(strings.flatMap{it.toList()})
//
//

//    val books = listOf(Book("A", listOf("A")),
//        Book("B", listOf("B")),
//        Book("B", listOf("B")),
//        Book("B", listOf("B")),
//        Book("C", listOf("C"))
//
//    )
//
//    println(books.flatMap { it.authors }.toSet())
//
//    people.map(Person::name).filter { it.startsWith("A") }
//
//    people.asSequence()
//        .map(Person::name)
//        .filter { it.startsWith("A") }
//        .toList()
//
//    listOf(1,2,3,4).asSequence()
//        .map { print("map($it) "); it * it }
//        .filter { print("filter($it)" ); it % 2 ==0}
//
//    listOf(1,2,3,4).asSequence()
//        .map { print("map($it) "); it * it }
//        .filter { print("filter($it)" ); it % 2 ==0}
//        .toList()
//
//    println(people.asSequence().map ( Person::name ).filter{it.length < 4}.toList())
//
//    println(people.asSequence().filter { it.name.length < 4 }
//        .map(Person::name).toList())


    val naturalNumbers = generateSequence(0){it+1}
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())

    var putton = Putton()
    putton.setOnClickListener {  p -> putton }

    var test =
        createViewWithCustomAttributtes()

    println(test)
}





data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }

    }
    println(theOldest)
}

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach { println("$prefix $it") }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun sendEmail(p: Person, m: String) {

}

//val action= {person: Person, message: String -> sendEmail(person,message)}
val nextAction = ::sendEmail

data class Person5(var name: String, val age: Int)

fun Person5.isAdult() = age >= 21

class Book(val title: String, val authors: List<String>)

fun alphabet() = StringBuilder().apply {
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("asdads")
}.toString()

/* apply를 TextView 초기화에 사용하기 */
fun createViewWithCustomAttributtes() =
    Person5("test",1).apply { this.name = "zz" }