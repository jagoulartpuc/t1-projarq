package pucrs.projarq.t1.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Review {

    private String working;
    private String process;
    private String pitch;
    private String innovation;
    private String teamFormation;

}