/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// 추상화는 선언부만 있고 기능이 구현되어 있지 않은 빈 함수로 추상 클래스라는 요소로 구성
// 그러므로 단독으로 인스턴스를 만들 수 없다. 반드시 서브클래스에서 상속을 받아 "abstract" 표시가 된 함수들을 구현해야 함
// 인터페이스
//  - 추상함수로만 이루어져 있는 순수 추상화 기능을 의미
//  - 생성자를 가질 수는 없다
//  - 구현부가 있는 함수는 open 함수, 없으면 abstract 함수로 간주
//  그래서 별도의 표현이 없어도 서브클래스에서 구현 및 재정의가 가능하며 한 번에 여러 인터페이스를 상속받을 수 있다
fun main() {
    var r = Rabbit()
    r.eat()
    r.sniff()
    
    var d = Dog()
    d.run()
    d.eat()
}

abstract class Animal {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal() {
    override fun eat() {
        println("당근을 먹습니다")
    }
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다")
    }
}

class Dog : Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다")
    }
    
    override fun eat() {
        println("허겁지겁 먹습니다")
    }
}