package ApiService.VehiclesStore.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @Column(name = "id_Vehicle")
    private Long idVehicle;

    @Column(name="name_Vehicle")
    private String nameVehicle;

    @Column(name="price_Vehicle")
    private Double priceVehicle;

    @Column(name="type_Color")
    private String typeColor;

    @Column(name="fuel_Vehicle")
    private String fuelVehicle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manufacturer_id")
    @JsonBackReference
    private Manufacturer manufacturer_Id;
}
