public class PrintingPattern_01 {
    public static void main(String args[]){
        //printing starting single line//
        for (int i=0;i<14;i++){
            System.out.print("*");
        }
        //printing decreasing order of the stars//
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
                    if(i<5){
                System.out.println();}
            }
            System.out.println();
            //printing the single stars at the start and end
            for(int i=0; i<5;i++){
                for(int j=0;j<14;j++){
                    if(j==0||j==13){
                        System.out.print("*");
                    }
                    if((j!=0)&&(j!=13))
                    System.out.print(" ");
                }
                System.out.println();
            }
            //printing the ending line
   
            for (int i=0;i<14;i++){
                System.out.print("*");
            }
        }
    }
