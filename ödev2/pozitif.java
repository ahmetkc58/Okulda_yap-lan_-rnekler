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
public class pozitif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input= new Scanner (System.in);

System.out.println("lütfen sayıyı giriniz:");
int a =input.nextInt();
if(a<0){
    System.out.println(a+"   sayı negatiftir");
    
}else if(a>0){
    System.out.println(a+"   sayı pozitiftir:");
}else if(a==0){
    System.out.println(a+"   sayı 0 a eşittir:");
}
    
    }
    
}
