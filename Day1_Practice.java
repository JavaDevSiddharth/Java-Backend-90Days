import java.util.Scanner;
class Day1_Practice {
    public static void main(String[] args) {

//Q1 write a program to calculate cgpa using marks of 3 subjects (out of 100)
        Scanner sc = new Scanner(System.in);
        System.out.print("The marks of English is: ");
        int English = sc.nextByte();
        System.out.print("The marks of dutch is: ");
        int dutch = sc.nextByte();
        System.out.print("The marks of Spanish is: ");
        int  Spanish = sc.nextByte();

        int total = English + dutch + Spanish;
        double CGPA = ((double) total/300 * 10);
        System.out.print("The CGPA is: ");
        System.out.println(CGPA);

//Q2 write a program which ask that user to enter his/her name and create them with "Hello <name>" have a good day
       String name  = sc.next();
       System.out.println("hello "+ name +" you have a nice day!");

//Q3 write a program to convert kilometers to miles
        System.out.print("The given kilometers is: ");
        double kilometer = sc.nextDouble();
        double miles = kilometer  * 0.621371;
        System.out.print("The Given  kilometers convert in to miles is: ");
        System.out.println(miles);
    }
}
