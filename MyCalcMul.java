package mypkg;

public class MyCalcMul {
    public int mul(int a, int b)
	{
		return(a*b);
	}

	public static void main(String[] args) {
		MyCalcMul ob = new MyCalcMul();		
		System.out.println("Multiplication is "+ob.mul(10, 20));
	}
    
}
