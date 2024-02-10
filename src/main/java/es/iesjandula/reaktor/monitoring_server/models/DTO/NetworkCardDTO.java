package es.iesjandula.reaktor.monitoring_server.models.DTO;

import es.iesjandula.reaktor.monitoring_server.models.Id.NetworkCardId;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NetworkCardDTO
{
    /** Attribute id*/
    private String id;

    /** Attribute macAddress*/
    private String macAddress;

    /** Attribute rj45IsConnected*/
    private Boolean rj45IsConnected;

    /** Attribute model*/
    private String model;

    /** Attribute isWireless*/
    private Boolean isWireless;
}
