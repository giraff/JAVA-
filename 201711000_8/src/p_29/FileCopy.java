package p_29;
import java.io.*;

class BufferCopy {
	void bufferCopy() {
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		try {
			fin = new FileInputStream("C:\\tmp\\a.jpg");
			fout = new FileOutputStream("C:\\tmp\\b.jpg");
			bin = new BufferedInputStream(fin, 1024); //1KB
			bout = new BufferedOutputStream(fout, 1024);
			int c;
			while((c = bin.read()) != -1) {
				bout.write(c);
			}
			bout.flush();
			fin.close();
			bin.close();
			fout.close();
			bout.close();
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없음");
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}	
	}
	public class FileCopy {
		public static void main(String[] args) {
			BufferCopy copy = new BufferCopy();
			copy.bufferCopy();
		}
	}