package CH3.Exercises;

import java.util.Random;

public class R2 {
    public static void main(String[] args) {
        Integer[] s = {1, 2, 4};
        delete(s);
        for (Integer o : s) {
            System.out.println(o);
        }
    }

    public static void delete(Object[] arr) {
        Random random = new Random(System.currentTimeMillis());
        int counter = 0;
        while (true) {
            if (counter == arr.length) break;
            else {
                int x = random.nextInt(arr.length);
                if (arr[x] == null) continue;
                arr[x] = null;
                counter++;
            }
        }
    }
}
