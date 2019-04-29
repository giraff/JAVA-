package p_15;
import java.io.*;
public class FileReadHangulSuccess {

	public static void main(String[] args) {
		try {
		FileInputStream fin= new FileInputStream("C:\\tmp\\hangul.txt");
		InputStreamReader in=new InputStreamReader(fin,"MS949");
		int c;
		
		System.out.println("인코딩 문자 집합은 "+ in.getEncoding());
		while((c=in.read())!=-1) {
			System.out.print((char)c);
		}
		in.close();
		fin.close();
		}catch(IOException e) {
			System.out.println("입출력오류");
		}
	}

}
