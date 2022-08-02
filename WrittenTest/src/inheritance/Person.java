package inheritance;

import java.util.Arrays;

public class Person {

	int id;
	String p_name,contact,address;
	IdProof proof[];
	
	Person(int id,String p_name,String contact,String address,IdProof proof[])
	{
		this.id=id;
		this.p_name=p_name;
		this.contact=contact;
		this.address=address;
		this.proof=proof;
	}
	
	public String toString()
	{
		return id+" "+p_name+" "+contact+" "+address+Arrays.toString(proof);
	}
}
