/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 널처리와 동일성 확인
// "?." - null safe operator
// 		[sample?.toUpperCase()] 참조연산자를 실행하기 전에 먼저 객체가 널인지 확인부터 하고 널이면 뒤 구문 미실행
// "?:" - elvis operator
// 		[sample?:"default"] 객체가 널이 아니라면 그대로 실행하고 널이면 연산자 우측의 객체로 대체
// "!!." - non-null assertion operator
// 		[sample!!.toUpperCase()] 참조연산자를 사용할 때 널여부를 컴파일시 확인하지 않도록 하여 런타임시 null pointer exception이 나도록 의도적으로 방치
// 동일성.
//  - 객체(변수)의 동일성은 메모리 상의 값을 서로다른 객체가 가리키고 있는 경우. "==="
//  - 내용의 동일성은 객체(변수)는 다르지만 내용이 같은 경우. "=="
fun main() {
    // 널체크
    var a: String? = null
    /*
    println(a?.toUpperCase())
    println(a?:"default".toUpperCase())
    println(a!!.toUpperCase())
    */
    // null safe 연산자를 스코프 함수와 함께 사용
    // 널이기에 전체가 실행되지 않음
    a?.run {
        println(toUpperCase())
        println(toLowerCase())
    }
    
    var b: String? = "Kotlin Exam"
    b?.run {
        println(toUpperCase())
        println(toLowerCase())
    }
    
    var c = Product("cola", 1000)
    var d = Product("cola", 1000)
    var e = c
    var f = Product("cider", 1000)
    
    println(c == d)
    println(c === d)
    
    println(c == e)
    println(c === e)
    
    println(c == f)
    println(c === f)
}

class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Product) {
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}