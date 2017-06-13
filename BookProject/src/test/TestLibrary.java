package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import maincode.Book;
import maincode.Loan;
import maincode.LoanFactory;
import maincode.Member;
import service.HasReachMaxSpecification;
import service.ISpecification;
import service.LoanOnlyOneSpecification;


public class TestLibrary {
	Book novel;
	Book easay;
	Book easay1;
	Book story;
	Book math;
	Member member;
    ISpecification<Member> isfb1;
	ISpecification<Member> isfb2;
	List<Loan> lns=new ArrayList<Loan>();
	
	@Before
	public void addData(){
		member=new Member("1","小明");
		novel=new Book("1","001","小说",member);
		easay=new Book("2","002","散文",member);
		story=new Book("3","003","故事",null);
		easay1=new Book("4","002","散文",null);
		math=new Book("5","004","数学",null);
		lns.add(LoanFactory.CreateLoan(novel, member));
		lns.add(LoanFactory.CreateLoan(easay, member));
		member.setLoans(lns);
		isfb1=new HasReachMaxSpecification();
		isfb2=new LoanOnlyOneSpecification(math);
		}
	
	@Test
	public void NLoan(){
	    story.setLoanTo(member);
	    lns.add(LoanFactory.CreateLoan(story, member));
	    member.setLoans(lns);
		if(isfb1.isSatisfiedBy(member)&&isfb2.isSatisfiedBy(member))
			System.out.println(member.Loan(story)?"借书成功":"借书失败");
		else
		   System.out.println("超过数量");
	}
	
	@Test 
	public void YReturn(){
		System.out.println(member.Return(easay)?"还书成功":"还书失败");
	}
	
	@Test
	public void NLoan1(){
		isfb2=new LoanOnlyOneSpecification(easay1);
		if(isfb1.isSatisfiedBy(member)&&isfb2.isSatisfiedBy(member))
			System.out.println(member.Loan(easay1)?"借书成功":"借书失败");
			else
		   System.out.println("已有此书");
	}
	
	@Test
	public void YLoan(){
		if(isfb1.isSatisfiedBy(member)&&isfb2.isSatisfiedBy(member)){
			System.out.println(member.Loan(story)?"借书成功":"借书失败");
		    math.setLoanTo(member);
		}else{
			  System.out.println("不合规则");
		}
	}
	
	@After
	public void end(){}
	

}
