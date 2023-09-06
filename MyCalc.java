package mypkg;

public class MyCalc {
	public int sum(int a, int b)
	{
		return(a+b);
	}

	public static void main(String[] args) {
		MyCalc ob = new MyCalc();
		
		System.out.println("Sum is "+ob.sum(10, 20));

	}

}
