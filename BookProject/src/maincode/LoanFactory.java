package maincode;

import java.util.Calendar;
import java.util.Date;

public class LoanFactory {
	public static Loan CreateLoan(Book book,Member member){
		Calendar cr=Calendar.getInstance();
		Loan ln=new Loan();
		ln.setLoanDate(cr);
		cr.add(Calendar.MONTH, +1);
		ln.setDateForReturn(cr);
		ln.setBook(book);
		ln.setMember(member);
		return ln;
	}
}
