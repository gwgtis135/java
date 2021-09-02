package co.yedam.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectTest {

	public static void main(String[] args) {

//		write1();
		read1();
	}
	
	public static void read1() {
		
		try {
		FileInputStream fis = new FileInputStream("C:/Temp/emp.dat");  //스트림이라서 바이너리로 저장됨 
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Emp> list = (ArrayList<Emp>)ois.readObject();
		for(int i =0;i< list.size();i++) {
			System.out.println(list.get(i).getName());
		}

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void write1() {
		ArrayList<Emp> list = new ArrayList<>();
		list.add(new Emp(1, "홍길동","인사"));
		list.add(new Emp(2, "홍길동","개발"));
		list.add(new Emp(3, "홍길동","인사"));
		
		try {
		FileOutputStream fos = new FileOutputStream("C:/Temp/emp.dat");  //스트림이라서 바이너리로 저장됨 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
