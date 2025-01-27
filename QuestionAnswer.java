import java.util.Scanner;

public class QuestionAnswer {
    static void answer(String[] quection) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter Correct option between 1 to 4 : ");
        int correctoption = scanner.nextInt();

        String[] option = {"a","b","c","d"};

        System.out.println("Your answer is " + option[correctoption]);

        if (option[correctoption - 1] == quection[6]) {
            System.out.println("Your option is correct");
        }
        else{
            System.out.println("Answer is wrong!!" + correctoption);
        }

        scanner.close();
    }
}
