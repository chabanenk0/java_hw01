import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dmitry on 27.10.16.
 */
public class TelephoneNumberValidatorTest {
    @Test
    public void testValidate() {
        TelephoneNumberValidator validator = new TelephoneNumberValidator();
        assertTrue(validator.validate("1234567"));
        assertFalse(validator.validate("1234"));
        assertEquals("Number should contain from 7 to 13 digits", validator.getMessage());
        assertTrue(validator.validate("1234567891234"));
        assertFalse(validator.validate("12345678912345"));
        assertEquals("Number should contain from 7 to 13 digits", validator.getMessage());
        assertFalse(validator.validate("1a35678912345"));
        assertEquals("Please use only digits.", validator.getMessage());
    }


}