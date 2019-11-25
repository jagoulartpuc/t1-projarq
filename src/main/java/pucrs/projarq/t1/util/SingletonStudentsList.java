package pucrs.projarq.t1.util;

import lombok.Getter;
import pucrs.projarq.t1.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Getter
public class SingletonStudentsList {

	private static SingletonStudentsList uniqueInstance;
	private List<Student> students;

	private SingletonStudentsList() {
		students = new ArrayList<>(DataGenerator.generateStudents());
	}

	public static synchronized SingletonStudentsList getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new SingletonStudentsList();

		return uniqueInstance;
	}

}
