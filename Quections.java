import java.util.Scanner;

public class Quections {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] quection = {"1","This is quection","a","b","c","d","c"};

        // System.out.println("This is quection");
        // for(int i=0;i<quection.length - 1;i++){
        //     System.out.println("This is question number " + i);
        //     for(int j=0;j<quection.length-1;j++){
        //         System.out.println(quection[i]);
        //     }
        // }

        System.out.println("Quection");
        for(int i=0;i<quection.length-1;i++)
        {
            if (i == 0) {
                System.out.println("Quection Number : " + quection[0]);
            }

            if (i == 1) {
                System.out.println(quection[0] + ". " + quection[i]);
            }
            
            if (i >= 2) {
                System.out.println(i-1 + ". " + quection[i]);
                
            }
        }

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
    }
}
