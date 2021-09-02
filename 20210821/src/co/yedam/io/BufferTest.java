package co.yedam.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferTest {
	
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
			String a = br.readLine();
			System.out.println(a);        //한글 가 는 출력안됨 1byte만 읽어드려서 
		
			
		
	}

}
