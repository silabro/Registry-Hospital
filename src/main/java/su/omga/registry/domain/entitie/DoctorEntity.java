package su.omga.registry.domain.entitie;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "DOCTOR")
@Getter
@Setter
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DOCTOR_ID")
    private Long doctorId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String midleName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BIRTHDAY")
    private Date birhday;

    @Column(name = "CABINET_NUMBER")
    private int cabinetNumber;

    @Column(name = "START_WORK_TIME")
    private Timestamp startWorkTime;

    @Column(name = "END_WORK_TIME")
    private  Timestamp endWorkTime;

    @OneToOne (optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "SPECIALIZATION_ID")
    private SpecializationEntity specialization;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "DIRECTION_AND_HOSPITAL_ID")
    private  DirectionAndHostitalEntity directionAndHostital;

    @OneToMany(mappedBy = "doctorId",fetch = FetchType.EAGER)
    private List<RecordEntity> records;






}
