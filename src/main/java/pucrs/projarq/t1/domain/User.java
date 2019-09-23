package pucrs.projarq.t1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {

    @JsonProperty("cpf")
    private String cpf;
    @JsonProperty("password")
    private String password;
    @JsonProperty("reviwer")
    private boolean reviewer;
}