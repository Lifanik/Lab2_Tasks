import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task1Test {
    @Test
    public void testProcessAndPrint() {
        Task1 task = new Task1();
        int[] expected = {-1, -5, -3, 3, 0, 2, 8};
        assertArrayEquals(expected, task.processAndPrint(new int[]{3, -1, 0, -5, 2, 8, -3}));
    }
}