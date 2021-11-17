import java.util.*;
public class CaesarCipher{
    public static void main (String args[]){
        System.out.println("Enter a text");
        Scanner sc=new Scanner(System.in);
        String plainText=sc.nextLine();
        String cipherText=encrypt(plainText,3);
        System.out.println("The encrypted text is "+cipherText);
        System.out.println("The decrypted message is "+decrypt(cipherText, 3));
    }
    public static String encrypt(String plainText,int shiftKey){
        String alphabetText="abcdefghijklmnopqrstuvwxyz";
        String cipherText="";
        for(int i=0;i<plainText.length();i++){
            int val=alphabetText.indexOf(plainText.charAt(i));
            int newVal=(val+shiftKey)%26;
            char newchar=alphabetText.charAt(newVal);
            cipherText=cipherText+newchar;
        }
        return cipherText;
    }
    public static String decrypt(String cipherText, int shiftKey){
        String decryptedText="";
        String alphabetText="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<cipherText.length();i++){
            int value=alphabetText.indexOf(cipherText.charAt(i));
            int newvalue=(value-shiftKey)%26;
            char newcharacter='a';
            if(newvalue>=0){
                newcharacter=alphabetText.charAt(newvalue);
            }
            else if(newvalue<0){
                newvalue=newvalue+26;
                newcharacter=alphabetText.charAt(newvalue);
            }
            decryptedText=decryptedText+newcharacter;
        }
        return decryptedText;

    }

}
