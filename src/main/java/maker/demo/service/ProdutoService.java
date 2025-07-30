package maker.demo.service;

import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import maker.demo.DTO.ProdutoDTO;
import maker.demo.model.Produto;

@Service
public class ProdutoService {

    @Autowired
    private RestTemplate restTemplate;

    public ProdutoDTO buscarProdutoMockbin() {
        String url = "https://992ac54cc7ba4c8c887aafce93da7b4b.api.mockbin.io";
        return restTemplate.getForObject(url, ProdutoDTO.class);
    }

    public void atualizarDescricaoProdutoViaReflection(Produto produto, ProdutoDTO produtoDTO) {
        try {
            Field descricaoField = produto.getClass().getDeclaredField("descricao");
            descricaoField.setAccessible(true);
            descricaoField.set(produto, produtoDTO.getDescricao());
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException e) {
            System.err.println("Erro ao atualizar o campo 'descricao': " + e.getMessage());
        }
    }
}
