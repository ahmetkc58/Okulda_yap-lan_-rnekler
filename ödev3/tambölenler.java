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
import java.util.Scanner ;
public class tambölenler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("a sayısını giriniz:");
        int a =input.nextInt();
        for (int i = 1; i<=a ; i++) {
             if(a%i==0){
             System.out.println("bölenleri "+i);
             }
            
        }
    }
    
    
}
