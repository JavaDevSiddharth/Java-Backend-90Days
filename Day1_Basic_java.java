import java.util.Scanner;
public class Day1_Basic_java {
    public static void main(String[] args) {

// taking some basic problems
//Q1 write code to add three numbers
        int num1 = 23;
        int num2 = 43;
        int num3 = 46;
        int sum = num1 + num2 + num3;
        System.out.print("The sum of given numbers is: ");
        System.out.println(sum);

//Q2 write code for substraxtion for two numbers
        int a = 65;
        int b = 45;
        int substract = a - b;
        System.out.print("The substraction of two numbers is: ");
        System.out.println(substract);

//Q3 write code for multiplication of two numbers
        int x = 54;
        int y = 42;
        int multiply = x -y ;
        System.out.print("The multiplication of two numbers is: ");
        System.out.println(multiply);

//Q4 write code for division of two numbers
        int i = 90;
        int j = 3;
        int div = i / j ;
        System.out.print("The division of two numbers is: ");
        System.out.println(div);

//Q5 write code for calculate percentage if a given student in CBSE board exam his marks from 5 subjects must  be taken as input  from keyboard (out of 100)
        Scanner sc = new Scanner(System.in);
        System.out.print("The marks of chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("The marks of Physics: ");
        int Physics = sc.nextInt();
        System.out.print("The marks of Biology: ");
        int Biology = sc.nextInt();
        System.out.print("The marks of maths: ");
        int maths = sc.nextInt();
        System.out.print("The marks of English: ");
        int English = sc.nextInt();

        int total = chemistry + Physics + Biology + maths + English;
        double percentage = ((double) total /500 * 100);
        System.out.print("The CBSE percentage of student is: ");
        System.out.println(percentage);

    }
}
