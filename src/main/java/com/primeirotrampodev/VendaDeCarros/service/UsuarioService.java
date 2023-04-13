package com.primeirotrampodev.VendaDeCarros.service;

import com.primeirotrampodev.VendaDeCarros.object.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public Usuario vendedor(String nomeUsuario, String telefoneUsuario){

        Usuario usuario = new Usuario();
        usuario.setId(2);
        usuario.setNome(nomeUsuario);
        usuario.setTelefone(telefoneUsuario);

        return usuario;
    }
}
