import java.util.HashMap;

public abstract class Question {
    private String questionAsked;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private char correctAnswer;
    private String checkboxAnswer;
    private Boolean trueFalseAnswer;
    private String type;

    public Question() {

    }
    public String getQuestionAsked() {
        return questionAsked;
    }
    public HashMap<Character, String> getAnswerMap() {
        AnswerMap quesOneAnswerMap = new AnswerMap(answerA, answerB, answerC, answerD);
        quesOneAnswerMap.createNewAnswerMap();
        return quesOneAnswerMap.createNewAnswerMap();
    }
    public String getType() {
        return this.type;
    }
    public Character getCorrectAnswer() {
        return this.correctAnswer;
    }
    public String getCheckboxAnswer() {
        return this.checkboxAnswer;
    }
    public Boolean getTrueFalseAnswer() {
        return this.trueFalseAnswer;
    }
}
