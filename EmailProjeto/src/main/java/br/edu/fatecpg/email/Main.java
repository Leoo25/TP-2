package br.edu.fatecpg.email;

import br.edu.fatecpg.email.model.Comentario;
import br.edu.fatecpg.email.service.comentarioService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        comentarioService service = new comentarioService();
        service.processarComentarios();
        List<String> validos = service.getEmailsValidos();
        List<String> invalidos = service.getEmailsInvalidos();
        System.out.println("=== E-Mails Válidos ===");

        validos.forEach(System.out::println);
        System.out.println("\n=== E-Mails Inválidos ===");
        invalidos.forEach(System.out::println);

        System.out.println("\nResumo:");
        System.out.println("Total de válidos: " + service.countValidos());
        System.out.println("Total de inválidos: " + service.countInvalidos());


    }
}