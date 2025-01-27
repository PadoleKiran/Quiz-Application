// by this function quection will disply

public class QuestionDisplay {

    

    static void display(String[] quection) {
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
    }
}
