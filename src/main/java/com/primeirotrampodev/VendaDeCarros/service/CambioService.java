package com.primeirotrampodev.VendaDeCarros.service;

import com.primeirotrampodev.VendaDeCarros.object.Cambio;
import org.springframework.stereotype.Service;

@Service
public class CambioService {

    public Cambio cambioVeiculo(Integer cambioId){

        Cambio cambioAuto = new Cambio();
        cambioAuto.setId(1);
        cambioAuto.setNome("Automático");


        Cambio cambioManual = new Cambio();
        cambioManual.setId(2);
        cambioManual.setNome("Manual");


        if (cambioId.equals(2)){
            return cambioManual;
        } else if (cambioId.equals(1)) {
            return cambioAuto;
        }else {
            return new Cambio();
        }
    }

}
