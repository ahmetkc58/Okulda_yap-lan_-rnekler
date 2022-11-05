/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev3;

/**
 *
 * @author Lenovo
 */import java.util.Scanner ;
public class denklem_çözme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input=new Scanner (System.in);
       
       
       System.out.println("a sayısını giriniz: ");
       int a =input.nextInt();
       
       
       System.out.println("b sayısını giriniz: ");
       int b =input.nextInt();
       
       
       System.out.println("c sayısını giriniz: ");
       int c =input.nextInt();
       
       
       int x=(c-b)/a;
       
       System.out.println("işlemin sonucu :"+x);
    }
    
}
