package Inheritance.SecondTask;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class Student
 * @since 20.03.2021 - 15.16
 **/

public class Student extends Person {
    private String group;
    private String chair;
    private String department;
    private boolean isStipendiary;
    private String studentTicket;
    private int course;
    private boolean isBudget;
    private boolean isInAbsentia; //заочно

    public Student() {
    }

    public Student(String firstName, String lastName, String patronymicName, LocalDate dateOfBirth, double height,
                   double weight, double chestGirth, double waistGirth, double thighGirth, String nationality,
                   String placeOfBirth, String address, String passportCode, char gender, boolean isDisabled,
                   boolean isServing, boolean isWorking, String group, String chair, String department,
                   boolean isStipendiary, String studentTicket, int course, boolean isBudget, boolean isInAbsentia) {
        super(firstName, lastName, patronymicName, dateOfBirth, height, weight, chestGirth, waistGirth, thighGirth,
                nationality, placeOfBirth, address, passportCode, gender, isDisabled, isServing, isWorking);
        this.group = group;
        this.chair = chair;
        this.department = department;
        this.isStipendiary = isStipendiary;
        this.studentTicket = studentTicket;
        this.course = course;
        this.isBudget = isBudget;
        this.isInAbsentia = isInAbsentia;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isStipendiary() {
        return isStipendiary;
    }

    public void setStipendiary(boolean stipendiary) {
        isStipendiary = stipendiary;
    }

    public String getStudentTicket() {
        return studentTicket;
    }

    public void setStudentTicket(String studentTicket) {
        this.studentTicket = studentTicket;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean isBudget() {
        return isBudget;
    }

    public void setBudget(boolean budget) {
        isBudget = budget;
    }

    public boolean isInAbsentia() {
        return isInAbsentia;
    }

    public void setInAbsentia(boolean inAbsentia) {
        isInAbsentia = inAbsentia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return isStipendiary() == student.isStipendiary() && getCourse() == student.getCourse() &&
                isBudget() == student.isBudget() && isInAbsentia() == student.isInAbsentia() &&
                Objects.equals(getGroup(), student.getGroup()) && Objects.equals(getChair(), student.getChair()) &&
                Objects.equals(getDepartment(), student.getDepartment()) && Objects.equals(getStudentTicket(),
                student.getStudentTicket());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGroup(), getChair(), getDepartment(), isStipendiary(),
                getStudentTicket(), getCourse(), isBudget(), isInAbsentia());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", group = '" + group + '\'' +
                ", chair = '" + chair + '\'' +
                ", department = '" + department + '\'' + '\n' +
                ", isStipendiary = " + isStipendiary +
                ", studentTicket = '" + studentTicket + '\'' +
                ", course = " + course +
                ", isBudget = " + isBudget +
                ", isInAbsentia = " + isInAbsentia;
    }
}
