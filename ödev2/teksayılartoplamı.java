
package ödev2;


import java.util.Scanner;
public class teksayılartoplamı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen a sayısını giriniz:");
        int a =input.nextInt();
        
        
        int t=0;
        int s=1;
        while(s<=a){
        t=t+s;
        s=s+2;
        }
        System.out.println("tek sayıların toplamı:"+t);
    }
    
}
