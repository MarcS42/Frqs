package frqPkg;

import java.util.ArrayList;
import java.util.List;

public class SparseArrayFrq153 {

  /** The number of rows and columns in the 
   * sparse array. */ 
  private int numRows; 
  private int numCols;

  /** The list of entries representing the 
   * non-zero elements of the sparse array. 
   * Entries are stored in the 
   * list in no particular order. Each 
   * non-zero element is represented by exactly 
   * one entry in the list. */
  private List<SparseArrayEntryFrq153> entries;

  /** Constructs an empty SparseArray. */ 
  public SparseArrayFrq153() 
  { 
    entries = new ArrayList<SparseArrayEntryFrq153>(); 
  }

  /** Returns the number of rows in the sparse array. */ 
  public int getNumRows() 
  { return numRows; }

  /** Returns the number of columns in the sparse array. */ 
  public int getNumCols() 
  { return numCols; }

  /** Returns the value of the element at row 
   * index row and column index col in the 
   * sparse array. 
   * 
   * Precondition: 0 <= row < getNumRows() 
   *               0 <= col < getNumCols() 
   */
  public int getValueAt(int row, int col) 
  { /* to be implemented in part (a) */
    int getR,getC;
    for(int i=0; i < entries.size();i++)
    {
      getR=entries.get(i).getRow();
      getC=entries.get(i).getCol();
      
      if(getR==row && getC==col)
      {
        return entries.get(i).getValue();
      }
    }
    return 0;
  }

  /** Removes the column col from the sparse array. 
   *  Precondition: 0 <= col < getNumCols() 
   */
  public void removeColumn(int col) 
  { /* to be implemented in part (b) */ 
    int getC,getR,getV;
    numCols=numCols-1;
    for(int i=entries.size()-1; i>=0; i--)
    {
      getC=entries.get(i).getCol();
      getR=entries.get(i).getRow();
      getV=entries.get(i).getValue();
      if(getC>col)
      {
        entries.add(new SparseArrayEntryFrq153(getR,getC-1,getV));
        entries.remove(i);
      }else if(getC==col)
      {
        entries.remove(i);
      }
    }
  }
  
  public int[][] SparseArray(int rows, int cols)
  {
    int[][] sparse = new int[rows][cols];
    for(int r=0; r<sparse.length; r++)
    {
      for(int c=0; c<sparse[0].length;c++)
      {
        if(this.getValueAt(r, c)!=0)
        {
          sparse[r][c]=this.getValueAt(r, c);
        }
      }
    }
    return sparse;
  }
  
  public static void printSparseArray(int[][] sparse)
  {
    for(int[] rowsOf:sparse)
    {
      for(int c:rowsOf)
      {
        if(c==0)
        {
          System.out.print("  ,\t");
        }else {
          System.out.print(""+c+" ,\t");
        }
      }
      System.out.println();
    }
  }
  
  public String toString()
  {
    String returnMe = "Sparse Array \n Number of Rows:= "+getNumRows()+"\n Number of Cols:= "+getNumCols()+"\n "
        + this.entries;
    return returnMe;
  }
  // There may be instance variables, constructors, and methods that are not shown.

  public static void main(String[] args)
  {
    SparseArrayFrq153 sparse1 = new SparseArrayFrq153();
    sparse1.numRows=5;
    sparse1.numCols=5;
    sparse1.entries.add(new SparseArrayEntryFrq153(2, 0, 1));
    sparse1.entries.add(new SparseArrayEntryFrq153(1, 1, 5));
    sparse1.entries.add(new SparseArrayEntryFrq153(3, 1, -9));
    sparse1.entries.add(new SparseArrayEntryFrq153(1, 4, 4));
    
//    System.out.println(sparse1);
//    System.out.println(sparse1.getValueAt(3, 1));
    int[][] sparse=sparse1.SparseArray(5, 5);
    printSparseArray(sparse);
    
//    System.out.println("Remove Column 1:");
//    sparse1.removeColumn(1);
//    System.out.println(sparse1);
  }

}
