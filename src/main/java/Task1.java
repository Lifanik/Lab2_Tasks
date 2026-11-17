import java.util.Arrays;

public class Task1 {
    public int[] processAndPrint(int[] a) {
        int[] b = new int[a.length];
        int index = 0;

        for (int val : a) if (val < 0) b[index++] = val;
        for (int val : a) if (val >= 0) b[index++] = val;

        System.out.println("Сформований масив b: " + Arrays.toString(b));
        return b;
    }
}