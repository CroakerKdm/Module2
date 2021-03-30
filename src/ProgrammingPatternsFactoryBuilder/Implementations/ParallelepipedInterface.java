package ProgrammingPatternsFactoryBuilder.Implementations;

import Polymorphism.Interfaces.IGeometry;

import java.util.Objects;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class ParalelipipedImpl
 * @since 30.03.2021 - 18.52
 **/

public class ParallelepipedInterface implements IGeometry {
    private double length;
    private double width;
    private double height;

    public ParallelepipedInterface() {
    }

    public ParallelepipedInterface(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParallelepipedInterface that = (ParallelepipedInterface) o;
        return Double.compare(that.getLength(), getLength()) == 0 && Double.compare(that.getWidth(),
                getWidth()) == 0 && Double.compare(that.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth(), getHeight());
    }

    @Override
    public String toString() {
        return "{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 4 * (length + width + height);
    }

    @Override
    public double getVolume() {
        return this.getWidth() * this.getLength() * this.getHeight();
    }
}
