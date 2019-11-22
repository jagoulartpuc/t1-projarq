package pucrs.projarq.t1.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.exception.ParticipantDontExistException;
import pucrs.projarq.t1.util.DataGenerator;
import pucrs.projarq.t1.util.SingletonStudentsList;

@Component
public class TeamDataBase {

    private List<Team> teamsBase = new ArrayList<>();

    public TeamDataBase(){
        Team t1 = new Team();
        t1.setName("Time 1");
        t1.setTeamId("1");
        Student s1 = new Student();
        s1.setName("S1 teste");
        s1.setCpf("190");
        Student s2 = new Student();
        s2.setName("s2 teste");
        s2.setCpf("20");
        s1.setCourse("Ciencia da Computação");
        s2.setCourse("Engenharia de Software");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        t1.setStudents(students);
        teamsBase.add(t1);
    }

    public List<Team> getTeamsBase() {
        return teamsBase;
    }

    public void addTeam(Team team) {
        teamsBase.add(team);
    }

    public Team getById(String  id) {
        for (Team team: teamsBase) {
            if (team.getTeamId().equals(id)) {
                return team;
            }
        }
        return null;
    }

    public Team deleteTeam(Team team) {
        Team aux = team;
        teamsBase.remove(team);
        return aux;
    }

    public void addParticipant(String cpf, String teamId) {
        Student student = getByCpf(cpf);
        if (SingletonStudentsList.getInstance().getStudents().contains(student)) {
            getById(teamId).getStudents().add(student);
        } else {
            throw new ParticipantDontExistException();
        }
    }

    public Student getByCpf(String cpf) {
        for (Student student: SingletonStudentsList.getInstance().getStudents()) {
            if (student.getCpf().equals(cpf)) {
                return student;
            }
        }
        System.out.println("caiu aqui");
        return null;
    }

    public boolean deleteParticipant(Student student, String teamId) {

        return getById(teamId).getStudents().remove(student);
    }
}