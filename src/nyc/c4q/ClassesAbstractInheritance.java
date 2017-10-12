package nyc.c4q;

import java.util.Scanner;

public class ClassesAbstractInheritance extends ControlStructuresChoice {

    private  static int keepingCount = 0;

    public static int getKeepingCount() {
        return keepingCount;
    }

    public static int getgame() {

        ControlStructuresChoice.addTo();

        Scanner input = new Scanner(System.in);

        System.out.println("What will be the outcome of this program.: " +
                "class A \n" +
                "{\n" +
                "    final public int GetResult(int a, int b) { return 0; } \n" +
                "} \tclass B extends A \n" +
                "{ \n" +
                "    public int GetResult(int a, int b) {return 1; } \n" +
                "} \tpublic class Test \n" +
                "{\n" +
                "    public static void main(String args[]) \n" +
                "    { \n" +
                "        B b = new B(); \n" +
                "        System.out.println(\"x = \" + b.GetResult(0, 1));  \n" +
                "    } \n" +
                "}\t\n" +
                "   19. x = 0\n" +
                "\t20.x = 1                                    \n" +
                "\t21. Compilation fails.   ");
        int response = input.nextInt();
        if (choiceAndAnswerControl.containsKey(response)) {

            keepingCount += 1;
            System.out.println("You are correct");
        } else {
            System.out.println("You are Wrong!!");
        }

        System.out.println("What will be the outcome of this program: \n" +
                "class BoolArray \n" +
                "{\n" +
                "    boolean [] b = new boolean[3];\n" +
                "    int count = 0;\n" +
                "\n" +
                "    void set(boolean [] x, int i) \n" +
                "    {\n" +
                "        x[i] = true;\n" +
                "        ++count;\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String [] args) \n" +
                "    {\n" +
                "        BoolArray ba = new BoolArray();\n" +
                "        ba.set(ba.b, 0);\n" +
                "        ba.set(ba.b, 2);\n" +
                "        ba.test();\n" +
                "    }\n" +
                "\n" +
                "    void test() \n" +
                "    {\n" +
                "        if ( b[0] && b[1] | b[2] )\n" +
                "            count++;\n" +
                "        if ( b[1] && b[(++count - 2)] )\n" +
                "            count += 7;\n" +
                "        System.out.println(\"count = \" + count);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "22.count = 0\n" +
                "\t23.count = 2\n" +
                "\t24.count = 3\n" +
                "\t25. count = 4");
        Scanner input2 = new Scanner(System.in);
        int response2 = input2.nextInt();
        if (choiceAndAnswerControl.containsKey(response2)) {
            keepingCount += 1;
            System.out.println("You are correct");
        } else {
            System.out.println("You are Wrong!!");
        }

        return keepingCount;
    }
}
