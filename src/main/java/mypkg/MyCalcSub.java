package mypkg;

public class MyCalcSub {
	public int sub(int a, int b)
	{
		return(a-b);
	}

	public static void main(String[] args) {
		MyCalcSub ob = new MyCalcSub();
		
		System.out.println("Subtraction is "+ob.sub(20, 10));

	}

}
