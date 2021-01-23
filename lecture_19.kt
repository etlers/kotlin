/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 캐스팅을 줄여주는 제너릭
// 	클래스나 함수에서 사용하는 자료형을 외부에서 지정할 수 있는 기능
// 	캐스팅 연산을 거치는 것은 프로그램의 속도를 저하시킬 수 있어 나온 개념이 제너릭이다.
// 	제너릭은 함수나 클래스를 선언할 때 고정적인 자료형 대신에 실제 자료형으로 대체되는 타입 파라미터를 받아 사용하는 방법
// 	타입 파라미터에 특정 자료형이 할당되면 제너릭에 사용되는 모든 코드는 할당된 자료형으로 대체되어 컴파일 되므로 캐스팅 연산 없이도 자료형을 그대로 사용할 수 있다
// 	제너릭을 특정한 수퍼 클래스를 상속받은 클래스 타입으로만 제한하려면 콜론을 쓰고 수퍼 클래스명을 적는다 "<T: SuperClass>"
// 	이렇게 선언(fun <T> genericFunc (var param:T) {})된 제너릭은 일반적인 함수처럼(genericFunc(1)) 사용
// 		파라미터나 반환형을 통행 "fun <Int> genericFunc (var param:Int) {}" 형태로 자동으로 추론을 해준다
// 		클래스(class GenericClass <T>)의 경우 인스턴스를 만들 때 타입 파라미터를 수동으로 "GenericClass<Int> ()" 지정하거나
// 		생성자에 제너릭이 사용된 경우 자동으로 추론된다. "class GenericClass<Int> (var pref:Int)" "GenericClass(1)"
// 		
fun main() {
    UsingGeneric(A()).doShouting()
    UsingGeneric(B()).doShouting()
    UsingGeneric(C()).doShouting()
    
    doShouting(B())
}

fun <T: A> doShouting(t: T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("A가 소리칩니다.")
    }
}

class B: A() {
    override fun shout() {
        println("B가 소리칩니다.")
    }
}

class C: A() {
    override fun shout() {
        println("C가 소리칩니다.")
    }
}

class UsingGeneric<T: A> (val t: T) {
    fun doShouting() {
        t.shout()
    }
}