/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


// 문자열 다루기
fun main() {
    var test1 = "Test.Kotlin.String"
    // 길이
    println(test1.length)
    
    println(test1.toLowerCase())
    println(test1.toUpperCase())
    
    var test2 = test1.split(".")
    println(test2)
    
    println(test2.joinToString())
    println(test2.joinToString("-"))
    
    println(test1.substring(5..10))
    println()
    
    val nullString: String? = null
    val emptyString: String? = ""
    val blankString: String? = " "
    val normalString: String? = "A"
    
    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())
    println()
    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())
    println()
    
    var test3 = "kotlin.kt"
    var test4 = "java.java"
    println(test3.startsWith("java"))
    println(test4.startsWith("java"))
    println(test3.endsWith("kt"))
    println(test4.endsWith("kt"))
    println(test3.contains("lin"))
    println(test4.contains("lin"))
}