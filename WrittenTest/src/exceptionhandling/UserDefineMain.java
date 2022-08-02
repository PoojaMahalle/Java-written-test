package exceptionhandling;

public class UserDefineMain {
	void validate(int age) throws UserDefineException
	{ 
		if(age<18)
	{
		throw new UserDefineException("age is less, not allowed for rollercoster ride");
	}
		else if(age>60)
		{
			throw new UserDefineException("age is greater,not allowed for rollercoster ride");
		}
		else
		{
			System.out.println("Enjoy your ride");
		}
		
	}

	public static void main(String[] args) {
		int age=65;
		UserDefineMain u = new UserDefineMain();
        
       try {
			u.validate(age);
		} catch (UserDefineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       System.out.println("Done");

	}

}
