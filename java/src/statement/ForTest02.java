package statement;
//for문을 중첩해서 사용하기
public class ForTest02 {
	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=5;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=5;i++) {
				if(i==3 & row==3) {
					System.out.print("너\t");
				}else {
					System.out.print("2\t");
				}
			}
			System.out.println();
		}
		System.out.println("================================");
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=5;i++) {
				//System.out.println("row="+row+",i="+i);
				if(i==row) {
					System.out.print("너\t");
				}else {
					System.out.print("2\t");
				}
			}
			System.out.println();
		}
	}
}
