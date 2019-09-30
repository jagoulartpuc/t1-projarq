package pucrs.projarq.t1.domain;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class Team {

    private String teamId;
    private String name;
    private List<Student> students = new ArrayList<>();
    private Review review;

}