package Inheritance.FirstTask;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class Main
 * @since 20.03.2021 - 14.53
 **/
public class Main {
    public static void main(String[] args) {
        Roof roof1 = new Roof(23.5, 18.3, "Wood", 10, true);
        Roof roof2 = new Roof(25.3, 13.8, "Stone", 5, false);

        System.out.println("First roof:" + roof1.toString() +
                "\n Price of 1 roof = " + roof1.getPrice()); //4859

        System.out.println("Second roof:" + roof2.toString() +
                "\n Price of 2 roof = " + roof2.getPrice()); //5516
    }
}
