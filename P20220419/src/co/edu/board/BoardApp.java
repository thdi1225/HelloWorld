package co.edu.board;

import java.util.ArrayList;

public class BoardApp implements BoardService {

	ArrayList<Board> list = new ArrayList<Board>();
	
	@Override
	public String boardInsert(Board vo) {
		String str;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == vo.getBoardNo()) {
				str = "등록된 번호가 존재합니다.";
				return str;
			}
		}
		
		list.add(vo);
		str = "등록하셨습니다.";
		return str;
	}
	
	@Override
	public String boardUpdate(Board vo) {
		String str = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() != vo.getBoardNo()) {
				str = "등록된 번호가 존재하지 않습니다.";
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == vo.getBoardNo()) {
				list.set(i, vo);
				str = "수정하셨습니다.";
			}
		}
		return str;
	}

	@Override
	public String boardDelete(int no) {
		String str = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() != no) {
				str = "등록된 번호가 존재하지 않습니다.";
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.remove(i);
				str = "삭제하셨습니다.";
			}
		}
		return str;
	}

	@Override
	public ArrayList<Board> boardSelectList() {
		return list;
	}

	@Override
	public Board boardSelectOne(int no) {
		for(Board board : list) {
			if(board.getBoardNo() == no) {
				return board;
			}
		}
		return null;
	}

}
