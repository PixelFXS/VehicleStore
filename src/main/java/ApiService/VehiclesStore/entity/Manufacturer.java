package ApiService.VehiclesStore.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "manufacturedvehicle")
public class Manufacturer {
    @Id
    @Column(name="id_Manufacturer")
    private Long id_Manufacturer;

    @Column(name = "manufacturer_Name")
    private String manufacturer_Name;

    @OneToMany(mappedBy = "manufacturer_Id", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Vehicle> vehicles;
}
