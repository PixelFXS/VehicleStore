package ApiService.VehiclesStore.service;

import ApiService.VehiclesStore.entity.Manufacturer;
import ApiService.VehiclesStore.entity.Vehicle;

import java.util.List;

public interface IManufacturerService {
    List<Manufacturer> readAll();
}
