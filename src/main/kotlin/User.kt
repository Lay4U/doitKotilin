import kotlin.properties.Delegates

//class User(val id: Int, var name: String, var age: Int) {
//
//}

class User{
    var name: String by Delegates.observable("NONAME"){
        porp, old, new ->
        print("$old -> $new")
    }
}


fun main() {
    val user = User(1, "Sean", 30)
    val name = user.name
    user.age = 41
    println("name: $name, ${user.age}")
}