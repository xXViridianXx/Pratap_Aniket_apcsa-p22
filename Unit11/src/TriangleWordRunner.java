import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		for (String s: new String[] {"a", "it", "box", "toad", "fishy", "dog"})
		{
			TriangleWord.printTriangle(s);
		}
	}
}