/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptOne() function.

        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        int space;
        String decode;
        int decodenum;
        // TODO: Complete the decryptTwo() function.
        while (encrypted.length() > 0){
            space =encrypted.indexOf(" ");
            decode = encrypted.substring(0, space);
            encrypted = encrypted.substring(space);
            decodenum = Integer.parseInt(decode);
            decode = String.valueOf((char)decodenum);
            decrypted = decrypted + decode;
        }

        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptThree() function.

        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
