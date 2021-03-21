package JavaClassDesign;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class Main
 * @since 20.03.2021 - 13.38
 **/

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(10, 5, "Black");
        Cylinder cylinder2 = new Cylinder(5, 10, "White");

        System.out.println("First cylinder: " + cylinder1.toString() +
                "\n Volume of 1 cylinder = " + cylinder1.getVolumeOfCylinder() + //785.3981633974483
                "\n Area of 1 cylinder = " + cylinder1.getAreaOfCylinder() + "\n"); //471.23889803846896

        System.out.println("Second cylinder: " + cylinder2.toString() +
                "\n Volume of 2 cylinder = " + cylinder2.getVolumeOfCylinder() + //1570.7963267948967
                "\n Area of 2 cylinder = " + cylinder2.getAreaOfCylinder() + "\n"); //942.4777960769379
    }
}
