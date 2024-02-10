package es.iesjandula.reaktor.monitoring_server.models.DTO;

import es.iesjandula.reaktor.monitoring_server.models.Id.SoundCardId;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoundCardDTO
{
    /** Attribute id*/
    private String id;

    /** Attribute model*/
    private String model;

    /** Attribute driver*/
    private String driver;

}
