
Kotlin Playground is an online sandbox to explore Kotlin
programming language. Browse code samples directly in the browser
Playground
Hands-on
Examples
Koans





/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */
​
​
// Collection class set & map
// set
//  - 순서가 정렬되지 않으며 중복이 허용되지 않는 컬렉션
//  - 인덱스로 위치를 지정하여 객체를 참조할 수 없다
//  - contains로 객체가 존재하는지 여부 확인. sampleSet.contains("etlers")
// map
//  - 객체를 넣을 때 그 객체를 찾아낼 수 있는 key를 쌍으로 넣어주는 컬렉션
fun main() {
    // set
    val a = mutableSetOf("귤", "바나나", "키위")
    for (item in a) {
        println("${item}")
    }
    a.add("자몽")
    println(a)
    a.remove("바나나")
    println(a)
    println(a.contains("귤"))
    println()
    // map
    val b = mutableMapOf("초이스" to "파이썬",
                         "주용" to "python",
                         "이틀러스" to "etlers")
    for (entry in b) {
        println("${entry.key}: ${entry.value}")
    }
    
    b.put("CHOIS", "안드로이드앱")
    println(b)
    b.remove("주용")
    println(b)
    println(b["이틀러스"])
}
귤
바나나
키위
[귤, 바나나, 키위, 자몽]
[귤, 키위, 자몽]
true

초이스: 파이썬
주용: python
이틀러스: etlers
{초이스=파이썬, 주용=python, 이틀러스=etlers, CHOIS=안드로이드앱}
{초이스=파이썬, 이틀러스=etlers, CHOIS=안드로이드앱}
etlers
© 2000-2020 JetBrains. All rights reservedSponsored and developed by