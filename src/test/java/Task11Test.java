import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task11Test {
    @Test
    public void testFindAndPrintOutOfBounds() {
        Task11 task = new Task11();
        var actual = task.findAndPrintOutOfBounds(0, 10, new int[]{5, 10, -2, 15, 8, 20});
        assertEquals(3, actual.size()); // -2, 15, 20
    }
}