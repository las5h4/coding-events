import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
    Scanner input = new Scanner(System.in);
    private ArrayList<Question> questionList;
    private String name;
    public Quiz(String name, ArrayList<Question> questionList) {
        this.questionList = questionList;
        this.name = name;
    }
    public void runQuiz() {
        double percentCorrect;


        int totalQuestions = 0;
        int totalCorrect = 0;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("** *** ** *** ** *** ** *** **");
        System.out.println();
        System.out.println(name.toUpperCase());
        System.out.println();
        System.out.println("** *** ** *** ** *** ** *** **");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println();
        System.out.println("Type 'go' to start the quiz!");

        String go = input.nextLine();
        if (go.equals("go")) {
            for (Question question : questionList) {
                totalQuestions ++;
                System.out.println();
                System.out.println();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println();
                System.out.println();
                System.out.println(question.getQuestionAsked());
                if (question.getType() == "MulCho") {
                    String userInput;
                    System.out.println();
                    System.out.println("Enter the letter of the best option:");
                    for (Map.Entry<Character, String> answer : question.getAnswerMap().entrySet()) {
                        System.out.println(answer.getKey()+".) "+answer.getValue());
                    }
                    userInput = input.nextLine();
                    char userInputAsChar = userInput.charAt(0);
                    if (userInputAsChar == question.getCorrectAnswer()) {
                        totalCorrect ++;
                        System.out.println();
                        System.out.println();
                        System.out.println("Correct!");
                        System.out.println("** *** ** *** ** *** ** *** **");
                        System.out.println("*** ** *** ** *** ** *** ** **");
                    } else {
                        System.out.println();
                        System.out.println();
                        System.out.println("WRONG!");
                    }
                }
                if (question.getType() == "Checkbox") {
                    String userInput;
                    System.out.println("Type the letters of each corresponding applicable answer, then press enter.");
                    System.out.println("Ex: if options a.) and b.) apply, type 'ab'");
                    for (Map.Entry<Character, String> answer : question.getAnswerMap().entrySet()) {
                        System.out.println(answer.getKey()+".) "+answer.getValue());
                    }
                    userInput = input.nextLine();
                    if (userInput.equals(question.getCheckboxAnswer())) {
                        totalCorrect ++;
                        System.out.println();
                        System.out.println();
                        System.out.println("Correct!");
                        System.out.println("** *** ** *** ** *** ** *** **");
                        System.out.println("*** ** *** ** *** ** *** ** **");
                    } else {
                        System.out.println();
                        System.out.println();
                        System.out.println("WRONG!");
                    }
                }
                if (question.getType() == "TrueFalse") {
                    Boolean userInput;
                    System.out.println("Type 'true' or 'false'");
                    userInput = input.nextBoolean();
                    if (userInput.equals(question.getTrueFalseAnswer())) {
                        totalCorrect ++;
                        System.out.println();
                        System.out.println();
                        System.out.println("Correct!");
                        System.out.println("** *** ** *** ** *** ** *** **");
                        System.out.println("*** ** *** ** *** ** *** ** **");
                    } else {
                        System.out.println();
                        System.out.println();
                        System.out.println("WRONG!");
                    }
                }

            }
        }
        percentCorrect = ((double) totalCorrect / (double) totalQuestions);
        percentCorrect = Math.round(percentCorrect*10000) * .01;
        System.out.println();
        System.out.println();
        System.out.println("Total Correct: "+totalCorrect+"/"+totalQuestions+" - "+percentCorrect+"%");
        System.out.println();
        System.out.println();
        if (percentCorrect >= 70.0) {
            System.out.println("Woah, you know your stuff! Thanks for Quizzing!");
        } else {
            System.out.println("Better luck next time! Thanks for Quizzing!");
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("** *** ** *** ** *** ** *** **");
        System.out.println("** *** ** *** ** *** ** *** **");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
