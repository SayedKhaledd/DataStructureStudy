package CH3;

import java.util.Arrays;

public class CaesarCipher {
    public char[] decoder = new char[26];
    public char[] encoder = new char[26];


    public CaesarCipher(int rotation) {
        for (int i = 0; i < 26; i++) {
            encoder[i] = (char) ('A' + (i + rotation) % 26);
            decoder[i] = (char) ('A' + (i - rotation + 26) % 26);

        }

    }

    public String encrypt(String original) {
        return transform(original, encoder);
    }

    public String decrypt(String original) {
        return transform(original, decoder);
    }

    public String transform(String original, char[] code) {
        char[] msg = original.toCharArray();
        for (int i = 0; i < msg.length; i++) {
            if (Character.isUpperCase(msg[i])) {
                int index = msg[i] - 'A';
                msg[i] = code[index];

            }

        }
        return new String(msg);

    }

    @Override
    public String toString() {
        return "CH3.CaesarCipher{" +
                "decoder=" + Arrays.toString(decoder) +
                ", encoder=" + Arrays.toString(encoder) +
                '}';
    }


}
