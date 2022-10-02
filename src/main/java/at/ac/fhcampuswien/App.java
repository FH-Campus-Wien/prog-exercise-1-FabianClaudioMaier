package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals() {
        char z = 'Z';
        int hex = 0xface;
        int number = 012;
        long a = 80L;
        double b = 44e-1f;
        double c = 5.5f;
        double d = 8.88e1;
        double e = 99.9;
        int sum = (int) z + hex + number + (int) a + (int) b + (int) c + (int) d + (int) e;
        System.out.println(sum);
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers() {
        // input your solution here
        Scanner scan = new Scanner(System.in);

        int numberOne = scan.nextInt();
        int numberTwo = scan.nextInt();


        System.out.println(numberOne + numberTwo);

    }

    //todo Task 5
    public void swapTwoNumbers() {
        // input your solution here

        Scanner scan = new Scanner(System.in);

        System.out.println("Before Swap:");

        System.out.print("x: ");
        int a = scan.nextInt();
        System.out.print("y: ");
        int b = scan.nextInt();

        a += b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap:");
        System.out.println("x: " + a);
        System.out.println("y: " + b);

    }

    //todo Task 6
    public void compareTwoNumbers() {
        // input your solution here
        Scanner scan = new Scanner(System.in);

        System.out.print("n1: ");
        int numberOne = scan.nextInt();
        System.out.print("n2: ");
        int numberTwo = scan.nextInt();

        if (numberOne < numberTwo) {
            System.out.println("n2 > n1");
        } else if (numberOne > numberTwo) {
            System.out.println("n1 > n2");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here

        System.out.print("Enter annual Revenue: ");

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        if (number >= 0 && number < 100000) {
            if (number <= 20000) {
                System.out.println("Poor Sales Revenue");
            } else if (number <= 50000) {
                System.out.println("Average Sales Revenue");
            } else if (number <= 80000) {
                System.out.println("Good Sales Revenue");
            } else {
                System.out.println("Excellent Sales Revenue");
            }
        } else {
            System.out.println("Invalid Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate() {
        // input your solution here

        System.out.print("Enter CommissionClass: ");

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        double comRate;

        switch (number) {
            case 1:
                comRate = number / 100.0;
                break;
            case 2:
                comRate = number / 100.0;
                break;
            case 3:
                comRate = number / 100.0;
                break;
            case 4:
                comRate = number / 100.0;
                break;
            default:
                comRate = 0;
        }
        System.out.println("Your Commission Rate was set to " + comRate);
    }

    //todo Task 9
    public void leapyear() {
        // input your solution here

        System.out.print("Year: ");

        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println("Leapyear");
                } else {
                    System.out.println("Not a Leapyear");
                }
            } else {
                System.out.println("Leapyear");
            }
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers() {
        // input your solution here
        Scanner scan = new Scanner(System.in);

        int numberOne = scan.nextInt()%1000;
        int numberTwo = 0;

        for (int i = 1; i < 1000; i *= 10) {
            numberTwo += numberOne%(10*i)/i * (100/i);
        }
        System.out.println("Number: " + numberTwo);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}