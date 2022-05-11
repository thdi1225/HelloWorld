package co.so.book;

import java.util.List;
import java.util.Scanner;

import co.so.book.service.BookService;
import co.so.book.serviceImpl.BookServiceImpl;
import co.so.book.vo.BookVO;

public class MainMenu {
	private Scanner scn = new Scanner(System.in);
	private BookService service = new BookServiceImpl();
	
	public void run() {
		menu();
	}
	
	private void menu() {
		
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("===============================================================================");
			System.out.println("1.전체조회 | 2.단건조회 | 3.내용검색 | 4.대여가능 | 5.책 대여 | 6.책 반납 | 7.책 등록 | 9.종료");
			System.out.println("===============================================================================");
			
			System.out.print("메뉴선택>");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				bookListSelect();
				break;
			case 2:
				bookNameSelect();
				break;
			case 3:
				bookContentsSelect();
				break;
			case 4:
				bookRentalSelect();
				break;
			case 5:
				bookHaveUpdate();
				break;
			case 6:
				bookGiveUpdate();
				break;
			case 7:
				bookInsert();
				break;
			case 9:
				System.out.println("프로그램이 종료되었습니다.");
				isTrue = false;
				break;
			default:
				
				break;
			}
		}
	}

	private void bookListSelect() {
		List<BookVO> list = service.bookListSelect();
		for(BookVO vo : list) {
			if(vo.getBookRental() == 0) {
				System.out.printf("책 제목 : %s, 저자명 : %s, 내용 : %s, 대여여부 : 대여가능 \n", vo.getBookName(), vo.getBookWrite(), vo.getBookContents());
			}else {
				System.out.printf("책 제목 : %s, 저자명 : %s, 내용 : %s, 대여여부 : 대여중 \n", vo.getBookName(), vo.getBookWrite(), vo.getBookContents());
			}
		}
	}

	private void bookNameSelect() {
		System.out.print("책제목>");
		String name = scn.nextLine();
		
		BookVO vo = new BookVO();
		vo.setBookName(name);
		
		vo = service.bookNameSelect(vo);
		
		if(vo.getBookRental() == 0) {
			System.out.printf("책 제목 : %s, 저자명 : %s, 내용 : %s, 대여여부 : 대여가능 \n", vo.getBookName(), vo.getBookWrite(), vo.getBookContents());
		}else {
			System.out.printf("책 제목 : %s, 저자명 : %s, 내용 : %s, 대여여부 : 대여중 \n", vo.getBookName(), vo.getBookWrite(), vo.getBookContents());
		}
	}

	private void bookContentsSelect() {
		System.out.print("검색내용>");
		String contents = scn.nextLine();
		
		BookVO vo = new BookVO();
		vo.setBookContents(contents);
		
		List<BookVO> list = service.bookContentsSelect(vo);
		
		for(BookVO vo1 : list) {
			if(vo.getBookRental() == 0) {
				System.out.printf("책 제목 : %s, 저자명 : %s, 내용 : %s, 대여여부 : 대여가능 \n", vo1.getBookName(), vo1.getBookWrite(), vo1.getBookContents());
			}else {
				System.out.printf("책 제목 : %s, 저자명 : %s, 내용 : %s, 대여여부 : 대여중 \n", vo1.getBookName(), vo1.getBookWrite(), vo1.getBookContents());
			}
		}
	}

	private void bookRentalSelect() {
		List<BookVO> list = service.bookRentalSelect();
		
		for(BookVO vo : list) {
			if(vo.getBookRental() == 0) {
				System.out.printf("책 제목 : %s, 저자명 : %s, 내용 : %s, 대여여부 : 대여가능 \n", vo.getBookName(), vo.getBookWrite(), vo.getBookContents());
			}else {
				System.out.printf("책 제목 : %s, 저자명 : %s, 내용 : %s, 대여여부 : 대여중 \n", vo.getBookName(), vo.getBookWrite(), vo.getBookContents());
			}
		}
	}

	private void bookHaveUpdate() {
		System.out.print("책제목>");
		String name = scn.nextLine();
		
		BookVO vo = new BookVO();
		vo.setBookName(name);
		
		service.bookHaveUpdate(vo);
	}

	private void bookGiveUpdate() {
		System.out.print("책제목>");
		String name = scn.nextLine();
		
		BookVO vo = new BookVO();
		vo.setBookName(name);
		
		service.bookGiveUpdate(vo);
	}

	private void bookInsert() {
		System.out.print("책제목>");
		String name = scn.nextLine();
		System.out.print("저자명>");
		String write = scn.nextLine();
		System.out.print("검색내용>");
		String contents = scn.nextLine();
		
		BookVO vo = new BookVO();
		vo.setBookName(name);
		vo.setBookWrite(write);
		vo.setBookContents(contents);
		
		service.bookInsert(vo);
	}
}