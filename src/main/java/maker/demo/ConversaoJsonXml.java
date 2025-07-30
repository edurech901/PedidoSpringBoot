package maker.demo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ConversaoJsonXml {
    public static void main(String[] args) {
        try {
            File inputJson = new File("exemplo-modelo-dados.json");

            File outputXml = new File("exemplo-modelo-dados.xml");

            ObjectMapper jsonMapper = new ObjectMapper();
            JsonNode jsonTree = jsonMapper.readTree(inputJson);

            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(outputXml, jsonTree);

            System.out.println("Conversão realizada com sucesso! Arquivo gerado: saida.xml");

        } catch (IOException e) {
            System.err.println("Erro ao converter JSON para XML: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}
