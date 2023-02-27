// USING AES (Advanced Encryption Standard) algorithm
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class AESDecryption {
    public static void main(String[] args) throws Exception {
        String encryptedValue = "zKf+mTZQ8VHcGmv1+VyGxw==";
        Key key = generateKey();
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = Base64.decodeBase64(encryptedValue);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        System.out.println("Decrypted Value: "+decryptedValue);
    }

    private static Key generateKey() throws Exception {
        byte[] keyValue = new byte[] { 'A', 'S', 'e', 'c', 'u', 'r', 'e', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y' };
        Key key = new SecretKeySpec(keyValue, "AES");
        return key;

    }
}
