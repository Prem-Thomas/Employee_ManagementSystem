package dto;

import java.util.Comparator;

public class SortByEmpNo implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getEage() - e2.getEage();
	}
	

}
