package maker.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import maker.demo.model.Pedido;
import maker.demo.repository.PedidoRepository;

@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public Pedido criarPedido(Pedido pedido) {
        return repository.save(pedido);
    }

    
    public List<Pedido> listarPedidos() {
        return repository.findAll();
    }

}
