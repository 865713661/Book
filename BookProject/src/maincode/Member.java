package maincode;

import java.util.Iterator;
import java.util.List;



public class Member {
	
	private String id;
	private String name;
	private List<Loan> loans;
	public boolean Return(Book book){
		boolean result=false;
		Loan loan=FindCurrentLoanFor(book);
		if(loan!=null){
			loan.MarkAsReturned();
			book.setLoanTo(null);
			result=true;
		}
		return result;
	}
	public Loan FindCurrentLoanFor(Book book){
		Loan findedLoan=null;
		for(Iterator<Loan> i= getLoans().iterator();i.hasNext();){
			Loan loan=(Loan)i.next();
			if(loan.getBook()==book){
				findedLoan=loan;
				break;
			}
		}
		return findedLoan;
	}
	public boolean CanLoan(Book book){
		return book.getLoanTo()==null;
	}
	public boolean Loan(Book book){
		boolean result=false;
		if(CanLoan(book)){
		Loan loan=LoanFactory.CreateLoan(book, this);
		getLoans().add(loan);
		result=true;
		}
		return result;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	public Member(String mid, String mname) {
		super();
		id = mid;
		name = mname;
	}
	
	
}
