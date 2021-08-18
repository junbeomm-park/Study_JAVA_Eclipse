package statement;
//구구단출력하기
public class GuGu_Continue {
	public static void main(String[] args) {
		for(int dan = 2;dan<=9;dan++) {
			if(dan==5) {
				continue;
			}
			for(int i = 1;i<=9;i++) {
//				if(i==5) {
//					continue;
//				}
				System.out.print(dan+"*"+i+"="+(dan*i)+"\t");
			}
			System.out.println();
		}
		
	}
}
