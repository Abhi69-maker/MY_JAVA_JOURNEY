import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = {"What is the chemical symbol of water?",
                "What is the national animal of India?",
                "Which is the largest planet in our solar system?",
                "Which planet is known as the Red Planet?",
                "Who is known as the Father of the Nation in India?"};
        String[][] options = {{"1) Mumbai ", "2) New Delhi ", "3) Kolkata ", "4) Chennai"},
                {"1) Elephant", "2) Lion", "3) Bengal Tiger", "4) Peacock"},
                {"1) Earth ", "2) Jupiter ", "3) Saturn ", "4) Neptune"},
                {"1) Venus ", "2) Mars ", "3) Jupiter ", "4) Saturn"},
                {"1) Jawaharlal Nehru ", "2) Bhagat Singh ", "3) Mahatma Gandhi ", "4) Subhas Chandra Bose"}};
        int answers[] = {2, 3, 2, 2, 3};
        int score = 0;
        int guess;
        System.out.println("**********************************");
        System.out.println("Wellcome to Quiz Game");
        System.out.println("**********************************");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.print(option);
            }
            System.out.println("Enter your answer : ");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                System.out.println("****************");
                System.out.println("Correct Answer,Great");
                System.out.println("****************");
                score++;

            } else {
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
                System.out.println("Wrong Answer");
                System.out.println("xxxxxxxxxxxxxxxxxxxxx");
            }
            System.out.println("Your Score out of 5 is " + score);


        }
    }











    }





