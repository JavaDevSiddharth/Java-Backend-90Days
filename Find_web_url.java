import java.util.Scanner;
class Find_web_url {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String web = sc.next();
        if (web.endsWith(".com")) {
            System.out.println("This is commercial website");
        } else if (web.endsWith(".in")) {
            System.out.println("This is india website");
        } else if (web.endsWith(".org")) {
            System.out.println("This is organization website ");
        } else{
            System.out.println("This is unknown website");
        }
    }
}