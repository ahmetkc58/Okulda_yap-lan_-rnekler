/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev2;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class karelertoplamı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input =new Scanner (System.in);
      System.out.println("lütfen n sayısını giriniz");
      int n=input.nextInt();
      
      int t=0;
      int s=0;
      
      while(s<=n){
      t=t+(s*s);
      s=s+1;
      }System.out.println("sayıların çarpımı :   "+t);
              
    }
    
}
