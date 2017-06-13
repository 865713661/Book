package maincode;

public class Book {
	private String id;
	private String isbn;
	private String title;
	private Member loanTo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Member getLoanTo() {
		return loanTo;
	}

	public void setLoanTo(Member value) {
		loanTo = value;
	}
	public Book(String bid, String bisbn, String btitle, Member bloanTo) {
		super();
		id = bid;
		isbn = bisbn;
		title = btitle;
		loanTo = bloanTo;
	}
	
}
