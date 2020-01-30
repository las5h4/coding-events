public class TrueFalseQues extends Question {
    String questionAsked;
    Boolean trueFalseAnswer;
    String type = "TrueFalse";
    public TrueFalseQues(String questionAsked, Boolean trueFalseAnswer) {
        this.questionAsked = questionAsked;
        this.trueFalseAnswer = trueFalseAnswer;
    }
    public String getQuestionAsked() {
        return questionAsked;
    }
    public String getType() {
        return this.type;
    }
    public Boolean getTrueFalseAnswer() {
        return this.trueFalseAnswer;
    }
}
