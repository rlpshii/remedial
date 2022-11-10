import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class remedial1 {
    public static void main(String[] args) {
        String[][] questionAndAnswer = {
                { "rules of a programming language \n (a) regulation \n (b) codes \n (c) sytax \n (d) rules", "a", "b",
                        "c", "d", "c" },
                { "this either starts with a // or /* \n (a) comments \n (b) single line comments \n (c) multi-line comments \n (d) all in the above",
                        "a", "b", "c", "d", "d" },
                { "a high-level modern programming language \n (a) HTML \n (b) CSS \n (c) C# \n (d) JAVA", "a", "b",
                        "c", "d", "d" },
                { "to use the scanner how do you import this in your file? \n (a) import java.util.Scanner \n (b) import.java.util.Scanner \n (c) import Java.util.Scanner \n (d) importScanner",
                        "a", "b", "c", "d", "a" },
                { "performs actions based on conditions \n (a) if statements \n (b) else statements \n (c) conditional statement \n (d) switch",
                        "a", "b", "c", "d", "c" },
                { "this is also called data table \n (a) multidimensional arrays \n (b) two multidimensional arrays \n (c) arrays \n (d) none in the above",
                        "a", "b", "c", "d", "b" },
                { "collection of variables of same type \n (a) arrays \n (b) String \n (c) data type \n (d) variable",
                        "a", "b", "c", "d", "a" },
                { "is is the measurement on how long can the array can handle \n (a) array new \n (b) array length \n (c) if else statement \n (d) nesting",
                        "a", "b", "c", "d", "b" },
                { "how do you use the snippet code of public static void main(String[] args)? \n (a) SOUT \n (b) SUOT \n (c) SOTU \n (d) TUSO",
                        "a", "b", "c", "d", "a" },
                { "what do we use to insert a special character in a java string? \n (a) forward slash \n (b) asterisk \n (c) question mark \n (d) backslash",
                        "a", "b", "c", "d", "d" },
        };

        Scanner mainScan = new Scanner(System.in);
        boolean repeatFail = true;
        int score = 0;
        System.out.println(
                "=================================\nSTATE YOUR FULL NAME (SN, FN, MN)\n=================================");
        String userName = mainScan.nextLine();
        System.out.println(
                "=============================\nSTATE YOUR GRADE AND SECTION\n=============================");
        String sectionAndGrade = mainScan.nextLine();

        while (repeatFail) {
            ArrayList<Integer> numberList = new ArrayList<Integer>();
            boolean ready = true;
            while (ready) {
                System.out.println(
                        "=========================================\nARE YOU READY TO TAKE THE TEST? (y or n)\n=========================================");
                String readyScanner = mainScan.nextLine();
                if (readyScanner.equalsIgnoreCase("y")) {
                    ready = false;
                } else if (readyScanner.equalsIgnoreCase("n")) {
                    ready = true;
                } else if (readyScanner.equalsIgnoreCase("no")) {
                    ready = true;
                } else if (readyScanner.equalsIgnoreCase("yes")) {
                    ready = false;
                } else {
                    System.out.println("INVALID RESPONSE!");
                }
            }
            for (int loop = 1; loop < 11; loop++) {
                Random rand = new Random();
                int quizNumberRandomizer = rand.nextInt(10);
                while (numberList.contains(quizNumberRandomizer)) {
                    quizNumberRandomizer = rand.nextInt(10);
                }
                System.out.println();
                numberList.add(quizNumberRandomizer);
                Boolean invalidResponseWhileLoop = true;
                while (invalidResponseWhileLoop) {
                    String questionedAsked = questionAndAnswer[quizNumberRandomizer][0];
                    String optionOne = questionAndAnswer[quizNumberRandomizer][1];
                    String optionTwo = questionAndAnswer[quizNumberRandomizer][2];
                    String optionThree = questionAndAnswer[quizNumberRandomizer][3];
                    String optionFour = questionAndAnswer[quizNumberRandomizer][4];
                    String correctAnswer = questionAndAnswer[quizNumberRandomizer][5];

                    System.out.println("=================== QUESTION " + loop + " =====================");
                    System.out.println(questionedAsked);
                    String userAnswer = mainScan.nextLine();
                    if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                        invalidResponseWhileLoop = false;
                        score++;
                        System.out.println("!!! CORRECT !!!\n============================\nCorrect Answer:"
                                + correctAnswer + "\nScore:" + score + "\n============================");
                    } else {
                        if (userAnswer.equalsIgnoreCase(optionOne)) {
                            invalidResponseWhileLoop = false;
                            System.out.println(
                                    "INCORRECT SADLY! :(\n============================\nCorrect Answer:" + correctAnswer
                                            + "\nScore:" + score + "\n============================");
                        } else if (userAnswer.equalsIgnoreCase(optionTwo)) {
                            invalidResponseWhileLoop = false;
                            System.out.println(
                                    "INCORRECT SADLY! :(\n============================\nCorrect Answer:" + correctAnswer
                                            + "\nScore:" + score + "\n============================");
                        } else if (userAnswer.equalsIgnoreCase(optionThree)) {
                            invalidResponseWhileLoop = false;
                            System.out.println(
                                    "INCORRECT SADLY! :(\n============================\nCorrect Answer:" + correctAnswer
                                            + "\nScore:" + score + "\n============================");
                        } else if (userAnswer.equalsIgnoreCase(optionFour)) {
                            invalidResponseWhileLoop = false;
                            System.out.println(
                                    "INCORRECT SADLY! :(\n============================\nCorrect Answer:" + correctAnswer
                                            + "\nScore:" + score + "\n============================");
                        } else {
                            int numberHandler = quizNumberRandomizer;
                            quizNumberRandomizer = numberHandler;
                            System.out.println("INVALID RESPONSE!");
                        }
                    }
                }
            }

            int totalMainScoreOver = 10;
            double finalAverage = score * 100 / totalMainScoreOver;
            boolean retakeWhile = true;

            if (score == 10) {
                System.out.println("!!! PERFECT CONGRATS !!!\n============================ \nScore: " + score + "( "
                        + finalAverage + "% )\nName: " + userName + "\nSection: " + sectionAndGrade);
                while (retakeWhile) {
                    System.out.println(
                            "=========================================\nWOULD YOU LIKE TO RETAKE? (y or n)\n=========================================");
                    String retakeScanner = mainScan.nextLine();
                    if (retakeScanner.equalsIgnoreCase("y")) {
                        repeatFail = true;
                        retakeWhile = false;
                        score = 0;
                    } else if (retakeScanner.equalsIgnoreCase("n")) {
                        repeatFail = false;
                        retakeWhile = false;
                        System.out.println("THANK YOU FOR TAKING THE TEST!");
                    } else if (retakeScanner.equalsIgnoreCase("no")) {
                        repeatFail = false;
                        retakeWhile = false;
                        System.out.println("THANK YOU FOR TAKING THE TEST!");
                    } else if (retakeScanner.equalsIgnoreCase("yes")) {
                        repeatFail = true;
                        retakeWhile = false;
                        score = 0;
                    } else {
                        System.out.println("INVALID RESPONSE!");
                    }
                }
            } else if (score >= 5) {
                System.out.println("!!! PASSED CONGRATS !!!\n============================ \nScore: " + score + "( "
                        + finalAverage + "% )\nName: " + userName + "\nSection: " + sectionAndGrade);
                while (retakeWhile) {
                    System.out.println(
                            "=========================================\nWOULD YOU LIKE TO RETAKE? (y or n)\n=========================================");
                    String retakeScanner = mainScan.nextLine();
                    if (retakeScanner.equalsIgnoreCase("y")) {
                        repeatFail = true;
                        retakeWhile = false;
                        score = 0;
                    } else if (retakeScanner.equalsIgnoreCase("n")) {
                        repeatFail = false;
                        retakeWhile = false;
                        System.out.println("THANK YOU FOR TAKING THE TEST!");
                    } else if (retakeScanner.equalsIgnoreCase("no")) {
                        repeatFail = false;
                        retakeWhile = false;
                        System.out.println("THANK YOU FOR TAKING THE TEST!");
                    } else if (retakeScanner.equalsIgnoreCase("yes")) {
                        repeatFail = true;
                        retakeWhile = false;
                        score = 0;
                    } else {
                        System.out.println("INVALID RESPONSE!");
                    }
                }
            } else {
                System.out.println("!!! FAILED !!!\n============================ \nScore: " + score + "( "
                        + finalAverage + "% )\nName: " + userName + "\nSection: " + sectionAndGrade);
                        score = 0;
            }
        }

        mainScan.close();
    }
}