package io.github.joaoroche.agendaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaApiApplication {

	/*@Bean
	public CommandLineRunner commandLineRunner(
			@Autowired ContatoRepositoy repositoy){
		return args -> {
			Contato contato = new Contato();
			contato.setNome("Joao");
			contato.setEmail("JoaoCarlos@gmail.com");
			contato.setFavorito(false);
			repositoy.save(contato);
		};
	}*/

	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
