package BankingApp;
// import java.io.File;
//import java.net.PasswordAuthentication;
import java.util.Objects;
import java.util.Scanner;

import classes.randompass;

// import java.io.FileWriter;
class CreateUser {
    Scanner input=new Scanner(System.in);
    
    String Fname;
    String Lname;
    String phone;
    String password;
    String password1;
    String password2;
    Long Accnum;
    Long balance;
    int ifscCode;
    String username;
    public static final String ANSI_COLORNAME="\u001B[30m";
    private String ANSI_RESET="\u001B[33m";

    public void checkpass(){
        Boolean C = false;

        while (!C) {
            
            System.out.print("\nplease set your password :");
            password1 = input.next();
            if (password1.length() < 8) {
                System.out.println("\nNOTE : your password must contain lower case,upper case letter and a symbol");
                System.out.println("\nyour password must contain atleast 8 letters");
            } 
            else {
                System.out.print("\nplease confirm your password :");
                password2 = input.next();
                if (Objects.equals(password1, password2)) {
                C = true;
                System.out.println("\nyour password set successfully");
            } 
                else {
                    System.out.println("\n\nplease check your password and try agin\n");
                }
        }
        }
        input.close();
        password = password1;
    }

    public void checknames(){
        
        Boolean C = false;
        while (!C) {
            System.out.print("\n");



            
            if (Fname.length() < 3) {
                if(Lname.length()<3){
                    System.out.println("\nyour first name and last name must contain atleast 3 letters\n");}
                    else{
                System.out.println("\nyour first name must contain atleast 3 letters\n");
                System.out.print("\nplease enter your first name :");
                Fname= input.next();
            } }
            else if(Lname.length()<3){
                System.out.println("\nyour last name must contain atleast 3 letters\n");
                System.out.print("\nplease enter your last name :");
                Lname=input.nextLine();}
               else if (Objects.equals(Fname, Lname)) {

               System.out.println("sorry! first name and last name cannot be same\n\n");
               System.out.print("\nplease enter your first name :");
               Fname = input.nextLine();
               System.out.print("\nplease enter your last name :");
               Lname = input.nextLine();
            } 
                else {
                    C = true;
                }
        }
        }
       
    public void getUserDetails() {
        randompass pass=new randompass();
        String G=pass.generate();
        System.out.print("\nplease enter your first name :");
        Fname = input.nextLine();
        System.out.print("\nplease enter your last name :");
        Lname = input.nextLine();
        checknames();
        System.out.print("\nplease enter your phone number :");
        phone = input.next();
        System. out. println(ANSI_COLORNAME + "This text is colored" + ANSI_RESET);
        System.out.println("\n\nyour randomly generated password is : "+""+G);
        checkpass();
        
    }

    public void SetUserDetails() {
        System.out.println("\n\nyou have succesfully created your account\n");
        username = (this.Lname + this.Fname).replaceAll(" ", "");
         Accnum = 1002345678L;
         balance = 20000L;
         ifscCode = 12509;
        
    }
    public void SetUserDetails(String a,String b,String c,String d) {
        username = (a + b).replaceAll(" ", "");
        password=c;
        phone=d;
        Accnum = 1002345678L;
        balance = 20000L;
        ifscCode = 12509;
    }
    public void Login(String U,String P) {
        
        System.out.println("please enter your username and password to continue login");
        System.out.println("\nplease enter your username: ");
        String name =input.next();
        System.out.println("please enter your password");
        String p=input.next();
        if(Objects.equals(name, U)&&Objects.equals(P,p )){
            System.out.println("you have logged in successfully");
            printUserDetails();
        }
        else{
            System.out.println("your login details are incorrect");
        }
    }
    public void printUserDetails(){
        //System.out.println("\n username : " + username);
        //System.out.println("\nyour password is "+password.substring(0, 3)+""+"*****");
        System.out.println("\n account number : " + Accnum);
        System.out.println("\n branch IFSC code : " + ifscCode);
        System.out.println("\nyour phone number is "+"+91-"+phone);
        System.out.println("\n account balance : " + balance);
    }
}


public class SBI {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("\n\nwelcome to SBI");
        
        System.out.println();
        CreateUser user1 = new CreateUser();
        //user1.getUserDetails();
        user1.SetUserDetails("manohar","pesaravai","manohar@","7672060147");
        user1.printUserDetails();
        CreateUser user2 = new CreateUser();
        //user2.getUserDetails();
        user2.SetUserDetails("girinath"," pe sar","manohar@3","8978317767");
        user2.printUserDetails();
        System.out.println("press L to login & press S to signup");
        char y=input.next().charAt(0);
        if(y=='L'||y=='l'){
           user1.Login(user1.username,user1.password);
        }
        else if(y=='s'||y=='s'){
            System.out.println("please enter the following details to sign");
            CreateUser sign=new CreateUser();
            sign.getUserDetails();
            sign.SetUserDetails();
            sign.printUserDetails();
            sign.Login(sign.username,sign.password);
            
            
        }
        else{
            System.out.println("please enter a valid input");
        }
        input.close();
    }
}
/*
 * login user1 = new login();
 * user1.setCustomerName("pesaravai manohar");
 * user1.setusername();
 * System.out.println(user1.getusername());
 * user1.setPassword("manohar");
 * 
 * // * System.out.println("login or sign up");
 * // * System.out.println("press L to login & press S to signup");
 * // * String y=input.next();
 * // * if(Objects.equals(y.charAt(0),"s")) {
 * // * if(Objects.equals(y,"s")||Objects.equals(y, "S")){
 * // * System.out.println("please enter your username");
 * // * user1.setCustomerName(input.next());
 * // * System.out.println("please set your password");
 * // * user1.setPassword(input.next());
 * // * user1.setusername();
 * // * System.out.println("signup successful");
 * // * }
 * // * if(Objects.equals(y,"l")||Objects.equals(y,"L")){
 * // * String name =user1.getusername();
 * // * String password=user1.getPassword();
 * // * login user1Login=new login(name, password);
 * // * // System.out.println("you have logged in successfully");
 * // * }
 * // * System.out.println("do you want to continue to login");
 * // * System.out.println("please press y to continue login");
 * //
 * System.out.println("please continue to login");
 * 
 * user1.check(user1.getusername(), user1.getPassword());
 * Boolean a = true;
 * if (Objects.equals(user1.exeCOM, a)) {
 * 
 * 
 * System.out.println("please deposit some money");
 * int I = input.nextInt();
 * user1.deposit(I);
 * System.out.println("deposit successful your account balance is"+user1.balance
 * );
 * System.out.println("please enter the amount to withdrawal");
 * I=input.nextInt();
 * System.out.println("your current balance is "+ user1.withdraw(I));
 * 
 * }
 * if (!Objects.equals(user1.exeCOM, a)) {
 * System.out.println("\n\n\nsorry you cannot access the account");
 * }
 * 
 * }
 * }
 */
