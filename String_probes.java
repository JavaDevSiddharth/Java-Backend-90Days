public class String_probes {
    public static void main(String[] args) {
        // Some String problems (using some String methods)
        // convert into lowercase
        String name;
        name = "    DemonLoki    ";
        String lowercase = name.toLowerCase();
        System.out.println(lowercase);

        // convert to uppercase
        String uppercase= name.toUpperCase();
        System.out.println(uppercase);

        // replace spaces with underscores
        String replaced = name.replace(' ','_');
        System.out.println(replaced);

        //writing a program to fill the template "dear <|name|> thanks a lot! "
        System.out.println("Dear"+name+"thanks a lot!");

        // using some escap sequence characters
        System.out.println("Dear Demonloki,\n\t\tdoing great again after to long time\n\t\tnice work and thanks for start!");
    }
}
