import java.util.*;
public class runningsum
  {
    public static int[] runningSum (int[] sums)
    {
      for (int i = 0; i < sums.length; i++)
        {
          sums[i] = sums[i] + sums[i-1];
        }
      return sums;
    }
    public static void main (String args[])
    {
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt ();
      int arr = new int[n];
      for (int i = 0; i < n; i++)
        {
          arr[i] = sc.nextInt ();
        }
      for (int i = 0; i < n; i++)
        {
          System.out.println(arr[i]);
        }
      int [] result = runningSum(arr);
      for (int i = 0; i < n; i++)
        {
          System.out.println(result[i]);
        }
    }
  }
