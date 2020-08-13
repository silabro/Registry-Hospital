package su.omga.registry.domain.entitie;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "DIRECTION_AND_HOSPITAL")
@Getter
@Setter
public class DirectionAndHostitalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DIRECTION_AND_HOSPITAL_ID")
    private Long directionAndHospitalId;

    @OneToOne (optional=false, mappedBy="DIRECTION_AND_HOSPITAL_ID")
    private DoctorEntity doctor;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "HOSPITAL_ID")
    private HospitalEntity hospital;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "DIRECTION_ID")
    private MedicalDirectionEntity direction;


}
