package frqTests;

import frqPkg.LogMessagesFrq162;
import frqPkg.SysLogFrq162;

public class TestLogMsgsFrq162 {

  public static void main(String[] args)
  {
    
    String[] msgs1 = {"disk","error on disk","error on dev/disk disk","error on disk DSK1"};
//    String[] msgs2 = {"DISK","error on disk3","error on dev/disk","diskette"};
    String mId = "Server1:";
    for(String msg:msgs1)
    {
      LogMessagesFrq162 testKw = new LogMessagesFrq162(mId+msg);
      System.out.print(testKw.containsWord("disk")+" ");
      System.out.println();
    }
    SysLogFrq162 sysLogTest = new SysLogFrq162();
    System.out.println(sysLogTest.removeMessages("disk"));

  }

}
