import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo4 
 {
public static void main(String[] args)throws IOException 
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter quanity");
	int quantity=Integer.parseInt(br.readLine());
	System.out.println("Enter price");
	int price=Integer.parseInt(br.readLine());
	System.out.println("Enter name");
	String name=br.readLine();
	
	FileOutputStream writer=new FileOutputStream("mfile.txt");
	BufferedOutputStream bs=new BufferedOutputStream(writer);
	DataOutputStream ds=new DataOutputStream(bs);
	
	ds.writeInt(quantity);
	ds.writeInt(price);
	ds.writeUTF(name);
	
	ds.close();
	bs.close();
	writer.close();
}
}
