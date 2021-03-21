package JavaClassDesign;

import java.util.Objects;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class Cylinder
 * @since 20.03.2021 - 13.15
 **/

public class Cylinder {
    private double height;
    private double radius;
    private String colour;

    public Cylinder() {
    }

    public Cylinder(double height, double radius, String colour) {
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

    //5 methods and required overrides bellow
    public double getAreaOfFoundation() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    public double getPerimeterOfFoundation() {
        return 2 * Math.PI * this.getRadius();
    }

    public double getAreaOfCylinderSide() {
        return this.getHeight() * getPerimeterOfFoundation();
    }

    public double getAreaOfCylinder() {
        return getAreaOfFoundation() * 2 + getAreaOfCylinderSide();
    }

    public double getVolumeOfCylinder() {
        return getAreaOfFoundation() * this.getHeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylinder cylinder = (Cylinder) o;
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
}
