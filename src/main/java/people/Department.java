package people;

public class Department {
    
    private final String deptid;
    private final String department;
    private final String description;

    public Department(String DeptID, String Department, String Description) {

        this.deptid = DeptID;
        this.department = Department;
        this.description = Description;
    }

    public String getDeptID() {
        return deptid;
    }

    public String Department() {
        return department;
    }

    public String Description() {
        return description;
    }

}
