/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// 반복문과 증감연산자
fun main() {
	var a = 0
    while (a < 5) {
        print(a++)
    }
    println("")
    var b = 0
    while (b < 5) {
        print(++b)
    }
    println("")
    do {
        print(a++)
    } while (a < 5)
    println("")
    for(i in 0..9) {
        print(i)
    }
    println("")
    for(i in 0..9 step 3) {
        print(i)
    }
    println("")
    for(i in 9 downTo 0) {
        print(i)
    }
    println("")
    for(i in 9 downTo 0 step 3) {
        print(i)
    }
    println("")
    for(i in 'a'..'f') {
        print(i)
    }
}