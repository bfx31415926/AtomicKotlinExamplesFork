// OperatorOverloading/ContainerAccess.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package operatoroverloading.my
import atomictest.eq

data class C(val c: MutableList<Int>) {
    override fun toString() = "C($c)"
}

operator fun C.get(i: Int): Int = c[i]

operator fun C.set(i: Int, k: Int) {
    c[i] = k
}

fun main() {
    val c = C(mutableListOf(2, 3))
//    (E(2) in c) eq true  // c.contains(E(2))
//    (E(4) in c) eq false // c.contains(E(4))
    c[1] eq 3         // c.get(1)
    c[1] = 4          // c.set(2, 4))
    c eq C(mutableListOf(2, 4))
}
