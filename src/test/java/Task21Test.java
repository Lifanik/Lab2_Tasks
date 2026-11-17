import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Task21Test {
    @Test
    public void testCheckAndPrintLinearCombination() {
        Task21 task = new Task21();
        assertTrue(task.checkAndPrintLinearCombination(new double[]{5, 7, 9, 11}, new double[]{1, 2, 3, 4}));
        assertFalse(task.checkAndPrintLinearCombination(new double[]{5, 7, 10, 11}, new double[]{1, 2, 3, 4}));
    }
}