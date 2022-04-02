import java.io.Console;
import java.util.Scanner;

public class myFavoriteColor {
    public static void main(String[] args) {
        String name;
        int age;
        //double gpa;
        String output;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        name = in.nextLine();
        //System.out.println("Enter your age");
       // name = in.nextInt();
      //  System.out.println("Enter your gpa");
       // name = in.nextDouble();

        output = String.format("Name:%10s\n", name);
        //output = String.format("Name:%10sd\n", age);
        //output = String.format("Name:%10.2nf\n", gpa);

        System.out.println(output);


    }
}
