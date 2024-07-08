package ApiService.VehiclesStore.repository;

import ApiService.VehiclesStore.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerRespository extends JpaRepository<Manufacturer, Long> {
}
