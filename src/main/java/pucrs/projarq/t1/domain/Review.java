package pucrs.projarq.t1.domain;


public class Review {

    private String working;
    private String process;
    private String pitch;
    private String inovation;
    private String teamFormation;

    public Review(String working, String process, String pitch, String inovation, String teamFormation) {
        this.working = working;
        this.process = process;
        this.pitch = pitch;
        this.inovation = inovation;
        this.teamFormation = teamFormation;
    }

    public Review() {

    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    public String getInovation() {
        return inovation;
    }

    public void setInovation(String inovation) {
        this.inovation = inovation;
    }

    public String getTeamFormation() {
        return teamFormation;
    }

    public void setTeamFormation(String teamFormation) {
        this.teamFormation = teamFormation;
    }
}