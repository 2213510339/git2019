package uml;

import java.util.List;

public class Student extends Person{
    private String classroom;
    private Address address;
    private StudentCard studentCard;
    public Student() {
        studentCard = new StudentCard();
        studentCard.setId(12345678);
    }
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    @Override
    public void say() {
        System.out.println("我是student, Address");
    }
    public void eat(Pig pig) {
        pig.eat();
    }
}
