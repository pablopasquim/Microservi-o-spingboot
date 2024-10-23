package br.com.up.ms_students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsStudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsStudentsApplication.class, args);
	}

}
