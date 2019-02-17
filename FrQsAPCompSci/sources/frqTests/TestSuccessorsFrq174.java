package frqTests;

import frqPkg.SuccessorsFrq174;

public class TestSuccessorsFrq174 {

  public static void main(String[] args)
  {
   int[][] arr2D = {{10,    1,    2,    7},   
                    { 3,    8,    4,    0},   
                    { 6,    5,    9,   11}
    };
//  int n=5;
//  System.out.print(SuccessorsFrq174.findPosition(n, arr2D));
   SuccessorsFrq174.printArr2D(SuccessorsFrq174.getSeccessorArray(arr2D));


  }

}
