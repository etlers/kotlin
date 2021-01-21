/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 오브젝트.
// 생성자 없이 객체를 만들어 냄
// 기존의 클래스는 생성자를 통해 인스턴스 객체를 사용해야 내부에 있는 변수나 메소드를 사용할 수 있다.
// 하나의 객체만으로 공통적인 속성과 함수를 사용해야 하는 코드에서는 클래스를 사용할 필요가 없다.
// 최초 생성시 자동으로 생성되며 이후에는 코드 전체에서 공용으로 사용될 수 있으므로 프로그램이 종료되기 전까지 공통적으로 사용할 내용들을 묶어 만드는 것이 좋다.
// 기존 클래스 안에도 오브젝트를 만들 수 있는데 'Companion Object'로 클래스의 인스턴스 기능은 그대로 사용할 수 있으면서 공용으로 사용할 속성 및 함수를 별도롤 생성하는 기능
fun main() {
    println(Counter.count)
    Counter.countUp()
    Counter.countUp()
    println(Counter.count)
    Counter.clear()
    println(Counter.count)
    
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")
    
    a.vote()
    a.vote()
    b.vote()
    b.vote()
    b.vote()
    
    println("${a.name}: ${a.count}")
    println("${b.name}: ${b.count}")
    println("총계: ${FoodPoll.total}")
}

class FoodPoll (val name: String) {
    companion object {
        var total = 0
    }
    
    var count = 0
    
    fun vote() {
        total++
        count++
    }
}

object Counter {
    var count = 0
    
    fun countUp() {
        count++
    }
    
    fun clear() {
        count = 0
    }
}