package br.com.ecommerce.projeto.model.domain.enums;

public enum TipoCliente {

    PESSOAFISICA("PESSOAFISICA", "Pessoa física"),
    PESSOAJURIDICA("PESSOAJURIDICA", "Pessoa jurídica");

    private String cod;
    private String descricao;

    TipoCliente(String cod, String descricao) {
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
    public static TipoCliente toEnum(String cod) {
        if(cod == null) {
            return null;
        }
        for(TipoCliente x : TipoCliente.values()) {
            if(cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
