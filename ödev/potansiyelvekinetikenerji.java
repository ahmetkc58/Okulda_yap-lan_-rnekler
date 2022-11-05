package ödev;

/*
1 başla 
2maddenin kütlesini girdir 
3 maddenin hızını gir
4maddenin yüksekliğini giriniz
5potansiyel enerjisini hesaplayalım mgh
6kinetik enerjisi hesaplayalım  1/2 m v^2
6 sonuçları yazdır 
7bittir

*/
import java.util.Scanner;
public class potansiyelvekinetikenerji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        
        System .out.println("lütfen maddenin kütlesini giriniz");
        int kg=input.nextInt();
        System.out.println("lütfen maddenin hızını giriniz:");
        int v = input.nextInt();
        System.out.println("lütfen maddenin yüksekliğini giriniz :");
        int h =input.nextInt();
        int P= kg*10*h;
        int K=(kg*v*h)/2;
        System.out.println("hesaplanan kinetik enerji :"+K);
        System.out.println("hesaplanan potansiyel enerji:"+P);
        
    }
    
    
    
}
