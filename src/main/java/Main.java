import java.io.IOException;

/**
 * Created by dmitry on 27.10.16.
 */
public class Main
{
    public static void main(String[] args) {
        TelephoneReader reader = new TelephoneReader();
        String number;
        try {
            number = reader.readTelephoneNumber();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("You've entered:" + number);
    }
}
