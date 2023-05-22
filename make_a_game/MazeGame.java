package midterm;

import java.util.Scanner;

public class MazeGame {
 char[][] maze;
 int playerX;
 int playerY;
 
 public MazeGame() {
     maze = new char[][]{
         {'S', ' ', '#', '#', '#', '#', '#', '#', '#', '#'},
         {'#', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', '#'},
         {'#', ' ', '#', '#', '#', ' ', '#', '#', ' ', '#'},
         {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
         {'#', '#', '#', '#', ' ', '#', '#', '#', '#', '#'},
         {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
         {'#', '#', '#', '#', '#', '#', ' ', '#', 'F', '#'},
     };
     playerX = 0;
     playerY = 0;
 }
 
 public void play() {
     Scanner in = new Scanner(System.in);
     System.out.println("미로 찾기 게임을 시작합니다!");

     while (true) {
         printMaze();
         
         System.out.print("이동할 방향을 입력하세요 (w: 위, s: 아래, a: 왼쪽, d: 오른쪽, q: 종료): ");
         String input = in.nextLine().toLowerCase();
         
         if (input.equals("q")) {
             System.out.println("게임을 종료합니다.");
             break;
         }
         
         movePlayer(input);
         
         if (isPlayerAtFinish()) {
             System.out.println("도착지에 도착했습니다! 게임을 종료합니다.");
             break;
         }
     }
     
     in.close();
 }
 
 private void printMaze() {
     for (int i = 0; i < maze.length; i++) {
         for (int j = 0; j < maze[i].length; j++) {
             if (i == playerY && j == playerX) {
                 System.out.print("P ");
             } else {
                 System.out.print(maze[i][j] + " ");
             }
         }
         System.out.println();
     }
     System.out.println();
 }
 
 private void movePlayer(String direction) {
     int newX = playerX;
     int newY = playerY;
     
     switch (direction) {
         case "w":
             newY--;
             break;
         case "s":
             newY++;
             break;
         case "a":
             newX--;
             break;
         case "d":
             newX++;
             break;
         default:
             System.out.println("유효하지 않은 입력입니다!");
             return;
     }
     
     if (isValidMove(newX, newY)) {
         playerX = newX;
         playerY = newY;
     } else {
         System.out.println("이동할 수 없는 방향입니다!");
     }
 }
 
 private boolean isValidMove(int x, int y) {
     if (x >= 0 && x < maze[0].length && y >= 0 && y < maze.length && maze[y][x] != '#') {
         return true;
     }
     return false;
 }
 
 private boolean isPlayerAtFinish() {
     return maze[playerY][playerX] == 'F';
 }
}
