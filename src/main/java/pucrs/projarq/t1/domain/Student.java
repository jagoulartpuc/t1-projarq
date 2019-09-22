package pucrs.projarq.t1.domain;

public class Student extends User{

    private String name;
    private String course;

    public Student() {
        super();
    }

    public Student(String cpf, String password, String name, String course) {
        super(cpf, password, false);
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }




}