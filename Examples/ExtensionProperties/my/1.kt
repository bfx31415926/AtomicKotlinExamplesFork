// ExtensionProperties/ListOfStar.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package extensionproperties_my
import atomictest.eq

val List<*>.indices: IntRange
    get() = 0 until size

fun main() {
    listOf(1).indices eq 0..0
    listOf('a', 'b', 'c', 'd').indices eq 0..3
    emptyList<Int>().indices eq IntRange.EMPTY
    ((IntRange.EMPTY) == (0..-1)) eq true

    val list: List<*> = listOf(1, 2)
    val any: Any? = list[0]
    any eq 1

    val list1 = listOf(1, 2, 3)
    (list1 is java.util.List<*>) eq true
}
