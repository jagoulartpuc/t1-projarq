package pucrs.projarq.t1.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Review {

    private Rank working;
    private Rank process;
    private Rank pictch;
    private Rank inovation;
    private Rank teamFormation;

}