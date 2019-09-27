package pucrs.projarq.t1.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pucrs.projarq.t1.domain.Review;
import pucrs.projarq.t1.domain.Reviewer;

@Component
public class ReviewerDataBase {

    private List<Reviewer> reviewersBase = new ArrayList<>();

    public List<Reviewer> getReviewersBase() {
        return reviewersBase;
    }

    @Autowired
    private TeamDataBase teamBase;

    public void addReviewer(Reviewer reviewer) {
        reviewersBase.add(reviewer);
    }

    public Reviewer getByCpf(String cpf) {
        for (Reviewer reviewer: reviewersBase) {
            if (reviewer.getCpf().equals(cpf)) {
                return reviewer;
            }
        }
        return null;
    }

    public Reviewer deleteReviewer(Reviewer reviewer) {
        Reviewer aux = reviewer;
        reviewersBase.remove(reviewer);
        return aux;
    }

    public Reviewer updateReviewer(Reviewer newRev) {
        Reviewer reviewer = getByCpf(newRev.getCpf());
        reviewer.setName(newRev.getName());
        reviewer.setPassword(newRev.getPassword());
        reviewer.setReviews(newRev.getReviews());
        return reviewer;
    }

    public void addReviewtoTeam(String teamId, Review review) {
        teamBase.getById(teamId).setReview(review);
    }


}
