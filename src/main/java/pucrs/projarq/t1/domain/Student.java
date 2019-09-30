package pucrs.projarq.t1.domain;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
=======
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
>>>>>>> origin/jose
import org.springframework.stereotype.Component;

@Data
@Component
<<<<<<< HEAD
public class Student extends User{
=======
@AllArgsConstructor
@NoArgsConstructor
public class Student {
>>>>>>> origin/jose

    private static int idGenerator = 0;

    private int id;
    private String name;
    private String course;
<<<<<<< HEAD
=======
    private String cpf;
    private String password;
    private boolean reviewer;

>>>>>>> origin/jose

}