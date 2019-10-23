import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int i = 10 ;
        int score;
        String grade = "";
        String answer = "Y";


        while(answer.equalsIgnoreCase("Y")){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter an exam score: ");
            score = keyboard.nextInt();

            if(90<=score && score <=100){
                grade = "A";
            }
            else if(80<=score && score <=89){
                grade = "B";
            }
            else if (70<=score && score <=79){
                grade = "C";
            }
            else if(60<=score && score <=69){
                grade = "D";
            }
            else if (score<60) {
                System.out.println("Go back to School if you get below 60.");
                break;
            }

            System.out.println("Good job. Your grade is " + grade + ".");
            System.out.println("Do you want to enter another score (Y/N)? ");
            answer = keyboard.next();


        }


    }
}
