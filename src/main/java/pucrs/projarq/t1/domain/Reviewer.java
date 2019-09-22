package pucrs.projarq.t1.domain;

import java.util.List;

public class Reviewer extends User {

    private String name;
    private List<Review> reviews;
    private boolean reviewer;

    public Reviewer(String cpf, String password, String name, List<Review> reviews) {
        super(cpf, password, true);
        this.name = name;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public boolean isReviewer() {
        return true;
    }

}