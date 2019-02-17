package frqPkg;

import java.util.ArrayList;
import java.util.List;

public class ClimbingClubFrq121 {
  /** The list of climbs completed by members of the club. 
   * Guaranteed not to be null. Contains only non-null references. 
   */
  private List<ClimbInfoFrq121> climbList;
  
  /** Creates a new ClimbingClubFrq121 object. */ 
  public ClimbingClubFrq121()
  { 
    climbList = new ArrayList<ClimbInfoFrq121>(); 
  }
  
  /** Adds a new climb with name peakName and time climbTime 
   * to the list of climbs.  
   * @param peakName the name of the mountain peak climbed * 
   * @param climbTime the number of minutes taken to complete 
   * the climb 
   */
  public void addClimb(String peakName, int climbTime) 
  { /* to be implemented in part (a) with ClimbInfoFrq121 objects 
  in the order they were added */ 
    climbList.add(new ClimbInfoFrq121(peakName,climbTime));
  }
  
  /**
   * To be implemented in part (b) with ClimbInfoFrq121 objects 
   * in alphabetical order by name
   *  
   * @param peakName
   * @param climbTime
   */
  public void addClimbAlpha(String peakName, int climbTime)
  {
    int i = climbList.size()-1;
    while(i>0 && peakName.compareTo(climbList.get(i).getPeakName())<0)
    {
        i--;
    }          
    
    if(i==climbList.size()-1)
    {
      climbList.add(new ClimbInfoFrq121(peakName,climbTime));
    }else 
    climbList.add(i, new ClimbInfoFrq121(peakName,climbTime));
  }

  public static void main(String[] args)
  {
    ClimbingClubFrq121 club1 = new ClimbingClubFrq121();
    club1.addClimb("Monadnock", 274);
    club1.addClimb("Monadnock", 344);
    club1.addClimb("Whiteface", 301);
    
    for(ClimbInfoFrq121 c:club1.climbList)
    {
      System.out.print(c+"\t");
    }
    
    club1.addClimbAlpha("Algonquin", 225);
    club1.addClimbAlpha("Whiteface", 227);
    club1.addClimbAlpha("Xenon", 220);
    
    System.out.println("\n\nAlphaList");
    for(ClimbInfoFrq121 c:club1.climbList)
    {
      System.out.print(c+"\t");
    }
  }

}
