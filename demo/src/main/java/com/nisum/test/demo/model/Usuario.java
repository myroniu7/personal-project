package com.nisum.test.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuario {

    @Id
    private int id;
    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy = "usuario")
    private List<Phone> phones = new ArrayList<>();
}
