package su.omga.registry.dto;

import lombok.Data;

import java.util.Date;

@Data
public class WeekDTO {
    private Date date;
    private String time;
    private int countFreeTalons;
}
