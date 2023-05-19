package chap_05;
import java.util.Scanner;

public class Hangman {
    String hiddenString;
    StringBuffer outputString;
    int remainder;
    int failed;
    Scanner scan = new Scanner(System.in);
    
    public Hangman() {
        hiddenString = "hello";
    }
    public int playGame() {
        outputString = new StringBuffer();
        for (int i = 0; i < hiddenString.length(); i++) {
            outputString.append("-");
        }
        remainder = hiddenString.length();
        failed = 0;
        while (failed < 6 && remainder > 0) {
            System.out.println(outputString);
            System.out.print("알파벳을 입력하세요 : ");
            char guess = readChar();
            checkChar(guess);
        }
        if (remainder == 0) {
            System.out.println(hiddenString);
        } else {
            System.out.println("실패");
        }
        return failed;
    }
    public char readChar() {
        String input = scan.nextLine();
        char guess = input.charAt(0);
        return guess;
    }
    public void checkChar(char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < hiddenString.length(); i++) {
            if (hiddenString.charAt(i) == guess) {
                outputString.setCharAt(i, guess);
                remainder--;
                correctGuess = true;
            }
        }
        if (correctGuess == false) {
            System.out.println(guess + "는(은) 틀렸습니다.");
            failed++;
        }
    }
}

//package chap_05;
//import java.util.Scanner;
//
//public class Hangman {
//    String hiddenString;
//    StringBuffer outputString;
//    int remainder;
//    int failed;
//    Scanner scan = new Scanner(System.in);
//
//    public Hangman() {
//        hiddenString = "hello";
//    }
//
//    public int playGame() {
//        // 문제 단어의 문자수 만큼의 ‘–’ 를 StringBuffer 객체에 추가
//        outputString = new StringBuffer();
//        for (int i = 0; i < hiddenString.length(); i++) {
//            outputString.append("-");
//        }
//
//        // 문제 단어의 길이를 카운트 변수에 저장
//        remainder = hiddenString.length();
//        failed = 0;
//
//        // 못 맞춘 글자 >0 이고 실패 < 6 동안 반복
//        while (failed < 6 && remainder > 0) {
//            System.out.println(outputString);
//            System.out.print("알파벳을 입력하세요 : ");
//
//            // 사용자로부터 문자 입력받기 메소드 호출
//            char guess = readChar();
//
//            // 입력받은 문자 체크하기 메소드 호출
//            checkChar(guess);
//        }
//
//        if (remainder == 0) {
//            System.out.println(hiddenString);
//        } else {
//            System.out.println("실패");
//        }
//
//        return failed;
//    }
//
//    public char readChar() {
//        String input = scan.nextLine();
//        char guess = input.charAt(0);
//        return guess;
//    }
//
//    public void checkChar(char guess) {
//        boolean correctGuess = false;
//        for (int i = 0; i < hiddenString.length(); i++) {
//            if (hiddenString.charAt(i) == guess) {
//                outputString.setCharAt(i, guess);
//                remainder--;
//                correctGuess = true;
//            }
//        }
//        if (correctGuess == false) {
//            System.out.println(guess + "는(은) 틀렸습니다.");
//            failed++;
//        }
//    }
//}
