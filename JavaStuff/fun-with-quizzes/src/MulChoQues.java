import java.util.HashMap;

public class MulChoQues extends Question {
    private String questionAsked;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private char correctAnswer;
    private String type = "MulCho";
    public MulChoQues(String questionAsked, String answerA, String answerB, String answerC, String answerD, char correctAnswer) {
        super();
        this.questionAsked = questionAsked;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;

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
        return correctAnswer;
    }
}
