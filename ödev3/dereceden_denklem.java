
package ödev3;

import java.util.Scanner;
import java.lang.Math;
public class dereceden_denklem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.println("a sayısını giriniz");
        int a =input.nextInt();
        
         System.out.println("b sayısını giriniz");
        int b =input.nextInt();
        
        
         System.out.println("c sayısını giriniz");
        int c =input.nextInt();
        
        int d=(b*b)-4*a*c;
        
        double q =Math.pow(d, 1/2);
        
        
        if(d>0){
        double x1=((-b)- Math.sqrt(d))/2*a;
        double x2=((-b) +Math.sqrt(d))/2*a;
        
        System.out.println("x1:"+x1);
               
        System.out.println("x2:"+x2);
                
        }else if (d==0) {
           int x=(-b)/2*a;
                   System.out.println("x:"+x);
        } else {        System.out.println("reel kök yoktur");
            
        }
        
        
        
        
        
          }
    
}
