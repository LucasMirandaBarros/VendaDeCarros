package com.primeirotrampodev.VendaDeCarros.service;

import com.primeirotrampodev.VendaDeCarros.object.Opcional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OpcionalService {

    public List<Opcional> getOpcionais(List<Integer> listaIdOpcionais){

        Opcional opcional1 = new Opcional();
        opcional1.setId(1);
        opcional1.setNome("Vidro elétrico");

        Opcional opcional2 = new Opcional();
        opcional2.setId(2);
        opcional2.setNome("Trava elétrica");

        Opcional opcional3 = new Opcional();
        opcional3.setId(3);
        opcional3.setNome("Ar-condicionado");

        Opcional opcional4 = new Opcional();
        opcional4.setId(4);
        opcional4.setNome("Direção hidráulica");

        Opcional opcional5 = new Opcional();
        opcional5.setId(5);
        opcional5.setNome("Airbags");

        Opcional opcional6 = new Opcional();
        opcional6.setId(6);
        opcional6.setNome("Bancos de couro");

        Opcional opcional7 = new Opcional();
        opcional7.setId(7);
        opcional7.setNome("Central Multimídia");

        Opcional opcional8 = new Opcional();
        opcional8.setId(8);
        opcional8.setNome("Sensor de Estacionamento");

        Opcional opcional9 = new Opcional();
        opcional9.setId(9);
        opcional9.setNome("Retrovisor Eletrico");

        Opcional opcional10 = new Opcional();
        opcional10.setId(10);
        opcional10.setNome("Desembaçador Traseiro");

        Opcional opcional11 = new Opcional();
        opcional11.setId(11);
        opcional11.setNome("Câmera de Ré");

        List<Opcional> opcionalList = new ArrayList<>();

        for (Integer cont = 0; cont < listaIdOpcionais.size(); cont++){
            Integer opcionalId = listaIdOpcionais.get(cont);

            if(opcionalId.equals(1)){
                opcionalList.add(opcional1);
            } else if (opcionalId.equals(2)) {
                opcionalList.add(opcional2);
            } else if (opcionalId.equals(3)) {
                opcionalList.add(opcional3);
            } else if (opcionalId.equals(4)) {
                opcionalList.add(opcional4);
            } else if (opcionalId.equals(5)) {
                opcionalList.add(opcional5);
            } else if (opcionalId.equals(6)) {
                opcionalList.add(opcional6);
            } else if (opcionalId.equals(7)) {
                opcionalList.add(opcional7);
            } else if (opcionalId.equals(8)) {
                opcionalList.add(opcional8);
            } else if (opcionalId.equals(9)) {
                opcionalList.add(opcional9);
            } else if (opcionalId.equals(10)) {
                opcionalList.add(opcional10);
            } else if (opcionalId.equals(11)) {
                opcionalList.add(opcional11);
            }

        }
        return opcionalList;
    }

}
