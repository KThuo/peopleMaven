package people;

public class Users {
    
    private final String empid;
    private final String username;
    private final String password;
    private final String role;

    public Users(String EmpID, String Username, String Password, String Role) {

        this.empid = EmpID;
        this.username = Username;
        this.password = Password;
        this.role= Role;
    }

    public String getEmpID() {
        return empid;
    }

    public String Username() {
        return username;
    }

    public String Password() {
        return password;
    }

    public String Roll() {
        return role;
    }

}
