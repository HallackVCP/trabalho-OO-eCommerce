package br.com.ecommerce.projeto.model.domain.enums;

public enum TipoFuncionario {

    Administrador(1, "Admnistrador"),
    Vendedor(1, "Vendedor");

    private int cod;
    private String descricao;

    TipoFuncionario(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    public static TipoFuncionario toEnum(Integer cod) {
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
