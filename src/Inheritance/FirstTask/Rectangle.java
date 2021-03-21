package Inheritance.FirstTask;

import java.util.Objects;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class Rectangle
 * @since 20.03.2021 - 14.00
 **/

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

    @Override
    public String toString() {
        return  ", length = " + length +
                ", width = " + width +
                " }";
    }

    public double getArea() {
        return this.getWidth() * this.getLength();
    }

}
