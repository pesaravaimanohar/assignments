/*
 * class A{
 * A(){
 * System.out.println("iam a constructor in A");
 * }
 * A(int n){
 * System.out.println("manohar had called A"+(n+7));
 * }
 * 
 * }
 * class B extends A{
 * B(){
 * System.out.println("iam a constructor in B");
 * }
 * B(int n){
 * super(n);
 * System.out.println("manohar had called B"+n);
 * }
 * }
 * class C extends B{
 * C(){
 * System.out.println("iam a constructor in C");}
 * C(int n){
 * super(n);
 * System.out.println("C has called");
 * }
 * public void name(){
 * System.out.println("you are beautiful");
 * }
 * }
 * 
 * public class manohar{
 * public static void main(String[] args) {
 * C happy=new C(6);
 * System.out.println("all are ready");
 * }
 * }
 */


public class manohar{
    //@Test
    public void whenPasswordGeneratedUsingPassay_thenSuccessful() {
        RandomPasswordGenerator passGen = new RandomPasswordGenerator();
        String password = passGen.generatePassayPassword();
        int specialCharCount = 0;
        for (char c : password.toCharArray()) {
            if (c >= 33 || c <= 47) {
                specialCharCount++;
            }
        }
        assertTrue("Password validation failed in Passay", specialCharCount >= 2);
        public static void main(String[] args) {
            
        }
    }
    }
