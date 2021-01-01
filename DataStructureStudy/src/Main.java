import CH3.CaesarCipher;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        CaesarCipher cipher = new CaesarCipher(3);
         System.out.println("Encryption code = " + new String(cipher.encoder));
         System.out.println("Decryption code = " + new String(cipher.decoder));
         String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
         String coded = cipher.encrypt(message);
         System.out.println("Secret: " + coded);
         String answer = cipher.decrypt(coded);
         System.out.println("Message: " + answer);



    }

    public void insertionSort(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int k=arr[i];
            int j=i;
            while(j>0 &&k<arr[j-1] ){
                arr[j]=arr[j-1];
                j--;
            }
             arr[j]=k;
        }

    }
}
