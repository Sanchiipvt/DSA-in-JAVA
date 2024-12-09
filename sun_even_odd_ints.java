
import java.util.*;
public class sun_even_odd_ints {
    public static void main (String arg [])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int i;
        int sum = 0;
        for ( i = 0; i <= n; i++)
        {
            if ( n % 2 == 0)
            {
                sum += i;
                System.out.println ("Even sum = " + sum);
            }
            else 
            {
                sum += i;
                System.out.println ("Odd sum = " + sum);
            }
        }
    }
}
