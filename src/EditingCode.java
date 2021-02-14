import java.util.ArrayList;
import java.util.Scanner;

public class EditingCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<StringBuilder> arr = new ArrayList<>();

        String s1 = scan.nextLine();
        while (!s1.equals("")) {

            arr.add(new StringBuilder(s1));

            s1 = scan.nextLine();

        }
        editArr(arr);
        for (StringBuilder i : arr) {
            System.out.println(i);
        }
    }

    public static void editArr(ArrayList<StringBuilder> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int counter = 0;
            StringBuilder s=arr.get(i);

             for(int j=0;j<s.length();j++){
                 if(Character.isDigit(s.charAt(j))){
                     counter++;
                 }
                 else if(s.charAt(j)==' ') {
                 counter++;
                 }
                 else
                     break;
             }
             s.delete(0,counter);

        }
    }
}
