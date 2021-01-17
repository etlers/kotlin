/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// class #3 상속
// 클래스를 더 구조적으로 해주는 장점. 지나친 상속 구조는 코드가 어려워짐
// 이미 존재하는 클래스를 확장하여 새로운 클래스를 생성
// 여러 클래스 중에서 공통점을 뽑아 코드 관리를 편하게 할 때
// 속성과 함수를 물려주는 쪽을 "수퍼 클래스", 받는 쪽을 "서브 클래스"라 함
// 코틀린은 "open" 상태가 아님. 즉, 상속금지가 기본
// open은 클래스가 상속될 수 있도록 클래스 선언시 붙여주는 키워드
// 조건.
//  - 서브 클래스는 수퍼 클래스에 존재하는 속성과 "같은이름"의 속성을 가질 수 없음
//  - 서브 클래스가 생성될 때는 반드시 수퍼 클래스의 생성자까지 호출해야 함
fun main() {
    // 두개가 동일
	var a = Animal("별이", 5, "개")
    var b = Dog("별이", 5)
    
    a.introduce()
    b.introduce()
    
    b.bark()
    
    var c = Cat("미로", 2)
    c.introduce()
    c.meaw()
}

open class Animal (var name:String, var age:Int, var type:String) {
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

// var, val 등을 붙이면 속성으로 선언이 되기 때문에 조건 1에 위반.
// 그래서 클래스 자체 속성으로 만들어 주기 위해 var 등을 붙이지 말고 일반 파라미터로 받아 Animal 클래스의 생성자에 직접 넘겨줌
class Dog (name:String, age:Int) : Animal(name, age, "개") {
    // Dog 클래스에서만 사용이 가능
    fun bark() {
        println("멍멍")
    }
}

class Cat (name:String, age:Int) : Animal(name, age, "고양이") {
    fun meaw() {
        println("야옹야옹")
    }
}