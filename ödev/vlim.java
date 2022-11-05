/*
1 başla
2 kulanıcıdan kütle al
3ivme al
4 sürtünme al
5 yüzey alanı al
6 Vlim=((m*g)/(k*a))^(1/2) hesapla 
7yazdır 
8bitir
 */
package ödev;

/**
 *                     HOCAYA SORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR SONUÇ YANLIŞ BULUYOOOOOOO  ( kök içine almıyor sonucu )
 * @author Lenovo
 */
import java.util.Scanner;
public class vlim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println("lütfen cismin kütlesini giriniz:");
        int m=input.nextInt();
        System.out.println("lütfen bulunduğunuz ortamın çekim ivmesini yazınız:");
        int g= input.nextInt();
        System.out.println("lütfen bulunduğunuz ortamın hava sürtünmesini yazınız:");
        int k=input.nextInt();
        System.out.println("lütfen cismin tek yönlü yüzey alanını yazınız:");
        int A=input.nextInt();
        
        double Vlim=((m*g)/(k*A))^(1/2);
        System.out.println("istediğiniz sonuç:"+Vlim);
        
    }
    
}
