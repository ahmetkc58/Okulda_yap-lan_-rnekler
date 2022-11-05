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
public class üçgençeşidi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("a kenarını giriniz:");
        int a=input.nextInt();
        System.out.println("lütfen b kenarını giriniz:");
        int b=input.nextInt();
        System.out.println("lütfen c kenarını giriniz");
        int c =input.nextInt();
        
        
        if (((a==b) &&(a!=c)&&(b!=c))){
        System.out.println("üçgen ikiz kenar ");
        }else if  (((b==c)&&(a!=b)&&(a!=c))) {
                 System.out.println("üçgen ikiz kenardır  ");
            }else if ((a==c)&&(b!=c)&&(b!=a)) {
                System.out.println("üçgen ikiz kenardır");
            }else if ((a==b)&&(a==c)&&(b==c)){
            System.out.println("üçgen eş kenardır");
            }else if((a!=b)&&(a!=c)&&(b!=c)){
            System.out.println("üçgen çeşitkenar üçgendir");
            }
        
            
        
        
        
        
         

               
        
       
    }
    
}
