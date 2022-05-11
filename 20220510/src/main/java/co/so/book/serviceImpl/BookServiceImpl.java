package co.so.book.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.so.book.service.BookService;
import co.so.book.vo.BookVO;
import co.so.conn.DataSource;

public class BookServiceImpl implements BookService{
	private DataSource dataSource = DataSource.getInstance();
	private Connection conn = dataSource.getConnection();
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<BookVO> bookListSelect() {
		List<BookVO> list = new ArrayList<BookVO>();
		String sql = "select * from book order by bookName";
		try {
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				BookVO vo = new BookVO();
				vo.setBookName(rs.getString("bookName"));				
				vo.setBookWrite(rs.getString("bookWrite"));				
				vo.setBookContents(rs.getString("bookContents"));				
				vo.setBookRental(rs.getInt("bookRental"));				
								
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public BookVO bookNameSelect(BookVO vo) {
		String sql = "select * from book where bookName = ? order by bookName";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBookName());
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				vo.setBookName(rs.getString("bookName"));				
				vo.setBookWrite(rs.getString("bookWrite"));				
				vo.setBookContents(rs.getString("bookContents"));				
				vo.setBookRental(rs.getInt("bookRental"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public List<BookVO> bookContentsSelect(BookVO vo) {
		List<BookVO> list = new ArrayList<BookVO>();
		String sql = "select * from book where bookContents like '%"+vo.getBookContents()+"%' order by bookName";
		try {
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				vo = new BookVO();
				
				vo.setBookName(rs.getString("bookName"));				
				vo.setBookWrite(rs.getString("bookWrite"));				
				vo.setBookContents(rs.getString("bookContents"));				
				vo.setBookRental(rs.getInt("bookRental"));
				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<BookVO> bookRentalSelect() {
		List<BookVO> list = new ArrayList<BookVO>();
		String sql = "select * from book where bookRental = 0 order by bookName";
		try {
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				BookVO vo = new BookVO();
				vo.setBookName(rs.getString("bookName"));				
				vo.setBookWrite(rs.getString("bookWrite"));				
				vo.setBookContents(rs.getString("bookContents"));				
				vo.setBookRental(rs.getInt("bookRental"));
				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int bookHaveUpdate(BookVO vo) {
		int result = 0;
		String sql = "update book set bookRental = 1 where bookName = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBookName());
			
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int bookGiveUpdate(BookVO vo) {
		int result = 0;
		String sql = "update book set bookRental = 0 where bookName = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBookName());
			
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int bookInsert(BookVO vo) {
		int result = 0;
		String sql = "INSERT INTO book VALUES(?, ?, ?, 0)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBookName());
			psmt.setString(2, vo.getBookWrite());
			psmt.setString(3, vo.getBookContents());
			
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
