package com.yabdioglu.sms;

import com.yabdioglu.sms.entity.Student;
import com.yabdioglu.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Ricardo", "Quaresma", "ricardo@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Alvaro", "Negredo", "alvaro@gmail.com");
//		studentRepository.save(student3);

	}
}
