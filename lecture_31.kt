/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 코루틴을 통한 비동기 처리
// GlobalScope
//  - 프로그램의 어디서나 제어, 동작이 가능한 기본 범위
// CoroutineScope
//  - 특정한 목적의 Dispatcher를 지정하여 제어 및 동작이 가능한 범위
//  - Dispatcher
//  	Dispatchers.Default 기본적인 백그라운드 동작
//  	Dispatchers.IO 디스크 및 메모리 I/O에 최적화 된 동작
//  	Dispatchers.Main 메인(UI) 스레드에서 동작
//  	생성된 함수에서 launch 또는 async를 통해 사용 가능. 차이는 반환 값의 여부로 launch는 반환 값이 없는 job 객체를 async는 반환 값이 있는 Deffered 객체를 반환

import kotlinx.coroutines.*

fun main() {
    /*
    val scope = GlobalScope
    // job 객체의 코루틴 생성
    scope.launch {
        for (i in 1..5) {
            println(i)
        }
    }
    */
    
    runBlocking {
        var a = launch {
            for (i in 1..5) {
                println(i)
                delay(10)
            }
        }
        
        val b = async {
            "async 종료"
        }
        
        println("async 대기")
        println(b.await())
        
        /*
        println("launch 대기")
        a.join()
        */
        // 취소하기
        println("launch 취소")
        a.cancel()
        println("launch 종료")
    }
    println()
    // 시간 내 실행여부 판단
    runBlocking {
        var result = withTimeoutOrNull(50) {
            for (i in 1..10) {
                println(i)
                delay(10)
            }
            "finish"
        }
        
        print(result)
    }
}