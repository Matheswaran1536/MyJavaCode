package Basics;

public class NumericPromotion {
    public static void main(String[] args) {

        int x = 5;
        double y = 10.55;

        //System.out.println(" x + y "+ x + y ); // 510.55 becuse it add string to double

        System.out.println(" X + Y = "+ (x+y));
        
        // Type casting 
        
       // int z = x + y;  Typecase problem double at RHS & INT at LHS
        int z = x + (int)y;
        
        System.out.print("Z = "+z);
     
        short a = 14;
        short b = 6;
        short c = (short) (a/b);
        System.out.println("C "+c);
    }
}
