public class printingPattern_02 {
    public static void main(String[] args) {
        int n=14;//n=lenth of the line
        //starting line
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
        //middle lines 1st part//
        for(int j=0;j<n/2;j++){
            for(int i=n/2;i>j;i--){
                System.out.print("*");
            }
            System.out.println();
        }
        //middlelines 2nd part//
        for(int j=(n/2)-2;j>0;j--){
            for(int i=n/2;i>j;i--){
                System.out.print("*");
            }
            System.out.println();
        }
        //ending line
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }
    
}
