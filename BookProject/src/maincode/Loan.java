package maincode;

import java.util.Calendar;

public class Loan {
	private String id;
	private Calendar loanDate;
	private Calendar dateForReturn;
	private Calendar returnDate;
	private Book book;
	private Member member;

	public boolean HasNotBeenReturned(){
		return returnDate==null;
	}
	public void MarkAsReturned(){
		setReturnDate(Calendar.getInstance());
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Calendar getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(Calendar loanDate) {
		this.loanDate = loanDate;
	}
	public Calendar getDateForReturn() {
		return dateForReturn;
	}
	public void setDateForReturn(Calendar dateForReturn) {
		this.dateForReturn = dateForReturn;
	}
	public Calendar getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Calendar returnDate) {
		this.returnDate = returnDate;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	
}
