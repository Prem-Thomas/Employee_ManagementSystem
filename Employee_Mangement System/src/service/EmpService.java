package service;

import java.util.*;

import dto.*;

public class EmpService 
{
	List<Employee> al=new ArrayList<Employee>();
	Scanner sc=new Scanner(System.in);
	
	public void addEmployee() {
		Employee e=new Employee();
		System.out.println("Enter Employee Details : ");
		
		// Handling EmpNo
		while(true)
		{
			try {
				System.out.println("1. EmpNo: ");
				e.setEmpno(sc.nextInt());
				break;
			} catch (InputMismatchException e2)
			{
				System.out.println("Invalid input for EmpNo. Please enter a valid integer.");
				sc.next(); // Consume the invalid input
			}
		}
		// Hnadling Emp Name
		
		System.out.println("2. Emp Name: ");
		sc.nextLine();// Consume the newline Character
		e.setEname(sc.nextLine());
		
		// Handling Emp Phone
		while(true) {
	  try {
		System.out.println("3. Emp Phone :");
		e.setEphone(sc.nextLong());
		break;
	} catch (InputMismatchException e2) {
		System.out.println("Invalid input for Emp Phone.Please Enter a valid long Integer.");
		sc.next();//consume the invalid input
	}
	
	}
	//Handling Emp Age
	while(true)
	{
	    try {
			System.out.println("4. Emp Age: ");
			e.setEage(sc.nextInt());
			break;
		} catch (InputMismatchException e2) {
			System.out.println("Invalid input for Emp Age. Please enter a valid Integer.");
			sc.next();
		}	
	}
	//Handling Emp Designation
	System.out.println("5.Emp Designation: ");
	e.setEdesignation(sc.next());
	
	// Handling Emp Sal
	while(true)
	{
		try {
			System.out.println("6. Emp Sal: ");
			e.setSal(sc.nextDouble());
			break;
		} catch (InputMismatchException e2) {
			System.out.println("Invalid input for Emp Sal.Please enter a Valid double.");
			sc.next();
		}
	}
	al.add(e);
	System.out.println("Employee Successfully added to the Database: "+e.getEname());
	System.out.println("------------------------------------");
	}
	public void updateEmployee() {
		System.out.println("Please enter the Emp No:");
		int empNo=sc.nextInt();
		sc.nextLine();// Consume the newLine character left by sc.nextInt()
		
		for(Employee e:al)
		{
			if(empNo==e.getEmpno())
				
			{
				System.out.println("Enter: \n2. Emp Name \n3. Emp Phone \n4. Emp Age \n5. EmpDesignation\n6. Emp Sal");
				
				//Handling Emp Name
				System.out.print("2. Emp Name: ");
				e.setEname(sc.nextLine());
				
				//Handling Emp Phone
				while(true)
				{
					try {
						System.out.print("3. Emp Phone: ");
						e.setEphone(sc.nextLong());
						break;
					} catch (InputMismatchException e2) {
						System.out.println("Invalid input for Emp Phone. Please enter a valid long integer.");
						sc.next();// consume the invalid input
					}
				}
				// handling Emp Age
				while(true)
				{
					try {
						System.out.println("4.Emp Age: ");
						e.setEage(sc.nextInt());
						break;
					} catch (InputMismatchException e2) 
					{
						System.out.println("Invalid input for Emp Age. Please enter valid Integer.");
						sc.next();
						
					}
				}
				// Handling Emp Designation
				System.out.println("5. Emp Designation: ");
				e.setEdesignation(sc.next());
				
				// Handling Emp Sal
				while(true)
				{
					try {
						System.out.println("6.Emp Sal: ");
						e.setSal(sc.nextDouble());
						break;
					} catch (InputMismatchException e2) {
						System.out.println("Invalid input for Emp Sal. Please Enter the Valid Integer :");
						sc.next();// consume the invalid input
					}
				}
				System.out.println("Employee details are successfully update ");
				System.out.println("-----------------------------");
				return;
			}
		}
		throw new EmpNoNotFound("EmpNo NOT-FOUND");
	}
	public void findAll() {
		System.out.println("Employees Details are: ");
		if(al.isEmpty())
		{
			System.out.println("No employees found in our database");
		}else {
			for(Employee e:al)
			{
				System.out.println(e);
				System.out.println("------------------------");
			}
		}
	}
	public void findByEmpNo() {
		System.out.println("Please enter the Emp No");
		int empNo=sc.nextInt();
		for(Employee e:al) 
		{
			if(empNo==e.getEmpno())
			{
				System.out.println("Employee Details are : ");
				System.out.println(e);
				System.out.println("--------------------------");
				return;
			}
		}
		System.out.println("No Employee found with EmpNo : "+empNo);
		throw new EmpNoNotFound("EmpNo NOT-FOUND");
	}
	public void deleteByEmpNo() {
		System.out.println("Please enter the Emp No: ");
		int empNo=sc.nextInt();
		for(Employee e:al)
		{
			if(empNo==e.getEmpno()) {
				System.out.println(e.getEname()+"is successfully deleted");
				System.out.println("----------------------------");
				al.remove(e);
				return;
			}
		}
		System.out.println("-----------------------------");
		throw new EmpNoNotFound("EmpNo NOT_FOUND");
	}
	public void sortByEmpNo() {
		System.out.println("Employee Details are :");
		if(al.isEmpty())
			
		{
			System.out.println("No Employees Found in our Database");
		}else {
			Collections.sort(al,new SortByEmpNo());
			for(Employee e:al) {
				System.out.println(e);
			}
		}
	}
	public void sortByEmpName()
	{
		if(al.isEmpty())
		{
			System.out.println("No Employees found in our Database");
			return;
		}
		Collections.sort(al,new SortByEmpName());
		System.out.println("Employees Details are:");
		for(Employee e:al)
		{
			System.out.println(e);
		}
	}
}
