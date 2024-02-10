package es.iesjandula.reaktor.monitoring_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.reaktor.monitoring_server.models.InternetConnectionNetworkCard;
import es.iesjandula.reaktor.monitoring_server.models.Id.InternetConnectionNetworkCardId;

public interface IinternetConnectionNetworkCardRepository extends JpaRepository<InternetConnectionNetworkCard, InternetConnectionNetworkCardId>
{
}
