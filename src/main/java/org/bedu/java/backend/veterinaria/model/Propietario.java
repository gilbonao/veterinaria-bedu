package org.bedu.java.backend.veterinaria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "propietario")
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(name = "apellido_paterno", nullable = false, length = 100)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", nullable = false, length = 100)
    private String apellidoMaterno;

    @Column(nullable = false, length = 250)
    private String direccion;

    @Column(nullable = false, length = 13)
    private String celular;

    @Column(nullable = false, length = 100)
    private String correo;

    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;

    @Column(nullable = false, length = 100)
    private String ocupacion;

    //De uno a muchos -> UN Propietario puede tener MUCHAS Mascotas
//    @OneToMany(mappedBy = "propietario")
//    private List<Mascota> mascotas;

}
