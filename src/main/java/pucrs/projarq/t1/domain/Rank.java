package pucrs.projarq.t1.domain;

import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rank {
    private HashMap<Integer, String> ranks;

    public Rank() {
        ranks.put(0, "Ruim");
        ranks.put(1, "Razoável");
        ranks.put(2, "Mediano");
        ranks.put(3, "Bom");
        ranks.put(4, "Ótimo");
        ranks.put(5, "Excelente");
    }
}