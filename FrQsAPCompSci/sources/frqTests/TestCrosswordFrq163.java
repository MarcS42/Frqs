package frqTests;

import frqPkg.CrosswordFrq163;

public class TestCrosswordFrq163 {

  public static void main(String[] args)
  {
    
    
    boolean[][] blackSquares = new boolean[7][9];
    blackSquares[0][0]= true;
    blackSquares[0][3]= true;
    blackSquares[0][4]= true;
    blackSquares[0][5]= true;
    blackSquares[1][4]= true;
    blackSquares[2][6]= true;
    blackSquares[2][7]= true;
    blackSquares[2][8]= true;
    blackSquares[3][2]= true;
    blackSquares[3][6]= true;
    blackSquares[4][0]= true;
    blackSquares[4][1]= true;
    blackSquares[4][2]= true;
    blackSquares[5][4]= true;
    blackSquares[6][3]= true;
    blackSquares[6][4]= true;
    blackSquares[6][5]= true;
    blackSquares[6][8]= true;
    
    CrosswordFrq163 cwTest1 = new CrosswordFrq163(blackSquares);
    
    
    for(int r=0; r<cwTest1.getPuzzle().length; r++)
    {
      for(int c=0; c<cwTest1.getPuzzle()[0].length; c++)
      {
        System.out.print(cwTest1.getPuzzle()[r][c] + ", ");
      }
      System.out.println();
    }
  }

}
