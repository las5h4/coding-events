import java.util.ArrayList;
import java.util.HashMap;

public class AnswerMap {
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    public AnswerMap(String answerA, String answerB, String answerC, String answerD) {
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
    }
    public HashMap<Character, String> createNewAnswerMap(){
        HashMap<Character, String> newAnswerMap = new HashMap<>();
        newAnswerMap.put('a', answerA);
        newAnswerMap.put('b', answerB);
        newAnswerMap.put('c', answerC);
        newAnswerMap.put('d', answerD);
        return newAnswerMap;
    }
}
