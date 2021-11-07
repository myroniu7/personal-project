package com.nisum.test.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Phone {

    @Id
    private int id;
    private String number;
    private String citycode;
    private String countrycode;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("id")
    private Usuario usuario;
}
