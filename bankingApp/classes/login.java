
 //details of user
 
/* public Long deposit(int num){
    balance= balance + num;
    System.out.println("Your deposit is successful");
    return balance;
    }
    
    public Long withdraw(int num) {
    
    if (num > balance) {
    System.out.
    println("sorry we cannot process that because of insufficient funds");
    }
    if (balance >= num) {
    balance = balance - num;
    System.out.println("withdrawal successful");
    }
    
    return balance;
    
    }
    
    }*/
    
    class login extends AccountDetails {
    Boolean exeCOM = false;
    
    public void check( String u, String j) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("please enter your username");
    String name = input.next();
    System.out.println("please enter your password");
    String pass = input.next();
    
    if (u.equals(name) && j.equals(pass)) {
    System.out.println();
    System.out.println();
    System.out.println("you have logged in successfully");
    exeCOM = true;
    }
    
    else if ((Objects.equals(u, name)) && (!Objects.equals(j, pass))) {
    System.out.println("hai " + u + " please check your password");
    } else {
    System.out.println("please check your username and password");
    }
    }
    }
public class login {
    
}
