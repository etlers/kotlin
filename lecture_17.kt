/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 익명개체와 옵저버 패턴
// 옵저버. 이벤트가 일어나는 것을 감시하는 감시자의 역할을 한다
//  - 이벤트란 키입력, 터치의 발생, 데이터의 수신 등 직접 함수로 요청하지는 않았지만 시스템 또는 루틴에 의해서 발생하게 되는 동작들
//  - 이 이벤트가 발생할 때마다 즉각적으로 처리할 수 있도록 만드는 패턴을 옵저버 패턴이라고 한다
//  	두(이벤트 수신, 발생 및 전달) 개의 클래스가 필요하고 발생 및 전달이 수신을 알 수 없기에 인터페이스가 필요하게 되고 이 인터페이스를 옵저버 또는 코틀린에서는 리스터(listner)라고 부른며 이벤트를 넘겨주는 행위를 콜백(callback)이라고 한다
fun main() {
    EventPrinter().start()
}

// 구성예제) 이벤트 출력 클래스 - 이벤트 리스너(인터페이스) - 5배수 카운터 클래스
interface EventListener {
    // 이벤트가 발생할 때 숫자를 반환
    // 리스터를 통해 이벤트를 반환하는 함수 이름은 관례적으로 'on(행위)'라는 규칙을 적용
    fun onEvent(count: Int)
}

class Counter(var listener: EventListener) {
    
    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) listener.onEvent(i)
        }
    }
}

// 익명객체
class EventPrinter {
    fun start() {
        val counter = Counter(object:EventListener{
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}

/*
// 이벤트를 받아서 화면에 출력
// 이벤트 함수는 이벤트 리스너를 상속하여 구현해야 함
class EventPrinter: EventListener {
    override fun onEvent(count: Int) {
        print("${count}-")
    }
    
    fun start() {
        // this라는 키워드로 이벤트 리스터 구현부를 넘겨줌
        // this는 키워드가 사용된 '객체자신'을 참조하는 키워드로 이벤트 프린터 객체 자신을 나타내지만 받는 쪽에서 'EventListener만' 요구했기 때문에 EventListener 구현부만 넘겨주게 되는 이를 객체지향의 다형성이라고 함
        val counter = Counter(this)
        counter.count()
    }
}
*/