package midterm;

import java.util.Random;
import java.util.Scanner;

public class QuizGame {
     String[] questions;
     int[] answers;
     String[][] selections;
     Random random;
     nickname nickname;
    public QuizGame() {
        questions = new String[3];
        answers = new int[3];
        selections = new String[3][3];
        random = new Random();
        nickname = new nickname();

        // 첫 번째 문제
        questions[0] = "미래관의 원래 이름은?";
        answers[1] = 2;
        selections[1] = new String[]{"1. 6호관", "2. 7호관", "3. 77호관"};

        // 두 번째 문제
        questions[1] = "알파벳 중 어떤 글자가 물이 가장 많은가?";
        answers[2] = 3;
        selections[2] = new String[]{"1. a", "2. b", "3. c"};

        // 세 번째 문제
        questions[2] = "모스 부호로 k5를 치면?";
        answers[2] = 3;
        selections[2] = new String[]{"1. · – 　– – – · ·", "2. – · – 　· · · · –", "3.– · – 　· · · · ·"};
    }

    public void play() {
        Scanner in = new Scanner(System.in);
        System.out.println("퀴즈 게임을 시작합니다!");

        int index = random.nextInt(questions.length);
        String question = questions[index];
        int answer = answers[index];
        String[] choices = selections[index];

        System.out.println("문제: " + question);
        System.out.println("선택지: ");
        for (String choice : choices) {
            System.out.println(choice);
        }

        int userAnswer;
        do {
            System.out.print("정답을 입력하세요: ");
            userAnswer = in.nextInt();
            in.nextLine(); // 개행 문자(\n) 비우기

            if (userAnswer == answer) {
                System.out.println("정답입니다!");
            } else {
                System.out.println("오답입니다! 다시 선택지를 확인해보세요.");
            }
        } while (userAnswer != answer);
        System.out.println("당신의 칭호: " + nickname.getTitle());
        in.close();
    }

    public static void main(String[] args) {
        QuizGame quizGame = new QuizGame();
        quizGame.play();
    }
}
