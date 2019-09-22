package pucrs.projarq.t1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pucrs.projarq.t1.domain.Review;
import pucrs.projarq.t1.domain.Reviewer;
import pucrs.projarq.t1.json.ReviewJSON;
import pucrs.projarq.t1.json.ReviewerJSON;
import pucrs.projarq.t1.service.ReviewerService;

@RestController
@RequestMapping("/t1/reviewer")
public class ReviewerController {

    @Autowired
    private ReviewerService service;

    @PostMapping
    public ReviewerJSON postReviewer(
            @RequestBody ReviewerJSON reviewerJSON
    ) {
        Reviewer reviewer = ReviewerJSON.from(reviewerJSON);
        service.insert(reviewer);

        return ReviewerJSON.toJson(reviewer);
    }

    @PostMapping("/review")
    public ReviewJSON postReview(
            @RequestBody ReviewJSON reviewJSON,
            @RequestParam String cpf
    ) {
        Review review = ReviewJSON.from(reviewJSON);
        service.insert(review, cpf);

        return ReviewJSON.toJson(review);
    }



    @GetMapping
    public List<Reviewer> getAll() {
        return service.findAll();
    }

    @GetMapping("/{cpf}")
    public Reviewer get(
            @PathVariable("cpf") String cpf
    ) {
        return service.findByCpf(cpf);
    }

    @DeleteMapping("/{cpf}")
    public Reviewer deleteReviewer(
            @PathVariable("cpf") String cpf
    ) {

        return service.delete(service.findByCpf(cpf));
    }


}
