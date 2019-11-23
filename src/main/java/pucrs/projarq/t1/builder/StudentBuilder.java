package pucrs.projarq.t1.builder;

import pucrs.projarq.t1.domain.Student;

public class StudentBuilder {

    private Student student;

    public StudentBuilder() {
        student = new Student();
    }

    public StudentBuilder withId(int id) {
        student.setId(id);
        return this;
    }

    public StudentBuilder withName(String name) {
        student.setName(name);
        return this;
    }

    public StudentBuilder withFullname(String fullname) {
        student.setFullname(fullname);
        return this;
    }

    public StudentBuilder withPassword(String password) {
        student.setPassword(password);
        return this;
    }

    public StudentBuilder withCpf(String cpf) {
        student.setCpf(cpf);
        return this;
    }

    public StudentBuilder withCourse(String course) {
        student.setCourse(course);
        return this;
    }

    public Student build(){
        return student;
    }
}
