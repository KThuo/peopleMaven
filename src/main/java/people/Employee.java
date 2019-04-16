package people;


public class Employee {

    private final String empid;
    private final String firstname;
    private final String lastname;
    private final String gender;
    private final String phone;
    private final String email;
    private final String empdate;
    private final String department;
    private final String title;
    
    
    public Employee(String EmpID, String FirstName, String LastName, String Gender, String Department, String Title, String Phone, String Email, String EmpDate){

        this.empid = EmpID;
        this.firstname = FirstName;
        this.lastname = LastName;
        this.gender = Gender;
        this.department = Department;
        this.title = Title;
        this.phone = Phone;
        this.email = Email;
        this.empdate = EmpDate;
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
    
    public String Gender(){
        return gender;
    }
    
    public String Department() {
        return department;
    }
    
    public String Title() {
        return title;
    }
        
    public String Phone(){
        return phone;
    }
    
    public String Email(){
        return email;
    }
    
    public String EmpDate(){
        return empdate;
    }
    
}
