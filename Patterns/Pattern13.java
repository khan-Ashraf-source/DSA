/*
// Patter to print

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/


public class Pattern13 {
    public static void main(String[] args){
        int level = 1, count = 1;
        for(int i=1; i<16; i++){
            if(count>0){
                System.out.print(i+" ");
                count--;
            }else{
                System.out.println();
                level++;
                count=level;
                i--;
                
            }
            
        }
    }
}