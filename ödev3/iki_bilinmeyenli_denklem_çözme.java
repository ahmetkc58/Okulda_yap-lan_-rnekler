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
public class iki_bilinmeyenli_denklem_çözme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input  =new Scanner (System.in);
       
       System.out.println("a sayısını giriniz");
       int a =input.nextInt();
      
       System.out.println("b sayısını giriniz");
       int b =input.nextInt();
       
       System.out.println("c sayısını giriniz");
       int c =input.nextInt();
       
       System.out.println("d sayısını giriniz");
       int d =input.nextInt();
       
       System.out.println("d sayısını giriniz");
       int e =input.nextInt();
       
       System.out.println("f sayısını giriniz");
       int f =input.nextInt();
       
       
       
       int x=(c-b*f/e)/(a-b*d/e);
       
       int y=(c-a*x)/b;
       
       System.out.println("x sin sonucu"+x);
       System.out.println("y nin sonucu "+y);
       
       
    }
    
}
