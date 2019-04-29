package p_29;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Append{

  public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      System.out.print("첫 번째 파일 이름:");
      String Fname1=sc.nextLine();
      System.out.print("두 번째 파일 이름:");
      String Fname2=sc.nextLine();
      FileReader f1 = null; // 첫번 째 파일
      FileReader f2 = null; // 두번 째 파일
      FileWriter f3 = null; // 첫번 째 파일+ 두번 째 파일
      try {
          int c;
          f1 = new FileReader("C:\\tmp\\"+Fname1+".txt");
          f2 = new FileReader("C:\\tmp\\"+Fname2+".txt");
          // f1,f2 불러올 파일 이름을 입력받음
          f3 = new FileWriter("C:\\tmp\\append_result.txt");
          // 새로 만들 파일(f3)을 설정해줌
          while((c = f1.read())!=-1) { // f1의 내용을 f3에 담는다.
              f3.write(c);
          }
          while((c = f2.read())!=-1) { // f2의 내용을 f3에 담는다.
              f3.write(c);
          }
          f1.close();
          f2.close();
          f3.close();
          // 스트림 닫기
      } catch (IOException e) {
          System.out.println("파일 입출력 오류");
      }
  }

}