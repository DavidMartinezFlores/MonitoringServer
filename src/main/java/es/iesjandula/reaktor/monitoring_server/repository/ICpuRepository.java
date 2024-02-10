package es.iesjandula.reaktor.monitoring_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import es.iesjandula.reaktor.monitoring_server.models.Cpu;
import es.iesjandula.reaktor.monitoring_server.models.Id.CpuId;

public interface ICpuRepository extends JpaRepository<Cpu, CpuId>
{
    Cpu findCpuById_Motherboard_MotherBoardSerialNumber(String motherBoardSerialNumber);
}
