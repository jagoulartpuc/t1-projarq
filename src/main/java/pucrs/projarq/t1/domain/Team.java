package pucrs.projarq.t1.domain;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Team {

    private static int idGenerator = 0;

    public Team(){
        int id = idGenerator++;
        this.teamId = Integer.toString(id);
    }

    private String teamId;
    private String name;
    private List<Student> students = new ArrayList<>();
    private Review review = new Review();

    public Team(String name, List<Student> students) {
    	int id = idGenerator++;
        this.teamId = Integer.toString(id);
        this.name = name;
        this.students = students;
    }
}
