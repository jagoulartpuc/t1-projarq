package pucrs.projarq.t1.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Team {

    private String teamId;
    private List<Student> students;
}
