package com.udemy.springbootbackendapirest.models.services;

import com.udemy.springbootbackendapirest.models.entity.Usuario;

public interface IUsuarioService {
    public Usuario findByUsername(String username);
}
