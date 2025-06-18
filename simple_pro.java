import java.util.Scanner;
class simple_problem {
    public static void main(String[] args) {
        // writing some problems of operators conditionals
        // Q1) program to encrypt a grade by adding 8 to it and decrypt  it to show carrect grade
         char grade = 'A';
         char encrypt = (char) (grade + 4);
        System.out.println(encrypt);
        char decrypt = (char) (encrypt - 4);
        System.out.println(decrypt);

        // using comparision operators find out whether a given number is greater than the users entered number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num>=42);
    }
}
