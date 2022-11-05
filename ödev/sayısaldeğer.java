package ödev;
import java.util.Scanner; 
import java.lang.Math;
public class sayısaldeğer {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);        
        System.out.println("lütfen a değerini giriniz:");
        int a=input.nextInt();
        double sayı1=Math.pow(a,2);       
        double sayı2=Math.pow(((1+(1/sayı1))), 1/3);
        double sayı3=Math.pow(a, 1/3);                           
        System.out.println("lütfen b değerini giriniz:");
        int b= input.nextInt();        
        double sayı4 =Math.pow( a+b*b, 1/3);
        double sayı5=Math.pow(a*b, 1/2);
        double sayı6=Math.pow ((1+((sayı4)/(1/sayı5))), 1/5);
        double sayı7=Math.pow((a*a+b*b), 4);
        double sayı8 =Math.pow(a*a*b*b,1/5);
        double sayı9=Math.pow((sayı7/ (a*b)/(1+(1/(a+1/(b+(sayı8)))))), 1/3);
        double sayı10=Math.pow(a, 3/4);             
        double  y1= ((1+a)/ sayı2 +(1/sayı3));
        double y2=a+(a/(b+1))/(sayı6)+(a*b)*(a*b);       
        double y3 = ((a+b)/sayı9 +(a*a+b*b*b)/(a*b)/(a*a+b*b+2*a*b)+(3*a*a-3*b*b)-(sayı10/2/b*b/3));
        System.out.println("y1 değerinin sonucu:"+y1);
        System.out.println("y2 nin sonucu :"+y2);       
        System.out.println("y3 değerinini sonucu"+y3);

             
    }
    
}
