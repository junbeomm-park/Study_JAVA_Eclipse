package api.lang;
//String의 주요 메소드
public class StringTest03 {
	public static void main(String[] args) {
//		System.out.println("java\t program");
//		System.out.println("java\n program");
//		System.out.println("\"java\" program");
		String str1 = new String("java programming");
		String str2 = new String("재밌다");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));
		System.out.println("str1.indexOf('합')=>"+str1.indexOf("합"));
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));
		System.out.println("str1.length()=>"+str1.length());
		System.out.println("str1.equals(\"java programming\")=>"+str1.equals("java programming"));
		System.out.println("str1.equals(\"java programming\")=>"+str1.equals("Java programming"));
		System.out.println("str1.equalsIgnoreCase(\"Java programming\")=>"
		                                            +str1.equalsIgnoreCase("Java programming"));
		
		
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.endsWith(\"mming\")=>"+str1.endsWith("mming"));
		System.out.println("str1.endsWith(\"java\")=>"+str1.endsWith("java"));
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());
		//String객체는 원본이 변경되지 않고 메소드 실행결과로 새로운 String객체가 만들어진다.
		//문자열 조작이 많은 작업은 String을 쓰는 것이 부담
		System.out.println("문자열원본=>"+str1);
		System.out.println("str1.toUpperCase().toUpperCase()=>"+str1.toUpperCase().toLowerCase());
		System.out.println();
		System.out.println();
		
		String data = new String("java programming");
		//GNIMMARGORP AVAJ
		//문자열조작을 위해서 1문자씩 추출
		//전체문자열을 확인 - for
		//문자열을 거꾸로 처리 : length()-1부터 --시켜서 작업
		data =data.toUpperCase();
		for(int i = data.length()-1;i>=0;i--) {
			System.out.print(data.charAt(i));
		}				
	}
}
