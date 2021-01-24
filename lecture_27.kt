/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 컬렉션 함수
//  - 반복문과 조건문을 대부분 대체할 수 있다
//  - list, set, map 등과 같은 컬렉션과 배열에 일반 함수 또는 람다 함수 형태를 사용하여 for문 없이도 아이템을 순회하며 참조하거나 조건을 걸고, 구조의 변경까지 가능
//  - 켈렉션으로 반환을 해준다.
//  - any. 조건에 맞는 것이 하나라도 있거나
//  - all. 모두 조건에 맞거나
//  - none. 맞는게 없거나
//  - first(find로 대체 가능). 일반 함수로 사용하는 경우 첫번째 객체를 반환. 람다함수 형태로 조건을 주면 조건에 맞는 첫번째를 반환. 반대는 last(findlast로 대체 가능)
fun main() {
    val nameList = listOf("최주용", "김수진", "최원희", "최원민", "윤서")
    nameList.forEach{
        print(it + " ")
    }
    println()
    println(nameList.filter{
        it.startsWith("최")
    })
    println()
    println(nameList.map{
        "이름: " + it
    })
    println(nameList.any{
        it == "김수진"
    })
    println(nameList.all{
        it.length >= 2
    })
    println(nameList.none{
        it.startsWith("이")
    })
    println(nameList.first{
        it.startsWith("최")
    })
    println(nameList.last{
        it.startsWith("최")
    })
    println(nameList.count{
        it.contains("원")
    })
}