package ProgrammingPatternsFactoryBuilder.Factory;

import ProgrammingPatternsFactoryBuilder.Implementations.CylinderInterface;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class CylinderFactory
 * @since 30.03.2021 - 19.04
 **/
public class CylinderFactory {

    public static CylinderInterface create(double radius, double height) {
        return new CylinderInterface(height, radius);
    }
}
