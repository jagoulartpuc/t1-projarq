package pucrs.projarq.t1.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import pucrs.projarq.t1.domain.Student;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class StudentJSON {

    String cpf;
    String password;
    String name;
    String course;
    boolean reviewer;

    public static StudentJSON toJson(Student student) {
        StudentJSON json = new StudentJSON();
        json.cpf = student.getCpf();
        json.name = student.getName();
        json.course = student.getCourse();
        json.password = student.getPassword();
        json.reviewer = student.isReviewer();

        return json;
    }

    public static Student from(StudentJSON json) {
        Student student = new Student();

        student.setCourse(json.course);
        student.setName(json.name);
        student.setCpf(json.cpf);
        student.setPassword(json.password);
        student.setReviewer(false);

        return student;
    }

}