package pucrs.projarq.t1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.repository.TeamRepository;

@Service
public class TeamService {

<<<<<<< HEAD
    @Autowired
    TeamRepository teamRepository;

    public boolean save(Team team) {
        return teamRepository.save(team);
    }

    public List<Team> all(){
        return teamRepository.all();
    }

    public Team getById(int id){
        return teamRepository.getById(id);
=======
    private TeamDataBase teamDataBase;

    @Autowired
    public TeamService(TeamDataBase teamDataBase){
        this.teamDataBase = teamDataBase;
    }

    public void  insert(Team team) {
        if(team.getStudents() == null || team.getStudents().isEmpty()) {
            teamDataBase.addTeam(team);
        }
        else if (validateTeam(team)) {
            teamDataBase.addTeam(team);
        } else {
            throw new NotAValidTeamException();
        }
    }

    private boolean validateTeam(Team team) {
        int countES = 0, countCC = 0, countEC = 0, countSI = 0;
        for (Student student: team.getStudents()) {
            if (student.getCourse().equals("Engenharia de Software")) {
                countES++;
            } else if (student.getCourse().equals("Ciência da Computação")) {
                countCC++;
            } else if (student.getCourse().equals("Engenharia da Computação")) {
                countEC++;
            } else if (student.getCourse().equals("Sistemas de Informação")) {
                countSI++;
            }
        }

        return (countES < team.getStudents().size() || countCC < team.getStudents().size() ||
                countEC < team.getStudents().size() || countSI < team.getStudents().size());
    }

    public List<Team> findAll() {
        return teamDataBase.getTeamsBase();
    }

    public Team findById(String id) {
        return teamDataBase.getById(id);
    }

    public Team delete(Team team) {
        return teamDataBase.deleteTeam(team);
    }

    public void insertParticipant(Student participant, String teamId) {
        teamDataBase.addParticipant(participant, teamId);
    }

    public boolean removeParticipant(String cpf, String teamId) {
        return teamDataBase.removeParticipant(cpf, teamId);
>>>>>>> origin/jose
    }
}
