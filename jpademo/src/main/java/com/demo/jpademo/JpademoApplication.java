package com.demo.jpademo;

import com.demo.jpademo.models.Author;
import com.demo.jpademo.models.Video;
import com.demo.jpademo.repositories.AuthorRepository;
import com.demo.jpademo.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpademoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository authorRepository,
            VideoRepository videoRepository
    ) {
        return args -> {
//			var author = Author.builder()
//                    .firstName("Tim")
//                    .lastName("ABC")
//                    .age(23)
//                    .email("abc@mail.com")
//                    .build();
//            authorRepository.save(author);

            var video = Video.builder()
                    .name("asd")
                    .length(5)
                    .build();
            videoRepository.save(video);
        };
    }

    ;
}
