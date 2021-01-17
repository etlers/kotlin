/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// 흐름제어와 논리연산자
// break, continue
fun main() {
    for (i in 1..9) {
        if (i == 3) break
        println(i)
    }
    for (i in 1..9) {
        if (i == 3) continue
        println(i)
    }
    for (i in 1..9) {
        for (j in 1..9) {
            if (i == 1 && j == 2) {
                println("i: $i, j: $j")
            }
        }        
    }
    loop@for (i in 1..9) {
        for (j in 1..9) {
            if (i == 1 && j == 2) break@loop
            println("i: $i, j: $j")
        }        
    }
    
    println(true && false)
    println(true || false)
    println(!true)
    println(!false)
    
    var a = 6
    var b = 4
    println(a > 5 && b < 5)
}