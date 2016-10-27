import java.io.IOException;

/**
 * Created by dmitry on 27.10.16.
 */
public class Main
{
    public static void main(String[] args) {
        TelephoneReader reader = new TelephoneReader();
        TelephoneProcessor processor = new TelephoneProcessor();
        String number;
        try {
            number = reader.readTelephoneNumber();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        String result = processor.process(number);
        System.out.println("Final result is:" + result);
    }
}
