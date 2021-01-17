/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// 형변환과 배열
fun main() {
    // 형변환 함수.
    // toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()    
    var a: Int = 54321
    // 명시적 형변환. 직접 지정해야 함
    var b: Long = a.toLong()
    println(b)
    // 배열
    var intArr = arrayOf(1, 2, 3, 4, 5)
    println(intArr[2])
    // 비어있는(널로 채워진) 배열
    // 배열에 할당할 자료형인 "<int>" 이 부분을 Generic 이라고 호칭
    var nullArr = arrayOfNulls<Int>(5)
    println(nullArr[2])
}