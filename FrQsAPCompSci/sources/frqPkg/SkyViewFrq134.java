package frqPkg;

public class SkyViewFrq134 {
  
  /** A rectangular array that holds the data 
   * representing a rectangular area of the 
   * sky. 
   */ 
  private double[][] view;
  
  /** Constructs a SkyViewFrq134 object from a 
   * 1-dimensional array of scan data. 
   * @param numRows the number of rows 
   * represented in the view
   *  Precondition: numRows > 0
   * @param numCols the number of columns 
   * represented in the view
   * Precondition: numCols > 0
   * @param scanned the scan data received 
   * from the telescope, stored in telescope 
   * order 
   * Postcondition: view has been created as 
   * a rectangular 2-dimensional array 
   */
  public SkyViewFrq134(int numRows, int numCols, double[] scanned) 
  { /* to be implemented in part (a) */ 
    double[][] wkgView = new double[numRows][numCols];
    view = new double[numRows][numCols];
    int scanElemIdx=0, rowLenIdx;
    
//  Initialize 2dArray working view with scanned values
    for(int row=0; row < view.length; row++)
    {
      for(int col=0; col < view[0].length; col++)
      {
        wkgView[row][col] = scanned[scanElemIdx++];
      }
    }
    
//  Transfer working view to view and reverse
//  odd numbered rows.
    for(int r=0; r<view.length; r++)
    {
      rowLenIdx=numCols-1;
      for(int c=0; c<view[0].length; c++)
      {
        if(r%2 == 0)
        {
          view[r][c]=wkgView[r][c];
        }else 
          view[r][c]=wkgView[r][rowLenIdx--];
      }
    }
  }
  
  /** Returns the average of the values in a 
   * rectangular section of view. 
   * @param startRow the first row index of 
   *  the section 
   * @param endRow the last row index of 
   * the section 
   * @param startCol the first column index of 
   * the section 
   * @param endCol the last column index of 
   * the section 
   * Precondition: 
   *  0 <= startRow <= endRow < view.length 
   * Precondition: 
   *  0 <= startCol <= endCol < view[0].length 
   * @return the average of the values in the
   * specified section of view 
   */
  public double getAverage(int startRow, int endRow,
  int startCol, int endCol)
  {
    double sum=0;
    int count=0;
    for(int r=startRow; r <= endRow; r++)
    {
      for(int c=startCol; c <= endCol;c++)
      {
        sum+=view[r][c];
        count++;  
      }
    }
    return sum/count;    
  }

  public static void main(String[] args)
  {
    double[] scanned = {0.3,0.7,0.8,0.4,1.4,1.1,0.2,0.5,0.1,1.6,0.6,0.9};
    SkyViewFrq134 sk1 = new SkyViewFrq134(4, 3, scanned);
    for(double s:scanned)
    {
      System.out.printf("%-5.1f",s);
    }
    System.out.println();
    for(double[] row:sk1.view)
    {
      for(double element:row)
      {
        System.out.printf("%-5.1f",element);
      }
      System.out.println();
    }
    System.out.printf("Average:= %.3f %n",sk1.getAverage(1, 2, 0, 2));
    System.out.println();
    

  }

}
