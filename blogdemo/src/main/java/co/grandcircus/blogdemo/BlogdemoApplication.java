package co.grandcircus.blogdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogdemoApplication.class, args);
		System.out.println("BLOGGING APP");
	}

}
