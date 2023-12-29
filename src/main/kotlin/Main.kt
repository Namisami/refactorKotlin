import kotlin.random.Random

data class User(val name: String)

val userNames = listOf("Марио", "Луиджи", "Пич", "Боузер", "Тоад")

fun generateUserList(): List<User> {
    val userList = mutableListOf<User>()
    for (i in 1..100) {
        userList.add(User(userNames[Random.nextInt(userNames.size)]))
    }
    return userList
}

fun main() {
    val userList = generateUserList()
    val userNameCountMap = mutableMapOf<String, Int>()
    for (user in userList) {
        userNameCountMap[user.name] = (userNameCountMap[user.name]?.plus(1)) ?: 1
    }
    println(userNameCountMap)
}

// WITHOUT REFACTOR
//import kotlin.random.Random
//
//class User(val name: String)
//
//var userNames = mutableListOf("Марио", "Луиджи", "Пич", "Боузер", "Тоад")
//
//fun main() {
//    var userList = mutableListOf<User>()
//    for (i in 1..100) {
//        userList.add(User(userNames[Random.nextInt(userNames.size)]))
//    }
//    var userNameCountMap = mutableMapOf<String, Int>()
//    for (user in userList) {
//        userNameCountMap[user.name] = (userNameCountMap[user.name]?.plus(1)) ?: 1
//    }
//    println(userNameCountMap)
//}