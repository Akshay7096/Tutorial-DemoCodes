package com.tutorial.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.Struct;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TutorialApplication {



	public static void main(String[] args) {
	   ApplicationContext app =  SpringApplication.run(TutorialApplication.class, args);

	   Student student = app.getBean(Student.class);
	   student.show();
	}
}
