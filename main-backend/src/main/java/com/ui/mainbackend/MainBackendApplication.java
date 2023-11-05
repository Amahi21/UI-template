package com.ui.mainbackend;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ui.mainbackend.models.medic.Test;
import com.ui.mainbackend.models.medic.UserModel;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainBackendApplication {
//	public static void main(String[] args) {
//		SpringApplication.run(MainBackendApplication.class, args);
//	}

	public static void main(String[] args) throws JsonProcessingException {
		String firstName = "Matvey";
		String middleName = "Andreevich";
		String lastName = "Bataev";
		String snils = "18455404685";
		UserModel user = new UserModel(firstName, middleName, lastName, snils);

		ObjectMapper objectMapper = new ObjectMapper();
		Test test = new Test("123", "4655464", "afmsdklvn");
		String json = objectMapper.writeValueAsString(test);
		System.out.println(json);
		return;
	}
}
