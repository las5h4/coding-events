import java.util.HashMap;

public class CheckboxQues extends Question {
    String questionAsked;
    String optionOne;
    String optionTwo;
    String optionThree;
    String optionFour;
    String correctAnswer;
    public String type = "Checkbox";
    public CheckboxQues(String questionAsked, String optionOne, String optionTwo, String optionThree, String optionFour, String correctAnswer) {
        this.questionAsked = questionAsked;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
        this.correctAnswer = correctAnswer;
    }
    public String getQuestionAsked() {
        return questionAsked;
    }
    public String getType() {
        return this.type;
    }
    public HashMap<Character, String> getAnswerMap() {
        AnswerMap quesOneAnswerMap = new AnswerMap(optionOne, optionTwo, optionThree, optionFour);
        quesOneAnswerMap.createNewAnswerMap();
        return quesOneAnswerMap.createNewAnswerMap();
    }
    public String getCheckboxAnswer() {
        return this.correctAnswer;
    }
}
