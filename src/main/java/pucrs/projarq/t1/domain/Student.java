package pucrs.projarq.t1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name;
    private String course;
    private String cpf;
    private String password;
    private boolean reviewer;


}