package p_29;
import java.io.*;
import java.util.Scanner;
public class equalText {
	static boolean twoFileCompare(String Fname1,String Fname2) {
		FileInputStream fin1=null;
		FileInputStream fin2=null;
		try {
			fin1=new FileInputStream("C:\\tmp\\"+Fname1+".txt");
			fin2=new FileInputStream("C:\\tmp\\"+Fname2+".txt");
			int c1;
			int c2;
			while((c1=fin1.read())!=-1&&(c2=fin2.read())!=-1){
				if(c1!=c2) {
					return false;
				}
			fin1.close();
			fin2.close();
		}
		}catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫 번째 파일 이름 입력:");
		String fname1=sc.nextLine();
		System.out.print("두 번째 파일 이름 입력:");
		String fname2=sc.nextLine();

		if(twoFileCompare(fname1, fname2)) {
			System.out.println("두 파일은 같습니다.");
		}
		else {
			System.out.println("두 파일은 다릅니다.");
		}
	}

}
