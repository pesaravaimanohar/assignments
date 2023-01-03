package classes;
import java.util.Random;

public class randompass {
    public String generate(){
    String UPPER="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String num="1234567890";
        String symbols="!@#$%^&*(){}[]<>?/";
        String combination=UPPER+lower+num+symbols;
        char[] password=new char[8];
        Random r=new Random();
        for(int i=0;i<8;i++){
            password[i]=combination.charAt(r.nextInt(combination.length()));
        }
        //System.out.println("your generated password is : "+ new String(password));
    return new String(password);
}

    public static void main(String[] args) {
        
}}