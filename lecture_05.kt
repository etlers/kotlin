/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// 조건문
fun main() {
	var a = 11
    if (a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거나 같다")
    }
    // 자료형 체크는 "is, !is" 이렇게  두 개가 있다.
    println(a !is Int)
    
    doWhen(1)
    doWhen("etlers")
    doWhen(12L)
    doWhen(3.141592)
    doWhen("Kotlin")
    
    doWhenVar("etlers")
}

// 다중 체크 when
// 파라미터 Any는 어떤 자료형이든 사용이 됨
fun doWhen (a: Any) {
    when(a) {
        1 -> println("정수 1입니다")
        "etlers" -> println("이틀러스 입니다")
        is Long -> println("Long 타입 입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("어떤 조건에도 맞지 않습니다.")
    }
}

// 변수로 받아 처리 가능
fun doWhenVar (a: Any) {
    var result = when(a) {
        1 -> "정수 1입니다"
        "etlers" -> "이틀러스 입니다"
        is Long -> "Long 타입 입니다."
        !is String -> "String 타입이 아닙니다."
        else -> "어떤 조건에도 맞지 않습니다."
    }
    print(result)
}