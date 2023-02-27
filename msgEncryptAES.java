// USING AES (Advanced Encryption Standard) algorithm
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESEncryption {
public static void main(String[] args) throws Exception {

String plainText = "Hello World!";
Key key = generateKey();
Cipher c = Cipher.getInstance("AES");
c.init(Cipher.ENCRYPT_MODE, key);
byte[] encVal = c.doFinal(plainText.getBytes());
String encryptedValue = new BASE64Encoder().encode(encVal);
System.out.println("Encrypted Value: "+encryptedValue);
}

private static Key generateKey() throws Exception {
byte[] keyValue = new byte[] { 'A', 'S', 'e', 'c', 'u', 'r', 'e', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y' };
Key key = new SecretKeySpec(keyValue, "AES");
return key;
}
}