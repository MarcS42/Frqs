package frqPkg;

/**
 * @author MarcSherman
 *
 * @param <T> Generic print 1d array as table.
 */
public class GenericPrintArr1dXAcross <T> {
  
  /**Prints arr1D X elements per Row
   * @param<T> Type of array
   * @param result: iN[] input
   * @param X: number of elements per Row
   */
  public static <T> void printArrayXAcross(T[] arrIn, int X)
  {
    int rows=0, i=0;
    if(arrIn.length%X != 0)
    {
      rows=arrIn.length/X + 1;
    }else {
      rows=arrIn.length/X;
    }
    while(i<arrIn.length-1) {
      for(int r=0; r<rows; r++)
      {
        for(int c=0; c<X;c++)
        {
          if(i+1<arrIn.length)
          {
            System.out.print(arrIn[i++]+", ");
          }else {
            System.out.print(arrIn[i]+". ");
            break;
          }
        }
        System.out.println();
      }
      System.out.println();
    }
  }

  public static void main(String[] args)
  {
    String[] result= {"The", "swift", "brown", "fox", "jumped", "over", "the", "lazy", "dog"};
    Integer[] integer= {1,2,3,4,5,6,7,8,9};
    printArrayXAcross(integer, 4);
    printArrayXAcross(result,3);

  }

}
