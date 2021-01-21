/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 람다함수의 특별한 기능 중 스코프함수
// 클래스에서 생성한 인스턴스를 스코프 함수에 전달하면 인스턴스의 속성이나 함수를 좀 터 깔끔하게 불러 사용 가능
//  - apply. 인스턴스를 생성한 후 변수에 담기 전에 '초기화 과정'을 수행할 때 사용
//  - run. 이미 인스턴스가 만들어진 이후에 인스턴스의 함수나 속성을 사용해야 할 때 유용
//  - with. run과 동일한 기능을 가지지만 단지 인스턴스를 참조연산자 대신 파라미터로 받는다는 차이가 있다
//  - also. 처리가 끝나면 인스턴스를 반환 [apply / also]. it을 통해 인스턴스를 사용할 수 있다.
//  - let. 처리가 끝나면 최종 값 반환 [run / let]. it을 통해 인스턴스를 사용할 수 있다.
//  	파라미터를 통해 인스턴스를 사용하는 과정을 거치는 이유는 같은 이름의 변수나 함수가 스코프 밖에 중복되어 있는 경우 혼란 방지를 위해
fun main() {
    // run 함수가 인스턴스 내의 price 속성보다 run이 속해있는 main 함수의 price 변수를 우선시하기 때문
    var price = 500000
    
    var a = Book("이틀러스의 파이썬", 1000000).apply {
        name = "[초특가]" + name
        discount()
    }
    
    var c = Book("이틀러스의 파이썬", 1000000).also {
        it.name = "[초특가]" + it.name
        it.discount()
    }
    with(c) {
        println("also. 상품명: ${name}, 가격: ${price}원")
    }
    
    a.run {
        println("run. 상품명: ${name}, 가격: ${price}원")
    }
    a.let {
        println("let. 상품명: ${it.name}, 가격: ${it.price}원")
    }
    
    with(a) {
        println("with. 상품명: ${name}, 가격: ${price}원")
    }
    // 가격은 출력하지만 'name'은 변수 'b'에 할당 됨
    var b = a.run {
        println(a.price)
        a.name
    }
}

class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}
