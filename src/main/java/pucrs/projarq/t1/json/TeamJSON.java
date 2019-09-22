package pucrs.projarq.t1.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;
import pucrs.projarq.t1.domain.Review;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class TeamJSON {

    private String teamId;
    private List<Student> students;
    private Review review;

    public static TeamJSON toJson(Team team) {
        TeamJSON json = new TeamJSON();
        json.teamId = team.getTeamId();
        json.students = team.getStudents();
        json.review = team.getReview();

        return json;
    }

    public static Team from(TeamJSON json) {
        Team team = new Team();
        team.setTeamId(json.teamId);
        team.setStudents(json.students);
        team.setReview(json.review);

        return team;
    }

}