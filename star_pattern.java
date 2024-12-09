package patterns;
import java.util.*;
public class star_pattern {
    public static void main (String arg [])
    {
        int i, star,line;
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt ();
        for (line=1;line<=r;line++)
        {
            for (star=0;star<=line;star++)
            {
                System.out.print ("*");
            }
            System.out.println ();
        }
    }
}
