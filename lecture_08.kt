/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// class #1 = 속성 + 함수
// 인스턴스를 만드는 틀. 인스턴스란 클래스를 이용해서 만들어 내는 서로 다른 속성의 객체를 지칭
fun main() {
	var a = Person("초이스", 1990)
    var b = Person("주용", 1972)
    var c = Person("이틀러스", 2019)

    a.introduce()
    b.introduce()
    c.introduce()
}

class Person(var name:String, val birthYear: Int) {
    fun introduce() {
        println("안녕하세요. ${birthYear}년생 ${name}입니다.")
    }
}