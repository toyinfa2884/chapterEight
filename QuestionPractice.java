package chapterEight;

import java.util.Scanner;

public class QuestionPractice {
    public  static Scanner input = new Scanner(System.in);
    //public static String[] questions;
    public  String prompt;
    public  char choice;
    public static  char [] userInput = new char[20];
    public QuestionPractice(String prompt, char choice){
        this.prompt = prompt;
        this.choice = choice;
   }


    public static void main(String[] args) {

        String q1 = "QuestionPractice 1:" +
                    "A:expend energy, enjoy groups\n"
                    + "B:conserve energy, enjoy one-on-one";
        String q2 = "QuestionPractice 2:" +
                    "A:interpret literally\n"
                    + "B:look for meaning and possibilities";
        String q3 = "QuestionPractice 3:" +
                    "logical, thinking, questioning\n"
                    + "empathetic, feeling, accommodating";
        String q4 = "QuestionPractice 4:" +
                    "A:organized, orderly\n"
                    + "B:flexible, adaptable";
        String q5 = "QuestionPractice 5:" +
                    "A:more outgoing, think out loud\n"
                    + "B:more reserved, think to yourself";
        String q6 = "QuestionPractice 6:" +
                    "A:practical, realistic, experiential\n"
                    + "B:imaginative, innovative, theoretical";
        String q7 = "QuestionPractice 7:" +
                    "A:candid, straight forward, frank\n"
                    + "B:tactful, kind, encouraging";
        String q8 = "QuestionPractice 8:" +
                    "A:plan, schedule\n"
                    + "B:unplanned, spontaneous";
        String q9 = "QuestionPractice 9:" +
                    "A:seek many tasks, public activities, interaction with others\n"
                    + "B:seek private, solitary activities with quiet to concentrate";
        String q10 = "QuestionPractice 10:" +
                    "A:standard, usual, conventional\n"
                    + "B:different, novel, unique";
        String q11 = "QuestionPractice 11:" +
                    "A:firm, tend to criticize, hold the line\n"
                    + "B:gentle, tend to appreciate, conciliate";
        String q12 = "QuestionPractice 12:" +
                    "A:regulated, structured\n"
                    + "B:easygoing, \"live\" and \"let live\"";
        String q13 = "QuestionPractice 13:" +
                    "A:external, communicative, express your\n"
                    + "B:internal, reticent, keep to yourself";
        String q14 = "QuestionPractice 14:" +
                    "A:focus on here-and-now\n"
                    + "B:look to the future, global perspective, \"big picture\"";
        String q15 = "QuestionPractice 15:" +
                    "A:tough-minded, just\n"
                    + "B:tender-hearted, merciful";
        String q16 = "QuestionPractice 16:" +
                    "A:preparation, plan ahead\n"
                    + "B:go with the flow, adapt as you go";
        String  q17 = "QuestionPractice 17:" +
                    "A:active initiate\n"
                    + "B:reflective, deliberate";
        String  q18 = "QuestionPractice 18:" +
                    "A:facts, things, \"what is\"\n"
                    + "B:ideas, dreams, \"what could be\", philosophical";
        String q19 = "QuestionPractice 19:" +
                    "A:matter of fact, issue-oriented\n"
                    + "B:sensitive, people=oriented, compassionate";
        String q20 = "QuestionPractice 20:" +
                    "A:control, govern\n"
                    + "B:latitude, freedom";


        QuestionPractice[] questions = {
                new QuestionPractice(q1, 'c'),
                new QuestionPractice(q2, 'c'),
                new QuestionPractice(q3, 'c'),
                new QuestionPractice(q4, 'c'),
                new QuestionPractice(q5, 'c'),
                new QuestionPractice(q6, 'c'),
                new QuestionPractice(q7, 'c'),
                new QuestionPractice(q8, 'c'),
                new QuestionPractice(q9, 'c'),
                new QuestionPractice(q10,'c'),
                new QuestionPractice(q11,'c'),
                new QuestionPractice(q12,'c'),
                new QuestionPractice(q13,'c'),
                new QuestionPractice(q14,'c'),
                new QuestionPractice(q15,'c'),
                new QuestionPractice(q16,'c'),
                new QuestionPractice(q17,'c'),
                new QuestionPractice(q18,'c'),
                new QuestionPractice(q19,'c'),
                new QuestionPractice(q20,'c')

        };
        takeQuestion();
        userAnswer();
        insertAnswersIntoTable();
    }
    public  static void takeQuestion(){
        String[] questions = new String[20];
        for(int i = 0; i <questions.length; i++){
            System.out.println(questions[i]);
            //String choice = input.nextLine();
            char answers = input.next().charAt(0);
            userInput[i] =  answers;
        }
    }
    public static void userAnswer(){
        String heading = String.format("%8s%8s%8s", " ", "A", "B");
        System.out.println(heading.repeat(4));
        System.out.println("=".repeat(100));
    }

    public static void insertAnswersIntoTable(){
        userAnswer();
        String[] questions = new String[20];
        for(int i = 1; i < questions.length; i += 2)
            System.out.println(i);
    }

}
