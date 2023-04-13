package com.primeirotrampodev.VendaDeCarros.service;

import com.primeirotrampodev.VendaDeCarros.object.Anuncio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnuncioService {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private CarroService carroService;

    @Autowired
    private PlanoDePagamentoService planoDePagamentoService;

    public Anuncio anuncioVendedor (String nomeUsuario, String telefoneUsuario, Integer carroId, Integer cambioId, Integer planoDePagamentoId, List<Integer>listaIdOpcionais){

        Anuncio anuncio = new Anuncio();
        anuncio.setCarro(carroService.carroAnuncio(carroId, cambioId, listaIdOpcionais));
        anuncio.setUsuario(usuarioService.vendedor(nomeUsuario, telefoneUsuario));
        anuncio.setPlanoDePagamento(planoDePagamentoService.planoDePagamento(planoDePagamentoId));

        return anuncio;
    }
}
