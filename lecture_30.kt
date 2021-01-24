/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 비트연산
fun main() {
    var bitData: Int = 0b10000
    
    bitData = bitData or(1 shl 2)
    // 2진수 형태로 출력
    println(bitData.toString(2))
   	// 하위 5번째 데이터 꺼내기
   	var result = bitData and(1 shl 4)
    println(result.toString(2))
    // 원래의 값으로 복원
    println(result shr 4)
    // 5번째 1을 클리어
    bitData = bitData and((1 shl 4).inv())
    println(bitData.toString(2))
    
    println((bitData xor(0b10100)).toString(2))
}