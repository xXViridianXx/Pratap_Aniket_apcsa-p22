//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	
	private int num, den;
	

	//write two constructors
	
	public Rational()
	{
		num = 1;
		den = 1;
	}
	
	public Rational(int numerator, int denominator)
	{
		num = numerator;
		den = denominator;
		
		reduce();
	}

	//write a setRational method
	
	
	public void setRational(int numerator, int denominator)
	{
		num = numerator;
		den = denominator;
	}

	//write  a set method for numerator and denominator

	public void setNums(int n, int d)
	{
		num = n;
		den = d;
	}
	
	public void add(Rational  other)
	{
		
		
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		 
		num = (num * other.getDenominator()) + (other.getDenominator() * den);
		den = (den * other.getDenominator());

		reduce();
	}

	private void reduce()
	{

		if( den < 0)
		{
			num = -1;
			den =-1;
		}
		for (int i = (num < den ? num : den); i > 1; i++)
		{
			if(num % i == 0 && den % i ==0)
			{
				num = num/i;
				num = den/ i;
				return;
			}
		}
		

	}

	private int gcd(int numOne, int numTwo)
	{
		
		return numOne * numTwo;
	}

	public Object clone ()
	{
		return this;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public int getNumerator()
	{
		return num;
	}
	public int getDenominator()
	{
		return den;
	}
	
	public boolean equals( Object obj)
	{

		return (num == ((Rational) obj).getNumerator() && den == ((Rational) obj).getDenominator());

		
	}

	public int compareTo(Rational other)
	{

		double frac1 = (double) num/den;
		double frac2 =  (double) other.getNumerator()/other.getDenominator();
		
		if(frac1 > frac2)
		{
			return 1;
		}
		else if (frac1 < frac2)
		{
			return -1;
		}
		return -1;
	}



	
	//write  toString() method
	public String toString(){
		{
			return num + "/" + den;
		}
	}
	
}