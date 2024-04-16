import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoopExampleTest {

    @Test
    void testSumWithZero() {
        assertEquals(0, LoopExample.sum(0));
    }

    @Test
    void testSumWithPositiveNumber() {
        assertEquals(55, LoopExample.sum(10));
    }

    @Test
    void testSumWithNegativeNumber() {
        assertEquals(-55, LoopExample.sum(-10));
    }
}
