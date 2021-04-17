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
public class Python extends AbstractExampleCourse {

    private int courseCredits;
    private String toolUsed;

    public Python(int courseCredits, String toolUsed, String courseName, int courseCode) {
        super(courseName, courseCode);
        this.courseCredits = courseCredits;
        this.toolUsed = toolUsed;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public String getToolUsed() {
        return toolUsed;
    }

    public void setToolUsed(String toolUsed) {
        this.toolUsed = toolUsed;
    }

    public double courseCost() {
        double cost = 0.0;
        cost = courseCredits * 120;
        return cost;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDevops{" + "courseCredits=" + courseCredits + ", toolUsed=" + toolUsed + ", course fee=" + courseCost() + '}';
    }

}
