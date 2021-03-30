package ProgrammingPatternsFactoryBuilder.Implementations;

import Polymorphism.Interfaces.IGeometry;

import java.util.Objects;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class CylinderImpl
 * @since 30.03.2021 - 18.58
 **/

public class CylinderInterface implements IGeometry {
    private double height;
    private double radius;

    public CylinderInterface() {
    }

    public CylinderInterface(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAreaOfFoundation() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.getRadius();
    }

    public double getAreaOfCylinderSide() {
        return this.getHeight() * getPerimeter();
    }

    public double getAreaOfCylinder() {
        return getAreaOfFoundation() * 2 + getAreaOfCylinderSide();
    }

    @Override
    public double getVolume() {
        return getAreaOfFoundation() * this.getHeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CylinderInterface cylinder = (CylinderInterface) o;
        return Double.compare(cylinder.getHeight(), getHeight()) == 0 && Double.compare(cylinder.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getRadius());}

    @Override
    public String toString() {
        return  "height=" + height +
                ", radius=" + radius +
                 '\'';
    }
}
