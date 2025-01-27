// this is main file

public class Quiz {
    public static void questionquiz() {
        QuestionsList questionsList = new QuestionsList();
        QuestionDisplay questiondisplay = new QuestionDisplay();
        QuestionAnswer questionAnswer = new QuestionAnswer();

        QuestionDisplay.display(QuestionsList.getQuection());
        QuestionAnswer.answer(QuestionsList.getQuection());
    }
}
