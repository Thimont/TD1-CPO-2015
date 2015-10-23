package upo.cpo1;

import com.sun.org.apache.xpath.internal.SourceTree;

public final class Main
{
    public static void main(String[] args)
    {
	    SalleCinema sc = new SalleCinema(1000, 7.5, "Jurassik World");
        for(int i = 0; i < 1001; i++)
            sc.vendrePlace();
        System.out.println(sc);
    }
}
