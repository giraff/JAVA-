package p_09;
import java.io.*;
public class FileInputStreamEx {

	public static void main(String[] args) {
		FileInputStream fin=null;
		try{
			fin=new FileInputStream("C:\\windows\\system.ini");
			//C:\\windows\\system.ini 파일을 열고 파일과 입력바이트 스트림 인스턴스 fin 연결
		int c;
		while((c=fin.read())!=-1) {//파일 끝까지 바이트씩 c에 읽어 들임.
								   // 파일의 끝을 만나면 read()는 -1 return
			System.out.print((char)c);
		}
	fin.close();
	}catch(IOException e) {
		System.out.println("입출력 오류");
	}
	
	}
}
