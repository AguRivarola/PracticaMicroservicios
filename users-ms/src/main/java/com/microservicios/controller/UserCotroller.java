package com.microservicios.controller;


import com.microservicios.modelo.User;
import com.microservicios.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserCotroller {
    private final UserService service;

    public UserCotroller(UserService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> obtenerUsuarioPorId() {
        System.out.println("Get all");
        return ResponseEntity.ok().body(new ArrayList<>());
//        return ResponseEntity.ok().body(service.obtenerUsuarios());
    }
    @GetMapping("/{idUsuario}")
    public ResponseEntity<Optional<User>> obtenerUsuarioPorId(@RequestParam Long idUsuario) {
        return ResponseEntity.ok().body(service.obtenerUserPorId(idUsuario));
    }
    @PostMapping()
    public ResponseEntity<User> obtenerUsuarioPorId(@RequestBody User newUsuario) {
        return ResponseEntity.ok().body(service.crearUsuario(newUsuario));
    }
    @DeleteMapping("/{idUsuario}")
    public ResponseEntity<String> borrarUsuarioPorId(@RequestParam Long idUsuario){
        return ResponseEntity.ok().body(service.eliminarUsuarioPorId(idUsuario));
    }
}
