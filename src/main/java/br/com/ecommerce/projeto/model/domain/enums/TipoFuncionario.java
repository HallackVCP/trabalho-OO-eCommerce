package br.com.ecommerce.projeto.model.domain.enums;

public enum TipoFuncionario {

    Gerente("Gerente", "Gerente"),
    Vendedor("Vendedor", "Vendedor");

    private String cod;
    private String descricao;

    TipoFuncionario(String cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    public static TipoFuncionario toEnum(String cod) {
        if(cod == null) {
            return null;
        }
        for(TipoFuncionario x : TipoFuncionario.values()) {
            if(cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
