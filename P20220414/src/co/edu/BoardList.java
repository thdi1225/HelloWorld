package co.edu;

public class BoardList {
	private Board[] boards;
	
	public void init(int size) {
		boards = new Board[size];
	}
	
	public int addBoard(Board board) {
		int errorCase = -1;
		for(int i = 0; i < boards.length; i++) {
			if(boards[i] != null) {
				if(board.getBoardNo() == boards[i].getBoardNo()) {
					errorCase = 1;
					break;
				}
			}
			if(boards[i] == null) {
				boards[i] = board;
				errorCase = 0;
				break;
			}
		}
		return errorCase;
	}
	
	public Board[] boardList() {
		return boards;
	}
	
	public int modifyBoard(Board board) {
		int errorCase = 0;
		for(Board vo : boards) {
			if(vo != null) {
				if(vo.getBoardNo() == board.getBoardNo()) {
					vo.setBoardTitle(board.getBoardTitle());
					vo.setBoardContent(board.getBoardContent());
				}else {
					errorCase = -1;
				}
			}
		}
		return errorCase;
	}
	
	public int removeBoard(int boardNo) {
//		for(Board vo : boards) {
		int errorCase = 0;
		for(int i = 0; i < boards.length; i++) {
			if(boards[i] != null) {
				if(boards[i].getBoardNo() == boardNo) {
					boards[i] = null;
					break;
				}else {
					errorCase = -1;
				}
			}
		}
		return errorCase;
	}
	
	public Board boardSelect(int boardNo) {
		for(Board vo : boards) {
			if(vo != null && vo.getBoardNo() == boardNo) {
				return vo;
			}
		}
		return null;
	}

	public Board[] boardWriter(String writer) {
		Board[] vos = new Board[boards.length];
		int i = 0;
		for(Board vo : boards) {
			if(vo != null && vo.getBoardWriter().equals(writer)) {
				vos[i] = vo;
				i++;
			}
		}
		return vos;
	}
}
