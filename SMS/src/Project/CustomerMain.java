package Project;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CustomerMain
{
public static void main(String[] args)throws IOException
	
	{
	
	FileInputStream stream=new FileInputStream("customer.txt");
	BufferedInputStream bs=new BufferedInputStream(stream);
	ObjectInputStream ot=new ObjectInputStream(bs);
	Customer1 c=(Customer1) ot.readObject();
	
	System.out.println("Your details");
	System.out.println(c);
}
}

