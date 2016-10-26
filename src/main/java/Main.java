import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main class for telephone number processor
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString;

        System.out.println("Enter your telephone number: ");
        try {
            inputString = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("your input is:" + inputString);
    }
}
