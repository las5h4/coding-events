import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        ArrayList<Question> starTrekQuestionList = new ArrayList<>();
        ArrayList<Question> musicQuestionList = new ArrayList<>();

        Question quesOne = new MulChoQues("Who was the first Star Trek Captain to appear on screen in 1969?", "Captain Archer", "Captain Kirk", "Captain Picard", "Captain Pike", 'd');
        Question quesTwo = new CheckboxQues("Which of the following is an episode of The Next Generation?", "The Cage", "Encounter At Farpoint", "The Inner Light", "In The Pale Moonlight", "bc");
        Question quesThree = new TrueFalseQues("There Are Four Lights", true);

        starTrekQuestionList.add(quesOne);
        starTrekQuestionList.add(quesTwo);
        starTrekQuestionList.add(quesThree);

        Quiz starTrekQuiz = new Quiz("Star Trek Quiz", starTrekQuestionList);

        Question musicOne = new TrueFalseQues("Igor Stravinsky had to escape from a riot in the theater during the debut of his ballet, 'The Rite Of Spring'", true);
        Question musicTwo = new MulChoQues("What is the name for the musical device in which the final chord of a song in a minor key is a Major I chord?", "Plagal Cadence", "Deceptive Cadence", "Picardy Third", "Perfect Third", 'c');
        Question musicThree = new MulChoQues("Which mode is the same in terms of notes played as a 'major' scale?", "Ionian", "Dorian", "Lydian", "Aolian", 'a');
        Question musicFour = new CheckboxQues("Which of the following notes would sound good played over an A minor chord?", "B", "Db", "G#", "G", "acd");
        Question musicFive = new TrueFalseQues("Western harmony is largely based on the overtone series", true);
        Question musicSix = new CheckboxQues("Which of the following modes has a tonic minor triad?", "Aolian", "Phrygian", "Locrian", "Dorian", "ad");

        musicQuestionList.add(musicOne);
        musicQuestionList.add(musicTwo);
        musicQuestionList.add(musicThree);
        musicQuestionList.add(musicFour);
        musicQuestionList.add(musicFive);
        musicQuestionList.add(musicSix);

        Quiz musicQuiz = new Quiz("Music Quiz", musicQuestionList);

//        starTrekQuiz.runQuiz();

        musicQuiz.runQuiz();

    }
}
