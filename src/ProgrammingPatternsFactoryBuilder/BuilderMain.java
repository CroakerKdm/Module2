package ProgrammingPatternsFactoryBuilder;

import Inheritance.SecondTask.Student;

import java.time.LocalDate;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class BuilderMain
 * @since 30.03.2021 - 19.52
 **/

public class BuilderMain {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1914, 12, 31);
        LocalDate date2 = LocalDate.of(2001, 1, 1);

        Student studentOriginal = new StudentBuilder.Builder()
                .setFirstName("Ivan")
                .setLastName("Ivanov")
                .setPatronymicName("Ivanovich")
                .setDateOfBirth(date1)
                .setHeight(176)
                .setWeight(80)
                .setChestGirth(90)
                .setWaistGirth(60)
                .setThighGirth(90)
                .setNationality("Ukrainian")
                .setPlaceOfBirth("Kiev")
                .setAddress("Unknown")
                .setPassportCode("ВЕ983143")
                .setGender('M')
                .setDisabled(true)
                .setServing(false)
                .setWorking(false)
                .setGroup("KN200")
                .setChair("Computer Science")
                .setDepartment("PIITU")
                .setStipendiary(true)
                .setStudentTicket("XA12454946")
                .setCourse(5)
                .setBudget(true)
                .setInAbsentia(false)
                .build();

        Student studentModified = new StudentBuilder.Builder()
                .setSimilarTo(studentOriginal)
                .setFirstName("Petr")
                .setLastName("Petrov")
                .setPatronymicName("Petrovich")
                .setDateOfBirth(date2)
                .build();

        System.out.println(studentOriginal);
        System.out.println(studentModified);
    }
}

/*
    Person {First Name = 'Ivan', Last Name = 'Ivanov', Patronymic Name = 'Ivanovich', date Of Birth = 1914-12-31, height = 176.0
, weight = 80.0, chest Girth = 90.0, waist Girth = 60.0, thigh Girth = 90.0, nationality = 'Ukrainian'
, placeOfBirth = 'Kiev', address = 'Unknown', passportCode = 'ВЕ983143', gender = M, isDisabled = true, isServing = false
, isWorking = false, group = 'KN200', chair = 'Computer Science', department = 'PIITU'
, isStipendiary = true, studentTicket = 'XA12454946', course = 5, isBudget = true, isInAbsentia = false
    Person {First Name = 'Petr', Last Name = 'Petrov', Patronymic Name = 'Petrovich', date Of Birth = 2001-01-01, height = 176.0
, weight = 80.0, chest Girth = 90.0, waist Girth = 60.0, thigh Girth = 90.0, nationality = 'Ukrainian'
, placeOfBirth = 'Kiev', address = 'Unknown', passportCode = 'ВЕ983143', gender = M, isDisabled = true, isServing = false
, isWorking = false, group = 'KN200', chair = 'Computer Science', department = 'PIITU'
, isStipendiary = true, studentTicket = 'XA12454946', course = 5, isBudget = true, isInAbsentia = false
*/
