/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Manoj Nuvvala
 */
public abstract class AbstractExampleCourse {

    private String courseName;
    private int courseCode;

    public AbstractExampleCourse(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "abstractexample{" + "courseName=" + courseName + ", courseCode=" + courseCode + '}';
    }

}
