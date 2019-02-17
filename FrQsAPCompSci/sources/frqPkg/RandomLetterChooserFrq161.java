package frqPkg;

public class RandomLetterChooserFrq161 extends RandomStringChooserFrq161 {

  /**Notice that you can use static class method
   * in the constructor.
   * @param str
   */
  public RandomLetterChooserFrq161(String str) {
    super(getSingleLetters(str));
  }
  
  public static String[] getSingleLetters(String str)
  {
    String[] letters = new String[str.length()];
    for(int i=0; i < letters.length; i++)
    {
      letters[i]=str.substring(i, i+1);
    }
    return letters;
  }

}
