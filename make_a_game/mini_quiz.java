package midterm;

//QuizGame.java

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class mini_quiz {
    ArrayList<String> questions;
    ArrayList<String> answers;
    ArrayList<String> selections;
    Random random;

    public mini_quiz() {
        questions = new ArrayList<>();
        answers = new ArrayList<>();
        selections = new ArrayList<>();
        random = new Random();

        questions.add("질문 1: 물은 어떤 상태에서 기체로 변화할까요?");
        selections.add("1. 어쩌고\n" + "2. 저쩌고");
        answers.add("1. 액체에서 기체");

        questions.add("질문 2: 가장 큰 행성은 무엇인가요?");
        selections.add("1.어쩌고\n" + "2.저쩌고");
        answers.add("2. 목성");

        questions.add("질문 3: 세계에서 가장 높은 산은 어디인가요?");
        selections.add("1.어쩌고\n" + "2.저쩌고");
        answers.add("3. 에베레스트");
    }

    public void play() {
        Scanner in = new Scanner(System.in);
        System.out.println("퀴즈 게임을 시작합니다!");

        int index = random.nextInt(questions.size());
        String question = questions.get(index);
        String selection = selections.get(index);
        String answer = answers.get(index);

        System.out.println("문제: " + question);
        
        System.out.println(selection);

        System.out.print("정답 번호를 입력하세요: ");
        int userAnswer = in.nextInt();
        in.nextLine(); // 버퍼 비우기

        if (userAnswer == index + 1) {
            System.out.println("정답입니다!");
        } else {
            System.out.println("오답입니다. 정답은 \"" + answer + "\" 입니다.");
        }

        System.out.println("퀴즈 게임이 종료되었습니다.");
        in.close();
    }
}
