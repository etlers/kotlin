/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// 변수 선언
fun main() {
    // 일반적으로 통용되는 변수.
    // 언제든지 읽기 쓰기가 가능함. 초기화를 해줘야지만 사용 가능하기에 널 포인터 익셉션 오류 방지
    var a: Int = 123
    a = 321
    println(a)
    // 널 가능 변수는 변수 선언시 자료형 뒤에 물음표를 붙여주면 된다.
    var b: Int? = null
    print(b)
    // 선언시 초기화 가능. 중간에 값 변경 불가
    //val
    // class에 선언된 변수는 "Property(속성)"
    // 이외의 Scope 내에 선언된 변수는 "Local Variable(로컬변수)"
    
    var stringVariable:String = "aaa"
    println(stringVariable)
    // 여러 줄은 파이썬과 동일
    var multiStringVariable:String = """하나
    둘
    셋"""
    println(multiStringVariable)
}