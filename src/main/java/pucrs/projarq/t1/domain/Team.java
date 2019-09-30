package pucrs.projarq.t1.domain;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonProperty;
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> origin/jose
import lombok.Data;
import org.springframework.stereotype.Component;


<<<<<<< HEAD
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class Team implements Serializable {

    @JsonProperty(value = "id")
    private int id;
    @JsonProperty(value = "students")
    private ArrayList<Student> students;
    private String name;
}
=======
@Data
@Component
public class Team {

    private String teamId;
    private String name;
    private List<Student> students = new ArrayList<>();
    private Review review;

}
>>>>>>> origin/jose
