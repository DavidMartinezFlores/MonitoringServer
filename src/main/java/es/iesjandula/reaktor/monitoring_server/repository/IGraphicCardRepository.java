package es.iesjandula.reaktor.monitoring_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.reaktor.monitoring_server.models.GraphicCard;
import es.iesjandula.reaktor.monitoring_server.models.Id.GraphicCardId;

public interface IGraphicCardRepository extends JpaRepository<GraphicCard, GraphicCardId>
{
}
