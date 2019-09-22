package pucrs.projarq.t1.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;
import pucrs.projarq.t1.domain.Review;
import pucrs.projarq.t1.domain.Reviewer;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ReviewerJSON {

    String cpf;
    String password;
    String name;
    List<Review> reviews;
    boolean reviewer;

    public static ReviewerJSON toJson(Reviewer reviewer) {
        ReviewerJSON json = new ReviewerJSON();
        json.cpf = reviewer.getCpf();
        json.name = reviewer.getName();
        json.password = reviewer.getPassword();
        json.reviewer = reviewer.isReviewer();
        return json;
    }

    public static Reviewer from(ReviewerJSON json) {
        return new Reviewer(json.cpf, json.password, json.name, json.reviews);
    }
}

