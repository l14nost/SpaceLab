package algorithm.Task5;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws Exception {
        String answer;
        Scanner in = new Scanner(System.in);
        System.out.println("Input something:");
        answer = in.nextLine();
        Cipher cipher = Cipher.getInstance("AES");
        KeyGenerator key = KeyGenerator.getInstance("AES");
        key.init(192);
        SecretKey key1 = key.generateKey();

//        SecretKey key = new SecretKeySpec("QwertYuasDfgHzxc".getBytes(),"AES");
        cipher.init(Cipher.ENCRYPT_MODE,key1);
        byte[] bytes = cipher.doFinal(answer.getBytes());
        for(byte b:bytes){
            System.out.print((char) b);
        }
        Cipher decript = Cipher.getInstance("AES");
        decript.init(Cipher.DECRYPT_MODE,key1);
        byte[] decriptBytes = decript.doFinal(bytes);
        System.out.println("\nDo you want decript?");
        answer = in.nextLine();
        switch (answer){
            case "yes":
                for(byte b:decriptBytes){
                    System.out.print((char) b);
                }
                break;
            case "no":
                System.out.println("BB");
                break;
        }

    }
}

