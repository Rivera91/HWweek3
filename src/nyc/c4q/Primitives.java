package nyc.c4q;

import java.util.Scanner;

public class Primitives extends ControlStructuresChoice {

    private static int keepingCount = 0;

    public static int getKeepingCount() {
        return keepingCount;
    }



    public static int getgame() {
        ControlStructuresChoice.addTo();

        Scanner input = new Scanner(System.in);



        System.out.println("What is the output for this code ?\n" +
                "   class Main {\n" +
                "\n" +
                "   public static void main(String[] args){\n" +
                "\n" +
                "        boolean alwaysTrue = false;\n" +
                "\n" +
                "        boolean alwaysFalse = false;\n" +
                "\n" +
                "        System.out.println(alwaysTrue && alwaysFalse);\n" +
                "\n" +
                "   }\n" +
                "\n" +
                " }\n" +
                "\n" +
                "       16.True\n" +
                "       17.False\n" +
                "       18.Error");
        Scanner input4 = new Scanner(System.in);

        int response = input.nextInt();
        if (choiceAndAnswerControl.containsKey(response)) {
            keepingCount += 1;
            System.out.println("You are correct");
        } else {
            System.out.println("You are Wrong!!");
        }
        return keepingCount;
    }
}
