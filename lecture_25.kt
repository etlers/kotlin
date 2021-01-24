/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// special function's class. Data & Enum Class
// Data Class
//  - 내용의 동일성을 판단하는 equals()
//  - 객체의 내용에서 고유한 코드를 생성하는 hashcode()
//  - 포함된 속성을 보기쉽게 나타내는 toString()
//  - 객체를 복사하여 똑같은 내용의 새 객체를 만드는 copy(). 생성자와 동일한 파라미터에 값을 교체하여 생성이 가능.
//  	val a = Data("A", 7)
//  	val b = a.copy("B") -> b("B", 7)의 의미가 됨
//  - 속성을 순서대로 반환하는 componentX()
//  	사용자가 직접 호출하기 보다는 배열이나 리스트에서 자동으로 꺼내 사용할 수 있도록 지원하기 위한 함수
//  	listOf(Data("A", 7), Data("B", 1))
fun main() {
    val a = General("JooYong", 212)
    println(a == General("JooYong", 212))
    println(a.hashCode())
    println(a)
    println()
    
    val b = Data("CHOI", 306)
    println(b == Data("CHOI", 306))
    println(b.hashCode())
    print(b)
    println()
    
    println(b.copy())
    println(b.copy("이틀러스"))
    println(b.copy(id=618))
    
    // 컴포넌트 계열의 함수 componentX()
    val list = listOf(Data("CHOI", 212),
                      Data("JYCHOI", 306),
                      Data("etlers", 618))
    // 내부적으로 component1 = a, component2 = b 함수를 실행하게 되는 것임
    for ((a, b) in list) {
        println("${a}, ${b}")
    }
    println()
    
    // enum class
    // 소유한 속성을 가질 수 있는데 생성자(enum class Color (val number: Int))를 만들어 속성도 설정(RED(1), BLUE(2)...)하고
    // 일반 클래스처럼 "fun isRed() = this == Color.RED" 등과 같이 함도 추가 가능.
    var state = State.SING
    println(state)
    state = State.SLEEP
    println(state.isSleeping())
    state = State.EAT
    println(state.message)
}

enum class State(val message: String) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다");
    
    // this는 State 객체 자기 자신을 의미한다. boolean을 리턴
    fun isSleeping() = this == State.SLEEP
}

class General(val name:String, val id: Int)

data class Data(val name:String, val id:Int)

