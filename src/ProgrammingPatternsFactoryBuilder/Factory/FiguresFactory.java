package ProgrammingPatternsFactoryBuilder.Factory;

import Polymorphism.Interfaces.IGeometry;
import ProgrammingPatternsFactoryBuilder.Implementations.CubeInterface;
import ProgrammingPatternsFactoryBuilder.Implementations.CylinderInterface;
import ProgrammingPatternsFactoryBuilder.Implementations.ParallelepipedInterface;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class FiguresFactory
 * @since 30.03.2021 - 18.47
 **/

public class FiguresFactory {
    public static IGeometry create(int length, int width, int height) {
        if (length == width && width == height) {
            return new CubeInterface(length);
        }
        return new ParallelepipedInterface(length, width, height);
    }

    public static IGeometry create(double a, Figures figure) {
        if (figure.equals(Figures.CYLINDER)) return new CylinderInterface(a, a);
        if (figure.equals(Figures.CUBE)) return new CubeInterface(a);
        if (figure.equals(Figures.PARALLELEPIPED)) return new ParallelepipedInterface(a, a, a);
        return null;
    }

    public static IGeometry create(double a, double b, double c, Figures figure) {
        if (figure.equals(Figures.CYLINDER)) return new CylinderInterface(a, b);
        if (figure.equals(Figures.CUBE)) return new CubeInterface(a);
        if (figure.equals(Figures.PARALLELEPIPED)) return new ParallelepipedInterface(a, b, c);
        return null;
    }
}
