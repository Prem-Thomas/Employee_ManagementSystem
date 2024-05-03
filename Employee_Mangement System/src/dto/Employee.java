package dto;

public class Employee 
{
	private int empno,eage;
	private String ename,edesignation;
	private long ephone;
	private double sal;
	
	public Employee(int empno, int eage, String ename, String edesignation, long ephone, double sal) {
		super();
		this.empno = empno;
		this.eage = eage;
		this.ename = ename;
		this.edesignation = edesignation;
		this.ephone = ephone;
		this.sal = sal;
	}

	public Employee() {
		super();
		
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdesignation() {
		return edesignation;
	}

	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}

	public long getEphone() {
		return ephone;
	}

	public void setEphone(long ephone) {
		this.ephone = ephone;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp No : " + this.empno + ", Emp Name : " + this.ename + ", Emp Phone=" + this.ephone + ", Emp Age is : " + this.eage
				+ ",Emp Job is : " + this.edesignation + ", Emp Sal is : " + this.sal;
	}

	
	
	
	

}
