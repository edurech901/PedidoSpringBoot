package maker.demo.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import maker.demo.DTO.ClienteDTO;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int filial;
    private double quantidade;
    private double total;
    private String tipo_pedido;
    private String cod_tabela_preco_venda;
    private String cod_pedidov;
    private String n_pedido_cliente;
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.PERSIST)
    private List<Lancamento> lancamentos;
    private LocalDate data_entrega;
    private String obs;
    private double v_frete;
    private double usr_c_frete;
    private int tipo_frete;
    private String nome_transportadora;
    private String cnpj_transportadora;
    private int modalidade_frete;
    private LocalDate datahora_expedicao;
    private LocalDate data_emissao;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco_entrega;
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private List<Produto> produtos;
    @Transient
    private ClienteDTO dados_cliente;

    public Pedido() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFilial() {
        return filial;
    }

    public void setFilial(int filial) {
        this.filial = filial;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTipo_pedido() {
        return tipo_pedido;
    }

    public void setTipo_pedido(String tipo_pedido) {
        this.tipo_pedido = tipo_pedido;
    }

    public String getCod_tabela_preco_venda() {
        return cod_tabela_preco_venda;
    }

    public void setCod_tabela_preco_venda(String cod_tabela_preco_venda) {
        this.cod_tabela_preco_venda = cod_tabela_preco_venda;
    }

    public String getCod_pedidov() {
        return cod_pedidov;
    }

    public void setCod_pedidov(String cod_pedidov) {
        this.cod_pedidov = cod_pedidov;
    }

    public String getN_pedido_cliente() {
        return n_pedido_cliente;
    }

    public void setN_pedido_cliente(String n_pedido_cliente) {
        this.n_pedido_cliente = n_pedido_cliente;
    }

    public List<Lancamento> getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(List<Lancamento> lancamentos) {
        this.lancamentos = lancamentos;
    }

    public LocalDate getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(LocalDate data_entrega) {
        this.data_entrega = data_entrega;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public double getV_frete() {
        return v_frete;
    }

    public void setV_frete(double v_frete) {
        this.v_frete = v_frete;
    }

    public double getUsr_c_frete() {
        return usr_c_frete;
    }

    public void setUsr_c_frete(double usr_c_frete) {
        this.usr_c_frete = usr_c_frete;
    }

    public int getTipo_frete() {
        return tipo_frete;
    }

    public void setTipo_frete(int tipo_frete) {
        this.tipo_frete = tipo_frete;
    }

    public String getNome_transportadora() {
        return nome_transportadora;
    }

    public void setNome_transportadora(String nome_transportadora) {
        this.nome_transportadora = nome_transportadora;
    }

    public String getCnpj_transportadora() {
        return cnpj_transportadora;
    }

    public void setCnpj_transportadora(String cnpj_transportadora) {
        this.cnpj_transportadora = cnpj_transportadora;
    }

    public int getModalidade_frete() {
        return modalidade_frete;
    }

    public void setModalidade_frete(int modalidade_frete) {
        this.modalidade_frete = modalidade_frete;
    }

    public LocalDate getDatahora_expedicao() {
        return datahora_expedicao;
    }

    public void setDatahora_expedicao(LocalDate datahora_expedicao) {
        this.datahora_expedicao = datahora_expedicao;
    }

    public LocalDate getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(LocalDate data_emissao) {
        this.data_emissao = data_emissao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco_entrega() {
        return endereco_entrega;
    }

    public void setEndereco_entrega(Endereco endereco_entrega) {
        this.endereco_entrega = endereco_entrega;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
