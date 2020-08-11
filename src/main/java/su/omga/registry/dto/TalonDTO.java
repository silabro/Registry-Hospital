package su.omga.registry.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TalonDTO {
    private int recordID;
    private String doctorName;
    private Date date;
    private  String time;
    private boolean free;
    private String hospitalName;
}
