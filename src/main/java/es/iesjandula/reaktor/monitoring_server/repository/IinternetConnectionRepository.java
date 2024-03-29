package es.iesjandula.reaktor.monitoring_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.reaktor.monitoring_server.models.InternetConnection;

public interface IinternetConnectionRepository extends JpaRepository<InternetConnection, Long>
{
}
