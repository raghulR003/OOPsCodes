import java.util.*;
public class operations {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("1.Signed Left Shift\n2.Signed Right Shift\n3.Unsigned Right Shift\n");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Original value: "+num);
            System.out.println("Enter shifting value: ");
            int n=sc.nextInt();
            System.out.println("Shifted value: "+(num<<n));
            System.out.println("Byte value is: "+((byte)(num<<n)));
            break;

            case 2:
            System.out.println("Original value: "+num);
            System.out.println("Enter shifting value: ");
            int n1=sc.nextInt();
            System.out.println("Shifted value: "+(num>>n1));
            System.out.println("Byte value is: "+((byte)(num>>n1)));
            break;
        }
    }
}
