package inheritance;

public class IdProof {
	int validity;
	String id_name,number;

	IdProof(String id_name,String number,int validity)
	{
		this.id_name=id_name;
		this.number=number;
		this.validity=validity;
	}
	
	public String toString()
	{
		return id_name+" "+number+" "+validity;
	}
}
