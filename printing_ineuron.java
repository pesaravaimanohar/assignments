public class printing_ineuron {
    public static void gap(){
        //to print 2 extra lines
    System.out.println();
    System.out.println();
    
    }
    public static void I(int n) {
        // printing I
        for (int j = 0; j < 8; j++) {
            if(j==0||j==7){
                for(int i=0;i<5;i++){
                    //printing the head and tail of I *******
            System.out.print("*");}
            System.out.println();}
        else{
            //to print the middle part of I
        for (int i = 0; i < 5; i++) {
            if(i==2){
            System.out.print("*");}
            else{
                System.out.print(" ");
            }}
            System.out.println();
        }
        }
    }

    public static void R() {
        // printing R
        for (int j = 0; j < 6; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            // left stars
            System.out.print("*");
            // to print right part of R
            if (i < 4) {
                for (int j = 4; j > i; j--) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {
                for (int j = 4; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void E() {
        for (int i = 0; i < 5; i++) {
            if ((i % 2) != 0) {
                System.out.println("*");
            } else {
                for (int j = 0; j < 6; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void U() {
        // printing U
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                for (int j = 0; j < 5; j++) {
                    if (j == 0 || j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            } else {
                for (int k = 0; k < 5; k++) {
                    if (k == 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
            }
        }
    }

    public static void O() {
        for (int i = 1; i <= 5; i++) {
            if (i != 3) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int k = 0; k < 2; k++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

    }
public static void N(){
for(int i=0;i<5;i++){
    System.out.print("*");
    for(int j=0;j<=4;j++){
        if((i==j)&&j<4&&j>0){
            System.out.print("*");
        }
        if(j!=i||i==4||i==0){
            System.out.print(" ");
        }
    }
    System.out.println("*");
}

}
    
    
    
    public static void main(String arg[]) {
        int n = 8;// n is the length of the letters
        I(n);
        gap();
        N();
        gap();
        E();
        gap();
        U();
        gap();
        R();
        gap();
        O();
        gap();
        N();                                                                                                                                                                                                                                                                                                                                                                                                                
    }
}
