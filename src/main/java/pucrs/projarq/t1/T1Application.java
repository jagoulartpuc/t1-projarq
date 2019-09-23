package pucrs.projarq.t1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScan({"pucrs.projarq.t1.controller","pucrs.projarq.t1.domain","pucrs.projarq.t1.repository","pucrs.projarq.t1.service"})
@SpringBootApplication
public class T1Application {

	public static void main(String[] args) {
		SpringApplication.run(T1Application.class, args);
	}

}
