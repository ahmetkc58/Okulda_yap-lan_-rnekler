
package ödev;
/*
1 başla 
2 kulanıcan kütlesini sor
3 kulanıcıdan boyunu sor
4 hesapla kg*m^2
5 yazdır 
6 bitir
 */
import java.util.Scanner;

public class ben_boykitle {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner (System.in);
        
        System.out.println("lütfen kilogramınızı giriniz:");
        int kg =input.nextInt();
        System .out.println("lütfen boy uzunluğunuzu metre cinsinden giriniz:");
        double m = input.nextDouble();
        
        double k=(kg/(m*m))*10000;
        
        System.out.println("boy kitle indeksiniz:"+k);
    }
    
}
