import java.util.Scanner;

public class ObjectPrg {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Trainer trainer=new Trainer();
        trainer.fName="Adarsh";

        trainer.lName= "Srivastava";

        concatenate(trainer.fName,trainer.lName);
    }

    static void concatenate(String fName,String lName){
        System.out.println(lName+" "+fName);
    }


}
 class Trainer{
    String fName;
    String lName;

}
