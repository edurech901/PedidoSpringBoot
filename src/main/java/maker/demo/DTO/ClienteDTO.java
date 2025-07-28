package maker.demo.DTO;

import java.util.List;

import maker.demo.model.Endereco;

public class ClienteDTO {
    private String nome;
    private String pf_pj;
    private String cpf_cnpj;
    private String rg;
    private List<Endereco> enderecos;
    private String email;
    private String email_nfe;
    private List<EnderecoEntregaDTO> endereco_entrega;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPf_pj() {
        return pf_pj;
    }

    public void setPf_pj(String pf_pj) {
        this.pf_pj = pf_pj;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail_nfe() {
        return email_nfe;
    }

    public void setEmail_nfe(String email_nfe) {
        this.email_nfe = email_nfe;
    }

    public List<EnderecoEntregaDTO> getEndereco_entrega() {
        return endereco_entrega;
    }

    public void setEndereco_entrega(List<EnderecoEntregaDTO> endereco_entrega) {
        this.endereco_entrega = endereco_entrega;
    }


}
