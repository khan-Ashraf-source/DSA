/*
// Pattern to print

ABCDE
ABCD
ABC
AB
A

*/


public class Pattern15{
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}