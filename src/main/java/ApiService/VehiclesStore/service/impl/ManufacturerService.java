package ApiService.VehiclesStore.service.impl;

import ApiService.VehiclesStore.entity.Manufacturer;
import ApiService.VehiclesStore.repository.ManufacturerRespository;
import ApiService.VehiclesStore.service.IManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ManufacturerService implements IManufacturerService {
    @Autowired
    ManufacturerRespository manufacturerRespository;

    @Override
    public List<Manufacturer> readAll(){
        return manufacturerRespository.findAll();
    }
}
