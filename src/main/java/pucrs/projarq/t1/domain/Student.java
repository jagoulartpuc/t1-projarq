package pucrs.projarq.t1.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {

    private String cpf;
    private String name;
    private String course;
    private String password;

}