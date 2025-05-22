public class Stringoperation {
    public static void main(String[] args) {
        String text = "Hello, Siddharth";

        //String length
        System.out.println("Length: "+ text.length());
        
        // Substring
        System.out.println("Substring (0-5): "+  text.substring(0,5));

        // Concatenation
        String newText = text.concat(" Let's Learn!");
        System.out.println("Concatenated: " + newText);

        // Character at index
        System.out.println("Character at index 1: " + newText.charAt(1));

        // Convert to uppercase
        System.out.println("uppercase: " + text.replace("hello", "Siddharth"));
    }
}
