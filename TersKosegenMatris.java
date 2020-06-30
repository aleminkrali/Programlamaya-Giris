public class TersKosegenMatris {

    
    public static void main(String[] args) {
        int k=1;
        System.out.print("Lütfen bir sayı giriniz.");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        for(int j=0;j<x;j++){
        for(int i=0;i<x;i++){
            if(i==x-k){
            System.out.print("1");
         
            }
            else
                System.out.print("0");
                
        }
        k++;
        System.out.println("");
        }
        
        
      
    }
    
}
