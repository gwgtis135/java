package co.yedam.app;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MemoStorage {
	List<Memo> list = new ArrayList<Memo>();

	private static MemoStorage instance = null;

	public static MemoStorage getinstance() {
		instance = new MemoStorage();
		return instance;
	}
	public MemoStorage() {
		System.out.println("qweqwe");
	}

	public boolean saveData(Memo pm) {
		return list.add(pm);
	}

	public boolean deleteData(String no) {

//		Iterator<Memo> itr = list.iterator();
//		while (itr.hasNext()) {
//			if (itr.next().getNo().equals(no))
//				itr.remove();
//		}
		for (Memo mm : list) {
			if (mm.getNo().equals(no)) {
				list.remove(mm);
				return true;
			}
		}
		return false;
	}
	File file = new File("D:\\temp\\memo.txt");
	
	public void fileRead() {
		
	}
	
	public void fileSave() {
		try {
			FileWriter fw = new FileWriter(file);
			for(Memo memo : list) {
				fw.append(memo.toString());
			}
			fw.close();
		}catch(Exception e) {
			e.fillInStackTrace();
		}
	}

	public List searchData() {
		return list;
	}
}
