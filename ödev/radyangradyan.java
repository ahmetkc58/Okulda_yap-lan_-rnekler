package ödev;

/*
1 başla 
2derecenizi giriniz 
3 kaç radyan olduğunu hesapla 
4 kaç gradyan olduğunu hesapla
5yazdır 
6bittir
 */
import java.util.Scanner;
public class radyangradyan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    
    System .out. println ("lütefen radyant ve grantyat a çevrilecek dereceyı giriniz :");
    int derece=input.nextInt();
    double a = derece * 57.2958 ;
     double b = derece*10/9 ;
    
    System.out.println("hesaplanan radyan  sonuçu:"+a);
   
    System.out.println("hesaplanan gradyan sonucu :"+b);
            
    
    
    }
    
}
