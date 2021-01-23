/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 클래스의 다형성
// 콜라 클래스가 음료 클래스를 상속 받으면 생성된 콜라 인스턴스에는 음료의 객체 공간과 콜라의 추가 공간이 존재
// 	이렇게 생성된 인스턴스는 음료를 담는 변수에 저장하면 즉, "var b:음료 = 콜라()"이면 음료의 기능만 하게 되고 <- Up-Casting
// 	반면 콜라를 담는 변수에 저장하면 즉, "var b:콜라 = 콜라() (이 경우는 타입추론 기능으로 콜라 자료형은 생략 가능)" 콜라의 기능까지 모두 사용 가능
// 	이때 콜라 인스턴스를 음료 변수에 담는 행위를 상위 자료형인 수퍼클래스로 변환한다고 하여 Up-Casting이라고 하고 Up-Casting된 인스턴스를 다시 하위 자료형으로 변환하면 Down-Casting 이라고 한다.
// 	Up-Casting은 그냥 상위 자료형에 담는 것으로 동작을 함
// 	Down-Casting은 별도의 연산자 "AS, IS"가 필요하다
// 		AS는 변수를 호환되는 자료형으로 변환해주는 캐스팅 연산자로 코드 내에서 사용할 시 즉시 자료형으로 변환 해준다. "a as Cola" 이후 a는 Cola로 동작하고 변환된 자료형을 반환도 해주는 연산자로 변수에 넣을 수 있다. "var b = a as Cola"
// 		IS는 변수가 자료형에 호환되는지를 먼저 체크한 후 변환 해주는 캐스팅 연산자로 조건문 내에서 사용되는 특징이 있다. "if (a is Cola) { 이 안에서만 a가 Cola가 됨 }"
fun main() {
    var a = Drink()
    a.drink()
    
    // Drink 타입의 변수를 b에 할당    
    var b:Drink = Cola()
    b.drink()
    // b는 Drink 함수이므로 washDishes 함수는 호출할 수 없음. "Unresolved reference: washDishes" 오류
    //b.washDishes()
    // is 또는 as를 통한 Down-Casting을 해야 함
    if (b is Cola) {
        b.washDishes()
    }
    // Down-Casting 한 것을 변수 c에 할당
    var c = b as Cola
    c.washDishes()
    // 앞에서와 달리 오류가 없음. as를 사용하면 변수 자체도 Down-Casting 되기 때문
    b.washDishes()
}

// 상속이 가능한 클래스 선언
open class Drink {
    var name = "음료"
    
    // 오버라이드가 가능하도록 open
    open fun drink() {
        println("${name}를 마십니다.")
    }
}

class Cola: Drink() {
    var type = "콜라"
    
    override fun drink() {
        println("${name} 중에 ${type}을 마십니다.")
    }
    
    fun washDishes() {
        println("${type}로 설거지를 합시다.")
    }
}

