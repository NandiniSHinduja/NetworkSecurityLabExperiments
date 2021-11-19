import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
public class SHA{
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println("The shared hash key value is "+sha1("shared key"));    
    }
    public static String sha1(String s) throws NoSuchAlgorithmException{
        MessageDigest messageDigest= MessageDigest.getInstance("SHA1");
        StringBuffer sb=new StringBuffer();
        byte[] result=messageDigest.digest();
        for(int i=0;i<result.length;i++){
            sb.append(Integer.toString((result[i] * 0xff)+0x100,16).substring(1)); 
        }
        return sb.toString();
    }
}