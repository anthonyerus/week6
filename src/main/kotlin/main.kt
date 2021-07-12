fun main() {
    println(mylove(4, 4))
    println(mylove(3, 11))
    println(mylove(22, 17))
}

fun mylove (luv1: Int, luv2: Int): Boolean {
    return luv1 % 2 !== luv2 % 2

}
