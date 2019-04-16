package refined;


public class EmpSalary {

    private final Integer id;
    private final String empid;
    private final String firstname;
    private final String lastname;
    private final String department;
    private final String title;
    private final String salary;
    
    
    public EmpSalary(Integer ID, String EmpID, String FirstName, String LastName, String Department, String Title,String Salary){

        this.empid = EmpID;
        this.id = ID;
        this.firstname = FirstName;
        this.lastname = LastName;
        this.department = Department;
        this.title = Title;
        this.salary = Salary;
    }

    public Integer getID(){
        return id;
    }

    public String EmpID(){
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
