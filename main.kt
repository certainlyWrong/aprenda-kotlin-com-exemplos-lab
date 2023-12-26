import Controllers.DioController
import models.user.Level
import models.user.User
import src.models.course.CourseModel
import src.models.course.SectionModel

fun main() {
    //  Instanciando objetos para testar o código
    val courses =
        mutableListOf<CourseModel>(
            CourseModel(
                "Kotlin",
                mutableListOf(
                    SectionModel("Kotlin Basics"),
                    SectionModel("Kotlin Collections"),
                    SectionModel("Kotlin Functions")
                )
            ),
            CourseModel(
                "Java",
                mutableListOf(
                    SectionModel("Java Basics"),
                    SectionModel("Java Collections"),
                    SectionModel("Java Functions")
                )
            ),
            CourseModel(
                "C#",
                mutableListOf(
                    SectionModel("C# Basics"),
                    SectionModel("C# Collections"),
                    SectionModel("C# Functions")
                )
            )
        )

    val users =
        mutableListOf<User>(
            User("John", "Doe", "johndoe@gmail.com", "123456", Level.PLENO),
            User("Ana", "Carla", "anacarla@gmail.com", "123456", Level.SENIOR),
            User("Mary", "Jane", "maryjane@gmail.com", "123456", Level.JUNIOR)
        )
    val dio = DioController("Dio", courses)

    //  Testando o código
    println(dio.courses)

    //  Testando metodos de DioController
    dio.addCourse(CourseModel("Python", mutableListOf(SectionModel("Python Basics"))))
    println(dio.courses)
    dio.removeCourseByName("Java")
    println(dio.courses)
    dio.updateCourse(
        CourseModel(
            "C#",
            mutableListOf(
                SectionModel("C# Basics"),
                SectionModel("C# Collections")
            )
        )
    )
    println(dio.courses)

    // Testando metodos de Course
    dio.courses[0].register(users[0])
    println(dio.courses[0].users)
    dio.courses[0].unregister(users[0])
    println(dio.courses[0].users)
    dio.courses[0].addUser(users[0])
    println(dio.courses[0].users)
    dio.courses[0].removeUser(users[0])
    println(dio.courses[0].users)
    dio.courses[0].removeUserByName("John")
    println(dio.courses[0].users)
}
