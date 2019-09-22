package pucrs.projarq.t1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pucrs.projarq.t1.domain.Review;
import pucrs.projarq.t1.domain.Reviewer;
import pucrs.projarq.t1.repository.ReviewerDataBase;

@Service
public class ReviewerService {

    @Autowired
    private ReviewerDataBase reviewerBase;

    public void insert(Reviewer reviewer) {
        reviewerBase.addReviewer(reviewer);
    }

    public void insert(Review review, String cpf) {
        reviewerBase.getByCpf(cpf).getReviews().add(review);
    }

    public List<Reviewer> findAll() {
        return reviewerBase.getReviewersBase();
    }

    public Reviewer update(Reviewer reviewer) {
        return reviewerBase.updateReviewer(reviewer);
    }

    public Reviewer findByCpf(String cpf) {
        return reviewerBase.getByCpf(cpf);
    }

    public Reviewer delete(Reviewer reviewer) {
        return reviewerBase.deleteReviewer(reviewer);
    }

    public void insertReviewToTeam(String teamId, Review review) {
        reviewerBase.addReviewtoTeam(teamId, review);
    }
}
