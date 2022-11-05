/*
 1 başla 
2 kulanıcıdan sürtünme katsayısını al 
3 kulanıcıdan maddenizi kütlesini al 
4 kulanıcıdan çekim ivmesini sor
5 hesapla fs=m*g*k
6 yazdır 
7bittir
 */
package ödev;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class sürtünme_ben {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println("lütfen sürtünme katsayısını giriniz:");
        int k=input.nextInt();
        System.out.println("lütfen cismin kilogramını giriniz:");
        int m =input.nextInt();
        System.out.println("lütfen bulunduğunuz ortamdaki çekim ivmesini giriniz:");
        double g=input.nextDouble();
        
        double Fs=k*m*g ;
        System.out.println("hesaplanan sonuç:"+Fs);
        
        
    }
    
}
