public class PrintingPattern_01 {
    public static void main(String args[]){
        for (int i=0;i<14;i++){
            System.out.print("*");
        }
        System.out.println();
            for(int i=0;i<7;i++){
                for(int j=6;j>i;j--){
                System.out.print("*");}
                for(int k=0;k<=i;k++){
                System.out.print(" ");}
                for(int k=0;k<=i;k++){
                    System.out.print(" ");}
                for(int g=6;g>i;g--){
                    System.out.print("*");}
                    if(i<6){
                System.out.println();}
            }
            for (int i=0;i<14;i++){
                System.out.print("*");
            }
        //      for(int i=0;i<10;i++){
        //          for(int j=0;j<i;j++)
        //      System.out.print(" ");}
        //      for(int i=7;i>0;i--){
        //         for(int j=0;j<i;j++)
        //         System.out.print("*");
        //         System.out.println();
        //     }
        // for (int i=0;i<14;i++){
        //     System.out.print("*");
        }
    }
