import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Hello \"World!\" ");
        System.out.println("Enter a value.");

        int text = userInput.nextInt();

        System.out.println("Input: " +text);
        System.out.println("Double of Input: " +text*2);
        String var = "#";
        System.out.println("Visual Representation: " + var.repeat(text));

        int i = 0;
        do {
            System.out.println(var.repeat(i));
            i++;
        }
        while (i<text);


    }
}
