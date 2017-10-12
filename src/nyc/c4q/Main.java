package nyc.c4q;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        promptuser();


        while (true) {




            Scanner input2 = new Scanner(System.in);

            String userChoice = input2.next().toLowerCase();

            if (userChoice.equals("control")){
                ControlStructures.getgame();
                System.out.println("Good Job!...Let't try another topic :)");


            } else if (userChoice.equals("Primitives")) {
                // Primitives.getgame();
                System.out.println("Good Job!...Let't try another topic :)");

            } else if (userChoice.equals("Classes") || userChoice.equals("abstract") || userChoice.equals("inheritance")) {
                ClassesAbstractInheritance.getgame();

                System.out.println("Good Job!...Let't try another topic :)");
            } else {
                System.out.println();
                promptuser();
                continue;
            }




        }

    }

    private static void promptuser() {
        System.out.println("Hi, welcome to Java trainer 1.0. Type in a Java term you would like to learn more about:");
        System.out.println("Let's test your knowledge. Choose A Topic: Control Structures, Primitives, Classes, Abstract, or Inheritance?");
    }
}