package pucrs.projarq.t1.domain;

import java.util.List;


public class Team {

    private static int idGenerator = 0;
    private String teamId;
    private List<Student> students;
    private Review review;


    public Team(String teamId, List<Student> students, Review review) {
        this.teamId = teamId;
        this.students = students;
        this.review = review;
    }

    public Team(String teamId, List<Student> students) {
        this.teamId = teamId;
        this.students = students;
    }

    public Team() {
        int id = idGenerator++;
        this.teamId = String.valueOf(id);
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
