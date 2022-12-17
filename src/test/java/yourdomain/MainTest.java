package yourdomain;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class MainTest {
    @Test
    public void testName() {
        MainApp mainApp = new MainApp();
        assertNotNull(mainApp);
    }
}
