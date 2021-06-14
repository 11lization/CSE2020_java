import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.io.*;

public class Worker {
	
	ArrayList<Member> MemberList = new ArrayList<Member> ();
	
	public Worker() 
	{
		MemberList.add(new Director("Sam", "director", "Busan", 3650.50));
		MemberList.add(new Employee("Cliff", "full-time", "Seoul", 2453.15));
		MemberList.add(new Employee("Kim", "intern", "America", 1548.15));
		MemberList.add(new PartTime("Takuya", "temporary", "China", 12.50));
		MemberList.add(new PartTime("Mike", "temporary", "Japan", 12.50));
		MemberList.add(new Helper("Hong", "volunteer"));		
		
		((Director)MemberList.get(0)).awardBonus(300);
		((PartTime)MemberList.get(3)).addHours(35);
		((PartTime)MemberList.get(4)).addHours(35);
	 } 
	
	public void fireSam()
	{
		Iterator<Member> iterator;
		for(iterator = MemberList.iterator(); iterator.hasNext(); ) {
			Member member = iterator.next();
			if(member.name.equals("Sam")) {
				iterator.remove();
				System.out.println("Bye Sam\n");
			}
		}
	}
	
	
	public void payoff() 
	{
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(new FileOutputStream("MemberList.txt"));
		} catch(FileNotFoundException e) {
			System.err.println("File not found or already be opened");
			System.exit(0);
		}
		
		Iterator<Member> iterator;
		for(iterator = MemberList.iterator(); iterator.hasNext(); ) {
			Member member = iterator.next();
			outputStream.println(member.toString());
			System.out.println(member.toString());
			if(member.pay() != 0) {	
				outputStream.println("Paid: " + member.pay());
				System.out.println("Paid: " + member.pay());
			}
			else {
				outputStream.println("Thank you!");
				System.out.println("Thank you!");
			}
			outputStream.println("------------------------------");
			System.out.println("------------------------------");
		}
		outputStream.close();
	}
	 
	public void memberSort() 
	{
		 //MemberList.sort(null);
		 Collections.sort(MemberList);
		 System.out.println("Sorted name:");
		 Iterator<Member> iterator;
			for(iterator = MemberList.iterator(); iterator.hasNext(); ) {
				Member member = iterator.next();
				System.out.println(member.name);
			}
	}
}

