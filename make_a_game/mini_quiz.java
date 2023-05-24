package midterm;

//QuizGame.java

import java.util.Random;
import java.util.Scanner;

public class mini_quiz {
     String[] questions;
     int [] answers;
     String[][] selections;
     Random random;

    public mini_quiz() {
        questions = new String[3];
        answers = new int[3];
        selections = new String[3][3];
        random = new Random();

        // 첫 번째 문제
        questions[0] = "물은 어떤 상태에서 기체로 변화할까요?";
        answers[0] = 1;
        selections[0] = new String[]{"1. 액체에서 기체", "2. 고체에서 기체", "3. 기체에서 액체"};

        // 두 번째 문제
        questions[1] = "가장 큰 행성은 무엇인가요?";
        answers[1] = 2;
        selections[1] = new String[]{"1. 지구", "2. 목성", "3. 화성"};

        // 세 번째 문제
        questions[2] = "세계에서 가장 높은 산은 어디인가요?";
        answers[2] = 3;
        selections[2] = new String[]{"1. 안데스 산맥", "2. 히말라야 산맥", "3. 에베레스트"};
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

        System.out.print("정답을 입력하세요: ");
        int userAnswer;
        try {
            userAnswer = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("유효한 정수를 입력해주세요!");
            in.close();
            return;
        }

        if (userAnswer == answer) {
            System.out.println("정답입니다!");
        } else {
            System.out.println("오답입니다!");
        }

        in.close();
    }
}