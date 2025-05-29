public class loop_problem {
    public static void main(String[] args) {

//write a java program to sum of first n natural numbers sum using while loop
        int n = 10; // input number
        int sum = 0;

        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
