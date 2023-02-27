//Using Twofish algorithm
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class TwofishEncryption {

public static void main(String[] args) throws Exception {
String plainText = "Hello World!";
byte[] keyValue = new byte[] { 'A', 'S', 'e', 'c', 'u', 'r', 'e', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y' };
SecretKeySpec key = new SecretKeySpec(keyValue, "Twofish");
Cipher c = Cipher.getInstance("Twofish");
c.init(Cipher.ENCRYPT_MODE, key);
byte[] encVal = c.doFinal(plainText.getBytes());
String encryptedValue = Base64.encodeBase64String(encVal);
System.out.println("Encrypted Value: "+encryptedValue);

}

}

