package su.omga.registry.dto;

import lombok.Data;

@Data
public class DoctorDTO {
    private int doctorId;
    private int name;
    private WeekDTO week;
}
