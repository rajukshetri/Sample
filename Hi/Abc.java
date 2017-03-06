package Hi;

import interview.Parent;




 class Abc extends Parent
{
	Abc(int x) {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s = "Maulik Mansukhbhai Kanani";
		
		String s1[] = s.split(" ");
		System.out.println("length" + s1.length);
		for(int i=s1.length;i<=0;i--)
		System.out.println(s1[i-1]);
		
		String s2 = "maulik";
		char[] ss = s2.toCharArray();
		for(int j=0;j<ss.length;j++)
			System.out.println(ss[j]);
		
	}
}