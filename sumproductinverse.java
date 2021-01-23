//WAP to print the sum and product of digits of an Integer and reverse the Integer.	
import java.util.*;
public class sumproductinverse {
    public static void main(String args[]){
        int sum=0, product=1, reverse=0;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter any number: ");
        int num = scan.nextInt();

        while(num>0){
            sum =sum+num%10;                            //Calculating sum of digit
            product=product*(num%10);                     //claculating product of digit
            reverse=reverse*10 + num%10;                //Reversing the digit
            num=num/10;
        }
        System.out.println("sum of digit of given number is: "+sum);
        System.out.println("Product of digit of given number is: "+product);
        System.out.println("Reverse of digit of given number is:"+reverse);
    }
    
}
