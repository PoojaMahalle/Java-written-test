package inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class MainPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int size = sc.nextInt();
		Person per[] = new Person[2];
		
		for(int i=0; i<2; i++)
		{
			System.out.println("Enter: id,pname,contact,address");
			int id=sc.nextInt();
			String p_name=sc.next();
			String contact=sc.next();
			String address=sc.next();
			
			IdProof proof[] = new IdProof[2];
			for(int j=0; j<2; j++)
			{
				System.out.println("Enter:id name,number,validity");
				String id_name=sc.next();
				String number=sc.next();
				int validity=sc.nextInt();
				
				proof[j]=new IdProof(id_name,number,validity);
			}
			per[i]= new Person(id,p_name,contact,address,proof);
		}
		System.out.println(Arrays.toString(per));
        for(Person p:per)
        {
        	for(IdProof d: p.proof)
        	{
        		if(p.address.equals("Pune") && d.id_name.equals("AdharCard"))
        		{
        			System.out.println(p.p_name+" "+p.contact+" "+p.address+" "+d.id_name);
        		}
        	}
        }
	}

}
