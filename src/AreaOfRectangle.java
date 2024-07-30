import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter length : ");
        int l= sc.nextInt();

        System.out.print("\nEnter breadth : ");
        int b= sc.nextInt();

        areaRectangle(l,b);

    }
    private static void areaRectangle(int l,int b){
        System.out.println("\nArea : "+l*b);
    }
}
