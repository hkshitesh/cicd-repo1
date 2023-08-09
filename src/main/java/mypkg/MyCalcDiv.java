package mypkg;

public class MyCalcDiv {
    public int div(int a, int b)
	{
		return(a/b);
	}

	public static void main(String[] args) {
		MyCalcDiv ob = new MyCalcDiv();		
		System.out.println("Division is "+ob.div(20, 20));
	}
    
}
