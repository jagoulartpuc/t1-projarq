package pucrs.projarq.t1.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Reviewer {

    private String cpf;
    private String name;
    private String course;
    private String password;
    private List<Review> reviews;



}