public class printing_patterns_03 {
    public static void main(String[] args) {
        int n=14;
            //printing stars of left side
        for(int i=1;i<n/2;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");}
                //printing gap between lines
                for(int h=n/2;h>i;h--){
                    System.out.print(" ");
                }
                for(int h=n/2;h>i;h--){
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++){
                    System.out.print("*");}
                //System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.print("*");}
            System.out.println();
            for(int i=0;i<n;i++){
            System.out.print("*");
        }
        }}
    















