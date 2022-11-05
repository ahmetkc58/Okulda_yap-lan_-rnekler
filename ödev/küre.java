package ödev;

/*
1 başla 
2kürenin yari çapını giriniz
3kürenin alanını hesapla (4pi r^2)
4kürenin hacmini hesapla4 pi r *r*r
5 yazdır 
6 bitir
 */
import java.util.Scanner;
public class küre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input =new Scanner (System.in);
     System.out.print("lütfen kürenin yarı çapını giriniz");
     float a=input.nextFloat();
     final  double pi = 3.1415 ;
     double alan =a * 4* a*a*pi;
     double hacim=  (4/3)*pi;
     System.out.println ("hesaplanan alan  : "+alan);
     System.out.println ("hesaplanana"  + hacim);
    }
    
}
 