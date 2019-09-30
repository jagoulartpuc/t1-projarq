package pucrs.projarq.t1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student extends User {

    private static int idGenerator = 0;

    private int id;
    private String name;
    private String course;

}