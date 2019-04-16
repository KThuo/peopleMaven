package people;


public class EmpSalary {

    private final String empid;
    private final String firstname;
    private final String lastname;
    private final String department;
    private final String title;
    private final String salary;
    
    
    public EmpSalary(String EmpID, String FirstName, String LastName, String Department, String Title,String Salary){

        this.empid = EmpID;
        this.firstname = FirstName;
        this.lastname = LastName;
        this.department = Department;
        this.title = Title;
        this.salary = Salary;
    }

    public String getEmpID(){
        return empid;
    }

    public String FirstName(){
        return firstname;
    }
    
    public String LastName(){
        return lastname;
    }
    
    public String Department() {
        return department;
    }
    
    public String Title() {
        return title;
    }
  
    public String Salary(){
        return salary;
    }
}
