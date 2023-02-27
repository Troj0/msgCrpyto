//USING RSA (Rivest–Shamir–Adleman) algorithm
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;

public class RSAEncryption {
public static void main(String[] args) throws Exception {
    
String plainText = "Hello World!";
KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
keyGen.initialize(1024);
KeyPair keyPair = keyGen.genKeyPair();
PrivateKey privateKey = keyPair.getPrivate();
PublicKey publicKey = keyPair.getPublic();
Cipher cipher = Cipher.getInstance("RSA");
cipher.init(Cipher.ENCRYPT_MODE, publicKey);
byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
String encryptedValue = Base64.getEncoder().encodeToString(encryptedBytes);
System.out.println("Encrypted Value: "+encryptedValue);

}

}

