package refined;

public class Users {
    
    private final Integer id;
    private final String empid;
    private final String username;
    private final String password;
    private final String role;

    public Users(Integer ID, String EmpID, String Username, String Password, String Role) {

        this.id = ID;
        this.empid = EmpID;
        this.username = Username;
        this.password = Password;
        this.role= Role;
    }

    public Integer getID() {
        return id;
    }

    public String EmpID() {
        return empid;
    }

    public String Username() {
        return username;
    }

    public String Password() {
        return password;
    }

    public String Role() {
        return role;
    }

}
