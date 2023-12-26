package src.models.course

import models.user.User

data class CourseModel(
    var name: String,
    val sections: MutableList<SectionModel>,
    val users: MutableList<User> = mutableListOf(),
) {
    fun register(user: User) {
        users.add(user)
    }

    fun unregister(user: User) {
        users.remove(user)
    }

    fun addUser(user: User) {
        users.add(user)
    }

    fun removeUser(user: User) {
        users.remove(user)
    }

    fun removeUserByName(userName: String) {
        users.removeIf { it.name == userName }
    }

    fun removeUserByEmail(userEmail: String) {
        users.removeIf { it.email == userEmail }
    }
}