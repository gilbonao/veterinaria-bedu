package org.bedu.java.backend.veterinaria.dto.consultas;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ConsultaDTO {

    @Schema(description = "ID de la consulta", example = "1")
    private Long id;

    @Schema(description = "Fecha de la consulta", example = "2023-11-25")
    private Date fechaConsulta;

    @Schema(description = "Diagnóstico de la consulta", example = "Fiebre y tos")
    private String diagnostico;

    @Schema(description = "Tratamiento indicado", example = "Tomar medicamento X cada 8 horas")
    private String tratamientoIndicado;

    @Schema(description = "Observaciones adicionales", example = "Seguimiento requerido")
    private String observaciones;

    // ¿Es correcto agregar estos objetos aquí?
//    private Mascota mascota;
//    private Veterinario veterinario;

}
