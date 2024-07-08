package ApiService.VehiclesStore.controller;

import ApiService.VehiclesStore.entity.Manufacturer;
import ApiService.VehiclesStore.service.impl.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ManufacturerController {
    @Autowired
    ManufacturerService manufacturerService;

    @GetMapping("/manufacturer")
    public List<Manufacturer> readAll(){
        return manufacturerService.readAll();
    }
}
