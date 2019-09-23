package pucrs.projarq.t1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Student extends User{

    @JsonProperty("name")
    private String name;
    @JsonProperty("course")
    private String course;





}