package su.omga.registry.domain.entitie;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "HOSPITAL")
@Getter
@Setter
public class HospitalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HOSPITAL_ID")
    private Long hospitalId;

    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;

    @Column(name = "HOSPITAL_ADDRESS")
    private String hospitalAddress;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "CITY_ID")
    private CityEntity city;

    @OneToMany (mappedBy="DIRECTION_AND_HOSPITAL_ID", fetch=FetchType.EAGER)
    private List<DirectionAndHostitalEntity> directionAndHostital;





    @ManyToMany
    @JoinTable(name = "DIRECTION_AND_HOSPITAL",
            joinColumns = @JoinColumn(name = "HOSPITAL_ID"),
            inverseJoinColumns = @JoinColumn(name = "DIRECTION_ID"))
    private List<MedicalDirectionEntity> directions;

}
