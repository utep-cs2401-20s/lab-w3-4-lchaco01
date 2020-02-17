public class TorusGameOfLife extends GameOfLife {
  public TorusGameOfLife(int a[][]) {}

  // constructors /
  // inherit: neighbors, oneStep, evolution
  @Override
  public int neighbors(int r, int c) {
    int counter = 0;
    if ((r - 1) % size) {
      if (c - 1 % size) {
      if (board[r - 1][c - 1] == 1) {
        counter++;
      }
      }
    }
    if (((c - 1) % size) && (board[r][c - 1] == 1)) {
      counter++;
    }
    if (((r + 1) <= (board.length - 1)) && ((c - 1) % size) && (board[r + 1][c - 1] == 1)) {
      counter++;
    }
    if (((r - 1) % size) && (board[r - 1][c] == 1)) {
      counter++;
    }
    if (((r + 1) <= (board.length - 1)) && (board[r + 1][c] == 1)) {
      counter++;
    }
    if (((r - 1) % size) && ((c + 1) <= (board[r].length - 1)) && (board[r - 1][c + 1] == 1)) {
      counter++;
    }
    if (((c + 1) <= (board[r].length - 1)) && (board[r][c + 1] == 1)) {
      counter++;
    }
    if (((r + 1) <= (board.length - 1))
        && ((c + 1) <= (board[r].length - 1))
        && (board[r + 1][c + 1] == 1)) {
      counter++;
    }
    return counter;
  }

  public void printBoard(int[][] print) {
    for (int i = 0; i < print.length; i++) {
      for (int j = 0; j < print[i].length; j++) {
        System.out.println(print[i][j]);
      }
    }
  }
  // use modulus(%)

}
