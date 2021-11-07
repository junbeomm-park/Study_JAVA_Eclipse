package basic;


public class TimeTest{
	public static void main(String[] args){
		int time = 8000;
		int h = time/60/60;
		int modVal = time % 3600;
		int m = modVal / 60;
		int s = modVal % 60;
		System.out.println(h+"시간 "+ m +"분 " + s +"초");
	}
}