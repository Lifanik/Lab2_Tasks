import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Потрібно передати amin, amax та елементи масиву.");
            return;
        }
        int amin = Integer.parseInt(args[0]);
        int amax = Integer.parseInt(args[1]);
        int[] a = new int[args.length - 2];
        for (int i = 2; i < args.length; i++) {
            a[i - 2] = Integer.parseInt(args[i]);
        }
        new Task11().findAndPrintOutOfBounds(amin, amax, a);
    }

    public List<int[]> findAndPrintOutOfBounds(int amin, int amax, int[] a) {
        List<int[]> result = new ArrayList<>();
        System.out.print("Елементи поза границями (" + amin + "..." + amax + "): ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] < amin || a[i] > amax) {
                result.add(new int[]{i, a[i]});
                System.out.print("[i=" + i + ", val=" + a[i] + "] ");
            }
        }
        System.out.println();
        return result;
    }
}