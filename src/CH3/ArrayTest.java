package CH3;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        int data[] = new int[10];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }
        int[] org = Arrays.copyOf(data, data.length);
        System.out.println("Arrays equals before sort : " + Arrays.equals(data, org));
        Arrays.sort(data);
        System.out.println("Arrays equals after sort : " + Arrays.equals(data, org));
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(org));


    }

    public static int[][] deepClone(int[][] original) {
       int[][] backup=new int[original.length][];
       for(int i=0;i< backup.length;i++){
           backup[i]=original[i].clone();
       }
       return backup;
    }

    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int k = arr[i];
            int j = i;
            while (j > 0 && k < arr[i - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = k;

        }
    }
}
