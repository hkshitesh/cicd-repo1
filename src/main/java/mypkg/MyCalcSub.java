package mypkg;

public class MyCalc {
	public int sub(int a, int b)
	{
		return(a-b);
	}

	public static void main(String[] args) {
		MyCalc ob = new MyCalc();
		
		System.out.println("Subtract is "+ob.sub(20, 10));

	}

}