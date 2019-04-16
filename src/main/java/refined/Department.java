package refined;

public class Department {
    
    private final Integer id;
    private final String deptid;
    private final String department;
    private final String description;

    public Department(Integer ID, String DeptID, String Department, String Description) {

        this.id = ID;
        this.deptid = DeptID;
        this.department = Department;
        this.description = Description;
    }

    public Integer getID() {
        return id;
    }
    
    public String DeptID() {
        return deptid;
    }

    public String Department() {
        return department;
    }

    public String Description() {
        return description;
    }

}
