package pucrs.projarq.t1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {

    private static int idGenerator = 0;

    @JsonProperty("cpf")
    private String cpf;
    @JsonProperty("password")
    private String password;
    @JsonProperty("reviewer")
    private boolean reviewer;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isReviewer() {
        return reviewer;
    }

    public void setReviewer(boolean reviewer) {
        this.reviewer = reviewer;
    }
}
