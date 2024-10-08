package com.workhive.app_workhive.repository;

import org.springframework.data.repository.CrudRepository;

import com.workhive.app_workhive.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    
}
