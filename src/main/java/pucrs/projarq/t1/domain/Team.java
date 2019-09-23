package pucrs.projarq.t1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Team implements Serializable {

    
    @JsonProperty(value = "teamId")
    private String teamId;

    @JsonProperty(value = "students")
    private ArrayList<Student> students;
}
