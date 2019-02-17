package frqPkg;

public class HorseBarnFrq123  {
  
  /** The spaces in the barn. 
   * Each array element holds a reference to 
   * the horse that is currently occupying 
   * the space. 
   * A null value indicates an empty space. 
   */
  private HorseFrq123[] spaces;
  
  public HorseBarnFrq123(int barnSize)
  {
    spaces = new HorseFrq123[barnSize];
    spaces[0]= new AHorseFrq123("Trigger",1340);
    spaces[2]= new AHorseFrq123("Silver",1210);
    spaces[5]= new AHorseFrq123("Patches",1350);
    spaces[6]= new AHorseFrq123("Duke",1410);
  }
  
  /** Returns the index of the space that 
   * contains the horse with the specified name.
   *  
   * Precondition: 
   * No two horses in the barn have the same 
   * name.  
   * @param name the name of the horse to find  
   * @return the index of the space containing 
   * the horse with the specified name; -1 if 
   * no horse with the specified name is in the 
   * barn. 
   */
  public int findHorseSpace(String name)
  { /* to be implemented in part (a) */ 
    for(int i=0; i<spaces.length; i++)
    {
      if(spaces[i] != null && spaces[i].getName().equals(name)) return i;
    }
    return -1;
  }
  
  /** Consolidates the barn by moving horses so that 
   * the horses are in adjacent spaces, 
   * starting at index 0, with no empty space between 
   * any two horses. * 
   * 
   * Postcondition: 
   * The order of the horses is the same as before 
   * the consolidation. 
   */
  public void consolidate()
  { /* to be implemented in part (b) */ 
    int indexWSpace=0;
    HorseFrq123[] wSpace=new HorseFrq123[spaces.length];
    for(int i=0; i<spaces.length; i++)
    {
      if(spaces[i] != null)
      {
        wSpace[indexWSpace++]=spaces[i];
      }
    }
    for(int i=0; i<wSpace.length;i++)
    {
      spaces[i]=wSpace[i];
    }
  }
  
  public static void main(String[] args) {
    HorseBarnFrq123 sweetHome = new HorseBarnFrq123(7);
    System.out.println("Find Trigger:= "+sweetHome.findHorseSpace("Trigger"));
    System.out.println("Find Silver:= "+sweetHome.findHorseSpace("Silver"));
    System.out.println("Find Coco:= "+sweetHome.findHorseSpace("Coco"));
    sweetHome.consolidate();
    for(HorseFrq123 h:sweetHome.spaces)
    {
      System.out.printf("%-14s", h);
    }
   
  }
}
