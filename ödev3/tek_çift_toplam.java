
package ödev3;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class tek_çift_toplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       
       
       
       System.out.println("n sayısını giriniz");
       int n=input.nextInt();
       
       
       int t1=0;
       int t2=0;     
       int t3=0;
       int a=0;
       
               
       for (int i=1;i<=n;i++) {
                   t1+=i;
        }System.out.println("t1:"+t1);
             
        for (int s = 1; s<=n; s=s+2) {
            t2=t2+s;
    }
        System.out.println("t2:"+t2);
   
        for(int s=2 ;s<=n;s=s+2){
        t3=t3+s;
        }
        
        System.out.println("t3:"+t3);
            
    }
    
    
}
