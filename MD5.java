import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
public class MD5{
    public static void main(String[] args) {
        System.out.println("For null value " +md5(""));
        System.out.println("For simple text "+md5("This is a simple text"));
        System.out.println("For simple numbers "+md5("12345"));
    }
    public static String md5(String s){
        if(s==null){
            return null;
        }
        String result=null;
        try{
            MessageDigest digest=MessageDigest.getInstance("MD5");
            digest.update(s.getBytes(),0,s.length());
            result=new BigInteger(1, digest.digest()).toString(16);
        }
        catch(NoSuchAlgorithmException e){
            System.out.println(e);
        }
        return result;
    }
}