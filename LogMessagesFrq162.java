package frqPkg;

public class LogMessagesFrq162 {
  
  private String machineId;
  private String description;
  
  public LogMessagesFrq162(String message)
  {
    int colonLoc = message.indexOf(":");
    machineId=message.substring(0, colonLoc);
    description=message.substring(colonLoc+1);
  }
  
  public boolean containsWord(String keyword)
  {
    boolean valid0 = description.startsWith(keyword+" ");
    boolean valid1 = description.endsWith(" "+keyword);
    boolean valid2= description.indexOf(" "+keyword+" ")>=0;
    boolean valid3 = description.startsWith(keyword) && 
        (description.length()==keyword.length());
    return (valid0 || valid1 || valid2 || valid3);

  }

  public String getMachineId()
  {
    return machineId;
  }

  public String getDescription()
  {
    return description;
  }
  
  public String toString()
  {
    return getMachineId()+":"+getDescription();
  }

}
