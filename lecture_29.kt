/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// lateinit, lazy
// var은 한 번 할당한 후 다시 재할당이 가능
// val은 재할당이 불가하다. 하지만 객체 내부의 속성을 변경할 수 없는 것은 아니다
// 상수는 컴파일 시점에 결정되고 절대 변경이 불가하다. "const val CONST_A = 1234"
//  - 클래스의 속성이나 지역변수 등으로는 사용할 수 없다
// lateinit
//  - 변수 선언과 동시에 할당을 할 수 없을 경우 사용하는데 초기값 할당 전까지 변수를 사용할 수는 없고 기본 자료형에도 사용할 수 없다. 단, String 클래스는 사용 가능
//  - 초기화 확인. "::변수이름.isInitialized"
// lazy
//  - 변수를 사용하는 시점까지 초기화를 자동으로 늦춰주는 지연 대리자 속성
//  - 선언. "val a: Int by lazy {7}"
//  - 실제 실행 시점에 초기화 됨
fun main() {
    var foodCourt = FoodCourt()
    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
    
    var a = LateInitSample()
    println(a.getLateInitText())
    a.text = "새로 할당한 값"
    println(a.getLateInitText())
    println()
    
    val number: Int by lazy {
        println("초기화를 합니다")
        7
    }
    println("코드를 시작합니다")
    println(number)
    // 이미 초기화를 했기 때문에 다시 초기화를 하지 않고 마지막 7만 출력하게 됨
    println(number)
}

class LateInitSample {
    lateinit var text: String
    
    fun getLateInitText(): String {
        if (::text.isInitialized) {
            return text
        } else {
            return "default"
        }
    }
}

class FoodCourt {
    fun searchPrice(foodName: String) {
        val price = when(foodName) {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }
        
        println("${foodName}의 가격은 ${price}입니다")
    }
    // 외부에서 목록을 알 수 있도록 선언
    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}