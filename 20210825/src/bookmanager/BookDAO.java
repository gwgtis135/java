package bookmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class BookDAO {

	
	
	private Connection getConnection() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String passwd = "test";
		Connection conn = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("db연결성공");
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	//closeJDBC
	private void closeJDBC(Connection conn, PreparedStatement pstmt, ResultSet rs){ 
		try {
		
		if(rs != null) {
			rs.close();       //자바 업데이트 하고 나서 try catch 	
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
		if(pstmt != null){
			pstmt.close();
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try {
			if(rs !=null) {
				rs.close();
			}
			}catch(SQLException e){
				e.printStackTrace();
			}
		 
	}
	
	//insert

	public int insert(Book book) {
		int cnt =0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql ="";
		
		if(!insertCheck(book)) {
		try {	
		conn = this.getConnection();
		sql = "INSERT INTO booklist VALUES(?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, book.getIsbn());
		pstmt.setString(2, book.getName());
		pstmt.setString(3, book.getContent());
		cnt = pstmt.executeUpdate();                //spl문을 사용해주는 구문 pstmt.executeUpdate();
//		conn.commit();

		
		if (cnt > 0) {  //CNT 값이 0보다 크면 INSERT 정상 작동 
			System.out.println("INSERT 성공");
		}
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeJDBC(conn, pstmt, null);
		}
		}
		else {
			System.out.println("이미 같은 값이 저장되어 있습니다.");
		}
		
		return cnt;
		
		

		
	}
	
	
	
	//insertCheck
	public boolean insertCheck(Book book) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql ="";
		ResultSet rs = null;
		
		try {
			conn = this.getConnection();
			sql = "SELECT isbn FROM booklist ";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
			if(rs.getString("isbn").equals(book.getIsbn())) {
				flag = true;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeJDBC(conn, pstmt, null);
		}
		return flag;
	}
	

	//delete
	
	public void delete(String isbn) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql ="";
		ResultSet rs = null;
		
		try {
			conn  = this.getConnection();
			sql = "DELETE FROM booklist WHERE isbn in ?";
			pstmt = conn.prepareStatement(sql);           //이 부분이  밑 부분보다 빨리와야 된다 
			pstmt.setString(1,isbn); //prepareStatement에 대해서 알아보기  
			rs = pstmt.executeQuery();
//			conn.commit();
			
			
				if(rs !=null){
				System.out.println("삭제완료");
			}
				else {
					System.out.println("삭제에러");
				}
				
					
		}catch (Exception e) {
				e.printStackTrace();
		}finally {
			closeJDBC(conn, pstmt, null);
		}
	}

	//search 검색은 책 이름을 받아서 해준다. 
	public void search(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		ResultSet rs = null;
		
		try {
			conn  = this.getConnection();
			sql = "SELECT * FROM BOOKLIST WHERE name = ? ";
			pstmt = conn.prepareStatement(sql);           //이 부분이  밑 부분보다 빨리와야 된다 
			pstmt.setString(1,name); //prepareStatement에 대해서 알아보기  
			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				Book book = new Book();
//				book.setIsbn(rs.getString("isbn"));
//				book.setName(rs.getString("name"));
//				book.setContent(rs.getString("content"));
//			}
			if(rs !=null) {
			while(rs.next()) {		//next() = > 가져올 요소가 있는지 체크 있으면 한건 가져오고 true; 가져올 데이터가 없으면 false 출력
	    		System.out.print("책일련번호: "+ rs.getString("isbn")); //employeeId,
	    		System.out.print("\t이름: "+ rs.getString("name"));
	    		System.out.print("\t내용: "+ rs.getString("content")+"\n");
	    		
	    		System.out.println("조회 완료");
	    		}
			}
			else {
				System.out.println("조회 결과 없음  ");
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeJDBC(conn, pstmt, rs);
		}
	}
	
	
	// 전체조회 출력값이 다르게 나오면  commit;
	public void searchAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		ResultSet rs = null;
		
		try {
			conn  = this.getConnection();
			sql = "SELECT * FROM booklist ";
			pstmt = conn.prepareStatement(sql);           //이 부분이  밑 부분보다 빨리와야 된다 
			rs = pstmt.executeQuery();
			
			while(rs.next()) {		//next() = > 가져올 요소가 있는지 체크 있으면 한건 가져오고 true; 가져올 데이터가 없으면 false 출력
	    		System.out.print("책일련번호: "+ rs.getString("isbn")); //employeeId,
	    		System.out.print("\t이름: "+ rs.getString("name"));
	    		System.out.print("\t내용: "+ rs.getString("content"));
	    		
	    		System.out.println();
	    		}
			
		} catch ( SQLException e) {
			e.printStackTrace();
		}finally {
			closeJDBC(conn, pstmt, null);
		}
		
	}
	
	//update
	public void update(String name, String isbn) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		ResultSet rs = null;
		try {
			conn  = this.getConnection();        //db와의 연결
			sql = "UPDATE BOOKLIST SET name = ? WHERE isbn = ? "; //디벨로퍼에서 실행할 쿼리문
			pstmt = conn.prepareStatement(sql);           //pstmt에 쿼리문을 담아주기  
			pstmt.setString(1, name);
			pstmt.setString(2, isbn);
			rs = pstmt.executeQuery();              //쿼리 실행을 하면서 반환된는 데이터들을 담아준다.
			
			if(rs != null) {
				System.out.println("업데이트 완료");
			}
			else {
				System.out.println("업데이트 오류");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeJDBC(conn, pstmt, null);
		}
	}
	
}



