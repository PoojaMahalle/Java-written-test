package sets_map;

public class Items {
	int id,price,qty;
	String name;
	
	Items(int id,String name,int qty,int price)
	{
		this.id=id;
		this.name=name;
		this.qty=qty;
		this.price=price;
		
	}
	
	public String toString()
	{
		return id+" "+name+" "+qty+" "+price;
	}

}
