package es.salesianos.model;

import org.springframework.context.annotation.Profile;

@Profile("easy")
public class Easy extends Dificulty {

	public Easy() {

		setTries(20);

	}
}
