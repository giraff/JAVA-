package p_22;
import java.io.*;
/*예제 8-7 버퍼 스트림*/
public class BufferedIOEx {

	public static void main(String[] args) {
		InputStreamReader in=new InputStreamReader(System.in);
		//키보드로부터 문자를 읽겠다.
		BufferedOutputStream out=new BufferedOutputStream(System.out,5);
		try {
			int c;
			while((c=in.read())!=-1) {
				out.write(c);
			}
			out.flush();//버퍼에 남아있는 문자 출력
		if(in!=null) {
			in.close();
			out.close();
		}
		
	}catch(IOException e) {
		System.out.println("입출력 오류");
	}

	}
}