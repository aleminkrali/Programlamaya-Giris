public class KosegenMatris {

   
   
    public static void main(String[] args) {
       System.out.print("Lütfen bir sayı giriniz");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int satır[]= new int[x];
        for(int k=0;k<x;k++)
            satır[k]=0;
        for(int i=0;i<x;i++){
                if(i==0)
                    satır[i]=1;   
                else{
                    satır[i-1]=0;
                    satır[i]=1;
                
                }
                    System.out.println(""); 
                for(int j=0;j<x;j++){
                   
                System.out.print(satır[j]);
             
                }
                /*Hocam selamlar ben hobi olarak java öğrenmeye çalışıyorum daha önce kısmen c++ tecrübem var
                ben ödevleri yapıyorum sanki daha karışık algoritmalar ile yapıyorum gibi geliyor.
                bu proje için çok mu karışık olmuş daha basit bir öneriniz var mı. İlgilenirseniz çok teşekkür ederim.
                */
        
        
    
    }
    
}
}
