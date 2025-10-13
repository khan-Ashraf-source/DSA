/*

Pattern to print (Rev Pascal Triangle)
        
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
        
*/




public class Pattern8 {
    public static void main(String[] args){
        for(int i=5; i>0; i--){
    
            for(int k=0; k<(5-i); k++){
                System.out.print("  ");
            }
            for(int j=0; j<(i*2-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    
}
