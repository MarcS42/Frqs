package frqPkg;

import java.util.ArrayList;
import java.util.List;

public class MusicDownloadFrq131 {
  
  /** The list of downloaded information. 
   * Guaranteed not to be null and not to contain duplicate titles.
   */
  private List<DownloadInfoFrq131> downloadList;
  
  
  /** Creates the list of downloaded information. */ 
  public MusicDownloadFrq131() { 
    downloadList = new ArrayList<DownloadInfoFrq131>(); 
    }
  
  /** Returns a reference to the DownloadInfo object 
   *  with the requested title if it exists.  
   *   @param title the requested title  
   *   @return a reference to the DownloadInfo object with the 
   */
  public DownloadInfoFrq131 getDownloadInfo(String title) 
  {  /* to be implemented in part (a) */
    for(int i=0;i<downloadList.size(); i++)
    {
      if(downloadList.get(i).getTitle().equals(title))
      {
        return downloadList.get(i);
      }
    }
    return null; 
  }
  
  /** Updates downloadList with information from titles. 
   * @param titles a list of song titles
   *  
   * Postcondition: 
   * - there are no duplicate titles in downloadList.
   * - no entries were removed from downloadList.
   * - all songs in titles are represented in downloadList.
   * - for each existing entry in downloadList, the download count 
   *   is increased by the number of times its title appeared in 
   *   titles.
   * - the order of the existing entries in downloadList is not changed.
   * - the first time an object with a title from titles is added to downloadList, 
   *   it is added to the end of the list.
   * - new entries in downloadList appear in the same order in which they 
   *   first appear in titles.
   * - for each new entry in downloadList, the download count is equal to
   *   the number of times its title appeared in titles.
   * Postcondition:
   * - no changes were made to downloadList.
   */
  public void updateDownloads(List<String> titles) 
  { /* to be implemented in part (b) */ 
    for(String title:titles)
    {
      DownloadInfoFrq131 findMe = getDownloadInfo(title);
      if(findMe != null)
      {
        findMe.incrementTimesDownloaded();
      }else {
        downloadList.add(new DownloadInfoFrq131(title));
      }
    }
  }

  
  public static void main(String[] args)
  {
    List<String> songTitles = new ArrayList<>();
    songTitles.add("Lights");
    songTitles.add("Aqualung");
    songTitles.add("Soul Sister");
    songTitles.add("Go Now");
    songTitles.add("Lights");
    songTitles.add("Soul Sister");
    
    for(String song:songTitles)
    {
      System.out.printf("%-14s", song);
    }
        
    MusicDownloadFrq131 playListB = new MusicDownloadFrq131();
    playListB.downloadList.add(new DownloadInfoFrq131("Hey Jude"));
    playListB.downloadList.add(new DownloadInfoFrq131("Soul Sister"));
    playListB.downloadList.add(new DownloadInfoFrq131("Aqualung"));
    
    System.out.println();
    for(DownloadInfoFrq131 dload:playListB.downloadList)
    {
      System.out.printf("%-17s", dload);
    }
    
    for(int i = 0; i<4;i++)
    {
      playListB.getDownloadInfo("Hey Jude").incrementTimesDownloaded();
    }
    
    for(int i = 0; i<2;i++)
    {
      playListB.getDownloadInfo("Soul Sister").incrementTimesDownloaded();
    }
    
    for(int i = 0; i<9;i++)
    {
      playListB.getDownloadInfo("Aqualung").incrementTimesDownloaded();
    }
    
    System.out.println();
    for(DownloadInfoFrq131 dload:playListB.downloadList)
    {
      System.out.printf("%-17s", dload);
    }
    
    playListB.updateDownloads(songTitles);
    
    System.out.println();
    for(DownloadInfoFrq131 dload:playListB.downloadList)
    {
      System.out.printf("%-17s", dload);
    }

  }

}
