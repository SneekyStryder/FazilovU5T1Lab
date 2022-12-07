public class Student {
    private String name;
    private int gradeLevel;
    private String school;

    /* Write the two constructors here, as described above */
    public Student(String name, int gradeLevel, String school) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            school = "high school";
        }
        else if (gradeLevel >= 6 && gradeLevel <= 8) {
            school = "middle school";
        }
        else {
            school = "elementary school";
        }
    }

    public String studentInfo() {
        /* implement me, as described above */
        return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
}
