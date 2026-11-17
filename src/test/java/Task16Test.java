import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task16Test {
    @Test
    public void testFindAndPrintUnique() {
        Task16 task = new Task16();
        var actual = task.findAndPrintUnique(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 6});
        assertEquals(4, actual.size());
        assertTrue(actual.contains(1) && actual.contains(6));
    }
}