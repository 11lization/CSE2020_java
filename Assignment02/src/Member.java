
abstract public class Member implements Comparable{
	
	protected String name; 
	protected String position; 
	
	public Member(String name, String position) 
	{
		this.name = name;
		this.position = position;
	} 
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getPosition() 
	{
		return position;
	}

	public void setPosition(String position) 
	{
		this.position = position;
	}

	public String toString() 
	{
		return "Name: " + name + "\nPosition: " + position;
	}
	
	public abstract double pay(); 
	
	public int compareTo(Object compareMember) 
	{
		if(compareMember == null)
			throw new NullPointerException("Object is null");
		//compareTo 구현에서는 instanceof를 적극 활용하자.
		else if(!(compareMember instanceof Member)) {
			throw new ClassCastException("Object not of the same type");
		}
		else {
			return this.name.compareTo(((Member)compareMember).name);
		}
	}
}
