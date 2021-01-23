/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 중첩클래스와 내부클래스
//  - 하나의 클래스가 다른 하나의 클래스와 강하게 연관되어 있다는 의미를 전달하기 위해 만들어진 형식으로 "외부클래스이름.중첩클래스이름()" 형태로 사용
//  - 내부클래스(inner class)는 혼자서 객체를 만들수는 없고 외부 클래스의 객체가 있어야만 생성과 사용이 가능
//  - 중첩 클래스는 별개의 클래스고 내부 클래스는 외부 클래스의 속성과 함수의 사용이 가능
fun main() {
    Outer.Nested().introduce()
    
    val outer = Outer()
    val inner = outer.Inner()
    
    inner.introduceInner()
    inner.introduceOuter()
    
    outer.text = "changed Outer class"
    inner.introduceOuter()
}

class Outer {
    var text = "Outer Class"
    
    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }
    
    inner class Inner {
        var text = "Inner Class"
        
        fun introduceInner() {
            println("Nested Class")
        }
        
        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}