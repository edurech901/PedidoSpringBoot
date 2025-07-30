package maker.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import maker.demo.DTO.ProdutoDTO;
import maker.demo.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ProdutoDTO buscarProduto() {
        return produtoService.buscarProdutoMockbin();
    }
}
