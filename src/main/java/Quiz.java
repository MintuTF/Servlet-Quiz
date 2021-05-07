

public class Quiz {
private  int score;
private String[]  questions={
        "3,1,4,5",
        "1,1,2,3,5",
        "1,4,9,16,25",
        "2,3,5,7,11",
        "1,2,4,8,16"
};
private static int [] answers={9,8,36,13,320};

    public Quiz()
{
 score=0;
}

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getQuestions(int i) {
        return questions[i];
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public static int getAnswers(int i) {
        return answers[i];
    }

    public static void setAnswers(int[] answers) {
        Quiz.answers = answers;
    }
}
