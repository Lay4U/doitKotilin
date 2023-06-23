fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit){
    println("Before calling out()")
    nestedFunc{out(a)}
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit) {
   body()
}

fun a(){
    val source = "Hello world!"
    val target = "Kotilin"
    println(source.getLongString(target))
}
fun String.getLongString(target: String): String =
    if (this.length > target.length) this else target