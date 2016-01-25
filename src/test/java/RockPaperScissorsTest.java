import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Taylor on 1/24/16.
 */
public class RockPaperScissorsTest {
    ComputerPlayer compy;

    @Before
    public void asset() {
       compy = new ComputerPlayer();
    }

    @Test
    public void computerResponseTest() {
        assertTrue("Computer input will be a number from 1 to 3.",compy.compResponse() <= 3 && compy.compResponse() > 0);
    }
}
