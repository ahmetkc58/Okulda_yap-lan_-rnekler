/*
 1 başla 
2sayıyı al
3 sayıyı her basamağını ayır 

4 while dögüsü kulanılacak 
5sayı mod 10 yaparak birler basmağını bul
6 yazdır 
6 eğer mod 10 işlemi 0 ise adım8 git 
7 sayı /10 yapıp bir basmak azaltırız
8 bitir
 */
package ödev3;

import java.util.Scanner;
public class sayıyı_tersten_yazdıran_program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Scanner input =new Scanner (System.in);
        
        System.out.println("lütfen sayıyı giriniz:");
        int s=input.nextInt();
        int b=0;
       
        
        
        System.out.print("sayının tersi:");
        while(s>0){
        b=s%10;
       
        System.out.print(b);
       
        s=s/10;
        
        }
       
        
        
        //2.yol
        
        
        System.out.println("lütfen sayıyı giriniz:");
        int a=input.nextInt();
       int h =0; 
        int sayı  =0;
       while(a>0){
       h=a%10;
       
       sayı=sayı*10+h;
       
       a=a/10;
       }System.out.println("sayının tersi:"+sayı);
    }
    
}
