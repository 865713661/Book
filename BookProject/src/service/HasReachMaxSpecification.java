package service;

import java.util.Iterator;

import maincode.Loan;
import maincode.Member;



public class HasReachMaxSpecification implements ISpecification<Member> {

	@Override
	public boolean isSatisfiedBy(Member member) {
        // TODO Auto-generated method stub
        int size=0;
        boolean result=true;
        Loan loan=new Loan();
        for(Iterator<Loan> i=member.getLoans().iterator();i.hasNext();){
            loan=i.next();
            if(loan.getReturnDate()==null){
                size++;
                if(size>=3){
                    result=false;
                    break;
                }
            }
        }
        return result;
    }
}
