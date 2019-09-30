package pucrs.projarq.t1.domain;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class Reviewer {

    private String cpf;
    private String password;
    private String name;
    private List<Review> reviews = new ArrayList<>();
    private boolean reviewer;


}