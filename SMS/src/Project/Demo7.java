package Project;

import java.util.Random;
import java.util.StringTokenizer;

public class Demo7 
{
public static void main(String[] args) {
	String str="Welcome to Bangalore";
	StringTokenizer st=new StringTokenizer(str,"Z");//here the value in quotes is delimiter
	System.out.println(st.countTokens());
	Random random=new Random();
	
	
	
	int k=(random.nextInt(10));
	System.out.println(k+10);
	
	
}
}
