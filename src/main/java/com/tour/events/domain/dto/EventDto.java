package com.tour.events.domain.dto;

import java.util.Date;

public class EventDto {

    private int idDto;
    private String nameDto;
    private String locationDto;
    private Date startDto;
    private Date finishDto;
    private Integer availabilityDto;

    public int getIdDto() {
        return idDto;
    }

    public void setIdDto(int idDto) {
        this.idDto = idDto;
    }

    public String getNameDto() {
        return nameDto;
    }

    public void setNameDto(String nameDto) {
        this.nameDto = nameDto;
    }

    public String getLocationDto() {
        return locationDto;
    }

    public void setLocationDto(String locationDto) {
        this.locationDto = locationDto;
    }

    public Date getStartDto() {
        return startDto;
    }

    public void setStartDto(Date startDto) {
        this.startDto = startDto;
    }

    public Date getFinishDto() {
        return finishDto;
    }

    public void setFinishDto(Date finishDto) {
        this.finishDto = finishDto;
    }

    public Integer getAvailabilityDto() {
        return availabilityDto;
    }

    public void setAvailabilityDto(Integer availabilityDto) {
        this.availabilityDto = availabilityDto;
    }
}
