package com.primeirotrampodev.VendaDeCarros.object;

public class Anuncio {

    private Usuario usuario;
    private Carro carro;
    private PlanoDePagamento planoDePagamento;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public PlanoDePagamento getPlanoDePagamento() {
        return planoDePagamento;
    }

    public void setPlanoDePagamento(PlanoDePagamento planoDePagamento) {
        this.planoDePagamento = planoDePagamento;
    }
}
