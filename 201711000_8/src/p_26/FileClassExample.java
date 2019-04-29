package p_26;

import java.io.File;

public class FileClassExample{
	public static void dir(File fd) {
		String[] filenames=fd.list();//배열의 각 요소가 string 
		for(String s:filenames) {
			File f= new File(fd,s);
			long t=f.lastModified();//마지막으로 수정된 시간
			System.out.print(s);
			System.out.print("\t파일크기: "+f.length());//파일크기
			System.out.printf("\t수정한시간:%tb %td %ta %tT\n",t,t,t,t);
			
		}
	}
	public static void main(String[] args) {
		File f1=new File("C:\\windows\\system.ini");
		File f2=new File("C:\\tmp\\java_sample");
		File f3=new File("C:\\tmp");
		
		String res;
		if(f1.isFile()) {
			res="파일";
		}
		else {
			res="디렉터리";
		}
		System.out.println(f1.getPath()+"은"+res+" 입니다.");
		if(!f2.exists()) {
			if(!f2.mkdir()) {
				System.out.println("디렉터리 생성 실패");
			}
		}
		if(f2.isFile()) {
			res="파일";
		}
		else {
			res="디렉터리";
		}
		System.out.println(f2.getPath()+"은"+res+"입니다.");
		dir(f3);
		
		f2.renameTo(new File("C:\\tmp\\javasample"));
		dir(f3);
	}
	
}