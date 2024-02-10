package es.iesjandula.reaktor.monitoring_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.reaktor.monitoring_server.models.HardDisk;
import es.iesjandula.reaktor.monitoring_server.models.Id.HardDiskId;

public interface IHardDiskRepository extends JpaRepository<HardDisk, HardDiskId>
{
}
