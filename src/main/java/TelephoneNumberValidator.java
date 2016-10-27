/**
 * Class for performing the telephone number validation.
 * Simple variant, uses the length check and allows only digits
 * Created by dmitry on 27.10.16.
 */
public class TelephoneNumberValidator {
    private int maxDigits;

    private int minDigits;

    private String message;

    public TelephoneNumberValidator()
    {
        this.maxDigits = 13;
        this.minDigits = 7;
        this.message = "";
    }

    public TelephoneNumberValidator(int maxDigits, int minDigits)
    {
        this.maxDigits = maxDigits;
        this.minDigits = minDigits;
        this.message = "";
    }

    public boolean validate(String telephoneNumber)
    {
        if ((telephoneNumber.length() > this.maxDigits) || (telephoneNumber.length() < this.minDigits)) {
            this.message = "Number should contain from 7 to 13 digits";
            return false;
        }
        for(int i = 0; i < telephoneNumber.length(); i++) {
            if (!Character.isDigit(telephoneNumber.charAt(i))) {
                this.message = "Please use only digits.";
                return false;
            }
        }

        return true;
    }

    public String getMessage()
    {
        return this.message;
    }
}
