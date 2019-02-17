package frqPkg;

/**
 * Creates a ClimbInfoFrq121 object with name peakName and time climbTime.
 * @param peakName the name of the mountain peak
 * @param climbTime the number of minutes taken to complete the climb
 */
public class ClimbInfoFrq121 {
    private String peakName;
    private int climbTime;
  
  public ClimbInfoFrq121(String peakName, int climbTime) {
    this.peakName = peakName;
    this.climbTime = climbTime;
  }

  public String getPeakName()
  {
    return peakName;
  }

  public int getClimbTime()
  {
    return climbTime;
  }
  
  public String toString()
  {
    return peakName +"/"+climbTime;
  }
  
  public static void main(String[] args) {
    
    ClimbInfoFrq121 monadnock = new ClimbInfoFrq121("Monadnock", 274);
    System.out.println(monadnock);
  }
  
}
