package pucrs.projarq.t1.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import pucrs.projarq.t1.domain.Student;

public class DataGenerator {

    public static List<Student> generateStudents() {

        List<Student> students = new ArrayList<>();
        Random r = new Random();

        String[] cpfs = {"028.629.580-69", "071.123.542-21", "324.564.137-00", "122.080.240-01", "090.009.179-12",
                "010.440.410-23", "101.020.120-20", "100.400.181-20", "030.343.201-53", "404.205.324-01",
                "395.284.180-02", "021.222.878-90"};

        String[] names = {"Cecília", "Joaquim", "Eloá", "Samuel", "Giovanna", "Henrique", "Maria Clara", "Rafael",
                "Maria Eduarda", "Guilherme", "Mariana", "Enzo", "Lara", "Murilo", "Beatriz", "Benício", "Antonella",
                "Gustavo", "Maria Júlia", "Isaac", "Emanuelly", "João Miguel", "Isadora", "Lucca", "Helena",
                "Miguel", "Alice", "Arthur", "Laura", "Heitor", "Manuela", "Bernardo", "Valentina",
                "Davi", "Sophia", "Théo", "Isabella", "Lorenzo", "Heloísa", "Gabriel", "Luiza", "Pedro", "Júlia",
                "Benjamin", "Lorena", "Matheus", "Lívia", "Lucas", "Maria Luiza", "Nicolas"};

        String[] lastNames = {"Bottega", "Botteon", "Botti", "Bourguignon", "Bozi", "Bozzi", "Bozzoli", "Braceschi",
                "Braga", "Bragagnolo", "Bragato", "da Fraga", "da Silva", "de Albergaria", "De Angeli", "de Assis",
                "de Avila", "De Biase", "de Camargo", "de Candia", "de Figueiredo", "Pereira", "Possebon", "Pacheca",
                "Pacheco", "Pachequa", "Paes", "Pagani", "Pagot", "Pagoto", "Pagotte", "Pagotto", "Paiva"};

        String[] courses = {"Engenharia de Software", "Ciência da Computação", "Engenharia da Computação",
                "Sistemas de Informação"};


        String[] passwords = {"324543g43e", "43tgrt5hb5", "fdsf24v4354gr3e", "43gth767f", "hasdbihw", "f3fd34",
                "fedf4f5gf", "dsgvf43g4g4", "swqafdjuy54", "23434t43gd", "vfdv4tr43", "dfsf43r43", "csac34r43",
                "fwsdef32r", "sdf32fr3f", "fewf43434", "fwef4444rf4", "sadfewrfg7u8", "jnhys3435s", "sd73yh6634"};



            students.add(new Student(cpfs[r.nextInt(cpfs.length)], fullname, courses[r.nextInt(courses.length)],
                    passwords[r.nextInt(passwords.length)], false));
        }

        return students;
}

}
