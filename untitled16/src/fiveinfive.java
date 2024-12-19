
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class fiveinfive{


    static final char[][] board = new char[12][12];
    static char currentPlayer = 'X';

    public  void fiveinfive() {


        Random random = new Random();
        int color = random.nextInt(31, 37);
        if (color == 31) {
            System.out.println("\033[31m");
        } else if (color == 32) {
            System.out.println("\033[32m");
        } else if (color == 33) {
            System.out.println("\033[33m");
        } else if (color == 34) {
            System.out.println("\033[34m");
        } else if (color == 35) {
            System.out.println("\033[35m");
        } else if (color == 36) {
            System.out.println("\033[36m");
        } else {
            System.out.println("\033[37m");
        }

        initializeBoard();
        Scanner scanner = new Scanner(System.in);

        while (true) {


            printBoard();
            System.out.println("player " + currentPlayer + "，Please enter your position (line number and column number)：");

            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (isValidMove(row, col)) {
                makeMove(row, col);
                if (checkForWin()) {
                    printBoard();
                    System.out.println("player " + currentPlayer + " win！");
                    System.out.println("Do you want to continue?('yes' to continue or anything else to quit):");
                    String continueChoice = scanner.next();
                    if (!continueChoice.equalsIgnoreCase("yes")) {
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        break;

                    }
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("dead heat！");
                    System.out.println("Do you want to continue?('yes' to continue or anything else to quit):");
                    String continueChoice = scanner.next();
                    if (!continueChoice.equalsIgnoreCase("yes")) {
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        break;

                    }
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid location, please re-select。");
            }


        }
    }
    private static void initializeBoard() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        System.out.println(" 1 2 3 4 5 6 7 8 9 10 11 12");
        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < 12; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 12 && col >= 0 && col < 12 && board[row][col] == '-';
    }

    private static void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    private static boolean checkForWin() {
        // 检查行
        for (int i = 0; i < 12; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer&&board[i][3]==currentPlayer&&board[i][4]==currentPlayer||board[i][5] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer&&board[i][3]==currentPlayer&&board[i][4]==currentPlayer||board[i][5] == currentPlayer && board[i][6] == currentPlayer && board[i][2] == currentPlayer&&board[i][3]==currentPlayer&&board[i][4]==currentPlayer||board[i][5] == currentPlayer && board[i][6] == currentPlayer && board[i][7] == currentPlayer&&board[i][3]==currentPlayer&&board[i][4]==currentPlayer||board[i][5] == currentPlayer && board[i][6] == currentPlayer && board[i][7] == currentPlayer&&board[i][8]==currentPlayer&&board[i][4]==currentPlayer||board[i][5] == currentPlayer && board[i][6] == currentPlayer && board[i][7] == currentPlayer&&board[i][8]==currentPlayer&&board[i][9]==currentPlayer||board[i][10] == currentPlayer && board[i][6] == currentPlayer && board[i][7] == currentPlayer&&board[i][8]==currentPlayer&&board[i][9]==currentPlayer||board[i][10] == currentPlayer && board[i][11] == currentPlayer && board[i][7] == currentPlayer&&board[i][8]==currentPlayer&&board[i][9]==currentPlayer) {
                return true;
            }
        }

        // 检查列
        for (int j = 0; j < 12; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer&& board[3][j] == currentPlayer&& board[4][j] == currentPlayer||board[5][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer&& board[3][j] == currentPlayer&& board[4][j] == currentPlayer||board[5][j] == currentPlayer && board[6][j] == currentPlayer && board[2][j] == currentPlayer&& board[3][j] == currentPlayer&& board[4][j] == currentPlayer||board[7][j] == currentPlayer && board[5][j] == currentPlayer && board[6][j] == currentPlayer&& board[3][j] == currentPlayer&& board[4][j] == currentPlayer||board[8][j] == currentPlayer && board[7][j] == currentPlayer && board[6][j] == currentPlayer&& board[5][j] == currentPlayer&& board[4][j] == currentPlayer||board[5][j] == currentPlayer && board[6][j] == currentPlayer && board[7][j] == currentPlayer&& board[8][j] == currentPlayer&& board[9][j] == currentPlayer||board[6][j] == currentPlayer && board[7][j] == currentPlayer && board[8][j] == currentPlayer&& board[9][j] == currentPlayer&& board[10][j] == currentPlayer||board[11][j] == currentPlayer && board[7][j] == currentPlayer && board[8][j] == currentPlayer&& board[9][j] == currentPlayer&& board[10][j] == currentPlayer) {
                return true;
            }
        }
        for(int h=0;h<9;h++){
            if(board[h][h]==currentPlayer&&board[h+1][h+1]==currentPlayer&&board[h+2][h+2]==currentPlayer&&board[h+3][h+3]==currentPlayer&&board[h+4][h+4]==currentPlayer){
                return true;
            }
        }
        for(int h=0;h<8;h++){
            if(board[h][h+1]==currentPlayer&&board[h+1][h+2]==currentPlayer&&board[h+2][h+3]==currentPlayer&&board[h+3][h+4]==currentPlayer&&board[h+4][h+5]==currentPlayer){
                return true;
            }}
        for(int h=0;h<7;h++){
            if(board[h][h+2]==currentPlayer&&board[h+1][h+3]==currentPlayer&&board[h+2][h+4]==currentPlayer&&board[h+3][h+5]==currentPlayer&&board[h+4][h+6]==currentPlayer){
                return true;
            }}

        for(int h=0;h<6;h++){
            if(board[h][h+3]==currentPlayer&&board[h+1][h+4]==currentPlayer&&board[h+2][h+5]==currentPlayer&&board[h+3][h+6]==currentPlayer&&board[h+4][h+7]==currentPlayer){
                return true;
            }}

        for(int h=0;h<5;h++){
            if(board[h][h+4]==currentPlayer&&board[h+1][h+5]==currentPlayer&&board[h+2][h+6]==currentPlayer&&board[h+3][h+7]==currentPlayer&&board[h+4][h+8]==currentPlayer){
                return true;
            }}
        for(int h=0;h<4;h++){
            if(board[h][h+5]==currentPlayer&&board[h+1][h+6]==currentPlayer&&board[h+2][h+7]==currentPlayer&&board[h+3][h+8]==currentPlayer&&board[h+4][h+9]==currentPlayer){
                return true;
            }}

        for(int h=0;h<3;h++){
            if(board[h][h+6]==currentPlayer&&board[h+1][h+7]==currentPlayer&&board[h+2][h+8]==currentPlayer&&board[h+3][h+9]==currentPlayer&&board[h+4][h+10]==currentPlayer){
                return true;
            }}
        for(int h=0;h<2;h++){
            if(board[h][h+7]==currentPlayer&&board[h+1][h+8]==currentPlayer&&board[h+2][h+9]==currentPlayer&&board[h+3][h+10]==currentPlayer&&board[h+4][h+11]==currentPlayer){
                return true;
            }}
        for(int h=0;h<1;h++){
            if(board[h][h+8]==currentPlayer&&board[h+1][h+9]==currentPlayer&&board[h+2][h+10]==currentPlayer&&board[h+3][h+11]==currentPlayer&&board[h+4][h+12]==currentPlayer){
                return true;
            }}

        for(int h=0;h<8;h++){
            if(board[h+1][h]==currentPlayer&&board[h+2][h+1]==currentPlayer&&board[h+3][h+2]==currentPlayer&&board[h+4][h+3]==currentPlayer&&board[h+5][h+4]==currentPlayer){
                return true;
            }}
        for(int h=0;h<7;h++){
            if(board[h+2][h]==currentPlayer&&board[h+3][h+1]==currentPlayer&&board[h+4][h+2]==currentPlayer&&board[h+5][h+3]==currentPlayer&&board[h+6][h+4]==currentPlayer){
                return true;
            }}

        for(int h=0;h<6;h++){
            if(board[h+3][h]==currentPlayer&&board[h+4][h+1]==currentPlayer&&board[h+5][h+2]==currentPlayer&&board[h+6][h+3]==currentPlayer&&board[h+7][h+4]==currentPlayer){
                return true;
            }}

        for(int h=0;h<5;h++){
            if(board[h+4][h]==currentPlayer&&board[h+5][h+1]==currentPlayer&&board[h+6][h+2]==currentPlayer&&board[h+7][h+3]==currentPlayer&&board[h+8][h+4]==currentPlayer){
                return true;
            }}
        for(int h=0;h<4;h++){
            if(board[h+5][h]==currentPlayer&&board[h+6][h+1]==currentPlayer&&board[h+7][h+2]==currentPlayer&&board[h+8][h+3]==currentPlayer&&board[h+9][h+4]==currentPlayer){
                return true;
            }}

        for(int h=0;h<3;h++){
            if(board[h+6][h]==currentPlayer&&board[h+7][h+1]==currentPlayer&&board[h+8][h+2]==currentPlayer&&board[h+9][h+3]==currentPlayer&&board[h+10][h+4]==currentPlayer){
                return true;
            }}
        for(int h=0;h<2;h++){
            if(board[h+7][h]==currentPlayer&&board[h+8][h+1]==currentPlayer&&board[h+9][h+2]==currentPlayer&&board[h+10][h+3]==currentPlayer&&board[h+11][h+4]==currentPlayer){
                return true;
            }}
        for(int h=0;h<1;h++){
            if(board[h+8][h]==currentPlayer&&board[h+9][h+1]==currentPlayer&&board[h+10][h+2]==currentPlayer&&board[h+11][h+3]==currentPlayer&&board[h+12][h+4]==currentPlayer){
                return true;
            }}

        for (int h=0;h<8;h++){
            if(board[h][h+4]==currentPlayer&&board[h+1][h+3]==currentPlayer&&board[h+2][h+2]==currentPlayer&&board[h+3][h+1]==currentPlayer&&board[h+4][h]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<7;h++){
            if(board[h][h+5]==currentPlayer&&board[h+1][h+4]==currentPlayer&&board[h+2][h+3]==currentPlayer&&board[h+3][h+2]==currentPlayer&&board[h+4][h+1]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<7;h++){
            if(board[h+1][h+4]==currentPlayer&&board[h+2][h+3]==currentPlayer&&board[h+3][h+2]==currentPlayer&&board[h+4][h+1]==currentPlayer&&board[h+5][h]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<6;h++){
            if(board[h][h+6]==currentPlayer&&board[h+1][h+5]==currentPlayer&&board[h+2][h+4]==currentPlayer&&board[h+3][h+3]==currentPlayer&&board[h+4][h+2]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<6;h++){
            if(board[h+1][h+5]==currentPlayer&&board[h+2][h+4]==currentPlayer&&board[h+3][h+3]==currentPlayer&&board[h+4][h+2]==currentPlayer&&board[h+5][h+1]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<6;h++){
            if(board[h+2][h+4]==currentPlayer&&board[h+3][h+3]==currentPlayer&&board[h+4][h+2]==currentPlayer&&board[h+5][h+1]==currentPlayer&&board[h+6][h]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<5;h++){
            if(board[h][h+7]==currentPlayer&&board[h+1][h+6]==currentPlayer&&board[h+2][h+5]==currentPlayer&&board[h+3][h+4]==currentPlayer&&board[h+4][h+3]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<5;h++){
            if(board[h+1][h+6]==currentPlayer&&board[h+2][h+5]==currentPlayer&&board[h+3][h+4]==currentPlayer&&board[h+4][h+3]==currentPlayer&&board[h+5][h+2]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<5;h++){
            if(board[h+2][h+5]==currentPlayer&&board[h+3][h+4]==currentPlayer&&board[h+4][h+3]==currentPlayer&&board[h+5][h+2]==currentPlayer&&board[h+6][h+1]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<5;h++){
            if(board[h+3][h+4]==currentPlayer&&board[h+4][h+3]==currentPlayer&&board[h+5][h+2]==currentPlayer&&board[h+6][h+1]==currentPlayer&&board[h+7][h]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<4;h++){
            if(board[h][h+8]==currentPlayer&&board[h+1][h+7]==currentPlayer&&board[h+2][h+6]==currentPlayer&&board[h+3][h+5]==currentPlayer&&board[h+4][h+4]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<4;h++){
            if(board[h+1][h+7]==currentPlayer&&board[h+2][h+6]==currentPlayer&&board[h+3][h+5]==currentPlayer&&board[h+4][h+4]==currentPlayer&&board[h+5][h+3]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<4;h++){
            if(board[h+2][h+6]==currentPlayer&&board[h+3][h+5]==currentPlayer&&board[h+4][h+4]==currentPlayer&&board[h+5][h+3]==currentPlayer&&board[h+6][h+2]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<4;h++){
            if(board[h+3][h+5]==currentPlayer&&board[h+4][h+4]==currentPlayer&&board[h+5][h+3]==currentPlayer&&board[h+6][h+2]==currentPlayer&&board[h+7][h+1]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<4;h++){
            if(board[h+4][h+4]==currentPlayer&&board[h+5][h+3]==currentPlayer&&board[h+6][h+2]==currentPlayer&&board[h+7][h+1]==currentPlayer&&board[h+8][h]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<3;h++){
            if(board[h][h+9]==currentPlayer&&board[h+1][h+8]==currentPlayer&&board[h+2][h+7]==currentPlayer&&board[h+3][h+6]==currentPlayer&&board[h+4][h+5]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<3;h++){
            if(board[h+1][h+8]==currentPlayer&&board[h+2][h+7]==currentPlayer&&board[h+3][h+6]==currentPlayer&&board[h+4][h+5]==currentPlayer&&board[h+5][h+4]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<3;h++){
            if(board[h+2][h+7]==currentPlayer&&board[h+3][h+6]==currentPlayer&&board[h+4][h+5]==currentPlayer&&board[h+5][h+4]==currentPlayer&&board[h+6][h+3]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<3;h++){
            if(board[h+3][h+6]==currentPlayer&&board[h+4][h+5]==currentPlayer&&board[h+5][h+4]==currentPlayer&&board[h+6][h+3]==currentPlayer&&board[h+7][h+2]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<3;h++){
            if(board[h+4][h+5]==currentPlayer&&board[h+5][h+4]==currentPlayer&&board[h+6][h+3]==currentPlayer&&board[h+7][h+2]==currentPlayer&&board[h+8][h+1]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<3;h++){
            if(board[h+5][h+4]==currentPlayer&&board[h+6][h+3]==currentPlayer&&board[h+7][h+2]==currentPlayer&&board[h+8][h+1]==currentPlayer&&board[h+9][h]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<2;h++){
            if(board[h][h+10]==currentPlayer&&board[h+1][h+9]==currentPlayer&&board[h+2][h+8]==currentPlayer&&board[h+3][h+7]==currentPlayer&&board[h+4][h+6]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<2;h++){
            if(board[h+1][h+9]==currentPlayer&&board[h+2][h+8]==currentPlayer&&board[h+3][h+7]==currentPlayer&&board[h+4][h+6]==currentPlayer&&board[h+5][h+5]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<2;h++){
            if(board[h+2][h+8]==currentPlayer&&board[h+3][h+7]==currentPlayer&&board[h+4][h+6]==currentPlayer&&board[h+5][h+5]==currentPlayer&&board[h+6][h+4]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<2;h++){
            if(board[h+3][h+7]==currentPlayer&&board[h+4][h+6]==currentPlayer&&board[h+5][h+5]==currentPlayer&&board[h+6][h+4]==currentPlayer&&board[h+7][h+3]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<2;h++){
            if(board[h+4][h+6]==currentPlayer&&board[h+5][h+5]==currentPlayer&&board[h+6][h+4]==currentPlayer&&board[h+7][h+3]==currentPlayer&&board[h+8][h+2]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<2;h++){
            if(board[h+5][h+5]==currentPlayer&&board[h+6][h+4]==currentPlayer&&board[h+7][h+3]==currentPlayer&&board[h+8][h+2]==currentPlayer&&board[h+9][h+1]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<2;h++){
            if(board[h+6][h+4]==currentPlayer&&board[h+7][h+3]==currentPlayer&&board[h+8][h+2]==currentPlayer&&board[h+9][h+1]==currentPlayer&&board[h+10][h]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<1;h++){
            if(board[h][h+11]==currentPlayer&&board[h+1][h+10]==currentPlayer&&board[h+2][h+9]==currentPlayer&&board[h+3][h+8]==currentPlayer&&board[h+4][h+7]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<1;h++){
            if(board[h+1][h+10]==currentPlayer&&board[h+2][h+9]==currentPlayer&&board[h+3][h+8]==currentPlayer&&board[h+4][h+7]==currentPlayer&&board[h+5][h+6]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<1;h++){
            if(board[h+2][h+9]==currentPlayer&&board[h+3][h+8]==currentPlayer&&board[h+4][h+7]==currentPlayer&&board[h+5][h+6]==currentPlayer&&board[h+6][h+5]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<1;h++){
            if(board[h+3][h+8]==currentPlayer&&board[h+4][h+7]==currentPlayer&&board[h+5][h+6]==currentPlayer&&board[h+6][h+5]==currentPlayer&&board[h+7][h+4]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<1;h++){
            if(board[h+4][h+7]==currentPlayer&&board[h+5][h+6]==currentPlayer&&board[h+6][h+5]==currentPlayer&&board[h+7][h+4]==currentPlayer&&board[h+8][h+3]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<1;h++){
            if(board[h+5][h+6]==currentPlayer&&board[h+6][h+5]==currentPlayer&&board[h+7][h+4]==currentPlayer&&board[h+8][h+3]==currentPlayer&&board[h+9][h+2]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<1;h++){
            if(board[h+6][h+5]==currentPlayer&&board[h+7][h+4]==currentPlayer&&board[h+8][h+3]==currentPlayer&&board[h+9][h+2]==currentPlayer&&board[h+10][h+1]==currentPlayer){
                return  true;
            }
        }

        for (int h=0;h<1;h++){
            if(board[h+7][h+4]==currentPlayer&&board[h+8][h+3]==currentPlayer&&board[h+9][h+2]==currentPlayer&&board[h+10][h+1]==currentPlayer&&board[h+11][h]==currentPlayer){
                return  true;
            }
        }
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
