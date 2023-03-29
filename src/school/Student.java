package school;

public class Student extends Group{
    private long id;
    private String password;
    private String name;

    public Student (){

    }
    public Student(long id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "\nYou're name is: " + name;
    }
}
