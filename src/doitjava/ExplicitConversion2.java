package doitjava;

public class ExplicitConversion2 {

	public static void main(String[] args) {
		int num = 10;
		float fnum = 2.0F;
		
		int num2 = num + (int)fnum;
		int num3 = num - (int)fnum;
		int num4 = num * (int)fnum;
		int num5 = num % (int)fnum;
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println((float)num5);
		
		
		

	}

}
