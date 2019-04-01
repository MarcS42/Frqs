package frqPkg;

import java.util.Arrays;

public class ArrayTesterFrq184 {

  public static int[] getColumn(int[][] arr2D, int c)
  {
    int[] out = new int[arr2D[0].length];
    int i=0;  
    for(int[] row:arr2D)
    {
      out[i]=row[c];
      i++;
    }
    return out;
  }
  
  public static boolean isLatin(int[][] square)
  {
    int[] row0 = new int[square.length];
    row0=square[0];
    if(!ArrayTesterFrq184.containsDuplicates(row0))
    {
      int k=0, passes=0;
      while(passes<square[0].length && k<square[0].length)
      {
        if(ArrayTesterFrq184.hasAllValues(row0,ArrayTesterFrq184.getColumn(square,k)))
        {
          if(ArrayTesterFrq184.hasAllValues(row0,square[k]))
          {
            k++;
          }
        }
        passes++;
      }
      if(k==square.length) return true;
    }
    return false;
  }
  
  public static boolean hasAllValues(int[] arr1, int[] arr2)
  {
    int count=0;
    for(int i=0; i<arr1.length; i++)
    {
      for(int j=0; j<arr2.length;j++)
      {
        if(arr1[i]==arr2[j])
        {
          count++;
          break;
        }
      }
    }
    if(count==arr2.length)
    {
      return true;
    }else
    return false;
  }
  
  public static boolean containsDuplicates(int[] arr)
  {
    for(int i=0; i<arr.length; i++)
    {
      for(int j=0; j<arr.length;j++)
      {
        if(arr[i]==arr[j] && i != j)
        {
          return true;
        }
      }
    }
    return false;
  }
  

  public static void main(String[] args)
  {
    int[][] arr2D = {{ 3, 5, 7, 1},
                     { 1, 3, 5, 7},
                     { 5, 7, 1, 3},
                     { 7, 1, 30, 5}
                    };
    int[][] arr2Dv1 = {{ 1,2},
                       { 2,1}
                       };
    int c=2;
    int[] row0=arr2D[0];
    System.out.println(Arrays.toString(row0));
    System.out.println(Arrays.toString(ArrayTesterFrq184.getColumn(arr2D, c)));
    System.out.println("ContainsDupicates? "+ArrayTesterFrq184.containsDuplicates(row0));
    System.out.println("hasAllValues? "+ArrayTesterFrq184.hasAllValues(row0,getColumn(arr2D, c)));
    System.out.println("IsLatin(arr2D)? "+ArrayTesterFrq184.isLatin(arr2D));
    System.out.println("IsLatin(arr2Dv1)? "+ArrayTesterFrq184.isLatin(arr2Dv1));
  }

}
