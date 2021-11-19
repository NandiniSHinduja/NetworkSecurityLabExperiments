import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import sun.misc.BASE64Encoder;
public class DigitalSignature {
    public static void main(String args[]){
        KeyPairGenerator kpg=KeyPairGenerator.getInstance("RSA");
        kpg.initialize(1024);
        KeyPair kp=kpg.genKeyPair();
        byte[] d="test".getBytes("UTF8");
        Signature sign=Signature.getInstance("MD5WithRSA");
        sign.initSign(kp.getPrivate());
        sign.update(d);
        byte[] sig=sign.sign();
        System.out.println( "Signature "+new BASE64Encoder.encode(sig));
        sign.initVerify(kp.getpublic());
        sign.update(d);
        System.out.println(sign.verify(sig));
    }
    
}
