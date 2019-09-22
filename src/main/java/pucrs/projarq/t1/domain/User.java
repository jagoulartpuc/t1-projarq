package pucrs.projarq.t1.domain;

public class User {

    private String cpf;
    private String password;
    private boolean reviewer;


    public User(String cpf, String password, boolean reviewer) {
        this.cpf = cpf;
        this.password = password;
        this.reviewer = reviewer;
    }

    public User() {

    }

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
