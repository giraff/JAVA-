package p_18;
import java.io.*;
public class FileWriterEx {

	public static void main(String[] args) {
		try {
		
		InputStreamReader in=new InputStreamReader(System.in);
		FileWriter fw=null;
		
		fw=new FileWriter("C:\\tmp\\test.txt");
		
		int c;
		while((c=in.read())!=-1) {
			fw.write(c);
		}
		in.close();
		fw.close();	
		}catch(IOException e) {
			System.out.println("입출력오류");
		}
	}
}
