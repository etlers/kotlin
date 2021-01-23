/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 데이터를 담는 리스트
//  - List<out T>
//  	생성시에 넣은 객체를 대체, 추가, 삭제 할 수 없음
//  	listOf(1, 2, 3)
//  - MutableList<T>
//  	생성시에 넣은 객체를 대체, 추가, 삭제 가능
//  	mutableListOf("A, "B", "C")
fun main() {
    var a = listOf("사과", "딸기", "배")
    println(a[1])
    
    for (fruit in a) {
        print("${fruit}:")
    }
    println()
    
    var b = mutableListOf(6, 3, 1)
    println(b)
    b.add(4)
    println(b)
    // 인덱스 2번 자리에 8 삽입
    b.add(2, 8)
    println(b)
    // 인덱스 1번 요소 삭제
    b.removeAt(1)
    println(b)
    // 무작위로 섞기
    b.shuffle()
    println(b)
    // 정렬
    b.sort()
    println(b)
}