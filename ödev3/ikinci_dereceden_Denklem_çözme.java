/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev3;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class ikinci_dereceden_Denklem_çözme {

    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.println(" a+b+c=0 olacak lütfen a sayısını giriniz:");
        int a =input.nextInt();
        
        System.out.println("lütfen b sayısını giriniz:");
        int b =input.nextInt();
        
        System.out.println("lütfen c sayısını giriniz:");
        int c =input.nextInt();
        
        if (a+b+c==0) {
          int  x1=1;
              int      x2=c/a;
            System.out.println("x1:"+x1);
            System.out.println("x2:"+x2);
        }
        System.out.println("lütfen koşula uygun bilgiler giriniz");
        
    }
    
}
