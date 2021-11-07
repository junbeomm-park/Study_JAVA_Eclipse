package api.lang;
//String을 정의하는 방법
// - 리터럴(literal)
// - 객체생성
public class StringTest01 {
  public static void main(String[] agrs) {
	  //String을 리터럴의 형식으로 할당하면 heap의 String상수 pool에 저장
	  String str1 = "java";
	  String str2 = "java";
	  
	  //객체생성으로 할당 - 인스턴스만들기
	  String str3 = new String("java");
	  String str4 = new String("java");
	  
	  if(str1==str2) { //같다.
		  System.out.println("같다.");
	  }else {
		  System.out.println("다르다.");
	  }
	
	  if(str1==str3) { //다르다.
		  System.out.println("같다.");
	  }else {
		  System.out.println("다르다.");
	  }
	  
	  if(str1==str2) { //다르다.
		  System.out.println("같다.");
	  }else {
		  System.out.println("다르다.");
	  }
	 
	  //String객체의 할당 방법하고 상관없이 문자열을 비교
	  if(str1.equals(str4)) { //같다.
		  System.out.println("같다.");
	  }else {
		  System.out.println("다르다.");
	  }
	  
	  if(str1==str4) { //다르다.
		  System.out.println("같다.");
	  }else {
		  System.out.println("다르다.");
	  }
  }
}
