package co.edu;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		User[] members = {
				new User("user1", "user1", "홍길동"),
				new User("user2", "user1", "김길동"),
				new User("user3", "user1", "박길동")				
		};
		
		Scanner scn = new Scanner(System.in);
		BoardList board = new BoardList();
		boolean isTrue = true;
		board.init(5);
		
		boolean login = false;
		String name = "";
		
		while(isTrue) {
			
			if(!login) {
				System.out.println("아이디를 입력하세요.");
				String id = scn.nextLine();
				System.out.println("비밀번호를 입력하세요.");
				String password = scn.nextLine();
				
				for(User userVO : members) {
					if(userVO.getUserId().equals(id) && userVO.getUserPassword().equals(password)){
						System.out.println("로그인 성공!");
						name = userVO.getUserName();
						login = true;
					}
				}
			}
			
			if(login) {
				System.out.println("================================================");
				System.out.println("1.추가 2.수정 3.목록 4.삭제 5.한건조회 6.작성자조회 9.종료");
				System.out.println("================================================");
				System.out.print("선택 >> ");
				int menu = 0;
				try {
					menu = scn.nextInt();
				} catch (Exception e) {
					
				}
				
				scn.nextLine();
				
				if(menu == 1) {
					System.out.println("글번호 입력 >> ");
					int boardNo = scn.nextInt();
					scn.nextLine();
					System.out.println("제목 입력 >> ");
					String boardTitle = scn.nextLine();
					System.out.println("내용 입력 >> ");
					String boardContent = scn.nextLine();
					String boardWriter = name;
					
					Board vo = new Board(boardNo, boardTitle, boardContent, boardWriter);
					
					int chk = board.addBoard(vo);
					if(chk == 0) {
						System.out.println("정상 입력되었습니다.");
					}else if(chk == -1){
						System.out.println("저장 공간이 없습니다.");
					}else if(chk == 1){
						System.out.println("이미 있는 번호입니다.");
					}
				}else if(menu == 2) {
					System.out.println("수정할 게시글의 글번호 입력 >> ");
					int boardNo = scn.nextInt();
					scn.nextLine();
					System.out.println("변경할 제목 입력 >> ");
					String boardTitle = scn.nextLine();
					System.out.println("변경할 내용 입력 >> ");
					String boardContent = scn.nextLine();
					Board vo = new Board(boardNo, boardTitle, boardContent, null);
					
					int chk = board.modifyBoard(vo);
					if(chk == 0) {
						System.out.println("정상 입력되었습니다.");
					}else if(chk == -1){
						System.out.println("변경할 번호가 없습니다.");
					}
				}else if(menu == 3) {
					Board[] boards = board.boardList();
					for(Board vo : boards) {
						if(vo != null) {
							vo.getInfo();
						}
					}
					
				}else if(menu == 4) {
					System.out.println("삭제할 게시글의 글번호 입력 >> ");
					int boardNo = scn.nextInt();
					scn.nextLine();
					int chk = board.removeBoard(boardNo);
					if(chk == 0) {
						System.out.println("정상 입력되었습니다.");
					}else if(chk == -1){
						System.out.println("삭제할 번호가 없습니다.");
					}
				}else if(menu == 5) {
					System.out.println("조회할 게시글의 글번호 입력 >> ");
					int boardNo = scn.nextInt();
					scn.nextLine();
					Board vo = board.boardSelect(boardNo);
					if(vo != null) {
						System.out.println("게시글 번호 게시글 제목 게시글 내용 작성자 조회수");
						System.out.printf("%5d %9s %7s %6s %6d \n", vo.getBoardNo(), vo.getBoardTitle(), vo.getBoardContent(), vo.getBoardWriter(), vo.getBoardCnt());	
					}
				}else if(menu == 6) {
					String boardWriter = name;
					
					System.out.println("게시글 번호 게시글 제목 게시글 내용 작성자 조회수");
					Board[] vos = board.boardWriter(boardWriter);
					for(Board vo : vos) {
						if(vo != null) {
							System.out.printf("%5d %9s %7s %6s %6d \n", vo.getBoardNo(), vo.getBoardTitle(), vo.getBoardContent(), vo.getBoardWriter(), vo.getBoardCnt());	
						}
					}
				}else if(menu == 9) {
					System.out.println("프로그램을 종료합니다.");
					isTrue = false;
				}else {
					System.out.println("사용할 수 없는 메뉴입니다.");
				}
			}else {
				System.out.println("아이디 또는 비밀번호가 다릅니다.");
			}
		}
	}
}
