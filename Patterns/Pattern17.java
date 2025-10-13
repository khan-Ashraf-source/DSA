/*
// Pattern to print

   A
  ABA
 ABCBA
ABCDCBA

*/

public class Pattern17{
    public static void main(String[] args){
        for(int i=0; i<4; i++){
            for(int j=i+1; j<4; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print((char)(65+k));
            }
            for(int l=i-1; l>=0; l--){
                System.out.print((char)(65+l));
            }
            System.out.println();
        }
    }
}