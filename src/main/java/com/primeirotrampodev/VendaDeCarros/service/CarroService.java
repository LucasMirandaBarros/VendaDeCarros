package com.primeirotrampodev.VendaDeCarros.service;

import com.primeirotrampodev.VendaDeCarros.object.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CambioService cambioService;

    @Autowired
    private OpcionalService opcionalService;

    public Carro carroAnuncio(Integer carroId, Integer cambioId, List<Integer> listaIdOpcionais){

        Carro carro1 = new Carro();
        carro1.setId(1);
        carro1.setNome("Gladiator");
        carro1.setMarca("Jeep");
        carro1.setAnoModelo("23/23");
        carro1.setCambio(cambioService.cambioVeiculo(cambioId));
        carro1.setCor("Amarelo");
        carro1.setOpcionalList(opcionalService.getOpcionais(listaIdOpcionais));


        Carro carro2 = new Carro();
        carro2.setId(2);
        carro2.setNome("AMG GT Black Series");
        carro2.setMarca("mercedes");
        carro2.setAnoModelo("23/23");
        carro2.setCambio(cambioService.cambioVeiculo(cambioId));
        carro2.setCor("Vermelho");
        carro2.setOpcionalList(opcionalService.getOpcionais(listaIdOpcionais));

        Carro carro3 = new Carro();
        carro3.setId(3);
        carro3.setNome("C43 AMG");
        carro3.setMarca("Mercedes");
        carro3.setAnoModelo("23/23");
        carro3.setCambio(cambioService.cambioVeiculo(cambioId));
        carro3.setCor("Cinza");
        carro3.setOpcionalList(opcionalService.getOpcionais(listaIdOpcionais));


        Carro carro4 = new Carro();
        carro4.setId(4);
        carro4.setNome("M3 Touring");
        carro4.setMarca("BMW");
        carro4.setAnoModelo("22/24");
        carro4.setCambio(cambioService.cambioVeiculo(cambioId));
        carro4.setCor("Branco");
        carro4.setOpcionalList(opcionalService.getOpcionais(listaIdOpcionais));


        Carro carro5 = new Carro();
        carro5.setId(5);
        carro5.setNome("A4 Avant");
        carro5.setMarca("Audi");
        carro5.setAnoModelo("20/21");
        carro5.setCambio(cambioService.cambioVeiculo(cambioId));
        carro5.setCor("Preto");
        carro5.setOpcionalList(opcionalService.getOpcionais(listaIdOpcionais));

        if (carroId.equals(1)){
            return carro1;
        } else if (carroId.equals(2)){
            return carro2;
        } else if (carroId.equals(3)){
            return carro3;
        } else if (carroId.equals(4)){
            return carro4;
        } else if (carroId.equals(5)){
            return carro5;
        } else {
            return new Carro();
        }

    }

}
