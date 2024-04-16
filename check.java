import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoopExampleTest {

    @Test
    public void testSum() {
        int expectedSum = 55; // Kết quả mong đợi khi tổng các số từ 1 đến 10

        // Gọi phương thức tính tổng từ 1 đến 10
        int actualSum = 0;
        for (int i = 1; i <= 10; i++) {
            actualSum += i;
        }

        // So sánh kết quả thực tế với kết quả mong đợi
        assertEquals(expectedSum, actualSum);
    }
}
