import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo5
{
	public static void main(String[] args)throws IOException
	
{
		File f=new File("a.txt");//pointing to the file.If file doesn't exist doesn't matter
		RandomAccessFile ra=new RandomAccessFile(f,"rw");//opens file in read and write mode
		ra.seek(ra.length());
		
		ra.writeUTF("HELLO, WELCOME TO JAVA");
		
		ra.seek(0);
		
		System.out.println("The content of the file is : ");
		
		try {
			do
			{
				String n=ra.readUTF();
				System.out.println(n);
			}
			while(true);
		} catch (Exception e) {
			
		}
		
		
	ra.close();
	
	
}

}
