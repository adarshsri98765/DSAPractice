import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your choice=>\n1. USD to INR\n2. INR to USD");
        int n=scanner.nextInt();

    switch (n){
        case 1:{
            System.out.println("Enter the amount in USD : ");
            int x=scanner.nextInt();
            System.out.println("Amount in INR = Rs. "+ x*83.73);
            break;
        }
        case 2:{
            System.out.println("Enter the amount in INR : ");
            int x=scanner.nextInt();
            System.out.println("Amount in USD = $ "+ x*0.012);
            break;
        }
        default:{
            System.out.println("Invalid Input!!!!!");
        }
    }
    }
}
