import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age=scanner.nextInt();

        String st=(age>=18)?"Eligible":"Not Eligible";
        System.out.println(st);

    }

}
