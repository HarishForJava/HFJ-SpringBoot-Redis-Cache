package com.hfj.bookmarker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author HFJ
 *
 */
@SpringBootApplication
@EnableJpaAuditing
@EnableCaching
public class BookmarkersApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmarkersApplication.class, args);
	}
}
