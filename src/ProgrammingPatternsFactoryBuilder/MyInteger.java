package ProgrammingPatternsFactoryBuilder;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module2
 * @class MyInteger
 * @since 30.03.2021 - 18.31
 **/

public class MyInteger {
    public static boolean isPrime(int num) throws Exception {
        if (num <= 0) {
            throw new Exception("Number should be >0");
        }
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is prime");
            }
        }
    }
}

/*

Number 2 is prime
Number 3 is prime
Number 5 is prime
Number 7 is prime
Number 11 is prime
Number 13 is prime
Number 17 is prime
Number 19 is prime
Number 23 is prime
Number 29 is prime
Number 31 is prime
Number 37 is prime
Number 41 is prime
Number 43 is prime
Number 47 is prime
Number 53 is prime
Number 59 is prime
Number 61 is prime
Number 67 is prime
Number 71 is prime
Number 73 is prime
Number 79 is prime
Number 83 is prime
Number 89 is prime
Number 97 is prime

*/