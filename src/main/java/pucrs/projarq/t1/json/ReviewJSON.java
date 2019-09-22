package pucrs.projarq.t1.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import pucrs.projarq.t1.domain.Review;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ReviewJSON {

    private String working;
    private String process;
    private String pitch;
    private String inovation;
    private String teamFormation;

    public static ReviewJSON toJson(Review review) {
        ReviewJSON json = new ReviewJSON();
        json.working = review.getWorking();
        json.process = review.getProcess();
        json.pitch = review.getPitch();
        json.inovation = review.getInovation();
        json.teamFormation = review.getTeamFormation();

        return json;
    }

    public static Review from(ReviewJSON json) {
        return new Review(json.working, json.process, json.pitch, json.inovation, json.teamFormation);
    }
}

