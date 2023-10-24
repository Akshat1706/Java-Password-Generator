import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // Creating all the variables
        System.out.println("Password Generator");
        Scanner Scan = new Scanner(System.in);
        System.out.println("To proceed with Password generation write Yes");
        String[] Alphabet = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f" };
        String[] number = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        String[] symbol = { "@", "#", "$", "%", "^", "&" };

        String answer = Scan.nextLine();// Setting up the scanner object

        // Conditional Sentences
        if (answer.equals("Yes")) {
            String[] psw = { "", "", "", "", "", "", "", "", "", "", "", "" };

            // Adds the alphabet first
            for (int i = 0; i < 8; i++) {
                Random r = new Random();// Creates a object
                int RandomNumber = r.nextInt(Alphabet.length);// The range is form 0 to the lenth of alphabet and this
                                                              // integar stores the random int
                psw[i] = Alphabet[RandomNumber];
            }
            // Adds the symbol second
            for (int i = 8; i < 9; i++) {
                Random r = new Random();// Creates a object
                int RandomNumber = r.nextInt(symbol.length);// The range is form 0 to the lenth of alphabet and this
                                                            // integar stores the random int
                psw[i] = symbol[RandomNumber];
            }
            // Adds the number last
            for (int i = 9; i < 12; i++) {
                Random r = new Random();// Creates a object
                int RandomNumber = r.nextInt(number.length);// The range is form 0 to the lenth of alphabet and this
                                                            // integar stores the random int
                psw[i] = number[RandomNumber];
            }

            // Traverses and prints the array
            System.out.print("Your password is -: ");
            for (int i = 0; i < psw.length; i++) {
                System.out.print(psw[i]);

            }

        } else {

            System.exit(0);
        }
        Scan.close();

    }
}
