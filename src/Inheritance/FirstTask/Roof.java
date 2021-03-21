package Inheritance.FirstTask;

import java.util.Objects;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class Roof
 * @since 20.03.2021 - 14.02
 **/

public class Roof extends Rectangle {
    private static final double pricePerInsulationMillimeter = 0.2;
    private String material;
    private double thickness;
    private boolean isInsulated;

    public Roof() {
    }

    public Roof(double length, double width, String material, double thickness, boolean isInsulated) {
        super(length, width);
        this.material = material;
        this.thickness = thickness;
        this.isInsulated = isInsulated;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public boolean isInsulated() {
        return isInsulated;
    }

    public void setInsulated(boolean insulated) {
        isInsulated = insulated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Roof roof = (Roof) o;
        return Double.compare(roof.getThickness(), getThickness()) == 0 && isInsulated() == roof.isInsulated() && Objects.equals(getMaterial(), roof.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMaterial(), getThickness(), isInsulated());
    }

    @Override
    public String toString() {
        return " { " +
                "Material='" + material + '\'' +
                ", thickness=" + thickness +
                ", isInsulated=" + isInsulated +
                super.toString();
    }

    public double getInsulationPrice() {
        if (!this.isInsulated()) {
            return 0;
        } else {
            return (this.getThickness() / 2) * pricePerInsulationMillimeter * this.getArea();
        }
    }

    public double getMaterialPrice() {
        if (this.getMaterial().equals("Wood")){
            return 10.3;
        }
        else if (this.getMaterial().equals("Stone")){
            return 15.8;
        }
        else return 0;
    }

    public int getPrice() {
        return (int) (this.getArea() * getMaterialPrice() + getInsulationPrice());
    }
}
