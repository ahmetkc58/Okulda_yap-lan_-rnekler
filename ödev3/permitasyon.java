/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev3;
import java.util.Scanner ;
import java.lang.Math;
/**
 *
 * @author Lenovo
 */
public class permitasyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input  =new Scanner  (System.in);
        
        System.out.println("n sayısını giriniz:");
        int n=input.nextInt();
        
        System.out.println("r sayısını giriniz:");
        int r =input.nextInt();
        
        
        int f1 =1;
        int f2 =1;
        int f3=1;
        
        for (int i = 1 ; i <=n; i++) {
            f1=f1*i;
        }
        
        for (int i = 1; i <=r; i++) {
            f2=f2*i;
            
        }
        
        int a=(n-r);
        
        for (int i = 1; i <=a; i++) {
            f3=f3*i;
            
            
        }
        
        int t=(f1/(f2*f3));
        System.out.println("işlem sonucu:"+t);
        
        
        //while dögüsü ile 
        
        /*
        1 başla 
        2 bilgileri al
        3 x!/y!*Math.abs(x-y)!
        4 f1 =x! f2=y!  f3 Math.abs(x-y)!
        i<=x i++
        f1=f1*i
        s<=y s++
        f2=f2*s
        p= Math.abs(x-y)
        ı<=p
        f3=f3*ı
        5 o=1 
        6 o=f1/(f2*f3)
        7 
        */
        
        System.out.println("x sayısını giriniz");
        int x=input.nextInt();
        
        System.out.println("y sayısını giriniz:");
        int y =input.nextInt();
        
        f1=1;
        f2=1;
        f3=1;
        int i=0;
        int s=1;
        int ı=1;
         int p =Math.abs(x-y);
         int o=1;
        
        while ((i<x)){
        i=i+1;
        f1=f1*i;
        
        
        
        
        
        }System.out.println("f1:"+f1);
        while((s<y)){
        s=s+1;
        f2=f2*s;
        }System.out.println("f2:"+f2);
        while(ı<p){
        ı=ı+1;
        f3=f3*ı;
        }System.out.println("f3:"+f3);
        o=f1/(f2*f3);
        System.out.println("işlemin sonucu:"+o);
                
                
                
    }
    
}
