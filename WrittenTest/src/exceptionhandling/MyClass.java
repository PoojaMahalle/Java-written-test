package exceptionhandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass {
	
	void myMethod1()throws IOException
	{
		myMethod2();
		throw new IOException("Exception is occured..");
	}
	
	void myMethod2()throws IOException
	{
		myMethod3();
		throw new IOException("Exception is occured..");
	}
	
	void myMethod3()
	{
		File f=new File("E://test1.txt");
		FileReader fr=null;
		FileWriter fw=null;
		try
		{
			fw=new FileWriter(f);
			fw.write("Welcome to core java session");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		MyClass m = new MyClass();
		m.myMethod1();

	}

}
