package Day10;

public class EmployeeBo {
public static void calincomeTax(EmployeeVo e)
{
	double income = e.getAnnualincome();
	
	
	if(income<=250000)
	{
		e.setIncometax(0);
	}
	else if(income>250000 && income<=500000)
	{
		
		e.setIncometax(0.05*income);
	}
	else if(income>500000 && income<=1000000)
	{
		e.setIncometax(0.2*income);
		
	}
	else
	{
		e.setIncometax(0.3*income);
		}
	
	
}
}
