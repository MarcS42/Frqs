package frqPkg;

import java.util.ArrayList;
import java.util.List;

public class SeatingChartFrq143 {
  
  /** seats[r][c] represents the Student in 
   * row r and column c in the classroom. */ 
  private StudentFrq143[][] seats;
  
 /** Creates a seating chart with the given 
  * number of rows and columns from the students 
  * in studentList. 
  * Empty seats in the seating chart are represented by null. 
  * @param rows the number of rows of seats in the classroom 
  * @param cols the number of columns of seats in the classroom 
  * Precondition: rows > 0; cols > 0; 
  *       rows x cols >= studentList.size()
  * Postcondition: 
  *  - Students appear in the seating chart in the same order 
  *    as they appear in studentList, starting at seats[0][0].
  *  - seats is filled column by column from studentList, 
  *    followed by any empty seats (represented by null).
  *  - studentList is unchanged. */
  public SeatingChartFrq143(List<StudentFrq143> studentList,
  int rows, int cols)
  {    //When you declare seats, all entries are null until initialized
    int listSize= studentList.size(), count=0;
    seats = new StudentFrq143[rows][cols];//!!Be careful not to re-declare seats[][]!!
    for(int c=0; c < seats[0].length; c++)
    {
      for(int r=0; r < seats.length; r++)
      {
        if(count<listSize)
        {
          seats[r][c]=studentList.get(count);
          count++;
        }
      }
    }
  }
  
  /** Removes students who have more than a 
   * given number of absences from the 
   * seating chart, replacing those entries 
   * in the seating chart with null and 
   * returns the number of students removed.   
   * @param allowedAbsences an integer >= 0
   * @return number of students removed from seats
  *  Postcondition: 
  *  - All students with allowedAbsences or fewer 
  *    are in their original positions in seats.
  *  - No student in seats has more than 
  *    allowedAbsences absences.
  *  - Entries without students contain null. 
  */
  public int removeAbsentStudents(int allowedAbsences)
  {
    int count=0;
    for(int r=0; r < seats.length; r++)
    {
      for(int c=0; c < seats[0].length; c++)
      {
        if((seats[r][c] != null) && (seats[r][c].getAbsenceCount() > allowedAbsences))
        {
          seats[r][c]=null;
          count++;
        }
      }
    }
    return count;
  }
  
  public static void printSeatingChart(StudentFrq143[][] seats)
  {
    for(StudentFrq143[] row:seats)
    {
      for(StudentFrq143 r:row)
      {
        //Left justified, width 10 spaces, string
        System.out.printf("%-10s",r);
      }
      System.out.println();
    }
  }

  public static void main(String[] args)
  {
    List<StudentFrq143> roster = new ArrayList<>();
    roster.add(new StudentFrq143("Karen",3));
    roster.add(new StudentFrq143("Liz",1));
    roster.add(new StudentFrq143("Paul",4));
    roster.add(new StudentFrq143("Lester",1));
    roster.add(new StudentFrq143("Henery",5));
    roster.add(new StudentFrq143("Renee",9));
    roster.add(new StudentFrq143("Glen",2));
    roster.add(new StudentFrq143("Fran",6));
    roster.add(new StudentFrq143("David",1));
    roster.add(new StudentFrq143("Danny",3));
    
    SeatingChartFrq143 st1 = new SeatingChartFrq143(roster,3,4);
    printSeatingChart(st1.seats);
    System.out.println(st1.removeAbsentStudents(4));
    printSeatingChart(st1.seats);


  }

}
