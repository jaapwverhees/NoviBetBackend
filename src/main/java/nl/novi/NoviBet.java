package nl.novi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoviBet {
	//source jwt: 	https://www.techgeeknext.com/spring/spring-boot-security-token-authentication-jwt-mysql;
	//source h2: 	https://www.baeldung.com/spring-boot-h2-database
	public static void main(String[] args) {
		SpringApplication.run(NoviBet.class, args);
	}
}
