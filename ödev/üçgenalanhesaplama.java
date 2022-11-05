package ödev;

/*
ALGORİTMA 
1 başla
2 üçgenin tabanının kenarı 
3 üçgenin yüksekliği 
4 taban ile yüksekliği çarp ve ikiye böl
5 yazdır 
6 bitir
*/
import java.util.Scanner;
public class üçgenalanhesaplama {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner (System.in);
        
System.out. println("lütfen üçgenin taban uzunluğunu giriniz  :");
int a=input.nextInt() ; //kulanıcıdan taban uzunluğunu aldık 
System .out. println("lütfen yüksekliği giriniz  :");
int  b =input.nextInt();//kulanıcıdan yükseklik bilgilerini aldık r
int alan =(a*b)/2;
System.out.println("üçgenin alanı:"+alan );

    }
    
}
