/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class haftagünleri {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       System.out.println("lütfen sayıyı giriniz:");
       int a =input.nextInt();
       if (a==1){
       System.out.println("bu gün günlerden pazartesi:");
               }else if(a==2){
               System.out.println("bu gün günlerden salı:");
               
               }else if(a==3){
               System.out.println("bu gün günlerden çarşamba:");
               }else if(a==4){
               System.out.println("bu gün günlerden perşembe");
               }else if (a==5) {
            System.out.println("bu gün günlerden cuma");
            
        }else if (a==6) {
               System.out.println("bu gün günlerden cumartesi");
        }else if (a==7) {
        System.out.println("bu gün günlerden pazar");
        }else {
        System.out.println("hey sen hafta 7 gündür 7 den büyük sayılar yazma");
        }
                   
       
    }
    
}
