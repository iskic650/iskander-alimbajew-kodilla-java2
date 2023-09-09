package com.kodilla;

import com.kodilla.good.patterns.challenges.MovieStore;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaGoodPatternsApplication {

	public static void main(String[] args) {
		MovieStore movieStore = new MovieStore();
		movieStore.getMovies().values().stream().forEach(m -> System.out.print(m + "!"));
	}
}
