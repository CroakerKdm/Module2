package Inheritance.SecondTask;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class Person
 * @since 20.03.2021 - 15.16
 **/

public class Person {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private LocalDate dateOfBirth;
    private double height;
    private double weight;
    private double chestGirth;
    private double waistGirth;
    private double thighGirth;
    private String nationality;
    private String placeOfBirth;
    private String address;
    private String passportCode;
    private char gender;
    private boolean isDisabled;
    private boolean isServing; //military, doesnt necessarily mean active
    private boolean isWorking;

    public Person() {
    }

    public Person(String firstName, String lastName, String patronymicName, LocalDate dateOfBirth, double height,
                  double weight, double chestGirth, double waistGirth, double thighGirth, String nationality,
                  String placeOfBirth, String address, String passportCode, char gender, boolean isDisabled,
                  boolean isServing, boolean isWorking) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
        this.chestGirth = chestGirth;
        this.waistGirth = waistGirth;
        this.thighGirth = thighGirth;
        this.nationality = nationality;
        this.placeOfBirth = placeOfBirth;
        this.address = address;
        this.passportCode = passportCode;
        this.gender = gender;
        this.isDisabled = isDisabled;
        this.isServing = isServing;
        this.isWorking = isWorking;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getChestGirth() {
        return chestGirth;
    }

    public void setChestGirth(double chestGirth) {
        this.chestGirth = chestGirth;
    }

    public double getWaistGirth() {
        return waistGirth;
    }

    public void setWaistGirth(double waistGirth) {
        this.waistGirth = waistGirth;
    }

    public double getThighGirth() {
        return thighGirth;
    }

    public void setThighGirth(double thighGirth) {
        this.thighGirth = thighGirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassportCode() {
        return passportCode;
    }

    public void setPassportCode(String passportCode) {
        this.passportCode = passportCode;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }

    public boolean isServing() {
        return isServing;
    }

    public void setServing(boolean serving) {
        isServing = serving;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.getHeight(), getHeight()) == 0 && Double.compare(person.getWeight(),
                getWeight()) == 0 && Double.compare(person.getChestGirth(),
                getChestGirth()) == 0 && Double.compare(person.getWaistGirth(),
                getWaistGirth()) == 0 && Double.compare(person.getThighGirth(),
                getThighGirth()) == 0 && getGender() == person.getGender() && isDisabled() == person.isDisabled()
                && isServing() == person.isServing() && isWorking() == person.isWorking() && Objects.equals(getFirstName(),
                person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getPatronymicName(),
                person.getPatronymicName()) && Objects.equals(getDateOfBirth(), person.getDateOfBirth()) && Objects.equals(getNationality(),
                person.getNationality()) && Objects.equals(getPlaceOfBirth(), person.getPlaceOfBirth()) && Objects.equals(getAddress(),
                person.getAddress()) && Objects.equals(getPassportCode(), person.getPassportCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPatronymicName(), getDateOfBirth(), getHeight(),
                getWeight(), getChestGirth(), getWaistGirth(), getThighGirth(), getNationality(), getPlaceOfBirth(),
                getAddress(), getPassportCode(), getGender(), isDisabled(), isServing(), isWorking());
    }

    @Override
    public String toString() {
        return "Person {" +
                "First Name = '" + firstName + '\'' +
                ", Last Name = '" + lastName + '\'' +
                ", Patronymic Name = '" + patronymicName + '\'' +
                ", date Of Birth = " + dateOfBirth +
                ", height = " + height + '\n' +
                ", weight = " + weight +
                ", chest Girth = " + chestGirth +
                ", waist Girth = " + waistGirth +
                ", thigh Girth = " + thighGirth +
                ", nationality = '" + nationality + '\'' + '\n' +
                ", placeOfBirth = '" + placeOfBirth + '\'' +
                ", address = '" + address + '\'' +
                ", passportCode = '" + passportCode + '\'' +
                ", gender = " + gender +
                ", isDisabled = " + isDisabled +
                ", isServing = " + isServing + '\n' +
                ", isWorking = " + isWorking;
    }
}
