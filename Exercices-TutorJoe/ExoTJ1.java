// Write a program to find maximum between two numbers //

import java.util.Scanner;

public class ExoTJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /***** Variables *****/

        int num1;
        int num2;

        /*********************/

        System.out.println("Premier nombre: ");
        num1 = sc.nextInt();
        System.out.println("Deuxième nombre: ");
        num2 = sc.nextInt();

        /**********************/

        if (num1<num2) {
            System.out.println("Nombre maximum :"+num2);
        } else if (num1>num2) {
            System.out.println("Nombre maximum :"+num1);
        } else {
            System.out.println("Les nombres "+num1+" sont égaux.");
        }
    }
    
}
