package es.iesjandula.reaktor.monitoring_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.reaktor.monitoring_server.models.Partition;
import es.iesjandula.reaktor.monitoring_server.models.Id.PartitionId;

public interface IPartitionRepository extends JpaRepository<Partition, PartitionId>
{
}
