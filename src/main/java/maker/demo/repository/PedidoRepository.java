package maker.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import maker.demo.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    

}