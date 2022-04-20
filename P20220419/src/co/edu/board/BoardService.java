package co.edu.board;

import java.util.ArrayList;

public interface BoardService {
	public String boardInsert(Board vo);

	public String boardUpdate(Board vo);

	public String boardDelete(int no);

	public ArrayList<Board> boardSelectList();

	public Board boardSelectOne(int no);
}
