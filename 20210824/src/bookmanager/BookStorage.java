package bookmanager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class BookStorage implements BookAccess{

	List<Book> book = new ArrayList<>();
	
//	?���??��
	static BookStorage instance = new BookStorage();
	public static BookStorage getInstance() {
		return instance;
	}
	
	@Override
	public boolean saveData(Book book1) {
		Iterator<Book> itr = book.iterator();
		while(itr.hasNext()) {
			Book target = itr.next();
		
			if(book1.getIsbn().equals(target.getIsbn())) {
				return false;
			}
		}
		book.add(book1);
		return true;
	}

	@Override
	public void searchData() {
		
		
		
		Iterator<Book> itr = book.iterator();
		while(itr.hasNext()) {
			Book target = itr.next();
			System.out.println(target.toString());
			
		}
		System.out.println("총 "+book.size() +"건수");
		
		
	}

	@Override
	public boolean deleteData(String name) {
		boolean flag = false;
		Iterator<Book> itr = book.iterator();
		while(itr.hasNext()) {
			if(itr.next().getName().contains(name)) {
				itr.remove();
				 flag = true;
			}
			
		}
		return flag;
	}
	

}
