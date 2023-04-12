package br.com.taking.DashboarMCIO;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashboarMcioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashboarMcioApplication.class, args);
		
		  System.out.println("Hello, World!");

	        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
	        URI endereco = URI.create(url);
	        HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
	        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
	        String body = response.body();
	      

	        JsonParser parser = new JsonParser();
	        List<Map<String, String>> listaDeFIlmes = parser.parse(body);
	        System.out.println(listaDeFIlmes.size());

	        for (Map<String,String> filme : listaDeFIlmes) {
	            System.out.println(filme.get());
	            

	        }
	}

}
