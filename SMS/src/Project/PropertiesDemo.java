package Project;
import java.io.*;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		
		InputStream stream=new FileInputStream("C:\\Batch\\Batchmates.properties");
        Properties prop=new Properties();
        prop.load(stream);//it will load key and value from file
        
        String username=prop.getProperty("username");
        
        String password=prop.getProperty("password");
        System.out.println("username is "+username);
        System.out.println(               
        		  "password is "+password);


	}

}
