package app.questions;

import java.util.Scanner;

public class MultipleChoiceQuestion
{

    /**
     * @param questionText The main question text
     * @param choices An array containing the text of the various choices for the question
     * @param correctChoiceIdx The index of the correct answer in the given choices array
     */
    private String questionText;
    private String[] choices;
    private int correctChoiceIdx;

    public MultipleChoiceQuestion(String questionText, String[] choices, int correctChoiceIdx)
    {
        this.questionText = questionText;
        this.choices = choices;
        this.correctChoiceIdx = correctChoiceIdx;
    }

    public String getQuestionText()
    {
        return questionText;
    }

    public String[] getChoices()
    {
        return choices;
    }

    public int getCorrectChoiceIdx()
    {
        return correctChoiceIdx;
    }


    public static void main(String[] args)
    {
        MultipleChoiceQuestion[] questions = createQuestions();

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Geometry Quiz!");

        for (MultipleChoiceQuestion question : questions)
        {
            System.out.println(question.getQuestionText());
            String[] choices = question.getChoices();
            for (int i = 0; i < choices.length; i++)

            {
                System.out.println((char) ('A' + i) + ". " + choices[i]);
            }

            System.out.print("Enter your answer (A, B, C, D): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(Character.toString((char) ('A' + question.getCorrectChoiceIdx()))))
            {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println();
        }

        System.out.println("Quiz finished!");
        System.out.println("Your score: " + score + " out of " + questions.length);
    }

    public static MultipleChoiceQuestion[] createQuestions()
    {
        MultipleChoiceQuestion[] questions = new MultipleChoiceQuestion[19];

        // Question 1
        String question1Text = "What is the area of a circle?";
        String[] question1Choices = {"2πr", "πr²", "πr", "π"};
        int question1CorrectChoiceIdx = 1;
        questions[0] = new MultipleChoiceQuestion(question1Text, question1Choices, question1CorrectChoiceIdx);



    // Question 2
    String question2Text = "What is the circumference of a circle?";
    String[] question2Choices = {"2πr", "πr²", "πr", "π"};
    int question2CorrectChoiceIdx = 0;
    questions[1]=new

    MultipleChoiceQuestion(question2Text, question2Choices, question2CorrectChoiceIdx);

    // Question 3
    String question3Text = "What is the volume of a sphere?";
    String[] question3Choices = {"4/3π³r", "4/3πr³", "4πr³", "πr³"};
    int question3CorrectChoiceIdx = 1;
    questions[2]=new

    MultipleChoiceQuestion(question3Text, question3Choices, question3CorrectChoiceIdx);

    // Question 4
    String question4Text = "What is the volume of a cylinder?";
    String[] question4Choices = {"4/3πr² x height", "2πr x height", "πr² x height"};
    int question4CorrectChoiceIdx = 2;
    questions[3]=new

    MultipleChoiceQuestion(question4Text, question4Choices, question4CorrectChoiceIdx);

    // Question 5
    String question5Text = "What is the area of a rectangle?";
    String[] question5Choices = {"(base x height) / 2", "base x height", "base²"};
    int question5CorrectChoiceIdx = 1;
    questions[4]=new

    MultipleChoiceQuestion(question5Text, question5Choices, question5CorrectChoiceIdx);

    // Question 6
    String question6Text = "What is the area of a triangle?";
    String[] question6Choices = {"(base x height) / 2", "base x height", "base / height"};
    int question6CorrectChoiceIdx = 0;
    questions[5]=new

    MultipleChoiceQuestion(question6Text, question6Choices, question6CorrectChoiceIdx);

    // Question 7
    String question7Text = "The longest side of a right angle triangle is called the...";
    String[] question7Choices = {"hippopotamus", "hypotension", "hypotenuse"};
    int question7CorrectChoiceIdx = 2;
    questions[6]=new

    MultipleChoiceQuestion(question7Text, question7Choices, question7CorrectChoiceIdx);

    // Question 8
    String question8Text = "A triangle with equal-length sides is called a...";
    String[] question8Choices = {"equilateral", "isosceles", "scalene"};
    int question8CorrectChoiceIdx = 0;
    questions[7]=new

    MultipleChoiceQuestion(question8Text, question8Choices, question8CorrectChoiceIdx);

    // Question 9
    String question9Text = "A triangle with only two equal-length sides is called a...";
    String[] question9Choices = {"equilateral", "isosceles", "scalene"};
    int question9CorrectChoiceIdx = 1;
    questions[8]=new

    MultipleChoiceQuestion(question9Text, question9Choices, question9CorrectChoiceIdx);

    // Question 10
    String question10Text = "A triangle with three unequal-length sides is called a...";
    String[] question10Choices = {"equilateral", "isosceles", "scalene"};
    int question10CorrectChoiceIdx = 2;
    questions[9]=new

    MultipleChoiceQuestion(question10Text, question10Choices, question10CorrectChoiceIdx);

    // Question 11
    String question11Text = "In a right angle triangle with orthogonal side lengths 'a' and 'b', the length of the hypotenuse is...";
    String[] question11Choices = {"sqrt(a² + b²)", "sqrt(a + b)", "a² + b²", "a + b"};
    int question11CorrectChoiceIdx = 0;
    questions[10]=new

    MultipleChoiceQuestion(question11Text, question11Choices, question11CorrectChoiceIdx);

    // Question 12
    String question12Text = "360 degrees in radians is";
    String[] question12Choices = {"π/2", "2π", "π"};
    int question12CorrectChoiceIdx = 1;
    questions[11]=new

    MultipleChoiceQuestion(question12Text, question12Choices, question12CorrectChoiceIdx);

    // Question 13
    String question13Text = "180 degrees in radians is";
    String[] question13Choices = {"π/2", "2π", "π"};
    int question13CorrectChoiceIdx = 2;
    questions[12]=new

    MultipleChoiceQuestion(question13Text, question13Choices, question13CorrectChoiceIdx);

    // Question 14
    String question14Text = "90 degrees in radians is";
    String[] question14Choices = {"2/π", "π/2", "π/4", "2π"};
    int question14CorrectChoiceIdx = 1;
    questions[13]=new

    MultipleChoiceQuestion(question14Text, question14Choices, question14CorrectChoiceIdx);

    // Question 15
    String question15Text = "45 degrees in radians is";
    String[] question15Choices = {"4/π", "π/4", "4π"};
    int question15CorrectChoiceIdx = 1;
    questions[14]=new

    MultipleChoiceQuestion(question15Text, question15Choices, question15CorrectChoiceIdx);

    // Question 16
    String question16Text = "2π radians is";
    String[] question16Choices = {"360 degrees", "180 degrees", "90 degrees", "45 degrees"};
    int question16CorrectChoiceIdx = 0;
    questions[15]=new

    MultipleChoiceQuestion(question16Text, question16Choices, question16CorrectChoiceIdx);

    // Question 17
    String question17Text = "π radians is";
    String[] question17Choices = {"360 degrees", "180 degrees", "90 degrees", "45 degrees"};
    int question17CorrectChoiceIdx = 1;
    questions[16]=new

    MultipleChoiceQuestion(question17Text, question17Choices, question17CorrectChoiceIdx);

    // Question 18
    String question18Text = "π/2 radians is";
    String[] question18Choices = {"360 degrees", "180 degrees", "90 degrees", "45 degrees"};
    int question18CorrectChoiceIdx = 2;
    questions[17]=new

    MultipleChoiceQuestion(question18Text, question18Choices, question18CorrectChoiceIdx);

    // Question 19
    String question19Text = "π/4 radians is";
    String[] question19Choices = {"360 degrees", "180 degrees", "90 degrees", "45 degrees"};
    int question19CorrectChoiceIdx = 3;
    questions[18]=new

    MultipleChoiceQuestion(question19Text, question19Choices, question19CorrectChoiceIdx);

        return questions;
    }
}