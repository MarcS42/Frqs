package frqPkg;

import java.util.*;

public class SysLogFrq162 {
  
  private List<LogMessagesFrq162> messageList;
  
  public SysLogFrq162()
  {
    messageList = new ArrayList<LogMessagesFrq162>();
    messageList.add(new LogMessagesFrq162("CLIENT3:security alert – repeated login failures")); 
    messageList.add(new LogMessagesFrq162("Webserver:disk offline")); 
    messageList.add(new LogMessagesFrq162("SERVER1:file not found")); 
    messageList.add(new LogMessagesFrq162("SERVER2:read error on disk DSK1)")); 
    messageList.add(new LogMessagesFrq162("SERVER1:write error on disk DSK2"));
    messageList.add(new LogMessagesFrq162("Webserver:error on /dev/disk"));
  }
  
  
  /** Removes from the SystemLog all entries 
   * whose descriptions properly contain keyword, 
   * and returns a list (possibly empty) 
   * containing the removed entries. 
   * 
   * Postcondition: 
   * Entries in the returned list properly 
   * contain keyword and are in the order in 
   * which they appeared in the system log.
   * - The remaining entries in the system log 
   * do not properly contain keyword and are in 
   * their original order.
   * The returned list is empty if no messages 
   * properly contain keyword
   */
  public List<LogMessagesFrq162> removeMessages(String keyword)
  {
    List<LogMessagesFrq162> targetList = new ArrayList<>();
    for(int msg = 0; msg < messageList.size(); msg++)
    {
      if(messageList.get(msg).containsWord(keyword))
      {
        targetList.add(messageList.get(msg));
        messageList.remove(msg);
        msg--;
      }
    }
    return targetList;
  }

}

