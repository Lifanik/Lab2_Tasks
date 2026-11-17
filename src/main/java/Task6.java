import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public List<int[]> findAndPrintLocalMinima(int[] a) {
        List<int[]> result = new ArrayList<>();
        if (a == null || a.length == 0) return result;

        System.out.print("Локальні мінімуми: ");
        for (int i = 0; i < a.length; i++) {
            boolean isMin = true;
            if (i > 0 && a[i] >= a[i - 1]) isMin = false;
            if (i < a.length - 1 && a[i] >= a[i + 1]) isMin = false;

            if (isMin) {
                result.add(new int[]{i, a[i]});
                System.out.print("[Індекс=" + i + ", Значення=" + a[i] + "] ");
            }
        }
        System.out.println();
        return result;
    }
}