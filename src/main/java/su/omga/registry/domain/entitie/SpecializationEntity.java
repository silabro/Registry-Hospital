package su.omga.registry.domain.entitie;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "SPECIALIZATION")
@Getter
@Setter
public class SpecializationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SPECIALIZATION_ID")
    private Long specializationId;

    @Column(name = "SPECIALIZATION_NAME")
    private String specializationName;

    @Column(name = "DURATION_RECEPTION")
    private int durationReception;





}
