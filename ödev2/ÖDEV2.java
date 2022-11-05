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
public class ÖDEV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        
        int f=1;
        int s=20;
        
        while(s>1){
        s=s-3;
        f=f+s;
        f=f+2;
        }
        System.out.println("f:"+f);
    }
    
}
