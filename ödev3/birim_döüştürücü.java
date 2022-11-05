/* 
1 adaım başla 
2  uzunluğu al 
3 hangi cinse girileceğini sor  1 mm 2 cm 3 km 
4 hangi sayıyı seçtine bak 
5 eğer 1 i seçtiyse m*100000
6 eğer 2 yi seçtiyse m*1000
7 eğer 3 ü seçtiyse m/1000
8 yazdır bitir

 */
package ödev3;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class birim_döüştürücü {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        
        
        System.out.println("lütfen metre cinsinden uzunluğu giriniz");
        int m=input.nextInt();
        
        System.out.println("1-mm cinsine mi çevrilsin "
                + "2-cm cinsine mi çevrilsin"
                + "3-km cinsine mi çevrilsin");
       
        int x=input.nextInt();
        int u=0;
        if(x==1){
        u=m*100000;
        System.out.println(u);
        }else if(x==2){
        u=m*1000;
        System.out.println(u);
        
        }else if (x==3){
        u=m/1000;
        System.out.println(u);
        }
       

      
        
    }
    
}
