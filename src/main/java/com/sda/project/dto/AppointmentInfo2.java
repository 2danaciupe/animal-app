package com.sda.project.dto;

import com.sda.project.model.Pet;
import com.sda.project.model.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
public class AppointmentInfo2 {

    private LocalDateTime date;
    private Set<String> pets;
    private User user;

}
