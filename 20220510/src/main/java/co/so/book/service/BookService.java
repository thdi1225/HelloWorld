package co.so.book.service;

import java.util.List;

import co.so.book.vo.BookVO;

public interface BookService {

	List<BookVO> bookListSelect();

	BookVO bookNameSelect(BookVO vo);

	List<BookVO> bookContentsSelect(BookVO vo);

	List<BookVO> bookRentalSelect();

	int bookHaveUpdate(BookVO vo);

	int bookGiveUpdate(BookVO vo);

	int bookInsert(BookVO vo);

}
