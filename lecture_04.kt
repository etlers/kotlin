/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// 타입추론.
// 변수나 함수들을 선언할 때나 연산이 이루어질때 자료형을 코드에 명시하지 않아도 
// 코틀린이 자동으로 자료형을 추론해주는 것
fun main() {
    // 정수
    var a = 1234
    // long
    var b = 1234L
    // 실수
    var c = 12.45
    // float
    var d = 12.45f
    
    var g = true
    var h = 'c'
    
    println(add(1, 2, 3))
    println(aFunc(1, 2, 3))
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

// 식을 할당하여 생성 가능. 반환형의 타입추론이 가능하여 생략 가능
fun aFunc(a: Int, b: Int, c: Int) = a + b + c