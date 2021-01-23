/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 함수의 인자를 다루는 방법과 infix 함수
// 오버로딩은 캍은 스코프 내에서 같은 이름의 함수를 여러개 만들 수 있다
//  - fun same(x: Int), fun same(x: Int, text: String), fun same(x: Int, y:Int)
//  - 단, 파라미터 개수가 같고 타입도 같다면 오버로딩을 할 수 없다. "fun same(x: Int, y:Int), fun same(a: Int, b:Int)"
fun main() {
    read(7)
    read("kotlin")
    
    delivery("etlers")
    delivery("Kotlin", 3)
    delivery("CHOIS", 4, "사무실")
    // named argument
    delivery("선물", destination="친구집")
    // varvag
    sum(1,2,3,4,5,6,7,8,9)
    
    // infix. 좌측이 인픽스 함수가 적용되는 객체 자신 즉, this에 해당하고 우측이 파라미터인 "x"에 해당
    println(6 multiple 4)
    println(6.multiple(4))
    
}

// infix function. 함수 이름을 infix 함수가 적용될 "자료형.이름"으로 지정
// 클래스 내에서 인픽스 함수를 선언할 때에는 적용할 클래스가 자기 자신이므로 클래스 이름은 쓰지 않는다
infix fun Int.multiple(x: Int): Int = this * x

// 같은 자료형을 파라미터 개수에 상관없이 받고 싶을때. vararg(variable number of arguments)
// 단, 여러 파라미터와 함께 사용할 때는 맨 마지막에 위치해야 함. "fun sample(text:String, varvag x: Int)"
fun sum(vararg numbers:Int) {
    var sum = 0
    
    for (n in numbers) {
        sum += n
    }
    
    println(sum)
}

// defualt argument
fun delivery(name: String, count: Int = 1, destination: String = "집") {
    println("${name}, ${count}개를 ${destination}에 배달을 하였습니다.")
}

fun read(x: Int) {
    println("숫자 $x 입니다")
}

fun read(x: String) {
    println(x)
}

