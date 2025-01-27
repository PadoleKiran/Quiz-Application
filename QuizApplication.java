import java.util.*;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();

        System.out.println("------------Login page----------------");

        System.out.print("Enter UserName : ");
        String username = scanner.next();

        System.out.print("Enter Password : ");
        String password = scanner.next();

        System.out.println("---------------------------------------");


        if(username.toLowerCase().equals("user") && password.toLowerCase().equals("user123") ) {
            System.out.println("You are loged in as user");
            quiz.questionquiz();
            // quiz.questionquiz();
        }
        else if (username.toLowerCase().equals("admin") && password.toLowerCase().equals("admin123") ) {
            System.out.println("You are loged in as Admin");
        }
        else {
            System.out.println("Please Enter valid Id and Password");
        }

        System.out.println("Program is End");

        scanner.close();

    }
}