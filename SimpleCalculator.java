import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("enter the values\n enter first number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("enter second number:");
        int num2 = sc.nextInt();
        System.out.println("give me the condition\n +(Addition) \n -(substraction) \n *(Multiplication \n /(Division)");
        String input = sc.next();
       switch (input){
           case "+":
               System.out.println("the addition of given numbers is: "+ (num1+num2));
               break;
           case "-":
               System.out.println("The substraction of given numbers is: "+ (num1-num2));
               break;
           case "*":
               System.out.println("The multiplication of given numbers is: "+ (num1*num2));
               break;
           case "/":
               System.out.println("The division of given numbers is: "+ (num1/num2));
               break;
           default:
               System.out.println("incorrect option");

        }
    }
}
