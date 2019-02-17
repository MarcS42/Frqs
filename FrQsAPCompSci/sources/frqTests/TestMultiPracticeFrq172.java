package frqTests;

import frqPkg.MultPracticeFrq172;
import frqPkg.StudyPracticeFrq172;

public class TestMultiPracticeFrq172 {

  public static void main(String[] args)
  {
    StudyPracticeFrq172 p1 = new MultPracticeFrq172(7,3);
    System.out.println(p1.getProblem());
    
    p1.nextProblem();
    System.out.println(p1.getProblem());
    
    p1.nextProblem();
    p1.nextProblem();
    System.out.println(p1.getProblem());

  }

}
