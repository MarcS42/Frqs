package frqPkg;

public class PositionFrq174 {
  
  private int r;
  private int c;
  
  public PositionFrq174(int row, int col)
  {
    this.r = row;
    this.c = col;
  }
  
  @Override
  public String toString()
  {
    return "(" + r +"," + c +")";
  }

}
