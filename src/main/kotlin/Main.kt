object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        var s = "Hello"
        println("Kotlin: ${s}")
        Scala(s)
        Java(s)
    }
}
