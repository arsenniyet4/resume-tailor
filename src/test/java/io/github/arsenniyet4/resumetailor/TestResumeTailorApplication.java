package io.github.arsenniyet4.resumetailor;

import org.springframework.boot.SpringApplication;

public class TestResumeTailorApplication {

	public static void main(String[] args) {
		SpringApplication.from(ResumeTailorApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
