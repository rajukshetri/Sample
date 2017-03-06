package Hi;
import Hello.*;

public class PQR extends ABC{
	PQR()
	{
		Object o = new Object();
		System.out.println("in child");
		
	}
	public void m1()
	{
		//ABC abc = new ABC();
		//abc.m2(); inheritance happens at calling time
		m2();
	}
public static void main(String[] args) {
	PQR b = new PQR();
	//Thread t = new Thread(b);
	int[] key= new int[5];
	System.out.println("value of B::" + b);
	//	b.m1();
}
}
