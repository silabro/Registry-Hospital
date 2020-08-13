package su.omga.registry.domain.entitie;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MEDICAL_DIRECTION")
@Getter
@Setter
public class MedicalDirectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DIRECTION_ID")
    private Long directionId;

    @Column(name = "DIRECTION_NAME")
    private String directionName;

    @OneToMany (mappedBy="address", fetch=FetchType.EAGER)
    private List<DirectionAndHostitalEntity> directionAndHostital;

    @ManyToMany
    @JoinTable(name = "DIRECTION_AND_HOSPITAL",
            joinColumns = @JoinColumn(name = "DIRECTION_ID"),
            inverseJoinColumns = @JoinColumn(name = "HOSPITAL_ID"))
    private List<HospitalEntity> hospitals;





}
