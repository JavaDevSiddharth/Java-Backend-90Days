import java.util.Scanner;
public class integer_detection {
    public static void main(String[] args) {

// write a java program to detect whether a number entered by the user is integer or not
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println(sc.hasNextInt());
    }
}
