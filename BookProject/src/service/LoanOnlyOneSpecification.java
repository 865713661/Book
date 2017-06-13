package service;

import java.util.Iterator;
import maincode.Book;
import maincode.Loan;
import maincode.Member;



public class LoanOnlyOneSpecification implements ISpecification<Member> {
	private Book wantbook;
	@Override
	public boolean isSatisfiedBy(Member member) {
		// TODO Auto-generated method stub
		Loan loan=new Loan();
		boolean result=true;
		for(Iterator<Loan> i=member.getLoans().iterator();i.hasNext();){
			loan=i.next();
			if(loan.getBook().getIsbn()==wantbook.getIsbn()&&loan.getReturnDate()==null){
				result=false;
			}
		}
		return result;
	}
	public LoanOnlyOneSpecification(Book book){
		this.wantbook=book;
	}
}
