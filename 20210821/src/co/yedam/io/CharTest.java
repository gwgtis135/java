package co.yedam.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

// 607쪽 
public class CharTest {
	public static void main(String[] args) {
		
//		write1();
//		read1();
		read2();
	}
	
	
	//read2 버퍼를 통해서 파일입력
	public static void read2() {
		try {
			FileReader fr = new FileReader("C:/Temp/addr.txt"); //버퍼를 씌울것임
			BufferedReader br = new BufferedReader(fr);     //파일 리더를 버퍼를 거쳐서 읽어 드릴꺼임 
			String s = null;
			while(true) {
				s = br.readLine();
				if(s == null)break;
				System.out.println(s);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	public static void read1() {
		try {
			
			FileReader fr = new FileReader("C:/Temp/addr.txt");	//파일명은 동일 
			char[] arr = new char[100];
			
			while(true) {
				int a = fr.read(arr);
				if(a == -1)break;
				for(int i =0;i<a;i++) {	//쓰레기 값이 들어갔을 테닌까 a의 크기만큼만 읽어주면 됨 
					System.out.print(arr[i]);
				}
				//char[] -> String으로 변환 
				//for문 안쓰고 하는 것 
				// 검색해서 찾아보기 
			}
			fr.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	
	public static void write1() {
		try {
			Scanner sc = new Scanner(System.in);
			FileWriter fw = new FileWriter("C:/Temp/addr.txt");
			System.out.println("입력>");
			String s = null;
			while(true){
				try {
					 s = sc.nextLine();		//사라지고 없어짐 
				}catch(NoSuchElementException e) {
					break;
				}
				
				
				fw.write(s+"\n");
			}
						
			fw.close();
			System.out.println("생성!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
