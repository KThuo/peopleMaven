package people;

public class Title {

    private final String titleid;
    private final String title;
    private final String description;
    private final String salary;

    public Title(String TitleID, String Title, String Description, String Salary) {

        this.titleid = TitleID;
        this.title = Title;
        this.description = Description;
        this.salary = Salary;
    }

    public String getTitleID() {
        return titleid;
    }

    public String Title() {
        return title;
    }

    public String Description() {
        return description;
    }

    public String Salary() {
        return salary;
    }

}
