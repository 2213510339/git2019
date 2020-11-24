package uml;


public class Group {
    private String name;
    private Student [] students;
    public Group() {
        this.students = new Student[10];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
