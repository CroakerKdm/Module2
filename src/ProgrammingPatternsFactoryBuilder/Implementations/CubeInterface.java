package ProgrammingPatternsFactoryBuilder.Implementations;

import Polymorphism.Interfaces.IGeometry;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class SquareImpl
 * @since 30.03.2021 - 18.49
 **/

public class CubeInterface implements IGeometry {
    private double side;

    public CubeInterface() {
    }

    public CubeInterface(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "{" +
                "side=" + side +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 12 * side;
    }

    @Override
    public double getVolume() {
        return side * 3;
    }
}
