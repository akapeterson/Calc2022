package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        delete();
        add();
    }
    public static void delete(){

    }
    public static void add(){
        System.out.println("Please add your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please add your Second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The Total is: " + total);
    }
}
