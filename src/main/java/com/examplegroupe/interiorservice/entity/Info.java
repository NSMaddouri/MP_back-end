package com.examplegroupe.interiorservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long infoId;
    private Long numcin ;
    private String nom ;
    private String prenom ;
    private String address ;
    private Long tel ;
    private String etat ;


}
