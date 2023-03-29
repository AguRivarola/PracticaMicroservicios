package com.microservicios.service;

import com.microservicios.modelo.User;
import com.microservicios.repositorio.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;
    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> obtenerUsuarios(){
        return repository.findAll();
    }
    public Optional<User> obtenerUserPorId(Long idUser){
        return repository.findById(idUser);
    }

    public User crearUsuario(User newUser){
        return repository.save(newUser);
    }

    public String eliminarUsuarioPorId(Long idUser) {
        repository.deleteById(idUser);
        return repository.existsById(idUser)?"Error eliminando":"Correctamente elimminado";
    }

}
