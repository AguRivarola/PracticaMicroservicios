package com.microservicios.modelo;


import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity //A class which should be persisted in a database
@Table(name="users") //allows you to specify the details of the table that will be used to persist the entity in the database.
public class User{

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private Long idUser;
    @Column(name = "email")
    private String mail;
    @Column(name = "password")
    private String password;
    @Column(name = "username")
    private String username;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private Integer edad;
    @Column
    private String nacionalidad;

    public User(Long idUser, String mail, String password, String username, String nombre, String apellido,
            Integer edad, String nacionalidad) {
        this.idUser = idUser;
        this.mail = mail;
        this.password = password;
        this.username = username;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public User(){
        
    }

    public Long getIdUser() {
        return idUser;
    }
    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
}