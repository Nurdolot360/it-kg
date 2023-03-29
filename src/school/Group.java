package school;
public class Group extends Company{
    private String groupName;
    private String howManyStudents;

    public Group() {
    }

    public Group(String name, String address, String phoneNumber,
                 String groupName, String howManyStudents) {
        super(name, address, phoneNumber);
        this.groupName = groupName;
        this.howManyStudents = howManyStudents;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getHowManyStudents() {
        return howManyStudents;
    }

    public void setHowManyStudents(String howManyStudents) {
        this.howManyStudents = howManyStudents;
    }

    @Override
    public String toString() {
        return "Group: " +
                "groupName: " + groupName + '\'' +
                "howManyStudents: " + howManyStudents + "\n";
    }
}

