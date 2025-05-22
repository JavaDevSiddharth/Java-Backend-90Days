import java.util.Scanner;
public class Day1_java_Basics {
    public static void main(String[] args) {
        System.out.println("lets practice basics");
//Q1 write program to add three numbers
        int num1 = 12;
        int num2 = 32;
        int num3 = 16;
        int sum = num1 + num2 + num3;
        System.out.print("The sum of three numbers is: ");
        System.out.println(sum);

//Q2 write program for subtract  two numbers
        int a = 70;
        int b = 20;
        int substraction = a - b ;
        System.out.print("The subtraction of two numbers is: ");
        System.out.println(substraction);

//Q3 write program for multiply two numbers
        int i = 10;
        int j = 5;
        int multiply = i * j;
        System.out.print("The multiplication of two numbers is: ");
        System.out.println(multiply);

//Q4 write code for divide two numbers
        int x = 100;
        int y = 2;
        int division = x / y ;
        System.out.print("The division of given numbers is: ");
        System.out.println(division);

//lets take an problem
//Q5 write a program to calculate percentage of a given students in CBSE Board exam.
//   his marks from 5 subjects  must be taken as input from keyboard (out of 100) ?
        Scanner sc = new Scanner(System.in);
        System.out.println("marks for subjects are below");
        System.out.println("marks for Maths");
        int Maths    = sc.nextInt();
        System.out.println("marrks for chemistry");
        int chemistry= sc.nextInt();
        System.out.println("marks for Physics");
        int Physics  = sc.nextInt();
        System.out.println("marks for Biology");
        int Biology  = sc.nextInt();
        System.out.println("marks for English");
        int English  = sc.nextInt();
        int total = Maths + chemistry + Physics + Biology + English /500 * 100;
        System.out.print("the total percentage of student is: ");
        System.out.println(total*100);
    }
}
