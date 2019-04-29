package p_29;

import java.io.*;

/*
 * 8. 이미지 파일 "a.jpg"를 "b.jpg"로 복사하는 프로그램을 작성하라.
 * 복사를 진행하는 동안 10% 진행할 때마다 '*'를 하나씩 출력하도록 하라.
 */

class CopyPercent {
	void copyPercent() {
		File f = null;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			f = new File("C:\\tmp\\a.jpg");
			fin = new FileInputStream(f);
			fout = new FileOutputStream("C:\\tmp\\b.jpg");
			int c, count = 0;
			int printStar = (int)f.length() / 10; // 10퍼센트
			int total = printStar; // 10, 20, 30, 40퍼센트... 100퍼센트를 저장할 변수
			while((c = fin.read()) != -1) {
				fout.write(c);
				count++;
				if(count == total) {
					System.out.print("*"); // 10퍼센트 마다 별을 출력
					total += printStar;
				}
			}
			fin.close();
			fout.close();
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없음");
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
	public class FileCopy2 {
		public static void main(String[] args) {
			CopyPercent cp = new CopyPercent();
			cp.copyPercent();
	}
}
