/*
// Pattern to print

E
D E
C D E
B C D E
A B C D E

*/

public class Pattern18{
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            for(int j=i; j>=0; j--){
                System.out.print((char)(69-j)+" ");
            }
            System.out.println();
        }
    }
}