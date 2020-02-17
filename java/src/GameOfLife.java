public class GameOfLife {
    int size;
    int[][] board;
    int[][] previous;

    public GameOfLife() {
    }

    public GameOfLife(int size) {
        this.size = size;

    }

    public GameOfLife(int[][] b) {
        size = b.length;
        board = new int[size][size];
        previous = new int[size][size];
    }

    public int[][] getBoard() {
        return board;
    }

    public void oneStep() {
        //the rules
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                previous[row][col] = board[row][col];
                neighbors(row, col);
                if (neighbors(row, col) == 3 && board[row][col] == 0 || neighbors(row, col) == 2 && board[row][col] == 1) {
                    board[row][col] = 1;
                } else {
                    board[row][col] = 0;
                }
            }
        }
    }


    public int neighbors(int r, int c) {
        //method called neighbors finds neighbors update state (live/dead)
        int counter = 0;
        if (r - 1 >= 0 && c - 1 >= 0 && board[r - 1][c - 1] == 1) {
            counter++;
        }
        if (c - 1 >= 0 && board[r][c - 1] == 1) {
            counter++;
        }
        if (r + 1 <= (board.length - 1) && c - 1 >= 0 && board[r + 1][c - 1] == 1) {
            counter++;
        }
        if (r - 1 >= 0 && board[r - 1][c] == 1) {
            counter++;
        }
        if (r + 1 <= (board.length - 1) && board[r + 1][c] == 1) {
            counter++;
        }
        if (r - 1 >= 0 && c + 1 <= (board[r].length - 1) && board[r - 1][c + 1] == 1) {
            counter++;
        }
        if (c + 1 <= (board[r].length - 1) && board[r][c + 1] == 1) {
            counter++;
        }
        if (r + 1 <= (board.length - 1) && c + 1 <= (board[r].length - 1) && board[r + 1][c + 1] == 1) {
            counter++;
        }
        return counter;
    }

    public void evolution(int steps) {
        //call oneStep n times
        for (int i = 0; i < steps; i++) {
            oneStep();
        }
    }

    public void printBoard(int[][] print) {
        for (int i = 0; i < print.length; i++) {
            for (int j = 0; j < print[i].length; j++) {
                System.out.println(print[i][j]);
            }
        }
    }

}
