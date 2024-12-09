package patterns;
public class inverted_star_pattern {
    public static void main (String arg [])
    {
        int line, star;
        int r = 4;
        for (line = 1; line <= r; line++)
        {
            for (star=1;star<=r-line+1; star++)
            {
                System.out.print ("*");
            }
            System.out.println ();
        }
    }
}
