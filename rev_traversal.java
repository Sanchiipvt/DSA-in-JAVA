public class rev_traversal
{
  public static void rev (int [] arr)
  {
    int i = 0, j = arr.length-1;
    while (i < j)
    {
      int t = arr[i];
      arr [i] = arr [j];
      arr [j] = t;
      i++;
      j--;
    }
  }
  public static void main (String args[])
  {
    int ar [] = {2,4,6,8,10,12};
    for (int i = 0; i < ar.length; i++)
    {
      System.out.println (ar[i]);
    }
    rev (ar);
    for (int i = 0; i < ar.length; i++)
    {
      System.out.println (ar[i]);
    }
  }
}
