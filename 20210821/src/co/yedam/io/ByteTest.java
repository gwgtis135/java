package co.yedam.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteTest {

	public static void main(String[] args) throws FileNotFoundException {

		
//		write1();
		
		try {
//			write2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		read1();
//		read2();
		filecopy();
		
	}
	
	public static void filecopy() {
		try {
			FileInputStream fis = new FileInputStream("C:/Temp/sky.jpg");//파일은 역스랠쉬로 안됨 \n이런 구조 때문에 구별하기 힘들어서 
			FileOutputStream fos = new FileOutputStream("C:/Temp/sky2.jpg");
			byte[] arr = new byte[100];  
			while(true) {
				int a = fis.read(arr);
				if(a == -1)break;
				fos.write(arr, 0, a);  //arr 적으면 뒤에 쓰레기 값도 나옴 , 읽어드릴 값만 출력하기 
			}
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}  

	}
	
	
	
	public static void read2() {
		try {
			FileInputStream fis = new FileInputStream("C:/Temp/data2.dat");
			byte[] arr = new byte[2];    //한번에 읽어 들일 크기   3바이트
			
			while(true) {
			int a = fis.read(arr);      //a는 읽어 들일 바이트 수 
			if(a == -1 )break;
//			for(byte temp : arr) {
//				System.out.println(temp);        //향상된 for문 원하는 배열 크기 까지만 출력은 못해줌 
//				}
			for(int i =0;i<a;i++) {
				System.out.println(arr[i]);
				}
			}
			fis.close();
			
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	public static void read1() {
		try {
			FileInputStream fis = new FileInputStream("C:/Temp/data1.dat");
			
			while(true) {
			int a = fis.read();
			if(a == -1 )break;
			System.out.println(a);
			}
			fis.close();
			
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	//바이트 배열
	public static void write2() throws Exception {
		byte[] arr = new byte[] {10, 20, 30};
		FileOutputStream fos = new FileOutputStream("C:Temp/data2.dat"); 
		
		
		fos.write(arr);	
		fos.flush();
		fos.close();
		
		
	}
	
	
	
	
	public static void write1() {
		try {
			FileOutputStream fos = new FileOutputStream("C:Temp/data1.dat");
			byte a = 10;
			byte b = 20;
			
			fos.write(a);
			fos.write(b);
			fos.flush();
			
			fos.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
