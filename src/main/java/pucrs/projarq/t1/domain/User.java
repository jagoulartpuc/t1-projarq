package pucrs.projarq.t1.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {

    private static int idGenerator = 0;

    private String cpf;
    private String password;
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
