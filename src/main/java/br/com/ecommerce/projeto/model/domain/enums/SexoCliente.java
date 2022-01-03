package br.com.ecommerce.projeto.model.domain.enums;

public enum SexoCliente {
    FEMININO("Feminino"),
    OUTRO("Outro"),
    MASCULINO("Masculino");

    private final String sexo;

    SexoCliente(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }


}