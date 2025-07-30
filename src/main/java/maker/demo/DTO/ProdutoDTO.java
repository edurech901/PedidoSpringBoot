package maker.demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProdutoDTO {
    @JsonProperty("title")
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
