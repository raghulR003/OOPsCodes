import java.util.*;
public class octaltodecimal
{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the octal number (of form 0XX): ");
        int num=sc.nextInt();
        int temp,sum=0,i=0;
        while(num!=0){
            temp=num%10;
            sum+=temp*Math.pow(8,i);
            num=num/10;
            i++;
        }
        System.out.println("The decimal value is:" +sum);
    }
}