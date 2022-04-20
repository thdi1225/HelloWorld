package co.edu.board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardService app = new BoardApp(); 
		int menu = 0;
		
		while(true) {
			System.out.println("1.등록 2.수정 3.삭제 4.상세조회 5.목록 6.종료");
			System.out.print("선택 >> ");
			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("사용할 수 없는 메뉴입니다.");
			}
			int no = 0;
			if(menu == 1) {
				System.out.print("등록 번호 > ");
				no = Integer.parseInt(scn.nextLine());
				System.out.print("등록 제목 > ");
				String title = scn.nextLine();
				System.out.print("등록 내용 > ");
				String str = "";
				while(true) {
					String temp = scn.nextLine();
					str += temp + "\n";
					if(temp.equals("")) {
						break;
					}
				}
//				String contents = scn.nextLine();
				System.out.print("등록 작성자 > ");
				String writer = scn.nextLine();
				
				Board vo = new Board(no, title, str, writer);
				
				String result = app.boardInsert(vo);
				System.out.println(result);
			}else if(menu == 2) {
				System.out.print("수정할 번호 > ");
				no = Integer.parseInt(scn.nextLine());
				System.out.print("변경 제목 > ");
				String title = scn.nextLine();
				System.out.print("변경 내용 > ");
				String str = "";
				while(true) {
					String temp = scn.nextLine();
					str += temp + "\n";
					if(temp.equals("")) {
						break;
					}
				}
//				String contents = scn.nextLine();
				System.out.print("변경 작성자 > ");
				String writer = scn.nextLine();
				
				Board vo = new Board(no, title, str, writer);
				
				String result = app.boardUpdate(vo);
				System.out.println(result);
			}else if(menu == 3) {
				System.out.print("삭제할 번호 > ");
				no = Integer.parseInt(scn.nextLine());
				
				String result = app.boardDelete(no);
				System.out.println(result);
			}else if(menu == 4) {
				System.out.print("조회할 번호 > ");
				no = Integer.parseInt(scn.nextLine());
				
				Board vo = app.boardSelectOne(no);
				System.out.println(vo);
			}else if(menu == 5) {
				ArrayList<Board> list = app.boardSelectList();
				for(Board vo : list) {
					if(vo == null) {
						System.out.println("등록된 글이 없습니다.");
					}else {
						System.out.println(vo);
					}
				}
			}else if(menu == 6) {
				break;
			}
		}
		
		System.out.println("end of prog.");
	}
}
