package com.primeirotrampodev.VendaDeCarros.controller;

import com.primeirotrampodev.VendaDeCarros.object.Anuncio;
import com.primeirotrampodev.VendaDeCarros.service.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/anuncio-controller")
public class AnuncioController {

    @Autowired
    private AnuncioService anuncioService;

    @GetMapping("/anuncio")
    public Anuncio anuncio(@RequestParam("nomeUsuario")String nomeUsuario,
                           @RequestParam("nomeUsuario")String telefoneUsuario,
                           @RequestParam("nomeUsuario")Integer carroId,
                           @RequestParam("nomeUsuario")Integer cambioId,
                           @RequestParam("nomeUsuario")Integer planoDePagamentoId,
                           @RequestParam("nomeUsuario")List<Integer> listaIdOpcionais){
        return anuncioService.anuncioVendedor(
                nomeUsuario,
                telefoneUsuario,
                carroId,
                cambioId,
                planoDePagamentoId,
                listaIdOpcionais);

    }
}
