package ProgrammingPatternsFactoryBuilder;

import Polymorphism.Interfaces.IGeometry;
import ProgrammingPatternsFactoryBuilder.Factory.CylinderFactory;
import ProgrammingPatternsFactoryBuilder.Factory.Figures;
import ProgrammingPatternsFactoryBuilder.Factory.FiguresFactory;
import ProgrammingPatternsFactoryBuilder.Implementations.CylinderInterface;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class Main
 * @since 29.03.2021 - 18.28
 **/

public class Main {
    public static void main(String[] args) {
        CylinderInterface cylinder = CylinderFactory.create(5, 10);
        System.out.println("Cylinder is " + cylinder);

        IGeometry CylinderInterface = FiguresFactory.create(1, Figures.CYLINDER);
        IGeometry ParallelepipedInterface = FiguresFactory.create(5, 10, 10, Figures.PARALLELEPIPED);
        IGeometry CubeInterface = FiguresFactory.create(5, 5, 5);

        System.out.println("Cylinder: " + CylinderInterface);
        System.out.println("Parallelepiped: " + ParallelepipedInterface);
        System.out.println("Cube: " + CubeInterface);
    }

/*  Cylinder is height=10.0, radius=5.0'
    Cylinder: height=1.0, radius=1.0'
    Parallelepiped: {length=5.0, width=10.0, height=10.0}
    Cube: {side=5.0}
*/
}
