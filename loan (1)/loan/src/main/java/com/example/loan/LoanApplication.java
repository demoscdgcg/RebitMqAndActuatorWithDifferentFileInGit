package com.example.loan;

import com.example.loan.dto.AccountsContectInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {AccountsContectInfoDto.class})
public class LoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanApplication.class, args);
		System.out.println("radhe radhe");
	}

}
