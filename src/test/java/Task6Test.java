import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task6Test {
    @Test
    public void testFindAndPrintLocalMinima() {
        Task6 task = new Task6();
        var actual = task.findAndPrintLocalMinima(new int[]{5, 2, 8, 1, 9});
        assertEquals(2, actual.size());
        assertArrayEquals(new int[]{1, 2}, actual.get(0));
    }
}