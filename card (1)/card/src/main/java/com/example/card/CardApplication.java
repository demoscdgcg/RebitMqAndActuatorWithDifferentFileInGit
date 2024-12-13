package com.example.card;
import com.example.card.dto.AccountsContectInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {AccountsContectInfoDto.class})
public class CardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardApplication.class, args);
		System.out.println("radhe radhe");
	}

}
