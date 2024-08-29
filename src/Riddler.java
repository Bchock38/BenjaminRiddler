//import jdk.incubator.vector.VectorOperators;

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
// a= 97 z = 122
        // A=65- Z=90
        // TODO: Complete the decryptOne() function.
        String decodechr;
        String currentchr;
        Character cchar;
        int chrascii;
        int dif;
        while (encrypted.length() > 1){
            currentchr = encrypted.substring(0,1);
            cchar = currentchr.charAt(0);
            chrascii = (int) cchar;
            if ( chrascii <= 122 && chrascii >= 97){
                if (chrascii+9 > 122){
                    dif = chrascii+9-123;
                    chrascii = 97 + dif;
                }
                else{
                    chrascii = chrascii+9;
                }
                decodechr = Character.toString((char) chrascii);
                decrypted = decrypted + decodechr;
            }
            else if ( chrascii <= 90 && chrascii >= 65){
                if (chrascii+9 > 90){
                    dif = chrascii+9 - 91;
                    chrascii = 65 + dif;
                }
                else{
                    chrascii = chrascii + 9;
                }
                decodechr = Character.toString((char) chrascii);
                decrypted = decrypted + decodechr;
            }
            else {
                decrypted = decrypted + cchar;
            }
            encrypted = encrypted.substring(1);
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        int space;
        String decode;
        int decodenum;
        // TODO: Complete the decryptTwo() function.
        while (encrypted.length() > 1){
            space = encrypted.indexOf(" ");
            decode = encrypted.substring(0, space);
            decodenum = Integer.parseInt(decode);
            encrypted = encrypted.substring(space+1);
            decode = String.valueOf((char)decodenum);
            decrypted = decrypted + decode;
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        Character temp;
        Character tempChr;
        int tempint = 0;
        int total = 0;
        // TODO: Complete the decryptThree() function.
        while (encrypted.length() > 0){
            for (int i = 0; i < 8; i++){
                temp = encrypted.charAt(i);
                tempint = Integer.parseInt(String.valueOf(temp));
                //System.out.print(tempint);
                total += tempint << 7-i;

            }
            //System.out.print(total);
            //System.out.print(" ");
            tempChr = (char) total;
            //System.out.println(tempChr);
            decrypted = decrypted + tempChr;
            encrypted = encrypted.substring(8);
            total = 0;
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
