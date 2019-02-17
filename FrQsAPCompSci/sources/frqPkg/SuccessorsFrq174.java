package frqPkg;

public class SuccessorsFrq174 {
  
  public static PositionFrq174 findPosition(int n, int[][] arr2D)
  {
    
    for(int r=0; r < arr2D.length; r++)
    {
      for(int c=0; c < arr2D[0].length; c++)
      {
        if(arr2D[r][c] == n)
        {
          PositionFrq174 PosOfN = new PositionFrq174(r, c);
          return PosOfN;
        }
      }
    }
    return null;
  }
  
  public static PositionFrq174[][] getSeccessorArray(int[][] arr2D)
  {
    PositionFrq174[][] positArr2D = new PositionFrq174[arr2D.length][arr2D[0].length];
    for(int r=0; r < arr2D.length; r++)
    {
      for(int c=0; c < arr2D[0].length; c++)
      {
        positArr2D[r][c] = findPosition(arr2D[r][c]+1, arr2D);
      }
    }
    return positArr2D;
  }
  
  public static void printArr2D(PositionFrq174[][] positArr2D)
  {
    for(PositionFrq174[] row:positArr2D)
    {
      for(PositionFrq174 p:row)
      {
        System.out.print(p+" ");
      }
      System.out.println();
    }
  }

}
