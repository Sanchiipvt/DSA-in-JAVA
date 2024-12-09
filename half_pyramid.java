package patterns;
import java.util.*;
public class half_pyramid {
    public static void main (String arg [])
    {
        int line, num;
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt ();
        for (line = 1; line<=r; line++)
        {
            for (num = 1; num<= line; num ++)
            {
                System.out.print (num);
            }
            System.out.println ();
        }
    }
}
