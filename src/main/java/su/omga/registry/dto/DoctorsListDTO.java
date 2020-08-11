package su.omga.registry.dto;

import lombok.Data;

import java.util.List;

@Data
public class DoctorsListDTO {
    private List<DoctorDTO> doctors;
}
