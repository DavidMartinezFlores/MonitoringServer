package es.iesjandula.reaktor.monitoring_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.reaktor.monitoring_server.models.SoundCard;
import es.iesjandula.reaktor.monitoring_server.models.Id.SoundCardId;

public interface ISoundCardRepository extends JpaRepository <SoundCard, SoundCardId>
{
}
