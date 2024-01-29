package org.bedu.java.backend.veterinaria.dto.propietario;

import java.util.Date;
import java.util.List;

import org.bedu.java.backend.veterinaria.model.Mascota;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreatePropietarioDTO {

    @Schema(description = "Nombre del propietario", example = "Rodrigo")
    @NotBlank(message = "El nombre del propietario es obligatorio")
    @Length(min = 1, max = 100, message = "El nombre no puede exceder de 100 caracteres")
    private String nombre;

    @Schema(description = "Apellido paterno del propietario", example = "Cruz")
    @NotBlank(message = "El apellido paterno del propietario es obligatorio")
    @Length(min = 1, max = 100, message = "El apellido paterno no puede exceder de 100 caracteres")
    private String apellidoPaterno;

    @Schema(description = "Apellido materno del propietario", example = "Palacios")
    @NotBlank(message = "El apellido materno del propietario es obligatorio")
    @Length(min = 1, max = 100, message = "El apellido materno no puede exceder de 100 caracteres")
    private String apellidoMaterno;

    @Schema(description = "Dirección del propietario", example = "Calle Principal #45, Col. Centro")
    @NotBlank(message = "La dirección del propietario es obligatoria")
    private String direccion;
    
    @Schema(description = "Número de celular del propietario", example = "+529212164578")
    @NotBlank(message = "El número de celular del propietario es obligatorio")
    @Length(min = 1, max = 100, message = "El número de celular no puede exceder de 13 caracteres")
    private String celular;
    
    @Schema(description = "Correo electrónico del propietario", example = "rodrigo@test.com")
    @NotBlank(message = "El correo electrónico del propietario es obligatorio")
    @Length(min = 1, max = 100, message = "El correo electrónico no puede exceder de 100 caracteres")
    private String correo;
    
    @Schema(description = "Fecha de nacimiento del propietario", example = "2005-12-01")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;

    @Schema(description = "Ocupación del propietario", example = "Bombero")
    @NotBlank(message = "La ocupación del propietario es obligatoria")
    private String ocupacion;

//    private List<Mascota> mascotas;

}
