package maker.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import maker.demo.DTO.ClienteDTO;
import maker.demo.DTO.EnderecoEntregaDTO;
import maker.demo.DTO.ProdutoDTO;
import maker.demo.model.Cliente;
import maker.demo.model.Endereco;
import maker.demo.model.Pedido;
import maker.demo.model.Produto;
import maker.demo.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;
    @Autowired
    private ProdutoService produtoService;


    public Pedido criarPedido(Pedido pedido) {
        if (pedido.getDados_cliente() != null && !pedido.getDados_cliente().isEmpty()) {
            ClienteDTO clienteDTO = pedido.getDados_cliente().get(0);
            Cliente cliente = new Cliente();
            cliente.setNome(clienteDTO.getNome());
            cliente.setPf_pj(clienteDTO.getPf_pj());
            cliente.setCpf_cnpj(clienteDTO.getCpf_cnpj());
            cliente.setRg(clienteDTO.getRg());
            cliente.setEndereco(clienteDTO.getEnderecos());
            for (Endereco endereco : clienteDTO.getEnderecos()) {
                endereco.setCliente(cliente);
            }
            cliente.setEmail(clienteDTO.getEmail());
            cliente.setEmail_nfe(clienteDTO.getEmail_nfe());
            pedido.setCliente(cliente);

            if (clienteDTO.getEndereco_entrega() != null && !clienteDTO.getEndereco_entrega().isEmpty()) {
                EnderecoEntregaDTO enderecoDTO = clienteDTO.getEndereco_entrega().get(0);
                Endereco endereco = new Endereco();
                endereco.setLogradouro(enderecoDTO.getLogradouro());
                endereco.setBairro(enderecoDTO.getBairro());
                endereco.setCep(enderecoDTO.getCep());
                endereco.setCidade(enderecoDTO.getCidade());
                endereco.setEstado(enderecoDTO.getEstado());
                endereco.setComplemento(enderecoDTO.getComplemento());
                endereco.setCliente(cliente);
                pedido.setEndereco_entrega(endereco);
            }
        }
        if (pedido.getProdutos() != null && !pedido.getProdutos().isEmpty()) {
            ProdutoDTO produtoDTO = produtoService.buscarProdutoMockbin();
            Produto produto = pedido.getProdutos().get(0);
            produtoService.atualizarDescricaoProdutoViaReflection(produto, produtoDTO);
        }
        return repository.save(pedido);

    }

}
