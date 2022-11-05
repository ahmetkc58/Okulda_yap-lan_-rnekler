package ödev;

/*
1 başla
2direnç bilgisini al
3akım bilgisini al
4gerilimi bul akım *direnç 
5 yazdır 
6 bitir 
 */
import java.util.Scanner;
public class direnç {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner (System.in);
        
        System.out.println("lütfen direnç giriniz:");
        int direnç=input.nextInt();
        System .out.println("lütfen akım bilgisini giriniz:");
        int akım =input.nextInt();
        int  gerilim= direnç*akım ;
        System.out.println("hesaplanan gerilim değeri:"+gerilim );
    }
    
}
