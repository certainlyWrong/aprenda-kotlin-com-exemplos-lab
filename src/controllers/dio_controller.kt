package Controllers

import models.user.User
import src.models.course.CourseModel

/**
 * This class represents a controller for the DIO platform. It contains a list of courses and a list
 * of users. It also contains methods to add and remove courses and users.
 */
data class DioController(
        var name: String,
        val courses: MutableList<CourseModel>
) {

    fun addCourse(course: CourseModel) {
        courses.add(course)
    }

    fun removeCourse(course: CourseModel) {
        courses.remove(course)
    }

    fun removeCourseByName(courseName: String) {
        courses.removeIf { it.name == courseName }
    }

    fun getCourseByName(courseName: String): CourseModel? {
        return courses.find { it.name == courseName }
    }

    fun updateCourse(course: CourseModel) {
        val index = courses.indexOfFirst { it.name == course.name }
        courses[index] = course
    }
}
