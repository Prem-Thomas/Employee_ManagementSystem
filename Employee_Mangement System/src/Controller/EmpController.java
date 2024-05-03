package Controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import service.EmpService;

public class EmpController
{
	public static void main(String[] args)
	{
		EmpService service = new EmpService();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Select The Option :-");
			System.out.println("1. Add Employee : \n2. Update Employee Details : \n3. Get Employee Details By EmpNo : \n4. Get All Employee Details : \n5. Remove Employee : \n6. Sort Emp By Their Name : \n7. Sort Emp By The Their Age : \n8. Exit :");
			int opt=0;
			try {
				opt=sc.nextInt(); // 1
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input. Please enter a Number.");
			}
			switch (opt) {
			case 1: {
				
				service.addEmployee();
				break;
			}
            case 2: {
				
				service.updateEmployee();
				break;
			}
           case 3: {
	
	            service.findByEmpNo();
	            break;
             }
           case 4: {
	
	            service.findAll();
	            break;
              }
           case 5: {
	
	            service.deleteByEmpNo();
	            break;
              }
           case 6: {
	
	            service.sortByEmpName();
	            break;
                }
           case 7: {
				
				service.sortByEmpNo();
				break;
			}
           case 8: {
				System.out.println("Thank You!! visit Again");
				System.exit(0);
				break;
				
			}
			default:
               System.out.println("Please Select Correct Option!!");
			}
		}
	}

}
