public class spring_problems {
    public static void main(String[] args) {
        String name = " SIDDHARTH ";
// using replacement to spaces with underscore
        String replace = name.replace(" ","_");
        System.out.println(replace);

// writing code for converting the string to lowercase
        String lower = name.toLowerCase();
        System.out.println(lower);

//writing a  java code for fill-in latter template which looks like "Dear <|name |> thanks a lot !"
        System.out.println("Dear"+ name + "thanks a lot!");

// write the program to format at the following latter using escape sequence  characters
        String letters = "Dear sid,\n\t this java is very nice and enjoyable.\n\t\t\t\t Thanks!";
        System.out.println(letters);

    }
}
