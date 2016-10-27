import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dmitry on 27.10.16.
 */
public class TelephoneReader {
    private int retriesNumber;
    /**
     * buffered reader for console reading
     */
    private BufferedReader bufferedReader;
    /**
     * telephone numbers validator
     */
    private TelephoneNumberValidator validator;

    public TelephoneReader()
    {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        this.validator = new TelephoneNumberValidator();
        this.retriesNumber = 5;
    }

    public TelephoneReader(BufferedReader reader)
    {
        this.bufferedReader = reader;
        this.validator = new TelephoneNumberValidator();
        this.retriesNumber = 5;
    }

    public TelephoneReader(BufferedReader reader, TelephoneNumberValidator validator)
    {
        this.bufferedReader = reader;
        this.validator = validator;
        this.retriesNumber = 5;
    }

    public String readTelephoneNumber() throws IOException {
        String userString;
        int count = 0;
        do {
            System.out.println("Enter your telephone number: ");
            userString = this.bufferedReader.readLine();
            if (this.validator.validate(userString)) {
                break;
            }
            System.out.println("Your number is invalid. " + this.validator.getMessage());
            count++;
        } while(count < this.retriesNumber);

        return userString;
    }
}
