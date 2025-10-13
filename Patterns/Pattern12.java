/*
Pattern to print

1      1
12    21
123  321
12344321

*/

public class Pattern12{
    public static void main(String[] args){
        for(int i=1; i<5; i++){
            for(int j=1; j<5; j++){
                if(j<=i){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=4; j>=1; j--){
                if(j<=i){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}