package com.dbpractice.springpractice.Model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class DoctorModel {
    @Id
    @GeneratedValue
    Integer id;

    @NotNull
    String name;

    @NotNull
    List<Patient> patiens = new ArrayList<Patient>();
}
