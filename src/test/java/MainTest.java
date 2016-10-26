import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by dmitry on 26.10.16.
 */
public class MainTest {
    @Test
    public void testMain()
    {
        Main m = new Main();
        try {
            String[] args = new String[0];
            m.main(args);
            assertTrue(true);
        } catch (Exception e) {
            fail("exception has been thrown during the main class invocation");
        }

    }
}
