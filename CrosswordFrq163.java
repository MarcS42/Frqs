package frqPkg;

public class CrosswordFrq163 {

  /** Each element is a Square object 
   * with a color (black or white) 
   * and a number. 
   * puzzle[r][c] represents the square in 
   * row r, column c. 
   * There is at least one row in the puzzle. 
   */
  private SquareFrq163[][] puzzle;
  
  public SquareFrq163[][] getPuzzle()
  {
    return puzzle;
  }


  /** Returns true if the square at row r, 
   * column c should be labeled with a positive 
   * number; false otherwise.
   * The square at row r, column c is black if 
   * and only if blackSquares[r][c] is true. 
   * Precondition: r and c are valid indexes 
   * in blackSquares. 
   */
  public boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
  { 
    boolean onTheBoard=(r-1>-1) && (c-1>-1);
    
    if(blackSquares[r][c]) return false;
    //only white squares after last if-test
    
    if(onTheBoard && blackSquares[r][c-1] && blackSquares[r-1][c]) return true;
    if(r==0) return true;
    if(c==0) return true;
    if(blackSquares[r][c-1] || blackSquares[r-1][c]) return true;
    return false;
  }


  /** Constructs a crossword puzzle grid. 
   * Precondition: There is at least one row 
   * in blackSquares.
   *  
   * Postcondition: 
   * - The crossword puzzle grid has the same dimensions as blackSquares. 
   * - The Square object at row r, column c in 
   *   the crossword puzzle grid is black if 
   *   and only if blackSquares[r][c] is true.
   * - The squares in the puzzle are labeled 
   *   according to the crossword labeling rule.
  */
  public CrosswordFrq163(boolean[][] blackSquares) 
  { /* to be implemented in part (b) */ 
    puzzle=new SquareFrq163[blackSquares.length][blackSquares[0].length];
    int num=1;
    for(int r=0; r < puzzle.length;r++)
    {
      for(int c=0;c<puzzle[0].length;c++)
      {
        if(toBeLabeled(r,c,blackSquares))
        {
        puzzle[r][c]=new SquareFrq163(blackSquares[r][c],num++);
        }else
        {
          puzzle[r][c]= new SquareFrq163(blackSquares[r][c],0);
        }
      }
    }
  }
  
}
