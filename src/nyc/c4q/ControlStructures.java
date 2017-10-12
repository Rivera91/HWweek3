package nyc.c4q;

import java.util.Scanner;

public class ControlStructures extends ControlStructuresChoice {

    private  static int keepingCount = 0;

    public static int getKeepingCount() {
        return keepingCount;
    }

    public static int getgame() {


        ControlStructuresChoice.addTo();




        Scanner String = new Scanner(System.in);
   //     Scanner input = new Scanner(System.in);


        System.out.println("1. What is the operator for OR  \n" +
                "         1: &&\n" +
                "         2: ==\n" +
                "         3:  ||");
        Scanner input = new Scanner(System.in);
        int response = input.nextInt();

        if ( getChoiceAndAnswerControl().containsKey(response) ) {
            keepingCount += 1;
            System.out.println("You are correct");
        } else {
            System.out.println("You are Wrong!!");
        }


        System.out.println("What is the operator is used to determine if two primitive values are equal?");


        String Stringinput = String.next();
        if (Stringinput.equals("==")) {
            keepingCount += 1;

            System.out.println("You are correct");
        } else {
            System.out.println("You are Wrong!!");
        }




        System.out.println("Which is true concerning this code: \n" +
                "    public void foo( boolean a, boolean b)\n" +
                "{ \n" +
                "    if( a ) \n" +
                "    {\n" +
                "        System.out.println(\"A\"); /* Line 5 */\n" +
                "    } \n" +
                "    else if(a && b) /* Line 7 */\n" +
                "    { \n" +
                "        System.out.println( \"A && B\"); \n" +
                "    } \n" +
                "    else /* Line 11 */\n" +
                "    { \n" +
                "        if ( !b ) \n" +
                "        {\n" +
                "            System.out.println( \"notB\") ;\n" +
                "        } \n" +
                "        else \n" +
                "        {\n" +
                "            System.out.println( \"ELSE\" ) ; \n" +
                "        } \n" +
                "    } \n" +
                "}\n" +
                "\n" +
                "4.If a is true and b is true then the output is \"A && B\"\n" +
                "5.If a is true and b is false then the output is \"notB\"\n" +
                "6.If a is false and b is true then the output is \"ELSE\"\n" +
                "7.If a is false and b is false then the output is \"ELSE\"");



        Scanner input2 = new Scanner(System.in);
        int response2 = input2.nextInt();

        if (getChoiceAndAnswerControl().containsKey(response2)) {
            keepingCount += 1;

            System.out.println("You are correct");
        } else {
            System.out.println("You are Wrong!!");
        }


        System.out.println(" What will be the output of the program?\t\n" +
                "   Float f = new Float(\"12\");   \t\n" +
                " switch (f) \n" +
                "{\n" +
                "    case 12: System.out.println(\"Twelve\"); \n" +
                "    case 0: System.out.println(\"Zero\"); \n" +
                "    default: System.out.println(\"Default\"); \n" +
                "}\t\n" +
                "\t8.Zero\n" +
                "\t9.Twelve\n" +
                "\t10.Default\n" +
                "\t11.Compilation fails");


        Scanner input3= new Scanner(System.in);
        int response3 = input3.nextInt();
        if (choiceAndAnswerControl.containsKey(response3)) {
            keepingCount += 1;

            System.out.println("You are correct");
        } else {
            System.out.println("You are Wrong!!");
        }


        System.out.println("What will be the output of the program?\t\n" +
                "class s implements Runnable \n" +
                "{ \n" +
                "    int x, y; \n" +
                "    public void run() \n" +
                "    { \n" +
                "        for(int i = 0; i < 1000; i++) \n" +
                "            synchronized(this) \n" +
                "            { \n" +
                "                x = 12; \n" +
                "                y = 12; \n" +
                "            } \n" +
                "        System.out.print(x + \" \" + y + \" \"); \n" +
                "    } \n" +
                "    public static void main(String args[]) \n" +
                "    { \n" +
                "        s run = new s(); \n" +
                "        Thread t1 = new Thread(run); \n" +
                "        Thread t2 = new Thread(run); \n" +
                "        t1.start(); \n" +
                "        t2.start(); \n" +
                "    } \n" +
                "}\t\n" +
                "\t12.DeadLock\n" +
                "\t13.It print 12 12 12 12\n" +
                "\t14.Compilation Error\n" +
                "\t15. Cannot determine output.");

        Scanner input4 = new Scanner(System.in);
        int response4 = input4.nextInt();
        if (choiceAndAnswerControl.containsKey(response4)) {
            keepingCount += 1;

            System.out.println("You are correct");
        } else {
            System.out.println("You are Wrong!!");
        }

        return keepingCount;
    }
}
