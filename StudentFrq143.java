package frqPkg;

public class StudentFrq143 {
  
  private String name;
  private int absenceCount;
  
  public StudentFrq143(String name, int absenceCount)
  {
    this.name=name;
    this.absenceCount=absenceCount;
  }

  public String getName()
  {
    return name;
  }

  public int getAbsenceCount()
  {
    return absenceCount;
  }
  
  public String toString() 
  {
    String name=getName();
    int absenceCount=getAbsenceCount();
    return name+"/"+absenceCount;
  }

}
