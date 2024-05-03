package dto;

import java.util.Comparator;

public class SortByEmpName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getEname().compareTo(e2.getEname());
	}

}
