import java.util.*;
public class decimaltooctal {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the decimal number: ");
        int num=sc.nextInt();
        int arr[]=new int[50];
        int i=0;
        while(num!=0){
            arr[i]=num%8;
            num=num/8;
            i++;
        }
        System.out.println("The octal value is:");
        for(int j=i;j>=0;j--){
            System.out.print(arr[j]);
                }}}