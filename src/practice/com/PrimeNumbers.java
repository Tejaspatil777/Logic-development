package practice.com;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers Application");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("it is prime number");
        }else {
            System.out.println("it is not prime number");
        }
        }
    }
