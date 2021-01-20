/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// 클래스 오버라이딩
//  - 원칙적으로는 수퍼클래스와 동일한 매소드 명칭을 사용할 수 없다.
//  - 이미 구현이 끝난 함수의 기능을 서브클래스에서 변경할 때 사용
fun main() {
    var t = Tiger()
    
    t.eat()
}

open class Animal {
    // open을 사용하면 수퍼 클래스의 함수를 변경할 수 있다.
    open fun eat() {
        println("음식을 먹습니다.")
    }
}

class Tiger : Animal() {
    override fun eat() {
        println("고기를 먹습니다.")
    }
}