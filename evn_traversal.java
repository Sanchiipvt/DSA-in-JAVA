public class evn_traversal
{
  public static void even_traversal (int [] arr)
  {
    for (int i = 0; i< arr.length; i++)
    {
        if (arr[i] % 2 == 0)
        {
            System.out.println (arr[i]);
        }
        
    }
  }
  public static void main (String args[])
  {
    int ar [] = {0,1,2,3,4,5,6};
    for (int i = 0; i < ar.length; i++)
    {
      System.out.println (ar[i]);
    }
    even_traversal(ar);
  }
}
