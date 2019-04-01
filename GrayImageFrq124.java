package frqPkg;

public class GrayImageFrq124 {
  public static final int BLACK = 0;
  public static final int WHITE = 255;
  
  /** The 2-dimensional representation of this 
   * image. Guaranteed not to be null.  
   * All values in the array are within the 
   * range [BLACK, WHITE], inclusive. 
   */
  private int[][] pixelValues;
  
  
  
  public GrayImageFrq124(int rows,int cols,int low,int high) 
  {
    this.pixelValues = generateRngMatrix(rows, cols, low, high);
  }

  /** @return the total number of white pixels 
   * in this image.  
   * Postcondition: this image has not been 
   * changed. 
   */
  public int countWhitePixels()
  { /* to be implemented in part (a) */ 
    int count=0;
    for(int[] rows:pixelValues)
    {
      for(int c:rows)
      {
        if(c==255)
        {
          count++;
        }
      }
    }
    return count;
  }
  
  /** Processes this image in row-major order 
   * and decreases the value of each pixel at  
   * position (row, col) by the value of the pixel 
   * at position (row + 2, col + 2) if it exists. 
   *  
   * Resulting values that would be less than BLACK 
   * are replaced by BLACK.  
   * Pixels for which there is no pixel at 
   * position (row + 2, col + 2) are unchanged. 
   */
  public void processImage()
  { /* to be implemented in part (b) */ 
    
    for(int r = 0; r < pixelValues.length; r++)
    {
      for(int c = 0; c < pixelValues[0].length; c++)
      {
        if(r< pixelValues.length-2 && c<pixelValues[0].length-2)
        {
          pixelValues[r][c]=Math.max(0,(pixelValues[r][c]-pixelValues[r+2][c+2]));
        }
      }
    }
  }
  
  /**
   * Generates int Matrix rows x cols, with
   * random element values ranging from low to high
   * @param rows - #rows
   * @param cols - #cols
   * @param low - lowest element int value
   * @param high - highest element int value
   * @return
   */
  public int[][] generateRngMatrix(int rows, int cols, int low,int high)
  {
    int[][] mat = new int[rows][cols];
    for(int r=0; r<rows; r++)
    {
      for(int c=0; c<cols; c++)
      {
        mat[r][c]=(int)(Math.random()*(high+1)+low);
      }
    }
    print2D(mat); 
    return mat;
  }
  
  public static void print2D(int[][] rmf)
  {
    for(int[] r:rmf)
    {
      for(int c:r)
      {
        System.out.printf("%-6d", c);
      }
      System.out.println(); 
    }
    System.out.println();
  }

  public static void main(String[] args)
  {
//    int[][] pValues= {{221,184,178,84,135},
//        {84,255,255,130,84},
//        {78,255,0,0,78},
//        {84,130,255,130,84}};
    GrayImageFrq124 gI1 = 
        new GrayImageFrq124(5,6,0,255);
    
    
//    print2D(gI1.pixelValues);
    gI1.processImage();
    print2D(gI1.pixelValues);
  }

}
