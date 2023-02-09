package com.salaheddine.schoolboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Holiday extends BaseEntity{
    @Id
    private String day;
    private String reason;
    @Enumerated(EnumType.STRING)
    private Type type;
    public enum Type {
        FESTIVAL, FEDERAL
    }
}
