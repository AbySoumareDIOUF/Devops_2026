package uahb.devops.githubDevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubDevopsApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello World from GitHub DevOps Spring Boot in Docker!";
	}
	
	@GetMapping("/health")
	public String health() {
		return "OK";
	}
}
