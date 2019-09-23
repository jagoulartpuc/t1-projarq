package pucrs.projarq.t1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student extends User{

    @JsonProperty("name")
    private String name;
    @JsonProperty("course")
    private String course;





}