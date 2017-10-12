package nyc.c4q;
import java.util.HashMap;

public class ControlStructuresChoice {


    public static HashMap<Integer, String> getChoiceAndAnswerControl() {
        return choiceAndAnswerControl;
    }

    static HashMap<Integer, String> choiceAndAnswerControl = new HashMap();


    public static class controlStructuresChoice {
        HashMap<Integer, String> choiceAndAnswerControl = new HashMap();
    }


    public static void addTo() {


        choiceAndAnswerControl.put(3, "The Correct answer is : ==");

        choiceAndAnswerControl.put(6, "The correct answer is : 6. The output is \"ELSE\". Only when a is false do the output lines after 11 get some chance of executing.\n" +
                "Option A is wrong. The output is \"A\". When a is true, irrespective of the value of b, only the line 5 output will be executed. The condition at line 7 will never be evaluated (when a is true it will always be trapped by the line 12 condition) therefore the output will never be \"A && B\".\n" +
                "Option B is wrong. The output is \"A\". When a is true, irrespective of the value of b, only the line 5 output will be executed.\n" +
                "Option D is wrong. The output is \"notB\".");

        choiceAndAnswerControl.put(10, " The corerct answer is 10. The switch statement can only be supported by integers or variables more \"narrow\" than an integer i.e. byte, char, short. Here a Float wrapper object is used and so the compilation fails. ");

        choiceAndAnswerControl.put(13, "Do this one over !!!!The Correct answer is 13. The program will execute without any problems and print 12 12 12 12.\n");

        choiceAndAnswerControl.put(17, "The corerct answer is 10 .The Answer is False ");

        choiceAndAnswerControl.put(21, "The Correct Answer is 21. The code doesn't compile because the method GetResult() in class A is final and so cannot be overridden.");

        choiceAndAnswerControl.put(24, "The Correct answer is 24. The reference variables b and x both refer to the same boolean array. count is incremented                     for each call to the set() method, and once again when the first if test is true. Because of the && short circuit operator, count is not incremented during the second if test. ");



    }


    public static String getanswer(int a) {


        return choiceAndAnswerControl.get(a);
    }
}
