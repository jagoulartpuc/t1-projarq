package pucrs.projarq.t1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class Team implements Serializable {

    @JsonProperty(value = "teamId")
    private String teamId;
    @JsonProperty(value = "students")
    private ArrayList<Student> students;
}
