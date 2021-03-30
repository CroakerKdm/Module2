package Polymorphism;

import Polymorphism.Interfaces.IGeometry;
import Polymorphism.Interfaces.IPacking;

import java.util.Objects;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class CylinderNew
 * @since 29.03.2021 - 18.11
 **/

public class CylinderNew implements IGeometry, IPacking {
    private double height;
    private double radius;
    private String colour;

    public CylinderNew() {
    }

    public CylinderNew(double height, double radius, String colour) {
        this.height = height;
        this.radius = radius;
        colour = colour;
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        colour = colour;
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
        CylinderNew cylinder = (CylinderNew) o;
        return Double.compare(cylinder.getHeight(), getHeight()) == 0 && Double.compare(cylinder.getRadius(), getRadius()) == 0 && Objects.equals(getColour(), cylinder.getColour());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getRadius(), getColour());
    }

    @Override
    public String toString() {
        return  "height=" + height +
                ", radius=" + radius +
                ", Colour='" + colour + '\'';
    }

    @Override
    public String toJSON() {
        return "Cylinder" + "{" + "\"" + "radius" + "\"" + ":"
                + this.getRadius() + "}";
    }

    @Override
    public String toXML() {
        return "<Cylinder>"
                + "<radius>" + this.getRadius() + "</radius>"
                + "</Cylinder>";
    }
}
