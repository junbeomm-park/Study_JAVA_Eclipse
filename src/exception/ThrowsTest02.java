package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;

public class ThrowsTest02 {
	public void test() throws ArithmeticException{
		System.out.println(10/0);
	}
	public void test2() throws ArithmeticException,FileNotFoundException{
		test();
		FileReader fr = new FileReader("test2.txt");
		
	}
	public void test3() throws ArithmeticException,FileNotFoundException,IOException{
		test2();
		Socket socket = new Socket("127.0.0.1",12345);
	}

}
