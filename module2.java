/** A module from the Coupon management system which shows product options by filter */
/** Options are Brand, Price, User Ratings, Material */
import java.util.*;
public class module2{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("You have decided to check shoes\n");
        System.out.println("Select your filter options now in order: ");
        System.out.println("1.Brand\n2.Price\n3.User Ratings\n");
        while(1){
            int choice=sc.nextInt();
            switch(choice){
                case 1: System.out.println("Shoe brands\n");
                System.out.println("1.Nike\n2.Adidas\n3.Reebok\n4.Puma");
                int ch=sc.nextInt();
                switch(ch){
                    case 1: System.out.println("You have chosen Nike!");
                    System.out.println("Enter your price range from 0 to 20000:");
                    // 9 coupons in 0 to 5000 range, 4 coupons in 5000 to 15000 range and 2 coupons in 15000 to 20000 range
                    int price_range=sc.nextInt();
                    double price=(double)price_range;
                    if(price>0 && price<5000){
                        System.out.println("9 coupons available.");
                        System.out.println("Enter the user ratings choice\n1. ****\n2.***\3.**\4.*\n");
                        int c=sc.nextInt();
                        switch(c){
                            case 1: System.out.println("4 units of coupons available.");
                            System.out.println("1. Value: 2500 rs (3 units)\n2. Value: 3999 rs (1 units)\n");
                            int k=sc.nextInt();
                            switch(k){
                                case 1: System.out.println("Selected coupon of value 2500 rs. How many you want to purchase?");
                                int num=sc.nextInt();
                                System.out.println("You are buying "+num+" coupons, worth "+(num*2500)+" rs.Proceeding to checkout... ");
                                break;

                                case 2: System.out.println("Selected coupon of value 3999 rs");
                                System.out.println("You are buying 1 coupon, worth 3999rs.Proceeding to checkout... ");
                                break;

                                default: System.out.println("Invalid Option selected!");
                                System.exit(0);
                            }
                            break;

                            case 2: System.out.println("3 units of coupons available.");
                            System.out.println("1. Value: 1500 rs (1 units)\n2. Value: 2999 rs (2 units)\n");
                            int k=sc.nextInt();
                            switch(k){
                                case 1: System.out.println("Selected coupon of value 1500 rs.");
                                System.out.println("You are buying 1 coupon, worth 1500rs.Proceeding to checkout... ");
                                break;

                                case 2: System.out.println("Selected coupon of value 2999 rs. How many you want to purchase?");
                                int num=sc.nextInt();
                                System.out.println("You are buying "+num+" coupons, worth "+(num*2999)+" rs.Proceeding to checkout... ");
                                break;

                                default: System.out.println("Invalid Option selected!");
                                System.exit(0);
                            }
                            break;

                            case 3: System.out.println("2 units of coupons available.");
                            System.out.println("1. Value: 2900 rs (2 units)\n2. Value: 2999 rs (Unavailable)\n");
                            int k=sc.nextInt();
                            switch(k){
                                case 1: System.out.println("Selected coupon of value 2900 rs. How many you want to purchase?");
                                int num=sc.nextInt();
                                System.out.println("You are buying "+num+" coupons, worth "+(num*2900)+" rs.Proceeding to checkout... ");
                                break;

                                case 2: 
                                break;

                                default: System.out.println("Invalid Option selected!");
                                System.exit(0);
                            }
                            break;

                            case 4: System.out.println("Unavailable");
                            break;

                            default: System.out.println("Invalid Option!");
                            System.exit(0);
                        }
                    }

                    else if(price>5000 && price<15000){
                        System.out.println("4 coupons available.");
                        System.out.println("Enter the user ratings choice\n1. ****\n2.***\3.**\4.*\n");
                        int c=sc.nextInt();
                        switch(c){
                            case 1: System.out.println("4 units of coupons available.");
                            System.out.println("1. Value: 2500 rs (2 units)\n2. Value: 3999 rs (2 units)\n");
                            int k=sc.nextInt();
                            switch(k){
                                case 1: System.out.println("Selected coupon of value 2500 rs. How many you want to purchase?");
                                int num=sc.nextInt();
                                System.out.println("You are buying"+num+" coupons, worth "+(num*2500)+" rs.Proceeding to checkout... ");
                                break;

                                case 2: System.out.println("Selected coupon of value 3999 rs. How many you want to purchase?");
                                int num=sc.nextInt();
                                System.out.println("You are buying"+num+" coupons, worth "+(num*3999)+" rs.Proceeding to checkout... ");
                                break;

                                default: System.out.println("Invalid Option selected!");
                                System.exit(0);
                            }
                            break;

                            case 2: 
                            case 3:
                            case 4:
                            break;
                            default: System.out.println("Invalid Option!");
                            System.exit(0);
                        }
                    }

                    else if(price>15000 && price<20000){
                        System.out.println("2 coupons available.");
                        System.out.println("Enter the user ratings choice\n1. ****\n2.***\3.**\4.*\n");
                        int c=sc.nextInt();
                        switch(c){
                            case 1: 
                            case 2: 
                            case 3: System.out.println("2 units of coupons available.");
                            System.out.println("1. Value: 2900 rs (2 units)\n2. Value: 2999 rs (Unavailable)\n");
                            int k=sc.nextInt();
                            switch(k){
                                case 1: System.out.println("Selected coupon of value 2900 rs. How many you want to purchase?");
                                int num=sc.nextInt();
                                System.out.println("You are buying "+num+" coupons, worth "+(num*2900)+" rs.Proceeding to checkout... ");
                                break;

                                case 2: 
                                break;

                                default: System.out.println("Invalid Option selected!");
                                System.exit(0);
                            }
                            break;
                            case 4:
                            break;
                            default: System.out.println("Invalid Option!");
                            System.exit(0);
                        }
                    }

                }
            }
        }
    }
}