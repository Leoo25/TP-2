package br.edu.fatecpg.email;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        JsonNode rootNode = mapper.readTree(new URL( "https://jsonplaceholder.typicode.com/comments"));
        JsonNode test = rootNode.get(0);
        String email = test.get("email").asText();

        System.out.println(email);
    }
}