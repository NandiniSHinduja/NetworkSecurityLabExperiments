import java.util.*;
import java.math.BigInteger;
public class DeffieHellman{
    final static BigInteger one=new BigInteger("1");
    public static BigInteger getNextPrime(String a){
        BigInteger result=new BigInteger(a);
        while(!result.isProbablePrime(99)){
            result=result.add(one);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.nextLine();
        BigInteger a=getNextPrime(p);
        System.out.println("Enter a number between 2 and p-1");
        String q=sc.nextLine();
        BigInteger b=new BigInteger(q);
        System.out.println("Enter private key A");
        BigInteger A=new BigInteger(sc.nextLine());
        BigInteger resulta=b.modPow(A,a);
        System.out.println("Enter private key B");
        BigInteger B=new BigInteger(sc.nextLine());
        BigInteger resultb=b.modPow(B,a);
        BigInteger x=resultb.modPow(A,a); 
        BigInteger y=resulta.modPow(B,a);
        System.out.println(x);
        System.out.println(y); 


    }
    
}