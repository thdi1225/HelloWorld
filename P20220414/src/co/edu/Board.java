package co.edu;

public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private int boardCnt = 0;
	
	public Board(int boardNo, String boardTitle, String boardContent, String boardWriter) {
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
	}
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public int getBoardCnt() {
		return boardCnt;
	}
	public void setBoardCnt(int boardCnt) {
		this.boardCnt = boardCnt;
	}
	
	public void getInfo() {
		System.out.println("게시글 번호 게시글 제목 게시글 내용 작성자 조회수");
		System.out.printf("%5d %9s %7s %6s %6d \n", this.boardNo, this.boardTitle, this.boardContent, this.boardWriter, this.boardCnt);
//		System.out.println(this.boardNo, this.boardTitle, this,boardContent, this.boardWriter, this.boardCnt);
	}
}
