package frqPkg;

public class DownloadInfoFrq131 {
  
  private String title;
  private int timesDownloaded;
  
  
  /** Creates a new instance with the given 
   * unique title and sets the number of 
   * times downloaded to 1.  
   * @param title the unique title of the downloaded song 
   */
  public DownloadInfoFrq131(String title) { 
    /* implementation not shown */
    this.title = title;
    this.timesDownloaded = 1;
  }
  /** @return the title */ 
  public String getTitle() 
  { 
    /* implementation not shown */
    return title;
  }
  /** Increment the number times downloaded by 1 */ 
  public void incrementTimesDownloaded() 
  { 
    /* implementation not shown */
    timesDownloaded++;
  }
  
  public String toString()
  {
    return title +"/"+ timesDownloaded;
  }

}
