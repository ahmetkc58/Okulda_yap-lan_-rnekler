/*
 1 adım başla 
2   x sayısını al 
3 denklemde yaz 
4   eğer denklem <0 ise git adım5 
5 yazdır sonuç negatif
6 eğer denklem>0 ise adım 6 git
7 yazdır sonuç pozitif
8 yazdır denklem sıfıra eşit
 */
package ödev3;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class fonksiyonun_işaretini_bulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       
       
     System.out.println("lütfen x sayısını giriniz: ");
     int x=input.nextInt();
     
     int f=x*x-5*x+3 ;
     
     if(f<0){
     System.out.println("sonuç negatif");
     }else if(f>0){
     System.out.println("sonuç pozitif");
     }else{
     System.out.println("denklemin sonucu 0 dır");
     }
     
     
    }
    
}
