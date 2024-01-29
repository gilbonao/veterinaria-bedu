package org.bedu.java.backend.veterinaria.dto.propietario;

import java.util.Date;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.bedu.java.backend.veterinaria.model.Mascota;

@Data
public class UpdatePropietarioDTO {

    @Schema(description = "Nombre del propietario", example = "Rodrigo")
    private String nombre;

    @Schema(description = "Apellido paterno del propietario", example = "Cruz")
    private String apellidoPaterno;

    @Schema(description = "Apellido materno del propietario", example = "Palacios")
    private String apellidoMaterno;

    @Schema(description = "Dirección del propietario", example = "Calle Principal #45, Col. Centro")
    private String direccion;
    
    @Schema(description = "Número de celular del propietario", example = "+529212164578")
    private String celular;
    
    @Schema(description = "Correo electrónico del propietario", example = "rodrigo@test.com")
    private String correo;
    
    @Schema(description = "Fecha de nacimiento del propietario", example = "2005-12-01")
    private Date fechaNacimiento;

    @Schema(description = "Ocupación del propietario", example = "Bombero")
    private String ocupacion;

//    private List<Mascota> mascotas;

}
