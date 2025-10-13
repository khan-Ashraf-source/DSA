public class Pattern11{
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print(Math.abs((i+1)%2 - j%2) +" ");
            }
            System.out.println();
        }
    }
}