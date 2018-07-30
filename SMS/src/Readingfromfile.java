import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Readingfromfile {
	public static void main(String[] args)throws IOException 
	{
		String n;int p=0;int q=0;
		DataInputStream stream=new DataInputStream
				(new BufferedInputStream(new FileInputStream(new File("mfile.txt"))));

		
		p=stream.readInt();
		q=stream.readInt();
		n=stream.readUTF();
		System.out.println(n+" your total bill is: "+(p*q));
		stream.close();
}
}