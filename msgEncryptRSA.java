//USING RSA (Rivest–Shamir–Adleman) algorithm
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;


public class RSAEncryption {
        public static void main(String[] args) throws Exception {
                
                // Generating pub/pri keys
                KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
                keyGen.initialize(1024);
                KeyPair keyPair = keyGen.genKeyPair();
                PublicKey publicKey = keyPair.getPublic();
                PrivateKey privateKey = keyPair.getPrivate();


                // Encryption
                String plainText = "Hello World!";
                Cipher cipher = Cipher.getInstance("RSA");
                cipher.init(Cipher.ENCRYPT_MODE, publicKey);
                byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
                String encryptedValue = Base64.getEncoder().encodeToString(encryptedBytes);
                System.out.println("Encrypted Value: "+encryptedValue+"\n");


                // Decryption 
                cipher.init(Cipher.DECRYPT_MODE, privateKey);
                byte[] encryptedBytesDecoded = Base64.getDecoder().decode(encryptedValue);
                byte[] decryptedBytes = cipher.doFinal(encryptedBytesDecoded);
                String decryptedValue = new String(decryptedBytes);
                System.out.println("decrypted Value: "+decryptedValue+"\n");

        }

}

