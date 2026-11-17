public class Task21 {
    public boolean checkAndPrintLinearCombination(double[] a, double[] b) {
        if (a == null || b == null || a.length != b.length || a.length < 2) {
            System.out.println("Недостатньо даних для перевірки.");
            return false;
        }

        double k, c;
        if (b[0] == b[1]) {
            if (a[0] != a[1]) {
                System.out.println("Не є лінійною комбінацією.");
                return false;
            }
            k = 0; c = a[0];
        } else {
            k = (a[0] - a[1]) / (b[0] - b[1]);
            c = a[0] - k * b[0];
        }

        for (int i = 2; i < a.length; i++) {
            if (Math.abs(a[i] - (k * b[i] + c)) > 1e-9) {
                System.out.println("Повідомлення: НЕ є лінійною комбінацією.");
                return false;
            }
        }

        System.out.println("Повідомлення: Є лінійною комбінацією (k=" + k + ", c=" + c + ").");
        return true;
    }
}