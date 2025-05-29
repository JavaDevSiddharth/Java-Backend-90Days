import java .util.Scanner;
public class conditionals {
    public static void main(String[] args) {

// what is the output of following program
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.print("Enter the age: ");
        if (a>=18){
            System.out.println("you are adult now!");
        }
        if(a<18) {
            System.out.println("you are not adult yet!");
        }
        if(a>21){
            System.out.println("do the job!");
        }
        if(a>60){
            System.out.println("you are now retired!");
        }
    }
}
