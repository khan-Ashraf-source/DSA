/*

Pattern to print (Rev Pascal Triangle)
        
*
* *
* * *
* * * *
* * * * *
* * * * 
* * * 
* *
*

        
*/


public class Pattern10 {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            for(int j=0; j<(i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
