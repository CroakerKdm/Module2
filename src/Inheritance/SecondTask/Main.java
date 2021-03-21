package Inheritance.SecondTask;

import java.time.LocalDate;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class Main
 * @since 20.03.2021 - 15.16
 **/

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1914, 12, 31);
        LocalDate date2 = LocalDate.of(2001, 1, 1);

        Person person = new Person("Ivan", "Ivanov", "Ivanovich", date1, 176,
                80, 90, 60, 90, "Ukrainian", "Kiev",
                "Unknown", "ВЕ983143", 'M', true, false, false);

        Student student = new Student("Petr", "Petrov", "Petrovich", date2, 200,
                100, 100, 80, 100, "Ukrainian", "Kharkiv",
                "Unknown", "ВH684648", 'M', false, true, true,
                "KN200", "Computer Science", "PIITU", true, "XA12454946",
                5, true, false);

        System.out.println(person);
        System.out.println(student);
    }
}
