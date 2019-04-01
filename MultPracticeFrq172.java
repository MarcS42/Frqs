package frqPkg;

public class MultPracticeFrq172 implements StudyPracticeFrq172{
  
  private int firstInteger;
  private int secondInteger;
  private String op = " TIMES ";
  
  public MultPracticeFrq172(int first, int second)
  {
    firstInteger = first;
    secondInteger= second;
    
  }
  
  public String getProblem()
  {
    String problem = firstInteger + op + secondInteger;
    return problem;
  }

  @SuppressWarnings("unused")
  public void nextProblem()
  {
    String nProblem = firstInteger + op + secondInteger++;
  }
}
