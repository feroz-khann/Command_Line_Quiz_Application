import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        // Quiz questions and their respective answers
        String q1 = "Which planet is known as the Red Planet?\n"
                  + "A) Venus\nB) Mars\nC) Jupiter\nD) Saturn";
                  
        String q2 = "Which river is known as the longest river in India?\n"
                  + "A) Ganga\nB) Brahmaputra\nC) Yamuna\nD) Godavari";
        
        String q3 = "What is the capital city of India?\n"
                  + "A) Mumbai\nB) Kolkata\nC) New Delhi\nD) Chennai";

        String q4 = "Which Indian festival is known as the Festival of Lights?\n"
                  + "A) Eid\nB) Diwali\nC) Christmas\nD) Holi";
        // Creating an array of Question objects
        Question [] questions = {
            new Question(q1,"b"),
            new Question(q2, "a"),
            new Question(q3, "c"),
            new Question(q4, "b")
        };
        // Conducting the test
        takeTest(questions);
        
    }
    public static void takeTest(Question[] questions){
        int score = 0;
        Scanner sc = new Scanner(System.in);

         // Iterating through each question
        for(int i = 0; i < questions.length; i++){
            // Displaying the question prompt
            System.out.println(questions[i].prompt);
            // Taking user's answer and converting it to lowercase
            String answer = sc.nextLine().toLowerCase();
            // Checking if the answer is correct
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        // Displaying the user's score
        System.out.println("You got " + score + " out of " + questions.length);
    }
}