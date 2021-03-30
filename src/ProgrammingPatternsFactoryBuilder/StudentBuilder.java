package ProgrammingPatternsFactoryBuilder;

import Inheritance.SecondTask.Person;
import Inheritance.SecondTask.Student;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class StudentBuilder
 * @since 30.03.2021 - 19.14
 **/

public class StudentBuilder extends Student {

    public static class Builder {
        private Student student;

        public Builder() {
            this.student = new Student();
        }

        public Builder setSimilarTo(Student student) {
            this.student.setFirstName(student.getFirstName());
            this.student.setLastName(student.getLastName());
            this.student.setPatronymicName(student.getPatronymicName());
            this.student.setDateOfBirth(student.getDateOfBirth());
            this.student.setHeight(student.getHeight());
            this.student.setWeight(student.getWeight());
            this.student.setChestGirth(student.getChestGirth());
            this.student.setWaistGirth(student.getWaistGirth());
            this.student.setThighGirth(student.getThighGirth());
            this.student.setNationality(student.getNationality());
            this.student.setPlaceOfBirth(student.getPlaceOfBirth());
            this.student.setAddress(student.getAddress());
            this.student.setPassportCode(student.getPassportCode());
            this.student.setGender(student.getGender());
            this.student.setDisabled(student.isDisabled());
            this.student.setServing(student.isServing());
            this.student.setWorking(student.isWorking());
            this.student.setGroup(student.getGroup());
            this.student.setChair(student.getChair());
            this.student.setDepartment(student.getDepartment());
            this.student.setStipendiary(student.isStipendiary());
            this.student.setStudentTicket(student.getStudentTicket());
            this.student.setCourse(student.getCourse());
            this.student.setBudget(student.isBudget());
            this.student.setInAbsentia(student.isInAbsentia());
            return this;
        }

        public Builder setFirstName(String firstName) {
            student.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName) {
            student.setLastName(lastName);
            return this;
        }

        public Builder setPatronymicName(String patronymicName) {
            student.setPatronymicName(patronymicName);
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            student.setDateOfBirth(dateOfBirth);
            return this;
        }

        public Builder setHeight(double height) {
            student.setHeight(height);
            return this;
        }

        public Builder setWeight(double weight) {
            student.setWeight(weight);
            return this;
        }

        public Builder setChestGirth(double chestGirth) {
            student.setChestGirth(chestGirth);
            return this;
        }

        public Builder setWaistGirth(double waistGirth) {
            student.setWaistGirth(waistGirth);
            return this;
        }

        public Builder setThighGirth(double thighGirth) {
            student.setThighGirth(thighGirth);
            return this;
        }

        public Builder setNationality(String nationality) {
            student.setNationality(nationality);
            return this;
        }

        public Builder setPlaceOfBirth(String placeOfBirth) {
            student.setPlaceOfBirth(placeOfBirth);
            return this;
        }

        public Builder setAddress(String address) {
            student.setAddress(address);
            return this;
        }

        public Builder setPassportCode(String passportCode) {
            student.setPassportCode(passportCode);
            return this;
        }

        public Builder setGender(char gender) {
            student.setGender(gender);
            return this;
        }

        public Builder setDisabled(boolean isDisabled) {
            student.setDisabled(isDisabled);
            return this;
        }

        public Builder setServing(boolean isServing) {
            student.setServing(isServing);
            return this;
        }

        public Builder setWorking(boolean isWorking) {
            student.setWorking(isWorking);
            return this;
        }

        public Builder setGroup(String group) {
            student.setGroup(group);
            return this;
        }

        public Builder setChair(String chair) {
            student.setChair(chair);
            return this;
        }

        public Builder setDepartment(String department) {
            student.setDepartment(department);
            return this;
        }

        public Builder setStipendiary(boolean isStipendiary) {
            student.setStipendiary(isStipendiary);
            return this;
        }

        public Builder setStudentTicket(String studentTicket) {
            student.setStudentTicket(studentTicket);
            return this;
        }

        public Builder setCourse(int course) {
            student.setCourse(course);
            return this;
        }

        public Builder setBudget(boolean isBudget) {
            student.setBudget(isBudget);
            return this;
        }

        public Builder setInAbsentia(boolean isInAbsentia) {
            student.setInAbsentia(isInAbsentia);
            return this;
        }

        public Student build() {
            return student;
        }
    }
}
