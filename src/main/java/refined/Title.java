package refined;

public class Title {

    private final Integer id;
    private final String titleid;
    private final String title;
    private final String description;
    private final String salary;

    public Title(Integer ID, String TitleID, String Title, String Description, String Salary) {

        this.id = ID;
        this.titleid = TitleID;
        this.title = Title;
        this.description = Description;
        this.salary = Salary;
    }

    public Integer getID() {
        return id;
    }

    public String TitleID() {
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
