package com.atl.edusoftware

import com.atl.edusoftware.business.services.QuizService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
 class EducationalSoftwareApplication {

	 static void main(String[] args) {
		SpringApplication.run(EducationalSoftwareApplication.class, args)
	}
}
