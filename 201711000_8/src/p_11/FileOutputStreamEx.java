package p_11;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("C:\\Users\\hse05\\test.out");
			FileInputStream fin=null;//읽을 수 있는 도구
			
			for(int i=0;i<10;i++) {
				int n=10-i;
				fout.write(n);
			}
			fout.close();
					
			fin=new FileInputStream("C:\\Users\\hse05\\test.out");
			int c=0;
			while((c=fin.read())!=-1) {
				System.out.print(c+" ");
			}
			fin.close();
			
		}catch(IOException e) {
			System.out.println("입출력오류");
		}
	}

}
