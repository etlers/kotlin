/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// class #2
// 생성자. 새로운 인스턴스를 만들기 위해 호출하는 특수한 함수로
// 인스턴스의 속성을 초기화. 인스턴스 생성시 필요한 구문을 수행
// init 함수는 파라미터나 반환형이 없는 특수한 함수. 생성자를 통해 인스턴스 생성시 수행됨
fun main() {
	var a = Person("초이스", 1990)
    var b = Person("주용", 1972)
    var c = Person("이틀러스", 2019)
    
    var d = Person("김수진")
    var e = Person("윤서")
    var f = Person("원민")
}

class Person(var name:String, val birthYear:Int) {
    // 기본생성자
    init {
        // this는 인스턴스 자신의 속성이나 함수를 호출하기 위해 클래스 내부에서 사용되는 키워드
        println("안녕하세요. ${this.birthYear}년생 ${this.name}님이 생성 되었습니다.")
    }
    // 보조생성자. 인스턴스 생성시 편의를 제공하거나 추가적인 구문을 수행
    // 반드시 기본 생성자를 통해 속성을 초기화 해줘야 함
    constructor(name:String) : this(name, 1972) {
        println("보조 생성자가 사용 되었습니다.")
    }
}