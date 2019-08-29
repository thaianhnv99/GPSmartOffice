package com.itsol.smartoffice.dto;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Team_leadDto {

    private String id_team;
    private String name_team;
    private int quantity;
}
