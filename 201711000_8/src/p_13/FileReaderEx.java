package p_13;
import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
	
		FileReader fr=new FileReader("C:\\windows\\system.ini");
		int c;
		
		while((c=fr.read())!=-1) {
			System.out.print((char)c);
		}
		
		fr.close();
	}catch(IOException e) {
		System.out.println("입출력오류");
	}

	}
}
