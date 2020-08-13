package su.omga.registry.domain.entitie;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "CITY")
@Getter
@Setter
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CITY_ID")
    private Long cityID;

    @Column(name = "CITY_NAME")
    private String cityName;

    @OneToMany(mappedBy = "CITY_ID", fetch = FetchType.EAGER)
    private List<HospitalEntity> hospitals;

}
