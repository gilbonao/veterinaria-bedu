package org.bedu.java.backend.veterinaria.dto.veterinario;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalTime;
import java.util.Date;

@Data
public class UpdateVeterinarioDTO {

    @Schema(description = "Nombre del veterinario", example = "Alberto")
    private String nombre;

    @Schema(description = "Apellido paterno del veterinario", example = "Juárez")
    private String apellidoPaterno;

    @Schema(description = "Apellido materno del veterinario", example = "Hernández")
    private String apellidoMaterno;

    @Schema(description = "Fecha de nacimiento del veterinario", example = "1998-12-25")
    private Date fechaNacimiento;

    @Schema(description = "Número de celular del veterinario", example = "+528332587821")
    private String celular;

    @Schema(description = "Correo electrónico del veterinario", example = "alberto@gmail.com")
    private String correo;

    @Schema(description = "Especialidad del veterinario", example = "Odontología")
    private String especialidad;

    @Schema(description = "Hora de entrada del veterinario", example = "09:25")
    private LocalTime horaEntrada;

    @Schema(description = "Hora de salida del veterinario", example = "18:15")
    private LocalTime horaSalida;

}
