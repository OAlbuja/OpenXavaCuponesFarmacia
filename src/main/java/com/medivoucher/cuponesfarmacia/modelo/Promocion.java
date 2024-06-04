package com.medivoucher.cuponesfarmacia.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Entity @Getter @Setter
public class Promocion {
 
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPromocion;

    @Column(length = 50) @Required
    private String descripcion;

    @Column @Temporal(TemporalType.DATE) @Required
    private Date fechaInicio;
}
