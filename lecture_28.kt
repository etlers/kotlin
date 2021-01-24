/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 컬렉션 함수
//  - associateBy. 아이템에서 key를 추출하여 map으로 변환하여 주는 함수
//  - groupBy
//  - partition. 두 개의 pair라는 객체로 반환이 되는데 first, second 두 개로 사용. 각각의 변수 이름으로도 사용 가능
//  - flatMap. 아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수로 "collection.flatmap {listOf(it *3, it+3)}" 형태로 적용
//  - getOfElse. 인덱스 위치에 아이템이 있으면 아이템을 반환하고 아닌 경우 지정한 기본 값을 반환하는 함수 "collection.getOrElse(1) {50}"
//  - zip. 컬렉션 두 개의 아이템을 1:1로 매칭하여 pair class의 객체로 새 컬렉션을 만들어 줌 "collectionA zip CollectionB". 만일 개수가 다르면 작은 개수를 따라가게 됨
fun main() {
    data class Person(val name: String, val age: Int)
    
    val personList = listOf(Person("chois", 45),
                            Person("etlers", 31),
                            Person("kkomgirak", 25),
                            Person("etlers", 11))
    println(personList.associateBy{
        it.age
    })
    println(personList.groupBy{
        it.name
    })
    val (over30, under30) = personList.partition {
        it.age > 30
    }
    println(over30)
    println(under30)
    println()
    
    val numbers = listOf(-3, 7, 2, -10, 1)
    println(numbers.flatMap {
        listOf(it * 10, it + 10)
    })
    println(numbers.getOrElse(1) {50})
    println(numbers.getOrElse(10) {50})
    val names = listOf("A","B","C","D")
    println(names zip numbers)
}