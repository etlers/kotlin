/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 고차, 람다 함수
// 람다함수
//  - 여러 구문의 사용이 가능. 여러 줄인 경우 마지막 줄의 값이 반환 값이 된다
//  - 파라미터가 없다면. 실행할 구문들만 나열
//  - 파라미터가 하나만 있다면 it 사용
fun main() {
    // 함수를 파라미터로 넘기는 경우 "::"를 앞에 붙여줌
    // b 함수에 a 함수를 파라미터로 해서 호출한다는 의미
	bFunc(::aFunc)
    // 람다함수는 그 자체가 고차함수이기 때문에 별도의 연산자 없이도 변수에 담을 수 있다.
    // 일반적인 변수를 자료형을 쓰듯 그 자리에 함수의 형식을 사용
    // 기본형태는 val cFunc: (String) -> Unit = { str: String }
    // 그러나 이미 함수에 파라미터의 자료형이 기술되어 있음
    val cFunc: (String)->Unit = { str -> println("$str 람다함수")}
    bFunc(cFunc)
    // 함수의 형식을 적지 않고 직접 파라미터의 자료형만 작성하면 파라미터와 리턴 값을 자동으로 추론하여
    // 이에 맞는 함수 형식의 객체 형태로 변수에 저장
    // val cFunc = { str: String -> println("$str 람다함수")}
}

fun aFunc (str:String) {
    println("$str 함수 a")
}

fun bFunc (function: (String) -> Unit) {
    function("b가 호출한")
}