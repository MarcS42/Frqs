package frqPkg;

public class DiverseArrayFrq151 {
  
  public static int arraySum(int[] arr)
  {
    int sum=0;
    for(int a:arr)
    {
      sum+=a;
    }
    return sum;
  }
  
  public static int[] rowSums(int[][] arr2D)
  {
    int rSumIndex=0;
    int[] rSums =new int[arr2D.length];
    for(int[] row:arr2D)
    {
      rSums[rSumIndex++]=arraySum(row);
    }
    return rSums;
  }
  
  public static boolean isDiverse(int[][] arr2D) 
  {
    boolean diverse=true;
    int[] rSums = rowSums(arr2D);
    /*need to check each element in rSums[]
     * against every other element, so it's
     * like a 2D array rSums x rSums*/
    for(int r=0;r<rSums.length;r++)
    {
      for(int c=0; c<rSums.length;c++)
      {
        if(c != r && rSums[r]==rSums[c]) return false;
      }
    }
    return diverse;
  }

  public static void main(String[] args)
  {
    int[][] mat1= {{ 1, 3, 2, 7, 3},
                   {10,10, 4, 6, 2},
                   { 5, 3, 5, 9, 6},
                   { 7, 6, 4, 2, 1}};
    
    int[][] mat2= {{ 1, 1, 5, 3, 4},
                   {12, 7, 6, 1, 9},
                   { 8,11,10, 2, 5},
                   { 3, 2, 3, 0, 6}};
    
    System.out.println("isDiverse of mat1? " + isDiverse(mat1));
    System.out.println("isDiverse of mat2? " + isDiverse(mat2));


  }

}
