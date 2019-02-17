package frqPkg;

import java.util.List;

public class FuelDepotFrq113 {
  /** The robot used to move the filling 
   * mechanism
   */ 
  private FuelRobotFrq113 filler;
  
  /** The list of fuel tanks */ 
  private List<FuelTankFrq113> tanks;
  
  /** Determines and returns the index of 
   * the next tank to be filled. 
   * @param threshold fuel tanks with a fuel 
   *  level <= threshold may be filled  
   * @return index of the location of the 
   *  next tank to be filled  
   * Postcondition: the state of the robot 
   * has not changed */
  public int nextTankToFill(int threshold)
  { /* to be implemented in part (a) */
    int lowTankIdx=filler.getCurrentIndex();
    for(int i=0; i<tanks.size();i++)
    {
      if(tanks.get(i).getFuelLevel()<=threshold)
      {
        if(tanks.get(i).getFuelLevel()<tanks.get(lowTankIdx).getFuelLevel())
        {
          lowTankIdx=i;
        }
      }
    }
    return lowTankIdx;
  }
  
  /** Moves the robot to location locIndex.  
   * @param locIndex the index of the location 
   *  of the tank to move to 
   * Precondition: 0 <= locIndex < tanks.size()
   * Postcondition: the current location of 
   * the robot is locIndex */
  public void moveToLocation(int locIndex)
  { /* to be implemented in part (b) */ 
    int botStrt=filler.getCurrentIndex();
    if(botStrt != locIndex)
    {
      if(botStrt<locIndex && filler.isFacingRight())
      {
        moveBot(locIndex);
      }else {
        filler.changeDirection();
        moveBot(locIndex);
      }
      if(botStrt>locIndex && filler.isFacingRight())
      {
        filler.changeDirection();
        moveBot(locIndex);
      }else {
        
        moveBot(locIndex);
      }
    }
  }

  /**
   * @param locIndex
   */
  public void moveBot(int locIndex)
  {
    while(filler.getCurrentIndex() != locIndex)
    {
      filler.moveForward(1);
    }
  }

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub

  }

}

