
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne {
	public static int countOddDigits(int num) {

		if (num >= 1) {

			if ((num % 10) % 2 == 1) {
				return 1 + countOddDigits(num / 10);
			} else if ((num % 10) % 2 == 0) {
				return countOddDigits(num / 10);
			}

			return countOddDigits(num);
		}
		return 0;
	}
}