package Polymorphism;

import Polymorphism.Interfaces.IGeometry;
import Polymorphism.Interfaces.IPacking;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class Main
 * @since 29.03.2021 - 18.08
 **/

public class Main {
    public static void main(String[] args) {
        CylinderNew cylinder1 = new CylinderNew(10, 5, "Black");
        IGeometry geometryCylinder = cylinder1;
        IPacking packingCylinder = cylinder1;

        System.out.println("Cylinder in Json: " + packingCylinder.toJSON() +
                "\n" + "Cylinder in XML: " + packingCylinder.toXML() +
                "\nVolume of cylinder = " + geometryCylinder.getVolume() +
                "\nPerimeter of cylinder = " + geometryCylinder.getPerimeter());

/*      Cylinder in Json: Cylinder{"radius":5.0}
        Cylinder in XML: <Cylinder><radius>5.0</radius></Cylinder>
        Volume of cylinder = 785.3981633974483
        Perimeter of cylinder = 31.41592653589793
*/
    }
}
