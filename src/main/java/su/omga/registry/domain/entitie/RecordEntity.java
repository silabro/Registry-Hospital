package su.omga.registry.domain.entitie;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "RECORD")
@Getter
@Setter
public class RecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private Long recordId;

    @Column(name = "DOCTOR_ID")
    @ManyToOne(optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "RECORD_ID")
    private Long doctorId;

    @Column(name = "START_RECEPTION_TIME")
    private Timestamp startReceptionTime;

    @Column(name = "END_RECEPTION_TIME")
    private Timestamp endReceptionTime;

    @Column(name = "IS_FREE_TIME")
    private boolean iiFreeTime;

    @Column(name = "RECORD_DATE")
    private Date recordDate;

    @Column(name = "PATIENT_OMS_NUMBER")
    private Long patientOmsNumber;

    @Column(name = "PATIENT_BIRTHDAY")
    private Date patientBirthday;

    @Column(name = "PATIENT_PHONE_NUMBER")
    private String patientPhoneNumber;

    @Column(name = "PATIENT_FIRST_NAME")
    private String patientFirstName;

    @Column(name = "PATIENT_MIDDLE_NAME")
    private String patientMiddleName;

    @Column(name = "PATIENT_LAST_NAME")
    private String patientLastName;












}
