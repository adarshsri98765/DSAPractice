import java.util.Random;

public class GenerateOTP {
    public static void main(String[] args) {
        Random random=new Random();

        int myOTP= random.nextInt(1000000);

        System.out.println(myOTP);
    }
}
