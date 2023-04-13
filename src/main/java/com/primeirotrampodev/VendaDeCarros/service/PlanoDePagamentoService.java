package com.primeirotrampodev.VendaDeCarros.service;

import com.primeirotrampodev.VendaDeCarros.object.PlanoDePagamento;
import org.springframework.stereotype.Service;

@Service
public class PlanoDePagamentoService {

    public PlanoDePagamento planoDePagamento(Integer planoDePagamentoId){

        PlanoDePagamento planoDePagemento1 = new PlanoDePagamento();
        planoDePagemento1.setId(1);
        planoDePagemento1.setNome("15 dias");
        planoDePagemento1.setValor(45.00);

        PlanoDePagamento planoDePagemento2 = new PlanoDePagamento();
        planoDePagemento2.setId(2);
        planoDePagemento2.setNome("30 dias");
        planoDePagemento2.setValor(65.00);

        PlanoDePagamento planoDePagemento3 = new PlanoDePagamento();
        planoDePagemento3.setId(3);
        planoDePagemento3.setNome("60 dias");
        planoDePagemento3.setValor(99.00);

        if (planoDePagamentoId.equals(1)){
            return planoDePagemento1;
        } else if (planoDePagamentoId.equals(2)) {
            return planoDePagemento2;
        } else if (planoDePagamentoId.equals(3)) {
            return planoDePagemento3;
        }else {
            return new PlanoDePagamento();
        }
    }
}
