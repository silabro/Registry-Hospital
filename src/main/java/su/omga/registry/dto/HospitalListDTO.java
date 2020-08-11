package su.omga.registry.dto;

import lombok.Data;

import java.util.List;

@Data
public class HospitalListDTO {
    private List<HospitalDTO> hospitalList;
}
