//Using Twofish algorithm
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class TwofishDecryption {
    public static void main(String[] args) throws Exception {
        String encryptedValue = "e7Vn+b4vJ4K4WbTZ9zgfMg==";
        byte[] keyValue = new byte[] { 'A', 'S', 'e', 'c', 'u', 'r', 'e', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y' };
        SecretKeySpec key = new SecretKeySpec(keyValue, "Twofish");
        Cipher c = Cipher.getInstance("Twofish");
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = Base64.decodeBase64(encryptedValue);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        System.out.println("Decrypted Value: "+decryptedValue);

    }

}