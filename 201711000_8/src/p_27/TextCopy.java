package p_27;
import java.io.*;
import java.util.Scanner;
public class TextCopy {
//FileReader
//FileWriter
//BufferedReader
//BufferedWriter
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub

		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;

		try {
			File src=new File("C:\\windows\\system.ini");
			File dst=new File("C:\\tmp\\system.txt");
			fr=new FileReader(src);
			fw=new FileWriter(dst);
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			int c;
			while((c=br.read())!=-1) { //원래 br ,bw 가 자꾸 오류가 나서 fr, fw로 변경
				bw.write((char)c);
			}
			fr.close();
			fw.close();
			br.close();
			bw.close();
		}catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

}
