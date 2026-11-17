import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task16 {
    public List<Integer> findAndPrintUnique(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        for (int val : a) setA.add(val);

        Set<Integer> setB = new HashSet<>();
        for (int val : b) setB.add(val);

        List<Integer> result = new ArrayList<>();
        for (int val : setA) if (!setB.contains(val)) result.add(val);
        for (int val : setB) if (!setA.contains(val)) result.add(val);

        System.out.println("Елементи, що є тільки в одному з масивів: " + result);
        return result;
    }
}